package com.manish.assignment.employees;

public class developerextendsemployee {

	public static void main(String[] args) {
		private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
	}