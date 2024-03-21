//check number is even or odd in buffered reader
import java.io.*;
class bfr1
{
public static void main(String args[])throws IOException
{
InputStreamReader ins=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(ins);
int num=Integer.parseInt(br.readLine());
if (num%2==0)
{
System.out.println(num+"is even");
}
else
{
System.out.println(num+"is odd");
}
}
}


