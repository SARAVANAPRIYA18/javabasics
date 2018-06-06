package com.basic;

public class Employee {
	private String firstname;
	private String lastname;
	private double monthlysalary,salary,salary1;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		if(monthlysalary>0)
		{
		this.monthlysalary = monthlysalary;
	}
		}
	
	public static void main(String[] arg)
	{
	Employee employee1= new Employee();
	Employee employee2= new Employee();
	employee1.setFirstname("Raja");
	employee2.setFirstname("Jagan");
	employee1.setLastname("Kumar");
	employee2.setLastname("Kumar");
	employee1.setMonthlysalary(500.0);
	employee2.setMonthlysalary(100.0);
	 double   salary= employee1.getMonthlysalary();
	          salary= 12.0 * salary;
	          employee1.setSalary(salary);
	          salary= employee2.getMonthlysalary();
	          salary= 12.0 * salary;
	          employee2.setSalary(salary);
	         salary=employee1.getSalary();
	         salary=1.1*salary;
	         employee1.setSalary1(salary);
	         salary=employee2.getSalary();
	         salary=1.1*salary;
	         employee2.setSalary1(salary);
	System.out.println(employee1.getFirstname()+" " + employee1.getLastname()+" yearly salary :"+employee1.getSalary());
	System.out.println(employee2.getFirstname()+" " + employee2.getLastname()+" yearly salary :"+employee2.getSalary());
	System.out.println(employee1.getFirstname()+" " + employee1.getLastname()+" yearly salary after 10% raise :"+employee1.getSalary1());
	System.out.println(employee2.getFirstname()+" " + employee2.getLastname()+" yearly salary after 10% raise :"+employee2.getSalary1());
	}
	public double getSalary1() {
		return salary1;
	}
	public void setSalary1(double salary1) {
		this.salary1 = salary1;
	}
	
	
	}

