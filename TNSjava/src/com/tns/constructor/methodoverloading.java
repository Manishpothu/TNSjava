package com.tns.constructor;

public class methodoverloading {

	public static void main(String[] args) {
		

		   
		    void display(int a) {
		        System.out.println("Method with int: " + a);
		    }

		   
		    void display(double a) {
		        System.out.println("Method with double: " + a);
		    }

		   
		    void display(String str) {
		        System.out.println("Method with String: " + str);
		    }

		   
		    void display(int a, String str) {
		        System.out.println("Method with int and String: " + a + ", " + str);
		    }


		    void display(String str, int a) {
		        System.out.println("Method with String and int: " + str + ", " + a);
		    }

		   
		        methodoverloading obj = new OverloadExample();


		        obj.display(10);               
		        obj.display(25.5);             
		        obj.display("Hello");          
		        obj.display(101, "Java");      
		        obj.display("Overloading", 2025);
		    }
		}

	}

}
