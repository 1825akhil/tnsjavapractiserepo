package com.placement.placementstudent.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.placementstudent.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
	Optional<StudentEntity> findByHallTicketNo(long hallTicketNo); 

}
