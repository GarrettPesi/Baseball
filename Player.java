
public abstract class Player {
    BattingBehavior battingBehavior;
    ThrowingBehavior throwingBehavior;
    CatchingBehavior catchingBehavior;
    
    private String name;
    
    public Player(){  
    }
    
    public void SetName(String in){
        name = in;
    }
    
    public String GetName(){
        return name;
    }
    
    public void SetBattingBehavior(BattingBehavior BB){
        battingBehavior = BB;
    }
    
    public void SetThrowingBehavior(ThrowingBehavior TB){
        throwingBehavior = TB;
    }
    
    public void SetCatchingBehavior(CatchingBehavior CB){
        catchingBehavior = CB;
    }
    
    abstract void Display();
    
    public void PerformBat(){
        battingBehavior.swinging();
    }
    
    public void PerformCatch(){
        catchingBehavior.catching();
    }
        
    public void PerformThrow(){
        throwingBehavior.throwing();
    }
    
}
