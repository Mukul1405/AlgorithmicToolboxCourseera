import java.util.Scanner;

public class fibonaaci_sum_of_squares {

	 static long calculateSquareSum(long n)  
	    {  
	        if (n <= 0)  
	            return 0;  
	        n=n%60;
	       long a=0;
	       long b=1;
	       long c=0;
	        
	        // Initialize result  
	        long sum = (a*a+b*b);  
	        if(n>=2) {
	        // Add remaining terms  
	        for (int i = 1; i < n; i++) {  
	        	c  = a + b; 
	        	a=b;
	        	b=c;
	        	b=b%10;
	            sum += (b*b);
	            sum%=10;
//	            System.out.(a+" "+b+" "+c+" "+sum);
	        	}  
	        
	        return  (sum%10); 
	    	}
	        else
	        	return n*n;
	    }  
	        
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	    	   Scanner sc=new Scanner(System.in);
	           long n = sc.nextLong();  
	           System.out.println(calculateSquareSum(n));  
	            
	    } 
}
