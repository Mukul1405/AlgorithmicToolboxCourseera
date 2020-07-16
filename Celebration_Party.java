import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Celebration_Party {

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer> years=new ArrayList();
		ArrayList<Integer> months=new ArrayList();
		for(int i=0;i<n;i++)
		{
			years.add(sc.nextInt());
			months.add(sc.nextInt());
		}
		
		ArrayList<Integer> age=new ArrayList();
		for(int i=0;i<n;i++)
		{
			age.add((years.get(i)*12)+months.get(i));
		}
			
		Collections.sort(age);
//		System.out.println(age);
	
		int count=0;
		int i=0,j=1;
		while(i<n)
		{
			int currentGroup=age.get(i);
//			group.add(age.get(i));
			System.out.print(j+""+"st group is ");
			try {
			while((currentGroup+12>=age.get(i))&& (i)<n)
			{
				System.out.print(age.get(i)+" ");
				i++;
			}
			}
			catch(Exception e)
			{
				System.out.println();
			}
			System.out.println();
			j++;
			
		}
	}
}
// This algo is done in O(n) time complexity