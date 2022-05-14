package com.toby.springBootAuto.JDBC;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toby.springBootAuto.Entity.*;

public interface EmployeeJDBC extends JpaRepository<Employee, Integer> {

}
