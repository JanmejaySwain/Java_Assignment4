package assignment4.src;

import java.security.cert.Extension;
import java.util.Scanner;

//WAP to check weather a number is palindrome number and divisible by 3 and 5 or not using
//custom exception and interface?
public class Assignment4_3 implements checkPlaindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        Assignment4_3 obj=new Assignment4_3();
        try {
            obj.checkAll(n);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void checkAll(int n) throws NotPalindrome{
        int temp=n,rev=0;
        while(temp>0)
        {
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }

        if(rev==n&& n%3==0 && n%5==0)
        {
            throw  new NotPalindrome(n+" is a palindrome number");
        }else {
            throw  new NotPalindrome(n+" is not a palindrome number");
        }
    }
}
interface checkPlaindrome
{
    public void checkAll(int n) throws NotPalindrome;
}


class NotPalindrome extends Exception{
    NotPalindrome(String str)
    {
        super(str);
    }
}
