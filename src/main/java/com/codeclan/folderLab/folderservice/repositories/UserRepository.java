package com.codeclan.folderLab.folderservice.repositories;

import com.codeclan.folderLab.folderservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
