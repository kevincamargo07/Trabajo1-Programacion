import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener
{

    private final int anchoP = 1800;
    private final int altoP = 1000;

    String absolutePath = System.getProperty("user.dir");
    Image millos;
    Image fondo;
    Timer timer;

    int velocidadx = 5;
    int velocidady = 4;

    int x = 0;
    int y = 0;
    // C:\Users\kevin\OneDrive\Documentos\Maestria\Semestre III\programacionavanzada\trabajo1\Escudo_Millos.png
    Panel() 
    {
        this.setPreferredSize(new Dimension(anchoP, altoP));
        this.setBackground(Color.BLACK);
        millos = new ImageIcon(absolutePath + "\\Escudo_Millos.png").getImage();
        fondo = new ImageIcon(absolutePath + "\\5572419.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        int width = this.getWidth();
        int height = this.getHeight();

        graphics2D.drawImage(fondo, 0, 0, width, height, null);
        graphics2D.drawImage(millos, x, y, 200, 200,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(x >= anchoP - millos.getWidth(null) || x < 0) 
        {
            velocidadx = velocidadx * -1;
        }
        if(y >= altoP - millos.getHeight(null) || y < 0) 
        {
            velocidady = velocidady * -1;
        }
        x = x + velocidadx;
        y = y + velocidady;
        repaint();
    }
    
}
