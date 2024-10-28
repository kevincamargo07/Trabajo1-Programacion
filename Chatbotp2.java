public abstract class Chatbotp2 implements Interfazchatbot
{

    @Override
    public String bienvenida() 
    {
        String menu = "Estas son mis opciones presiona:\n1 Reproducir\n 2 Pausar\n 3 Reanudar\n 4 Detener\n 5 Salir\n";
        return "Bienvendo, saluda al mejor equipo de colombia \n  ¿Cómo te puedo colaborar en este día?\n" + menu;
    }

    public String despedida() 
    {
        return "Adiós, que estes bien y no lo olvides...\n Solo millos locaaaa";
    }

    public abstract void interaccion(int entrada);
}
