package com.xworkz.computerdetails.computer;

import javax.lang.model.element.NestingKind;

public class Computer {

    private String processor;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    private String ramSize;
    public String getRamSize(){
    return ramSize;
}

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    private String operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    private String modelNo;

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    private double screenSizeInInches;

    public double getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(double screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
    }
}
