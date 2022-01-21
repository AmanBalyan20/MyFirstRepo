import java.util.*;
class SelectionSort
{
	public static void main(String ar[])
	{
		int num,min,swap=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Element You Want: ");
		num=sc.nextInt();
	    int[] a=new int[num];
		System.out.println("Enter Array Elements ");
		for(int k=0;k<num;k++)
		{
			a[k]=sc.nextInt();
		}
		System.out.println("Arrays After Sorting ");
		for(int i=0;i<num;i++)
		{
			min=i;
			for(int j=i+1;j<num;j++)
			{
				if(a[j]<a[i])
				{
					min=j;
				}
			}
			swap=a[i];
			a[i]=a[min];
			a[min]=swap;
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}