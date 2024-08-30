package org.jsp.cds.controller;


import org.jsp.cds.entity.Faculty;
import org.jsp.cds.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping
    public List<Faculty> getAllFaculties(){
        return facultyService.getAllFaculties();
    }


}
