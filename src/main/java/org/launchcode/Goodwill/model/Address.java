package org.launchcode.Goodwill.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @NotNull
    @Size(min = 3,max = 25)
    private String streetName;
    @NotNull
    @Size(min = 3,max = 20,message = "This field is required")
    private  String city;
    @NotNull
    @Size(min = 3,max = 20,message = "This field is required")
    private String state;
    @NotNull
    @Size(message = "Email ID is required")
    private  String emailID;
    @NotBlank(message = "Phone number is required")
    private Integer phoneNumber;
}
