package com.sumendra.schoolmanagement.controller;

import com.sumendra.schoolmanagement.dto.School;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/school/api/")
public class SchoolController {

    @ApiOperation(nickname = "getSchoolDetails",value="Getting School Details", notes="Retrieves all the details of the school depending up on the ID of the school passed as path variable")
    @ApiResponses(
            value={
                    @ApiResponse(code=200,message="Success, Ended OK", response = String.class),
                    @ApiResponse(code=400, message= "Bad Request", response = String.class)
            }
    )
    @GetMapping(value = "/getSchoolDetails", produces = "application/json")
    //@LogExecutionTime()
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
