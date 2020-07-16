import java.util.Scanner;

public class chane_dp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[3][n];
		int coins[]= {1,3,4};
		for(int i=0;i<3;i++)
		{
			getRow(arr,coins[i], i,coins);
		}
		System.out.println(arr[2][n-1]);
	}

	private static void getRow(int[][] arr, int n,int i,int coinarr[]) {
		for(int j=0;i<arr[i].length;j++)
		{
			int coin=j+1;
			int numberofcoins=0;
			while(coin>=0 && coin>=i)
			{
				coin-=i;
				numberofcoins++;
				System.out.println(coin+" "+numberofcoins);
			}
			int k=i;
			while(coin>0)
			{
				if(coin<coinarr[k-1])
				{
					k--;
				}
				coin-=coinarr[k];
				numberofcoins++;
				System.out.println(coin+" "+numberofcoins);

			}
			
			if(i>0)
			{
				arr[i][j]=(arr[i-1][j]<numberofcoins)?arr[i-1][j]:numberofcoins;
			}
			else
				arr[i][j]=numberofcoins;
		}
	
	}




}
