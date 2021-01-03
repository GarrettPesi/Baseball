
public class Batter extends Player{
    public Batter(){
        battingBehavior = new BatForContact();
        catchingBehavior = new CatchWithHands();
        throwingBehavior = new ThrowNothing();
    }
    
    public void Display(){
        System.out.println(GetName());
    }
}
