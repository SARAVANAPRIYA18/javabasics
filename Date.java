package com.basic;

public class Date {
	int month,day,year;
	public Date(int month,int day,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void display() {
		System.out.println("Date :" + day +"." + month + "." + year);
	}
	public static void main(String[] args) {
		Date d= new Date(11,18,1997);
		d.display();
		
	}

}