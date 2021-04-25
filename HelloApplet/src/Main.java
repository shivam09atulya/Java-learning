import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Main extends Applet {
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    Label l3;
    public  void init()
    {

        l1=new Label("First Number ");
        l2=new Label("Second Number");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Add");
       l3=new Label();
        setLayout(null);
        l1.setBounds(50,50,100,20);
        l2.setBounds(50,100,100,20);
        t1.setBounds(100,50,100,20);
        t2.setBounds(100,100,100,20);
        b1.setBounds(200,200,100,20);
        l3.setBounds(250,250,100,20);
        setBackground(Color.lightGray);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l3);
    }
}
