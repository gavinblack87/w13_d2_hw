package com.codeclan.folderLab.folderservice.repositories;

import com.codeclan.folderLab.folderservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
