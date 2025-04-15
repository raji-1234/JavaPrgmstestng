package test;

public class LoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		int pointer = 1;
		while (pointer <= 10) {
			int result = number * pointer;
			System.out.println(result);
			pointer++;
		}
		System.out.println("End of while loop");

		System.out.println("===========================================");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
		System.out.println("End of for loop");

		System.out.println("===========================================");
		String[] names = { "Joe", "Smith", "Mary", "Shiv" };
		for (String str1 : names) {
			System.out.println(str1);
		}
		System.out.println("===========================================");
		//same this using normal for loop
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
