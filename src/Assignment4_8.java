package assignment4.src;

//WAP to create pyramid of even and odd numbers using multithreading?
public class Assignment4_8 implements Runnable{
    int num;
    Assignment4_8(int num)
    {
        this.num=num;
    }
    public synchronized void run()
    {
        createPyramid(num);
    }

    private void createPyramid(int num) {
        for(int i=1;i<=4;i++)
        {
            for(int j=4-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(num+" ");
                num=num+2;
            }
            System.out.println();
        }
        notify();
    }

}
class Number
{
    public static void main(String[] args) {
        Assignment4_8 obj1=new Assignment4_8(1);
        Thread t1=new Thread(obj1);
        t1.start();
        synchronized (t1)
        {
            try {
                t1.wait();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        Assignment4_8 obj2=new Assignment4_8(2);
        Thread t2=new Thread(obj2);
        t2.start();
    }
}