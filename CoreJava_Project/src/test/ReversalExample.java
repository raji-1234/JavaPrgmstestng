package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am Rajeshwari Choukimath";
		System.out.println(str1);
//output should be I ma irawhsejaR htamikuohC
		String[] out = str1.split(" ");
		System.out.println(out[0]);
		System.out.println(out[1]);
		System.out.println(out[2]);
		System.out.println(out[3]);
		System.out.println(str1.length());

		for (String name : out) {
			printReverse(name);
			System.out.print(" ");

		}
	}

	private static void printReverse(String name) {
		// TODO Auto-generated method stub/
		String result = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			result = result + name.charAt(i);
		}

		System.out.print(result);

	}

}
