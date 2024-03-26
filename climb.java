import java.util.Scanner;
class climb {
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
        if (n<=2)
        {
            System.out.println(n);
        }
        int a[]= new int[n+1];
        a[1]=1;
        a[2]=2;
        for(int i=3;i<=n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println( a[n]);
        
    }
}// n4 a[5] a[1]=1 a[2]=2 a[3]=3 a[4]=5