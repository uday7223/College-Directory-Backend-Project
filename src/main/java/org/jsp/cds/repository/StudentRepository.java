package org.jsp.cds.repository;

import org.jsp.cds.entity.Department;
import org.jsp.cds.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByDepartment(Department department);


    // Custom query methods if needed
}