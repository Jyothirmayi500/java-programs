import java.awt.event.*;
import java.awt.*;
 public class Lab7p1{
    public static void main(String[] args){
    Frame f=new Frame();
    TextField t=new TextField(30);
    Button b=new Button("Click");
    b.setSize(10,20);
    Label l=new Label();
    int a[]={1};
    l.setPreferredSize( new Dimension(100,100));
        f.setSize(400,400);
        f.setVisible(true);
        f.setTitle("Event Handling");
        f.add(t);
        f.add(b);
        f.add(l);
        FlowLayout fl=new FlowLayout();
        f.setLayout((fl));
        b.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("the Text is"+t.getText()+"_"+ a[0]);
                    l.setText(t.getText());
                    a[0]++;
              }
            }
        );

    }

 } 

