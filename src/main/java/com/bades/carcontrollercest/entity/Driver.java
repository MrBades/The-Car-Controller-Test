package com.bades.carcontrollercest.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.bades.carcontrollercest.status.OnlineStatus;

@Entity
@Table(
    name = "driver",
    uniqueConstraints = @UniqueConstraint(name = "uc_username", columnNames = {"username"}))
public class Driver
{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime dateCreated = ZonedDateTime.now();

    @Column(nullable = false)
    @NotNull(message = "Username can not be null!")
    private String username;

    @Column(nullable = false)
    @NotNull(message = "Password can not be null!")
    private String password;

    @Column(nullable = false)
    private Boolean deleted = false;

    @Embedded
    private GeoCoordinate coordinate;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime dateCoordinateUpdated = ZonedDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OnlineStatus onlineStatus;


    public Driver()
    {
        super();
    }


    public Driver(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.deleted = false;
        this.coordinate = null;
        this.dateCoordinateUpdated = null;
        this.onlineStatus = OnlineStatus.OFFLINE;
    }


    public Long getId()
    {
        return id;
    }


    public void setId(Long id)
    {
        this.id = id;
    }


    public String getUsername()
    {
        return username;
    }


    public String getPassword()
    {
        return password;
    }


    public Boolean getDeleted()
    {
        return deleted;
    }


    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }


    public OnlineStatus getOnlineStatus()
    {
        return onlineStatus;
    }


    public void setOnlineStatus(OnlineStatus onlineStatus)
    {
        this.onlineStatus = onlineStatus;
    }


    public GeoCoordinate getCoordinate()
    {
        return coordinate;
    }


    public void setCoordinate(GeoCoordinate coordinate)
    {
        this.coordinate = coordinate;
        this.dateCoordinateUpdated = ZonedDateTime.now();
    }


    public ZonedDateTime getDateCreated()
    {
        return dateCreated;
    }


    public void setDateCreated(ZonedDateTime dateCreated)
    {
        this.dateCreated = dateCreated;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public void setPassword(String password)
    {
        this.password = password;
    }

}
