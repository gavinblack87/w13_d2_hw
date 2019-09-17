package com.codeclan.folderLab.folderservice.components;


import com.codeclan.folderLab.folderservice.models.File;
import com.codeclan.folderLab.folderservice.models.Folder;
import com.codeclan.folderLab.folderservice.models.User;
import com.codeclan.folderLab.folderservice.repositories.FileRepository;
import com.codeclan.folderLab.folderservice.repositories.FolderRepository;
import com.codeclan.folderLab.folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){
        User gav = new User("Gav");
        userRepository.save(gav);

        User amy = new User("Amy");
        userRepository.save(amy);

        Folder folder1 = new Folder("folder1", gav);
        folderRepository.save(folder1);

        File file1 = new File("file1", "txt", 100, folder1);
        fileRepository.save(file1);

        gav.addFolder(folder1);
        userRepository.save(gav);

        folder1.addFile(file1);
        folderRepository.save(folder1);


    }
}
