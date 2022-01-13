package com.mycompany.eb.constructors;
class Box1{
	int height;
	int width;
	int depth;
	public Box1(int h,int w,int d) {
		height=h;
		width=w;
		depth=d;
	}
	void volume() {
		System.out.println(height*width*depth);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 b1=new Box1(20,30,20);
		b1.volume();

	}

}
