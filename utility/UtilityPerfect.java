package main.utility;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class UtilityPerfect {
	private final static Logger logger= Logger.getLogger("Utility");
	public static void  perfectNum(){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(sum==num)
			logger.log(Level.INFO, "Perfect Number");
		else
			logger.log(Level.INFO, " Not Perfect Number");
			
		sc.close();
	} 
	
	
	
}
