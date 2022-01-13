package com.mycompany.eb.methods;
class PersonDetails{
	int id;
	String name;
	double salary;
	String gender;
	void display() {
		System.out.println(name);
	}
}
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails p1=new PersonDetails();
		p1.name="Vasuda";
		p1.display();

	}

}
