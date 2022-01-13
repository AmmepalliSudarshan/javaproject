package com.mycompany.eb.methods;
class PersonDetails2{
	int id;
	String name;
	double salary;
	String gender;
	double bonus;
	void incSalary(double bonus) {
		System.out.println(salary+bonus);
	}
}
public class Person2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails2 p2=new PersonDetails2();
		p2.salary=10050;
		p2.incSalary(10000);

	}

}
