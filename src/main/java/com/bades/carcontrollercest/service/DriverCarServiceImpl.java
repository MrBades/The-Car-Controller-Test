package com.bades.carcontrollercest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bades.carcontrollercest.dao.DriverCarRepository;
import com.bades.carcontrollercest.entity.DriverCar;

@Service
public class DriverCarServiceImpl implements DriverCarService
{

    @Autowired
    private DriverCarRepository driverCarRepository;


    @Override
    public void delete(DriverCar driverCar)
    {
        driverCarRepository.delete(driverCar);
    }


    @Override
    public DriverCar save(DriverCar driverCar)
    {
        return driverCarRepository.save(driverCar);
    }


    @Override
    public DriverCar findByDriverIdAndCarId(Long driverId, Long carId)
    {
        return driverCarRepository.findByDriverIdAndCarId(driverId, carId);
    }

}
