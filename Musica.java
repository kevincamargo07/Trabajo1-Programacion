import javax.sound.sampled.*;
import java.io.File;


public class Musica
{
    private static Clip cancion;

    public static void reproducirMusica(String ubicacion) 
    {
        try 
        {
            File ruta = new File(ubicacion);
            if(ruta.exists()) 
            {
                AudioInputStream arc = AudioSystem.getAudioInputStream(ruta);
                cancion = AudioSystem.getClip();
                cancion.open(arc);
                cancion.start();
            } 
            else 
            {
                System.out.println("Error Archivo de audio no existente");
            }
        } 
        catch (Exception k) 
        {
            System.out.println(k);
        }
    }

    public static void pausar() 
    {
        if (cancion != null && cancion.isRunning()) 
        {
            cancion.stop();
        }
    }

    public static void reanudar() 
    {
        if (cancion != null && !cancion.isRunning()) 
        {
            cancion.start();
        }
    }


    public static void detener() 
    {
        if (cancion != null) 
        {
            cancion.stop();
            cancion.close();
        }
    }

}
