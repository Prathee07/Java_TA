package array;

import java.util.Scanner;
class Dog{
	String breed;
	int age;
}

public class Array_of_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of objects that u need to create");
		int n=sc.nextInt();
		Dog []arr=new Dog[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Dog();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the breed of dog "+(i+1));
			arr[i].breed=sc.next();
			System.out.println("Enter the age of dog "+(i+1));
			arr[i].age=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The breed of the dog "+(i+1)+" is "+arr[i].breed+" and the age is"+arr[i].age);
		}
		
		
	}

}
