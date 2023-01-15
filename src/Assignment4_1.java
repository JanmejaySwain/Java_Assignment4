//. WAP to create a list of prime Fibonacci series between user defined range and default range is
//10 to 50 using interface?
public class Assignment4_1 {
    public static void main(String[] args) {
    //List l1=new List();
    List l2=new List(20,60);
    l2.findPrime();
    l2.findFibonacci();
    }
}
interface Ilist
{
    public void findPrime();
    public void findFibonacci();
}
class List implements Ilist
{
    int start=10;
    int end=50;
   // List(){ }
    List(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    @Override
    public void findPrime()
    {

        System.out.println("The prime No.s are :");
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(" "+i);
            }
        }
    }

    @Override
    public void findFibonacci() {
        int a=0,b=1,c=0;
        System.out.println("\nFibonacci Series are :");

        while(c<=end)
        {
            c=a+b;
            if(c>=start && c<=end)
            {
                System.out.print(" "+c);
            }
            a=b;
            b=c;
        }
    }


}
