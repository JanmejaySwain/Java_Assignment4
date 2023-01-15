package assignment4.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//WAP to check weather a number is Armstrong number or not using custom exception and
//interface?
public class Assignment4_2 implements Amstrong{
    public static void main(String[] args) {
        Assignment4_2 a2=new Assignment4_2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        try
        {
            a2.checkAmstrong(num);
        }catch (test1 e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void checkAmstrong(int num) throws test1 {
        int rem,result=0,count=0;
        int temp=num;
        int temp1=num;

        while(temp>0)
        {
            rem=temp%10;
            result=result+(rem*rem*rem);
            temp=temp/10;
        }
        if(result==num)
        {
            throw new test1(num+" is an amstrong number");
        }else {
            throw new test1(num+" is not an amstrong number");
        }

    }
}
interface Amstrong
{
    void checkAmstrong(int num) throws test1;
}
class test1 extends Exception
{
test1(String str)
{
    super(str);
}
}

