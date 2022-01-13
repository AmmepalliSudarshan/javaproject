package com.mycompany.eb.methods;
class PersonDetails3{
	int id;
	String name;
	double salary;
	String gender;
	double incSalary(double bonus) {
		return salary+bonus;
	}
}
public class Person3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails3 p3=new PersonDetails3();
		p3.salary=12500;
		double newSal=p3.incSalary(5000);
		System.out.println(newSal);

	}

}
