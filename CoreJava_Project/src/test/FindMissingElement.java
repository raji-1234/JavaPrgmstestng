package test;

public class FindMissingElement {
	// TODO Auto-generated method stub
public static void main(String[] args) {
	int[] first = { 1, 2, 4, 5 };
	int n = first.length + 1;
	int[] second = new int[n + 1];
	// Store frequencies of elements
	for(int i = 0;i<first.length;i++)
	{
		int val = first[i];
		second[val] = second[val] + 1; // 0+1 = 1
	}
	// Find the missing number
	for(int i = 1;i<=n;i++)
	{
		if (second[i] == 0) {
			System.out.println(i);
		}
	}
	}
}