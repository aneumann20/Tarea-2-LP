import lp.motor.Application;
import lp.motor.Context;
import lp.motor.MouseHandler;

import java.awt.*;

public class Main implements Context
{
    public Main()
    {
        // aquí puede inicializar valores y crear los objetos de juego.
    }

    @Override
    public void update(MouseHandler mouseHandler)
    {
        // aquí actualice sus objetos para que puedan interactuar con input de usuario o entre los mismos
        // objetos.

        // por ejemplo imprimir algo si el mouse está cerca de la esquina superior izquierda:
        Point point = mouseHandler.getMousePosition();
        if (point.x < 200 && point.y < 200)
            System.out.println(point);
    }

    @Override
    public void render(Graphics graphics)
    {
        // aquí, y solo aquí, puede dibujar cosas en la pantalla.

        // por ejemplo dibujar un círculo verde:
        graphics.setColor(Color.GREEN);
        graphics.fillOval(275, 275, 50, 50);
    }

    public static void main(String[] args)
    {
        // el método main solo se encargará de iniciar el sistema.
        Application.start(600, 600, "Elepé!", 60, new Main());
    }
}