import java.applet.Applet;
import java.awt.*;
/* <applet code="MovingBall" width=2000 height=2000></applet>*/

public class MovingBall extends Applet implements  Runnable {
    Thread t;
    int x=100,y=100;
    public void start()
    {
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.fillOval(x,y,100,100);


    }
    public void run() {
        try
        {
            for(;;)
            {
                if(x==1900)
                {
                    x=100;
                    y=100;
                    repaint();

                }else{
                        x=x+15;
                        repaint();
                    Thread.sleep(100);
                    }
                }

        }catch (Exception e){}
    }

}
