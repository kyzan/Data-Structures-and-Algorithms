

import java.util.Scanner;

public class MergeSort
{
	public static void merge(int a[] , int s , int e)
	{
		int mid = (s+e)/2;
		int i=s,j=mid+1,k=s;
		int temp[] = new int[e+1];
		while(i<=mid && j<=e)
		{
			if(a[i]<a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}

		while(i<=mid)
			temp[k++] = a[i++];
		while(j<=e)
			temp[k++] = a[j++];

		for(i=s;i<=e;i++)
			a[i] = temp[i];
	}

	public static void mergeSort(int a[] , int s , int e)
	{
		if(s>=e)
			return ;
 	
		int mid = (s+e)/2;
		mergeSort(a,s,mid);
		mergeSort(a,mid+1,e);

		merge(a,s,e);
	}

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = cin.nextInt();

		mergeSort(a,0,n-1);

		for(int i=0;i<n;i++)
			System.out.print(a[i] + " ");
	}
}
