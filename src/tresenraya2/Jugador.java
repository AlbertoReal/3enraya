package tresenraya2;

import java.util.Scanner;

public class Jugador {

    private String name;
    private boolean blancas;

    public Jugador(String name) {
        this.name = name;
    }

    public boolean getBlancas() {
        return this.blancas;
    }

    public Movimiento mover() {
        int cell;
        Movimiento m;
        m = new Movimiento();

        Scanner sc = new Scanner(System.in);

        m.setBlancas(this.blancas);
        m.setJugador(this);

        System.out.println("Introduce donde quieres mover un valor del 0 al 8");
        cell = sc.nextInt();
        while (!m.setCell(cell)) {
            System.out.println("no as introducido un valor valido");
            cell = sc.nextInt();
        }
        return m;
    }
public void setBlancas(boolean blancas) {
        this.blancas = blancas;
    }
}
