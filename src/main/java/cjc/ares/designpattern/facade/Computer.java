package cjc.ares.designpattern.facade;

public class Computer {
    private CPU cpu;
    private Disk disk;

    public Computer(CPU cpu, Disk disk) {
        this.cpu = cpu;
        this.disk = disk;
    }

    public void start(){
        cpu.start();
        disk.start();
        System.out.println("computer is working");
    }

    public void shutDown(){
        cpu.shutdown();
        disk.shutdown();
        System.out.println("computer has been shut down");
    }
}
