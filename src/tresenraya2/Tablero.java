package tresenraya2 ;


public class Tablero {
    //atributos
    private int cell[];
    
    public Tablero(){
     cell = new int [9]; 
     for (int i=0; i<9; i++){
        cell [i] =-1;
        }
    }
    public boolean comprovarLleno(){
          for(int i=0; i<9; i++){
            if(cell[i] ==-1){
                return false;
            }  
          }
     return true;   
    }
    public int comprovarVictoria(){
        if(cell[0]==cell[1] && cell[1]==cell[2] && cell[1]!=-1){
            return cell[1];
        }
           if(cell[0]==cell[3] && cell[3]==cell[6] && cell[3]!=-1){
            return cell[3];
        }
           if(cell[0]==cell[4] && cell[4]==cell[8] && cell[4]!=-1){
            return cell[4];
        }
           if(cell[1]==cell[4] && cell[4]==cell[7] && cell[4]!=-1){
            return cell[4];
        }
           if(cell[2]==cell[4] && cell[4]==cell[6] && cell[4]!=-1){
            return cell[4];
        }  
           if(cell[2]==cell[5] && cell[5]==cell[8] && cell[5]!=-1){
            return cell[5];
        }
        if(cell[3]==cell[4] && cell[4]==cell[5] && cell[4]!=-1){
            return cell[4];
        }  
        if(cell[6]==cell[7] && cell[7]==cell[8] && cell[7]!=-1){
            return cell[7];
        }  
      return -1;  
    }
    public void showTablero() {
        for(int i=0; i<9; i++){
            if(i%3==0) {
                System.out.println();
            }
            
            if(this.cell[i]!=-1){
                
                if(this.cell[i]==1){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
            }else{
                System.out.print("-");
            }    
        }
        System.out.println("\n");   
    }
    
    public int[] getCell() {
  
        return this.cell;    
    }
    public boolean ponerFicha(Movimiento m){
             if(m==null) return false;
        
        int posicion;
        posicion= m.getCell();
        
        if(m.getBlancas()){
            cell[posicion]=0;
        }else{
            cell[posicion]=1;
        }
        
        return true;
    }
    public boolean validarPosicionVacia(int cell){
        if(this.cell[cell]!=-1){
            return true;  
        }
        return true;
    }
       public boolean validarMovimiento(Movimiento m){
       int casilla;
        casilla=m.getCell();
        
        if(cell[casilla]!=-1){
            return false;  
        }
        return true;
       }
    }
