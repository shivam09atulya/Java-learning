import java.applet.*;
import java.awt.*;


public class applet extends Applet {

    public void init()
    {
        setBackground(Color.pink);

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(80,100,300,300);
        g.setColor(Color.black);
        g.fillOval(140,160,80,80);
        g.fillOval(270,160,80,80);
        g.setColor(Color.red);
        g.fillArc(170,220,160,140,0,-180);

    }
}
