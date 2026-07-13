package _10_Facade;

class CPU{
    public void freeze(){
        System.out.println("CPU Freeze");
    }

    public void execute(){
        System.out.println("CPU Execute");
    }
}

class Memory{
    public void load(){
        System.out.println("Memory loaded");
    }
}

class HardDrive{
    public void read(){
        System.out.println("Hard Drive Read");
    }
}

class ComputerFacade{
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(){
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer(){
        cpu.freeze();
        hardDrive.read();
        memory.load();
        cpu.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();

        computerFacade.startComputer();
    }
}