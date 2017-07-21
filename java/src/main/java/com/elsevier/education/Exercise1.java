package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
Steps:
1) remove field Setters (commented here for past reference) 
2) provide a constructor for setting 
3) remove default constructor
4) make class final

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		//public Person() {//Remove default constructor
		//}
		public Person(String firstName,String lastName,Set<String> phoneNumbers) {
			this.firstName = firstName;	
			this.lastName = lastName;	
			this.phoneNumbers = phoneNumbers;	
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		//	phoneNumbers = newPhoneNumbers;
		//}
		
		public String getFirstName() {
			return firstName;
		}
		//public void setFirstName(String newName) {
		//	firstName = newName;
		//}
		
		public String getLastName() {
			return lastName;
		}
		//public void setLastName(String newName) {
		//	lastName = newName;
		//}
	}
}
