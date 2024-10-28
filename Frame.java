import javax.swing.*;

public class Frame extends JFrame implements Runnable 
{
    Panel panel;

    public Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Trabajo 1 Multihilo y Mas Cositas");
    }

    public void run() 
    {
        panel = new Panel();
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}