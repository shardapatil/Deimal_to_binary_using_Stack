package com.nm.dtob;

import java.util.Scanner;

public class DecimalToBinaryUsingStack {

	int stack[],top;
	
	void stack(int size)
	{
		stack = new int[size];
		top--;
	}
	
	boolean isStackEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	boolean isStackFull()
	{
		if(top == stack.length-1)
			return true;
		else
			return false;
	}
	
	void push(int element)
	{
		if(isStackFull())
		{
			System.out.println("Stack is full");
			return;
		}
		else
		{
			top++;
			stack[top] = element;
		}
	}
	
	Integer pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			int temp = stack[top];
			top--;
			return temp;
		}
	}
	
	void print()
	{
		for(int i =top; i>=0;i--)
		{
			System.out.print(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		
		DecimalToBinaryUsingStack db = new DecimalToBinaryUsingStack();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number in decimal : ");
		int num = sc.nextInt();
		
		db.stack(10);
		
		while(num!=0)
		{
			int rem;
			rem = num%2;
			num = num/2;
			
			db.push(rem);
		}
		
		db.print();
	}
}
