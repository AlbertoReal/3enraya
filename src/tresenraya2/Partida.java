package tresenraya2;

public class Partida {

    private int actualTurn;
    private Tablero tablero;
    private Jugador Players[];
    private int victoria = -1;

    public Partida() {
        super();
    }

    public Partida(Jugador blancas, Jugador negras) {
        this.Players = new Jugador[2];
        Players[0] = blancas;
        Players[1] = negras;

        Players[0].setBlancas(true);
        Players[1].setBlancas(false);
        
        this.tablero = new Tablero();
        this.victoria = -1;
        
        if (Players[0] instanceof IA0) {
            ((IA0) Players[0]).setTablero(this.tablero);
        } else {
            ((IA0) Players[1]).setTablero(this.tablero);
        }
    }

    public Tablero getTablero() {
        return tablero;
    }
    public boolean victoriaJugador() {
        if (victoria != -1) {
            System.out.print("\nCasilla no válida");
            if (Players[victoria] instanceof IA0) {
                return false;
            } else {
                return true;
            }
        }
        if (Players[tablero.comprovarVictoria()] instanceof IA0) {
            return false; 
        }
        return true;
    }
    public void Game() {
        Movimiento m;
        int turno;
        for (this.actualTurn = 0; !tablero.comprovarLleno() && tablero.comprovarVictoria() == -1; this.actualTurn++) {
            turno = this.actualTurn % 2;
            if (turno == 0) {
                System.out.println("juegan las X");
            } else {
                System.out.println("juegan los O");
            }
            m = Players[turno].mover();
            if (!tablero.validarPosicionVacia(m.getCell())) {
                victoria = Math.abs(turno - 1);
                break;
            }
            tablero.ponerFicha(m);
            this.tablero.showTablero();
        }

    }
}
