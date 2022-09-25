package com.bridgelabz.employeeWedge;

public class AddPartTime extends EmployeeWedge {

	public int dayHour(String type) {
		switch (type) {

			case FULL_TIME:
				return 8;
			case PART_TIME:
				return 4;
			default:
				return 0;
		}
	}

}
