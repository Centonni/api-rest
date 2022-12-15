package com.stresstest.apirest_beac.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {
	@Value("file_destination")
	String fileDestination;
	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		
		file.transferTo(new File("C:\\FilesUploadedStressTest\\"+file.getOriginalFilename()));
	}

}
