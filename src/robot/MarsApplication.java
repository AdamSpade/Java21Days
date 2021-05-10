package robot;

public class MarsApplication {

    public static void main(String[] args)
    {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        System.out.println("Mars Exploration Robot - Spirit");
        spirit.showAttributes();
        System.out.println("Increase speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        System.out.println("============================");
        
        MarsRobot opportunity = new MarsRobot();
        System.out.println("Mars Exploration Robot - Opportunity");
        opportunity.status = "chillin'";
        opportunity.speed = 0;
        opportunity.temperature = 420;
        opportunity.showAttributes();
    }

}
