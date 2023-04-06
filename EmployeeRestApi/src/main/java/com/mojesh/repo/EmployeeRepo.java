package com.mojesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojesh.model.EmployeeRestApi;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeRestApi, Integer> {

}
