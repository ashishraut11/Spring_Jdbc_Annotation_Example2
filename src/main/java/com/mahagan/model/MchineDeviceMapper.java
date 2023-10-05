package com.mahagan.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MchineDeviceMapper implements RowMapper<MachineDevices> {
    // row mapper is used for fetching the data from database and print on console.

    @Override
    public MachineDevices mapRow(ResultSet rs,int a) throws SQLException {
        MachineDevices machineDevices=new MachineDevices();
        machineDevices.setId(rs.getInt("Id"));
        machineDevices.setMachineName(rs.getString("machineName"));
        machineDevices.setMachineFunction(rs.getString("machineFunction"));
        machineDevices.setMachineLocation(rs.getString("machineLocation"));
        machineDevices.setMachineLifetime(rs.getString("machineLifetime"));
        return machineDevices;
    }
}
