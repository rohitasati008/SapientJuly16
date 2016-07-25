package com.sapient.day4;

public class Employee implements Comparable<Employee> {
	
	Integer id;
	String name;
	String lastName;
	Double salary;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}



	public Employee(Integer id, String name, String lastName, Double salary) {
		this(id,name);
		this.lastName = lastName;
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName="
				+ lastName + ", salary=" + salary + "]";
	}



	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.id.compareTo(e.id);
		
		if(this.id>e.id){
			return 1;
		}
		else if(this.id == e.id){
			return 0;
		}
		return -1;
	}*/
	@Override
	public int compareTo(Employee o) {
		if(this.name.equals(o.name)){
			return this.lastName.compareTo(o.lastName);
		}
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
