package com.sumendra.schoolmanagement.controller;

import com.sumendra.schoolmanagement.dto.School;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/school/api/")
public class SchoolController {

    @GetMapping(value = "/getSchoolDetails", produces = "application/json")
    public School getSchoolDetails ()
    {
        return new School(1,"STVN","Chinnayagudem");

    }

    @PostMapping(value = "/saveSchool" , consumes = "application/json")
    public void saveSchool(@Valid @RequestBody School requestSchool)
    {
        School school = requestSchool;
        System.out.println(school);
    }
}
