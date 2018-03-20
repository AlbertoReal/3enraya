package tresenraya2 ;


public class Movimiento {
    
    private int cell;       
    private boolean blancas;    
    private Jugador jugador; 
 
    
    public Movimiento(){
    }
    
        public Movimiento(int cell, boolean blancas, Jugador j){
        this.cell=cell;
        this.blancas=blancas;
        this.jugador=j;
    }
        
   public boolean getBlancas(){
        return this.blancas;
    }
    
    public int getCell(){
        return this.cell;
    }
    
    public Jugador getJugador(){
        return this.jugador;
    }
    
    public void setBlancas(boolean blancas){
        
        this.blancas=blancas;
    }
     public boolean setCell(int cell){
       if(cell<0 || cell>9){
           return false; 
       } 
       this.cell=cell;
       return true;
    }
    public void setJugador(Jugador j){
      
       if(j!=null){
            this.jugador = j;
       }
    }
}
