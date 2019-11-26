package com.bades.carcontrollercest.service.cs;

import java.util.List;

import com.bades.carcontrollercest.entity.Car;
import com.bades.carcontrollercest.exception.EntityNotFoundException;

public interface CarService
{

    Car find(final Long carId) throws EntityNotFoundException;


    List<Car> findAllCars();


    Car create(final Car car) throws EntityNotFoundException;


    void update(final Car car) throws EntityNotFoundException;


    void delete(final Long carId) throws EntityNotFoundException;

}
