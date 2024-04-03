import java.util.Scanner;
class switch5
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
String month=sc.next();
switch(month)
{
case "january":case "march":case "may":case "july":case "august":case "october":case "december":System.out.println("this month have 31 days in it");
break;
case "february":System.out.println("enter the year");
int yr=sc.nextInt();
if((yr%100==0)&&(yr%400==0)||(yr%4==0)&&(yr%100!=0))
{
System.out.println("it has 29 days");
}
else
{
System.out.println("it has 28  days");
}
break;
case "april":case "september":case "june":case "november":System.out.println("this month have 30 days in it");
break;
default:System.out.println("invalid input");
}
}
}