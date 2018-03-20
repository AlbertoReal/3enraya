package tresenraya2 ;


public class Ranking {
    
    private int wins;      
    private int draws;    
    private int totalGames; 
 
    public Ranking(){
        this.wins=0;
        this.draws=0;
        this.totalGames=0;
    }
    public void showRanking() {
        // TODO implement me    
    }
    
    public void Win(boolean playerWins) {
        this.totalGames++;
        
        if (playerWins) {
           this.wins++;
        }
    }
    public void Draw() {
        this.draws++;
        this.totalGames++;
    }
    public void mostrar() {
        
        System.out.println("partidas totales " + this.totalGames +"\n"+
                            "victorias " + this.wins + "\n"+   
                            "empates "+ this.draws+ "\n"); 
    }
}
