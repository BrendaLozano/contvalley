package com;

import java.util.Scanner;

public class Principal {

	static int countingValleys(int n, String s) {

		int vCount = 0;
		int altitud = 0;
		char c;
		for (int i = 0; i < n; i++) {
			c = s.charAt(i);
			if (c=='U') {
				altitud++;
				if (altitud == 0) {
					vCount++;
				}

			} else {

				altitud--;
			}
		}
		return vCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(countingValleys(n, str));
		sc.close();
	}
	
	

}
