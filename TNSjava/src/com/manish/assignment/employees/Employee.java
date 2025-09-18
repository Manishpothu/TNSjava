package com.manish.assignment.employees;

public class Employee {

	public static void main(String[] args) {
		private String name ;
		private int employeeId;
	    private double  salary ;
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        public String getName() {
	            return name;
	        }

	        protected void setName(String name) {   
	            this.name = name;
	        }

	        public int getEmployeeId() {
	            return employeeId;
	        }

	        private void setEmployeeId(int employeeId) { 
	            this.employeeId = employeeId;
	        }

	        public double getSalary() {
	            return salary;
	        }

	        public void setSalary(double salary) {  
	            this.salary = salary;
	        }

	        
	        public void displayDetails() {
	            System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
	        }
	    
	    }

	}

}
