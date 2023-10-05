package com.mahagan.model;

public class MachineDevices {
    private int Id;
    private  String machineName;   // here we used the table columns all fields
    private  String machineFunction;
    private  String machineLocation;
    private  String machineLifetime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineFunction() {
        return machineFunction;
    }

    public void setMachineFunction(String machineFunction) {
        this.machineFunction = machineFunction;
    }

    public String getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(String machineLocation) {
        this.machineLocation = machineLocation;
    }

    public String getMachineLifetime() {
        return machineLifetime;
    }

    public void setMachineLifetime(String machineLifetime) {
        this.machineLifetime = machineLifetime;
    }

    public MachineDevices(int id, String machineName, String machineFunction, String machineLocation, String machineLifetime) {
        Id = id;
        this.machineName = machineName;
        this.machineFunction = machineFunction;
        this.machineLocation = machineLocation;
        this.machineLifetime = machineLifetime;
    }// it is used to initialize the value

    public MachineDevices() {
    }

    @Override
    public String toString() {
        return "MachineDevices{" +
                "Id=" + Id +
                ", machineName='" + machineName + '\'' +
                ", machineFunction='" + machineFunction + '\'' +
                ", machineLocation='" + machineLocation + '\'' +
                ", machineLifetime='" + machineLifetime + '\'' +
                '}';//it is used to get the exact value
    }

    public void updateDevice(MachineDevices machineDevices1) {
    }
}
