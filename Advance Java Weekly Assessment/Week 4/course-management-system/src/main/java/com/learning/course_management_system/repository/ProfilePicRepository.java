package com.learning.course_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.course_management_system.entity.ProfilePicEntity;

@Repository
public interface ProfilePicRepository extends JpaRepository<ProfilePicEntity, Long>{

}

