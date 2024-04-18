package com.greatlearning.ems.repository;

import org.springframework.data.jpa.respository.JpaRepository;

import com.greatlearning.ems.entity.Employee;

public interface EmployeesRepository extends JpaRepository<Employee,Integer> {

}
