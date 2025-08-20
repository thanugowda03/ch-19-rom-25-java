package com.xworkz.computerdetails;

import com.xworkz.computerdetails.computer.Computer;

public class ComputerRunner {

    public static void main(String[] args) {
        System.out.println("main stared");
        Computer computer=new Computer();

        computer.setModelNo("Dell");
        computer.setOperatingSystem("Windows");
        computer.setProcessor("Intel");
        computer.setRamSize("8GB");
        computer.setScreenSizeInInches(15.5);

        String modelNo= computer.getModelNo();
        String operatingSystem= computer.getOperatingSystem();
        String processor= computer.getProcessor();
        String ramSize=computer.getRamSize();
        double screenSizeInInches= computer.getScreenSizeInInches();

        System.out.println("Model No: "+modelNo);
        System.out.println("Operating System: "+operatingSystem);
        System.out.println("Processor: "+processor);
        System.out.println("Ram size: "+ramSize);
        System.out.println("Screen size in inches: "+screenSizeInInches);
        System.out.println("main ended");
    }
}
