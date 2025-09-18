package com.manish.assignment.employees;

public class managerextendsemployee {

	public static void main(String[] args) {
		private String department;

	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Department: " + department);
	    }
	}
	