package com.test.comparision;


public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	
	@Override	
	public boolean equals(Object obj) {
		boolean isEqual = true;
		System.out.println("isEqual0 for "+ toString() +" and "+ obj+" is: "+isEqual);
		if(obj==null) { return false; }
		System.out.println("isEqual1 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);
		if(obj==this) { return true; }
		System.out.println("isEqual2 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);
		isEqual = isEqual && obj instanceof Person;
		System.out.println("isEqual3 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);		
		isEqual = isEqual && this.firstName!=null;
		isEqual = isEqual && this.lastName!=null;
		System.out.println("isEqual4 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);		
		isEqual = isEqual && ((Person)obj).firstName !=null;
		isEqual = isEqual && ((Person)obj).lastName !=null;
		System.out.println("isEqual5 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);		
		isEqual = isEqual && this.firstName.equals(((Person) obj).firstName);
		isEqual = isEqual && this.lastName.equals(((Person) obj).lastName);
		System.out.println("isEqual6 for "+ toString() +" and "+ obj.toString()+" is: "+isEqual);
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		int hashCode = (firstName!=null ? firstName.hashCode() : 0) + 
				(lastName!=null ? lastName.hashCode() : 0);
		System.out.println("hashCode for "+toString()+" is: "+hashCode);
		return hashCode;
	}
	
	@Override
	public String toString() {
		return "[firstName="+firstName+"],[lastName="+lastName+"]";
	}
	
	@Override
	public int compareTo(Person p) {
		if(p==null) { return -1; }
		if(this.firstName==null) { return 1; }
		if(p.firstName==null) { return -1; }
		if(this.firstName.equals(p.firstName)) { 
			if(this.lastName==null) { return 1; }
			if(p.lastName==null) { return -1; }
			if(this.lastName.equals(p.lastName)) {
				return 0;
			}else {
				return this.lastName.compareTo(p.lastName);
			}
		}else {
			return this.firstName.compareTo(p.firstName);
		}
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return new Person(firstName, lastName);
	}
}
