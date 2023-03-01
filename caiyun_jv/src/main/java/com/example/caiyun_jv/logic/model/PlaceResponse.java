package com.example.caiyun_jv.logic.model;

import android.location.Location;

import java.util.List;

public class PlaceResponse {
    private String valstatus;
    private List valplaces;

    public PlaceResponse(String valstatus, List<Place> valplaces) {
        this.valstatus = valstatus;
        this.valplaces = valplaces;
    }

    public String getValstatus() {
        return valstatus;
    }

    public void setValstatus(String valstatus) {
        this.valstatus = valstatus;
    }

    public List<Place> getValplaces() {
        return valplaces;
    }

    public void setValplaces(List<Place> valplaces) {
        this.valplaces = valplaces;
    }
   public  class Place{
        public  String name;
        public String address;
        public Location location;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getAddress() {
           return address;
       }

       public void setAddress(String address) {
           this.address = address;
       }

       public Location getLocation() {
           return location;
       }

       public void setLocation(Location location) {
           this.location = location;
       }

       public Place() {
       }

       public Place(String name, String address, Location location) {
           this.name = name;
           this.address = address;
           this.location = location;
       }
   }

    public class Location { private String vallng; private String vallat;

        public Location(String vallng, String vallat) { this.vallng = vallng; this.vallat = vallat; }

        public String getVallng() { return vallng; }

        public void setVallng(String vallng) { this.vallng = vallng; }

        public String getVallat() { return vallat; }

        public void setVallat(String vallat) { this.vallat = vallat; } }
}
