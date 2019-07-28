package com.rajesh.router.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeEvent {
	
	private Employee employee;
    private Date date;

}
