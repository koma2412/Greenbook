package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name="LOCATION_DATA")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer location_id;
    private Integer pincode;
    private String address;
    private String city;
    private String state;
    private String country;
    private String map_url;

    public Location(Integer location_id, Integer pincode, String address, String city, String state, String country, String map_url) {
        this.location_id = location_id;
        this.pincode = pincode;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.map_url = map_url;
    }

    public Location() {
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMap_url() {
        return map_url;
    }

    public void setMap_url(String map_url) {
        this.map_url = map_url;
    }
}
