package com.bridgelabz.employeeWedge;

public class EmployeeWedge {
	
	public static final int perHourWedge = 200;
	public static final String PART_TIME = "PART_TIME";
	public static final String FULL_TIME = "FULL_TIME";
	
	public static void main(String[] args) {
		
		EmployeeWedgeUC1 uc1 = new EmployeeWedgeUC1();
		uc1.attendance();
		
		EmployeeDailyWedgeUC2 uc2 = new EmployeeDailyWedgeUC2();
		double perDaySalary = uc2.dailyWedge(perHourWedge, 8);
		System.out.println("Employee per day salary= "+perDaySalary);
		
		AddPartTime uc3 = new AddPartTime();
		int dailyhours = uc3.dayHour(PART_TIME);
		System.out.println("part time employee hour is: "+dailyhours);
		
		int dailyhours2 = uc3.dayHour(FULL_TIME);
		System.out.println("part time employee hour is: "+dailyhours2);
		
		WagesPerMonthUC5 uc5 = new WagesPerMonthUC5();
		double monthlySalary = uc5.monthlyWedge(perDaySalary, 20);
		System.out.println("Monthly Salary of Employee is: "+monthlySalary);
		
	}

}
