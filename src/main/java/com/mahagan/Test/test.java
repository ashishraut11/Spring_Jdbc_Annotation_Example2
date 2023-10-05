package com.mahagan.Test;

import com.mahagan.config.ApplicationConfig;
import com.mahagan.dao.MachineDevice;
import com.mahagan.model.MachineDevices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*here im going to change the code first time */

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MachineDevice machineDevice = context.getBean(MachineDevice.class);
        System.out.println("get all information");
        for (MachineDevices machineDevices : machineDevice.getAllDevice())  // here we create model class reference for printing something on console
        {
            System.out.println(machineDevices);
        }
        //**********************************************************
        System.out.println("Upadating");
       // System.out.println("get machinedevice id");
        MachineDevices machineDevices=new MachineDevices(50 ,"ac","aa","home","yes");
        machineDevice.createIotDevice(machineDevices);
        for (MachineDevices machineDevices1 : machineDevice.getAllDevice()) // we create reference of model package machineDevice because
        {
            System.out.println(machineDevices1);
        }
        //******************************************************************
        System.out.println("deleting operation");
        MachineDevices machineDevices22=machineDevice.getDeviceById(32);
        machineDevice.deleteDevice(machineDevices22);
        for (MachineDevices machineDevices1 : machineDevice.getAllDevice())
        {
            System.out.println(machineDevices1);
        }
        //************************************************
        System.out.println("updating device on perticular id");
        MachineDevices machineDevices1=machineDevice.getDeviceById(39);
        machineDevices1.setMachineName("tube");
        machineDevices1.setMachineFunction("blink");
        machineDevices1.setMachineLocation("home");
        machineDevices1.setMachineLifetime("ghgjjjh");
        machineDevice.updateDevice(machineDevices1);
        System.out.println("Updated device");
        /**************************************************/
        System.out.println("List of device is");
        for(MachineDevices machineDevices2:machineDevice.getAllDevice())
        {
            System.out.println(machineDevices2);
        }
        context.close();

    }

}