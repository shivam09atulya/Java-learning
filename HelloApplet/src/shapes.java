import java.awt.*;
import java.applet.*;
public class shapes extends Applet{
    public void paint(Graphics g)
    {
        setBackground(Color.lightGray);
        g.setColor(Color.yellow);
        g.drawRect(100,100,100,100);

        g.fillRect(100,100,100,100);
        g.drawOval(180,200,100,100);
        g.fillOval(180,200,100,100);
        g.setColor(Color.black);
        g.drawLine(100,150,180,130);
    }
}
