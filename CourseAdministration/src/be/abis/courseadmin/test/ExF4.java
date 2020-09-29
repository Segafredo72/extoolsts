package be.abis.courseadmin.test;

import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;
import be.abis.courseadmin.model.*;

public class ExF4{

public static void createFile (){
     try {
      File myObj = new File("salaryhistory.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
	  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

public static void main(String[] args){


	createFile();
		
	
	Instructor instructor = new Instructor();
	Course co1 = new Course();
	
	co1.setTitle("Java"); 
	co1.setNumberOfDays(2);
	co1.setPricePerDay(300.0);
	co1.setPriorKnowledgeRequired(false);
	
	instructor.setFirstName("Sandy");
	instructor.setLastName("Schillebeeckx");
	instructor.setCurrentAge(35);
    instructor.setStartAge(25);
	instructor.setSalary(35000.00);
	
	co1.addInstructor(instructor);

	Instructor instructor2 = new Instructor();
	instructor2.setFirstName("Chris");
	instructor2.setLastName("Froome");
	instructor2.setCurrentAge(45);
    instructor2.setStartAge(27);
	instructor2.setSalary(45000.00);
	
	co1.addInstructor(instructor2);

  
	Course co2 = new Course();
	
	co2.setTitle("Python"); 
	co2.setNumberOfDays(3);
	co2.setPricePerDay(300.0);
	co2.setPriorKnowledgeRequired(true);
	
	Instructor instructor3 = new Instructor();
	instructor3.setFirstName("Chris");
	instructor3.setLastName("Rea");
	instructor3.setCurrentAge(45);
    instructor3.setStartAge(27);
	instructor3.setSalary(45000.00);
	
	co2.addInstructor(instructor3);
		
	Course[] courses = { co1, co2 };

	try {
		for (Course c : courses) {
			System.out.println(c.getTitle() + " costs " + c.calculatePrice());
			c.printInfo();
		}
	}

	catch (IOException e) {
		System.out.println(e.getMessage());
	}

	
		
	instructor.printSalaryHistory();
	}

	
}
