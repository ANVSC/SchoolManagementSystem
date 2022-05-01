package com.sumendra.schoolmanagement.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class School {


    private int schoolId;

    @NotEmpty(message = "School Id Should not be null")
    @Size(min = 2, message = "user name should have at least 2 characters")
    private String schoolName;

    private String adress;


}
