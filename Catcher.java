
public class Catcher extends Player{
    public Catcher(){
        battingBehavior = new BatWithNothing();
        catchingBehavior = new CatchWithMitt();
        throwingBehavior = new ThrowToPitcher();
    }
    
    public void Display(){
        System.out.println(GetName());
    }
}
