package com.javaguide.sms.repository;

import com.javaguide.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
