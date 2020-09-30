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
		
	
	
	Course co1 = new Course("Java", 2, 300.0, false);
	
	Instructor instructor = new Instructor("Sandy", "Schillebeeckx", 42, 25, 35000.0);
	
	co1.addInstructor(instructor);

	Instructor instructor2 = new Instructor("Chris", "Froome", 45, 27, 45000.00);
	
	co1.addInstructor(instructor2);

  
	Course co2 = new Course("Python", 3, 300.0, true);
	
	Instructor instructor3 = new Instructor("Chris", "Rea", 45, 27, 45000.00);
	
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
