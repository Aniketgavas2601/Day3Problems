package com.bridgelabz.employeeWedge;

public class EmployeeWedgeUC1 {
	
	public void attendance() {
	
	int FULL_TIME = 1;
	double empPresentOrAbsent = (int) (Math.floor(Math.random() * 10) % 2);
	if (empPresentOrAbsent == FULL_TIME) {
		System.out.println("Employee is Present");
	}
	else {
		System.out.println("Employee is Absent");
	}
}
}

