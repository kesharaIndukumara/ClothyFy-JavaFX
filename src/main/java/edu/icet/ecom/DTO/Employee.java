package edu.icet.ecom.DTO;

import lombok.*;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee extends EmployeeUser {
    private String id;
    private String name;
    private String nic;
    private String address;
    private Date DOB;
    private String contactno;


}
