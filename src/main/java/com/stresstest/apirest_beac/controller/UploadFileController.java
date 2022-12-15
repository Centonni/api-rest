package com.stresstest.apirest_beac.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stresstest.apirest_beac.service.UploadFileService;

@RestController
public class UploadFileController {
	@Autowired
	UploadFileService uploadFileService;
	///{idBanque}
	@PostMapping("/uploadFile")
	public String submit(@RequestParam ("file") MultipartFile file) 
				throws IllegalStateException, IOException {
					 //TODO add try catch
						// TODO Path_to_directory + idBanque recuprer la valeur du path_directory depuis le fichier properties.
					uploadFileService.uploadFile(file);
					//	file.transferTo(new File("C:\\Users\\ACER\\Documents\\FilesUploadedStressTest"+file.getOriginalFilename()+"idBanque"));
					 //Files.copy(file.getInputStream(), "Path_to_directory", StandardCopyOption.REPLACE_EXISTING);
					 //TODO notifier le service python du nouveau chargement de fichier.
			 return "File has uploaded successfully";
		}

	}
