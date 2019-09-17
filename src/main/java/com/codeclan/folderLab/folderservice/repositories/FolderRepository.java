package com.codeclan.folderLab.folderservice.repositories;

import com.codeclan.folderLab.folderservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
