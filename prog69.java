import java.util.Scanner;
class rightrotate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no of array elements");
		int n=sc.nextInt();
		System.out.println("no of times of rotation");
		int c=sc.nextInt();
		int lst;int k;int i;
		int []a=new int[n];
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=1;j<=c;j++)
		{
			lst=a[n-1];
			for(k=n-1;k>0;k--)
			{
				a[k]=a[k-1];
			}
			a[k]=lst;
		}
		for(int m=0;m<n;m++)
			System.out.print(a[m]+" ");
	}
}
