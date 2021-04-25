import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class something extends Applet{
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    Label l3;
    public void init()
    {
        l1=new Label("First Number = ");
        l2=new Label("Second text = ");
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
        setBackground(Color.orange);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        add(b1);
        add(l3);
        b1.addActionListener(new MyHandler());
    }
    public class MyHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int a,b,s;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            s=a+b;
            l3.setText("Sum is "+s);
        }

    }


}