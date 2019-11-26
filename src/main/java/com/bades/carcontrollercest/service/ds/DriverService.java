package com.bades.carcontrollercest.service.ds;

import java.util.List;
import java.util.Map;

import com.bades.carcontrollercest.status.OnlineStatus;
import com.bades.carcontrollercest.dto.DriverDTO;
import com.bades.carcontrollercest.entity.Driver;
import com.bades.carcontrollercest.exception.CarAlreadyInUseException;
import com.bades.carcontrollercest.exception.ConstraintsViolationException;
import com.bades.carcontrollercest.exception.EntityNotFoundException;

public interface DriverService
{

    Driver find(Long driverId) throws EntityNotFoundException;


    Driver create(Driver driverDO) throws ConstraintsViolationException;


    void delete(Long driverId) throws EntityNotFoundException;


    void updateLocation(long driverId, double longitude, double latitude) throws EntityNotFoundException;


    List<Driver> find(OnlineStatus onlineStatus);


    DriverDTO selectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;


    void deSelectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;


    List<DriverDTO> findDriversByFilterCriteria(Map<String, String> params) throws EntityNotFoundException;

}