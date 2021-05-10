package robot;

public class MarsRobot extends ScienceRobot {

    public void checkTemperature()
    {
        if (temperature > -80)
        {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes()
    {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}