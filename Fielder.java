
public class Fielder extends Player{
    public Fielder(){
        throwingBehavior = new ThrowToFielder();
        catchingBehavior = new CatchWithGlove();
        battingBehavior = new BatWithNothing();
    }
    
    public void Display(){
        System.out.println(GetName());
    }
}
