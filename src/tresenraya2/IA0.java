package tresenraya2 ;


public class IA0 extends Jugador {
 
  private Tablero tablero;
  
    public IA0(){
        super("IA0");
    }
    @Override
    public Movimiento mover() {
        Movimiento m;
        m = new Movimiento();
         
        if(this.tablero.comprovarLleno()){
            return null;
        }
        m.setBlancas(this.getBlancas());
        m.setJugador(this);
        
        for(int i=0; i<9;i++){
            if(this.tablero.validarMovimiento(m)){
                m.setCell(i);
                return m;
            }
        }
        return null;
    }
    public void setTablero(Tablero tablero){
        if(tablero!=null){
            this.tablero=tablero;
        }
}
}
