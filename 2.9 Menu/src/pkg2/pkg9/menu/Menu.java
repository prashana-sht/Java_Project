package pkg2.pkg9.menu;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    static JButton b;
    static JFrame f;
    static JPopupMenu pm;
    JLabel l;
    Menu()
    {
    }
    public static void main(String[] args) {
        f = new JFrame("Popup");
 
        f.setSize(400, 400);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel p = new JPanel();
 
        Menu menu = new Menu();
 
        b = new JButton("click");
 
        b.addActionListener(menu);
 
        pm = new JPopupMenu("Message");
 
        JMenuItem m1 = new JMenuItem("Item1");
        JMenuItem m2 = new JMenuItem("Item2");
        JMenuItem m3 = new JMenuItem("Item3");
 
        final JLabel l = new JLabel("nothing clicked yet");
 
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
 
        m1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Item 1 clicked.");
            }
        });
 
        m2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Item 2 clicked.");
            }
        });
 
        m3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Item 3 clicked.");
            }
        });
        p.add(b);
        p.add(l);
        f.add(p);
        f.show();
    }
 
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("click")) {
            pm.show(f, 100, 100);
        }
    }
}
