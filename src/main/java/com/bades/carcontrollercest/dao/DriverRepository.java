package com.bades.carcontrollercest.dao;

import com.bades.carcontrollercest.status.OnlineStatus;
import com.bades.carcontrollercest.entity.Driver;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Database Access Object for driver table.
 * <p/>
 */
public interface DriverRepository extends CrudRepository<Driver, Long>
{
    Driver findByUsername(final String username);

    List<Driver> findByOnlineStatus(OnlineStatus onlineStatus);
}
