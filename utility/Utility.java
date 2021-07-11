package main.utility;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public  class Utility {
	private final static Logger logger= Logger.getLogger("Utility");
	public static void fibonacci(){
	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int prev=0;
		int curr=1;
		int count=0;
		while(count<num){
			int sum=prev+curr;
			logger.log(Level.INFO, String.valueOf(sum));
			prev=curr;
			curr=sum;	
			count++;
		}
		sc.close();
	}
}
