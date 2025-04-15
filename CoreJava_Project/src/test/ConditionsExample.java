package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("******");

		System.out.println("====================================================");*/

		int x;
		int y;
		Scanner s1 = new Scanner(System.in);
		/*System.out.println("Enter the value of x :");
		x = s1.nextInt();
		System.out.println("Enter the value of y :");
		y = s1.nextInt();
		if (x == y) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
		*/
		String name1;
		String name2;
		System.out.println("Enter the value of name1 :");
		name1=s1.nextLine();
		System.out.println("Enter the value of name2 :");
		name2=s1.nextLine();
		if (name1.equals(name2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
		//Case insensitive
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
	}

}
