package com.java.test;

public class ContractTest {
	public static void main(String[] args){
		Employee emp1 = new Employee("1", "29061986");
		Employee emp2 = new Employee("1", "29061986");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
	}
}

class Employee{
	String empId;
	String dob;
	
	public Employee(String theId, String theDob){
		empId = theId;
		dob = theDob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}
	
	
}
