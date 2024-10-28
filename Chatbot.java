import java.util.Scanner;
public class Chatbot extends Chatbotp2 implements Runnable 
{

    @Override
    public void interaccion(int entrada) 
    {
        String absolutePath = System.getProperty("user.dir");
        String ubicacion =absolutePath + "\\PiponasRmx.wav";
        switch ((int)entrada)
        {
            case 1:
                System.out.println("Reproduciendo");
                new Thread(() -> Musica.reproducirMusica(ubicacion)).start();
                break;
            case 2:
                System.out.println("Pausando");
                new Thread(() -> Musica.pausar()).start();
                break;
            case 3:
                System.out.println("Que siga la melodia");
                new Thread(() -> Musica.reanudar()).start();
                break;
            case 4:
                System.out.println("Deteniendo");
                new Thread(() -> Musica.detener()).start();
                break;
            case 5:
                System.out.println("deteniendo musica y cerrando reproductor");
                break;
            default:
                System.out.println("Opción Invalida");
                break;
        }
    }
    public void run() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(bienvenida());
        boolean salir=false;
        while (!salir) 
        {
            System.out.println("Ingrese su Opción");
            int entrada = scanner.nextInt();
            if(entrada==5)
            {
                salir=true;
                new Thread(() -> Musica.detener()).start();
                System.out.println(despedida());
            }
            else
            {
                interaccion(entrada);
            }
        }
        scanner.close();
    }
}