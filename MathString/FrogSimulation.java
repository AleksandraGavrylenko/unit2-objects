public class FrogSimulation{
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int d, int nH){
        this.goalDistance = d;
        this.maxHops = nH;
    }
    private int hopDistance(){
        int hop = 0;
        hop = (int)(Math.random()*10)+1;
        if(Math.random()<0.2){
            hop = -hop;
        }
        if(Math.random()>0.93){
            hop = 31;
        }
        return hop;
    }
    public boolean simulate(){
        int dist = 0;
        for(int i = 1; i<=maxHops; i++){
            dist = dist + hopDistance();
            if(dist < 0){
                return false;
            }
            if(dist >= goalDistance){
                return true;
            }
        }
    
        return false;
    }
    public double runSimulations(int n){
        if(n<=0){
            return 0.0;
        }
        count = 0;
        for(int i = 1; i<n;i++){
            boolean res = simulate();
            if(res){
                count ++;
            }
        }
        return count*(0.1)/n;
    }
}