package edu.icet.model;


import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String contactNumber;

}
