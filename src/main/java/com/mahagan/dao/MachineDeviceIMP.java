package com.mahagan.dao;
import com.mahagan.model.MachineDevices;
import com.mahagan.model.MchineDeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class MachineDeviceIMP implements MachineDevice{
    JdbcTemplate jdbcTemplate;


    private  final  String SQL_Find_Device ="select * from machinedevice where id= ?";// here we used SQL query because here we used SQL driver
    private  final  String SQL_Delete_Device ="delete from machinedevice where id= ?";
    private final String SQL_Update_Device = "Update machinedevice set machineName= ?,machineFunction= ?,machineLocation= ?,machineLifetime= ? where id= ?";
    private final String SQL_Get_All_Device = "select * from machinedevice";
    private final String SQL_Insert_Device = "insert into machinedevice(id,machineName,machineFunction,machineLocation,machineLifetime) value(?,?,?,?,?)";
    // here interface method are implemented

    @Autowired
    public MachineDeviceIMP(DataSource dataSource)
    {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }


    @Override
    public MachineDevices getDeviceById(int Id) {
        return jdbcTemplate.queryForObject(SQL_Find_Device,new Object[]{Id},new MchineDeviceMapper());
    }

    @Override
    public List<MachineDevices> getAllDevice() {
        return jdbcTemplate.query(SQL_Get_All_Device, new MchineDeviceMapper());
    }

    @Override
    public int deleteDevice(MachineDevices machineDevices) {
        return jdbcTemplate.update(SQL_Delete_Device,machineDevices.getId());
    }

    @Override
    public int updateDevice(MachineDevices machineDevices) {
        return jdbcTemplate.update(SQL_Update_Device,machineDevices.getMachineName(),machineDevices.getMachineFunction(),machineDevices.getMachineLocation(),machineDevices.getMachineLifetime(),machineDevices.getId());
    }

    @Override
    public int createIotDevice(MachineDevices machineDevices) {
        return jdbcTemplate.update(SQL_Insert_Device,machineDevices.getId(),machineDevices.getMachineName(),machineDevices.getMachineFunction(),machineDevices.getMachineLocation(),machineDevices.getMachineLifetime());
    }
}
