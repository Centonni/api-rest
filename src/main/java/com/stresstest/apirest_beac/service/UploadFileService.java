package com.stresstest.apirest_beac.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

@Service
@Slf4j
public class UploadFileService {

	private final String fileDestination;

	private final String pythonServiceEndpoint;

	private final RestTemplate restTemplate;

	public UploadFileService(@Value("${beac.upload.dest.directory}") String fileDestination,
							 @Value("${beac.upload.python.ms.endpoint}") String pythonServiceEndpoint,
							 RestTemplateBuilder restTemplateBuilder) {
		this.fileDestination = fileDestination;
		this.pythonServiceEndpoint = pythonServiceEndpoint;
		this.restTemplate=restTemplateBuilder.build();
	}

	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		
		file.transferTo(new File("C:\\FilesUploadedStressTest\\"+file.getOriginalFilename()));
	}

	public void uploadFileAndNotify(MultipartFile file,String idBank) {

		try {

			String fileName = "bank_"+idBank+"_"+ System.currentTimeMillis();
			String destinationPath = fileDestination + fileName;
			File fileSourcePath =  new File(destinationPath);
			Files.copy(file.getInputStream(), fileSourcePath.toPath(),REPLACE_EXISTING);


			var headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			var request =new HttpEntity(null, headers);

			ResponseEntity<String> response = restTemplate.postForEntity(pythonServiceEndpoint, request, String.class,fileName);

			log.info("response {}",response);

		} catch (IOException e) {
			log.error("Exception when saving files for bank {}",idBank,e);
		}catch (RestClientException exception){
			log.error("Exception when trying to call python ms");
		}
	}

}
