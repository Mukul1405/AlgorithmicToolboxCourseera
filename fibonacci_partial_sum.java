import java.util.Scanner;

public class fibonacci_partial_sum {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long m=sc.nextLong();
       long n=sc.nextLong();
      
       long a= getans(m);
       long b= getans(n);
       if(m!=1)
       System.out.println(Math.abs(a-b));
       else
    	   System.out.println(Math.abs(a-b)+1);
    }

	private static long getans(long n) {
		
		 if (n <= 0)  
	            return 0;  
	        n=n%60;
	       long a=0;
	       long b=1;
	       long c=0;
	        
	        // Initialize result  
	        long sum = (a+b);  
	        if(n>=2) {
	        // Add remaining terms  
	        for (int i = 1; i < n; i++) {  
	        	c  = a + b; 
	        	a=b;
	        	b=c;
	        	b=b%10;
	            sum += b;
	            sum%=10;
//	            System.out.(a+" "+b+" "+c+" "+sum);
	        	}  
	        
	        return  (sum%10); 
	    	}
	        else
	        	return n;
	}
}
