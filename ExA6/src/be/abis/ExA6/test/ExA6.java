package be.abis.ExA6.test;

import java.time.LocalDate;

import be.abis.ExA6.model.Address;
import be.abis.ExA6.model.Company;
import be.abis.ExA6.model.Person;

public class ExA6 {

	public static void main(String[] args) {
		
		Address address = new Address("Diesteweg", "14/B", "3000", "Leuven", "Belgie", "BE");
				
		Company company = new Company("ABIS", address);
		
		Person person  = new Person(1, "Ann", "Smits", LocalDate.of(1985, 7 , 23), company ) ;
		
		Person person1 = new Person(1, "John", "Doe", LocalDate.of(1966, 7 , 23)) ;
		
		System.out.println(person);
		
		System.out.println(person1);
		
	}
}
