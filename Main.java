import javax.swing.SwingUtilities;

public class Main
{
    public static void main (String Args[])
    {
        SwingUtilities.invokeLater(new Frame());
        Thread inicializacionchat = new Thread(new Chatbot());
        inicializacionchat.start();
    }
    
}