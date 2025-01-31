package org.jsp.cds.service;


import org.jsp.cds.entity.Faculty;
import org.jsp.cds.entity.Student;
import org.jsp.cds.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }


}
