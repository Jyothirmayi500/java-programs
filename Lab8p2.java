import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8p2  implements ActionListener{
    JFrame f;
    JLabel l;
    BorderLayout bl;
Lab8p2(){
    f.setTitle("JFrame");
    bl=new BorderLayout();
    f.setLayout(bl);
    l=new JLabel();
    l.setFont(new Font("Arial",Font.BOLD,50));
    f.add(l,bl.CENTER);
    MenuBar mb=new MenuBar();
    f.setMenuBar(mb);

    String[] menus={"File","Edit","Help"};
         String[][] mi={
             {"save","open","close"},
             {"cut","copy","paste"},
             {"About","Update","License"}
         };
         int x=0;
         int y=0;
    for(String s:menus){
        y=0;
        Menu m=new Menu(s);
        for(int i=0;i<3;i++){
            MenuItem mmi = new MenuItem(mi[x][y]);
            mmi.addActionListener(this);
            m.add(mmi);
            y++;
        }
        x++;
        mb.add(m);
    }

    f.setSize(400,400);
    f.setVisible(true); 
    f.setDefaultWindowClosing(JFrame.EXIT_ON_CLOSE);


}
public static void main(String[] args){
    new Lab8p2();
}
public void actionPerformed(ActionEvent ae){
    String mstr=ae.getActionCommand();
    if(mstr.equals("close")){
        System.exit(0);
    }
    else{
        l.setText(mstr);
    }
}
            
}