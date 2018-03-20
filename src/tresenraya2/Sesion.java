package tresenraya2 ;

import java.util.ArrayList;
import java.util.Scanner;


public class Sesion {
    
    private ArrayList<Partida> partida;
    private Ranking ranking;
    private Jugador jugador;
    private Jugador jugador1;
    
    public Sesion(){
        this.partida= new ArrayList();
        jugador1 = new IA0();
        ranking = new Ranking();
     }
     
   
    public void showRanking(Partida game) {
        if (game.getTablero().comprovarLleno()) {
            System.out.println("Se ha producio un empate");
            this.ranking.Draw();

        } else {

            if (game.victoriaJugador()) {
                this.ranking.Win(true);
                System.out.println("victoria");
            } else {
                this.ranking.Win(false);
                System.out.println("derrota");

            }
        }
        
    }
    private int sorteoTurno() {
             int  aux =(int) (Math.random()*2);
             if (aux ==0){
                System.out.println("empiezas");
             }else{
             System.out.println("empiez la cpu");
             }
        return aux;
    }
   public void newPartida(){
       Partida P;
     
      if (sorteoTurno() ==0){
       P = new Partida (this.jugador, this.jugador1);
      }else{
       P = new Partida(this.jugador1, this.jugador);
      }
      this.partida.add(P);
        P.Game();
        
        this.showRanking(P);
   }
    public void iniciarSesion(){
        this.CrearJugadorHumano();
        int opcion;
        opcion=0;
        do{ 
            opcion = this.Menu();
            switch (opcion){
                case 1:
                    System.out.println("|0|1|2|");
                    System.out.println("-------");
                    System.out.println("|3|4|5|");
                    System.out.println("-------");      
                    System.out.println("|6|7|8|");      
                    newPartida();
                    break;
                case 2:
                    this.ranking.mostrar();
                    break;
            }
        }while (opcion != 3);   
    }
    public void CrearJugadorHumano() {
        System.out.println("Nombre del nuevo jugador");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        this.jugador = new Jugador(name);
    }
     public int Menu() {
        System.out.println("pulas 1 para empezar");
        System.out.println("pulas 2 ver ranking");
        System.out.println("pulas 3 salir");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;

    }
     public static void main(String[] args) {
        Sesion sesion;
        sesion = new Sesion();
        sesion.iniciarSesion();

    }
}
