package be.abis.courseadmin.model;

import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;

public class Instructor {
	
    private String firstName;
	private String lastName;
	private int currentAge;
	private int startAge;
	private double salary;
	
	public Instructor(){
		this.firstName 	= "";
		this.lastName 	= "";
		this.currentAge = 0;
		this.startAge 	= 0;
		this.salary 	= 0;
    }
	
	public Instructor(String firstName, String lastName, int currentAge, int startAge, double salary){
		this.firstName 	= firstName;
		this.lastName 	= lastName;
		this.currentAge = currentAge;
		this.startAge 	= startAge;
		this.salary 	= salary;
    }
	
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public int getCurrentAge(){
		return currentAge;
	}
	
	public void setCurrentAge(int currentAge){
		this.currentAge = currentAge;
	}
		
	public int getStartAge(){
		return startAge;
	}
			
	public void setStartAge(int startAge){
		this.startAge = startAge;
	}
		
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public void printSalaryHistory(){
	
	double increasedSalary = 0;	
	int stopAge = 0;	
	int nextAge = 0;
		
	try{
		
	FileWriter myWriter = new FileWriter("salaryhistory.txt");
	
	stopAge = startAge + 35;
	increasedSalary = salary;
	nextAge = startAge;
	
	do{
	
	myWriter.write("Salary of "+ firstName + " at " + nextAge + " is " + increasedSalary +"\n" );
	
	
    nextAge +=5;
	increasedSalary *= 1.03;
    
	} while(nextAge <= stopAge && nextAge <= currentAge);
	
	if (nextAge >= stopAge) {
		myWriter.write("Maximum salary reached \n" );
	}
	 
	myWriter.close();
	
	}catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

}