package com.bades.carcontrollercest.dao;

import com.bades.carcontrollercest.entity.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long>
{
    Manufacturer findByName(final String name);
}
