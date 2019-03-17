

import java.util.Scanner;

public class QuickSort
{
	public static int partition(int a[] , int s , int e)
	{
		int i = s-1 , j , pivot = a[e];
		for(j=s;j<e;j++)
		{
			if(a[j] < pivot)
			{
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[e];
		a[e] = t;

		return i+1;
	}

	public static void quickSort(int a[] , int s , int e)
	{
		if(s >= e)
			return ;
		int p = partition(a,s,e);
		quickSort(a,s,p-1);
		quickSort(a,p+1,e);
	}

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = cin.nextInt();

		quickSort(a,0,n-1);

		for(int i=0;i<n;i++)
			System.out.print(a[i] + " ");
	}
}
