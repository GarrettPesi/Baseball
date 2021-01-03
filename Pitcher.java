
public class Pitcher extends Player{
    public Pitcher(){
        battingBehavior = new BatWithNothing();
        catchingBehavior = new CatchWithGlove();
        throwingBehavior = new ThrowByPitching();
    }
    
    public void Display(){
        System.out.println(GetName());
    }
}
