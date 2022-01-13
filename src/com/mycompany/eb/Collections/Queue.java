package com.mycompany.eb.Collections;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int queue[]=new int[size];
		int front=-1;
		int rear=-1;
		System.out.println("queue operation");
		while(true) {
			System.out.println("enter choice");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				if(rear==size-1) {
					System.out.println("queue if full");
				}
				else {
					System.out.println("enter the ele in to queue");
					int key=s.nextInt();
					rear=rear+1;
					queue[rear]=key;
					front=0;
				}
				break;
			case 2:
				if(front>rear||rear==-1&&front==-1) {
					System.out.println("queue cannot be deleted further");
					
				}
				else {
					front=front+1;
					
				}
				break;
			case 3:
				if(front>rear||front==-1&&rear==-1) {
					System.out.println("queue is empty");
				}
				else {
					for(int i=front;i<=rear;i++) {
						System.out.println(queue[i]);
					}
				}
				break;
			case 4:System.exit(0);
			break;
			default:System.out.println("check the option and retry");
			break;
			}
		}

	}

}
