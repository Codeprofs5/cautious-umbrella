import java.util.Scanner;
class insertion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();int index2;
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int index1=1;index1<=a.length;index1++)
		{
			int temp=a[index1];
			index2=index1;
			for( ;index2>0&&a[index2-1]>temp; )
			{
				a[index2]=a[index2-1];
				index2--;
			}
			a[index2]=temp;
		}
	for(int m=0;m<n;m++)
	System.out.println(a[m]+" ");
	}
}

			
		