package com.codeclan.folderLab.folderservice;

import com.codeclan.folderLab.folderservice.models.File;
import com.codeclan.folderLab.folderservice.models.Folder;
import com.codeclan.folderLab.folderservice.models.User;
import com.codeclan.folderLab.folderservice.repositories.FileRepository;
import com.codeclan.folderLab.folderservice.repositories.FolderRepository;
import com.codeclan.folderLab.folderservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderserviceApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createAll(){
		User gav = new User("Gav");
		userRepository.save(gav);
		Folder folder1 = new Folder("folder1", gav);
		folderRepository.save(folder1);
		File file1 = new File("file1", "txt", 212, folder1);
		fileRepository.save(file1);
	}

}
