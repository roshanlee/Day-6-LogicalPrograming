package main.utility;

import java.util.Scanner;

public class ReverseNum {
	static int reverseNum(){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
		}
		sc.close();
		return rev;
		
		
	}
}
