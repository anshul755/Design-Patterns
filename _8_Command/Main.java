package _8_Command;

interface Command{
    void execute();
}

class Light{

    public void turnOn(){
        System.out.println("Light On");
    }

    public void turnOff(){
        System.out.println("Light Off");
    }
}

class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }
}

class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.turnOff();
    }
}

class RemoteControl{
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        Light light=new Light();

        Command lightOnCommand=new LightOnCommand(light);
        Command lightOffCommand=new LightOffCommand(light);
        
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
