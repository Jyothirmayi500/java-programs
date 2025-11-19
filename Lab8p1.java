import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

public class Lab8p1 extends Frame  implements ActionListener{
    Label l;
    BorderLayout bl;
Lab8p1(){
    super("MenuBar");
    bl=new BorderLayout();
    setLayout(bl);
    l=new Label();
    l.setFont(new Font("Arial",Font.BOLD,50));
    add(l,bl.CENTER);
    l.setAlignment(l.CENTER);
    MenuBar mb=new MenuBar();
    setMenuBar(mb);

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

    setSize(400,400);
    setVisible(true); 
    addWindowListener(
        new WindowAdapter(){
            public  void windowClosing(WindowEvent we){
                dispose();
            }
        }
    );

}
public static void main(String[] args){
    new Lab8p1();
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