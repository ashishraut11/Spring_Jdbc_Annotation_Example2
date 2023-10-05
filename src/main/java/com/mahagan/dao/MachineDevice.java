package com.mahagan.dao;

import com.mahagan.model.MachineDevices;

import java.util.List;

public interface MachineDevice  {
    MachineDevices getDeviceById(int Id);  // this is a persistence layer here we write our own login
    List<MachineDevices> getAllDevice();
    int deleteDevice(MachineDevices machineDevices);   // inside the method we used model class reference because we used there our fields and getter setter
    int updateDevice(MachineDevices machineDevices);
    int createIotDevice(MachineDevices machineDevices);

}
