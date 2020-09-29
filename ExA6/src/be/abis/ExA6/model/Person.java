package be.abis.ExA6.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private int personNumber;
	private String firstname;
	private String lastName;
	private LocalDate birthDate;
	Company company = new Company();
	
	

	public Person() {

	}

	public Person(int personNumber, String firstname, String lastName, LocalDate birthDate) {
		super();
		this.personNumber = personNumber;
		this.firstname = firstname;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public Person(int personNumber, String firstname, String lastName, LocalDate birthDate, Company company) {
		super();
		this.personNumber = personNumber;
		this.firstname = firstname;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.company = company;
	}

	public int getPersonNumber() {
		return personNumber;
	}
	
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Person [personNumber=" + personNumber + ", firstname=" + firstname + ", lastName=" + lastName
				+ ", Age=" + calculateAge(birthDate) + ", company=" + company + "]";
	}
	
	
	public int calculateAge(LocalDate birthDate) {
		  
		  LocalDate now1 = LocalDate.now();
		  Period diff1 = Period.between(birthDate, now1);
		  return diff1.getYears();
	}
	
}
