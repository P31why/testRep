package com.exampl.laba12;

public class Tester {
private String name;
private String surname;
private int expirianceInYears;
private String englishLevel;
private float salary;

public Tester(String name, String surname, float salary)
{
	this.name=name;
	this.surname=surname;
	this.salary=salary;	
}
public Tester(String name, String surname, float salary,String englishLevel)
{
	this(name,surname,salary);
	this.englishLevel=englishLevel;
	
}
public Tester(String name, String surname, int expir, String englishLevel, float salary)
{
	this(name,surname,salary,englishLevel);
	expirianceInYears=expir;
}
public static void printMessage(String message,int a)
{
	System.out.println(message+" "+a);
}
public static void printMessage(String message) 
{
	System.out.println(message);
}
public static void printMessage() 
{
	System.out.println("Message");
}
public void setName(String name)
{
	this.name=name;
}
public void setSurname(String surname)
{
	this.surname=surname;
}
public void setEngLevel(String enL)
{
	englishLevel=enL;
}
public void setExp(int year)
{
	expirianceInYears=year;
}
}
