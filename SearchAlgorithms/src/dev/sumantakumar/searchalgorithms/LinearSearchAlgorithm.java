package dev.sumantakumar.searchalgorithms;

import java.util.Scanner;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int len =  sc.nextInt();
		int array[] = new int[len];
		if(len > 0) {
			System.out.println("Enter Arrays : ");
		}else {
			System.out.println("Invalid Array Size\nPlease Try with Valid Size");
			System.exit(0);
		}
		for(int i = 0; i<len; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter Element to search");
		int find = sc.nextInt();
		int index = linearSerach(array, 0, len,find);
		System.out.println(index);
		

	}
	public static int linearSerach(int[]a, int start, int last, int find) {
		int i=-1;
		if(start >= last)
			return i;
		if (a[start]==find){
			return start;
		}
		return linearSerach(a, start+1,last,find);
	}

}
