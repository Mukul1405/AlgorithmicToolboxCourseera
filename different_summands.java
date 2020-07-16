import java.util.ArrayList;
import java.util.Scanner;

public class different_summands {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("0");
		}
		else
		{
			ArrayList<Integer> al=new ArrayList();
			int a=1;
			
			while(n>=a)
			{
				
				al.add(a);
				n-=a;
				a++;
			}
			
			if(n>0)
			{
				al.remove(al.size()-1);
				al.add(al.size(),(a+n-1));
				System.out.println(al.size());
				for(int i=0;i<al.size();i++)
				{
					System.out.print(al.get(i)+" ");
				}
			}
			else
			{
				System.out.println(al.size());
				for(int i=0;i<al.size();i++)
				{
					System.out.print(al.get(i)+" ");
				}
			}
		}

	}

}
