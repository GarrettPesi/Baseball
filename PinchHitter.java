
public class PinchHitter extends Player{
    public PinchHitter(){
        battingBehavior = new BatForPower();
        catchingBehavior = new CatchNothing();
        throwingBehavior = new ThrowNothing();
    }
    
    public void Display(){
        System.out.println(GetName());
    }
}
