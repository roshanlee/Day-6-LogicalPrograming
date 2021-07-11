package main.utility;

import java.util.Scanner;

public class UtilityPrime {
	static boolean checkPrime(){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i*i<=num;i++){
			if(num%i==0)
				return false;
		}
		sc.close();
		return true;
	}
}
