class Computer {
    private String cpu;
    private String memory;
    private String storage;
    private String gpu;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void showComputer() {
        System.out.println("Computer with CPU: " + cpu + ", Memory: " + memory + ", Storage: " + storage + ", GPU: " + gpu);
    }
}

interface ComputerBuilder {
    void buildCpu();
    void buildMemory();
    void buildStorage();
    void buildGpu();
    Computer getComputer();
}

class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB DDR4 RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD + 1TB HDD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA RTX 3080");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer() {
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildStorage();
        computerBuilder.buildGpu();
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingComputerBuilder);

        director.buildComputer();

        Computer computer = gamingComputerBuilder.getComputer();
        computer.showComputer();
    }
}