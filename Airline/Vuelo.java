package Airline;

import java.util.Date;

public class Vuelo {

    private String flight_number = "";
    private String flight_origin = "";
    private String flight_destination = "";
    private Date flight_date = new Date();
    private String flight_capability = "";
    private int flight_seats_avaliable = 0;

    

    public Vuelo(String flight_number, String flight_origin, String flight_destination, Date flight_date,
            String flight_capability, int flight_seats_avaliable) {
        this.flight_number = flight_number;
        this.flight_origin = flight_origin;
        this.flight_destination = flight_destination;
        this.flight_date = flight_date;
        this.flight_capability = flight_capability;
        this.flight_seats_avaliable = flight_seats_avaliable;
    }
    public String getFlight_number() {
        return this.flight_number;
    }
    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
    public String getFlight_origin() {
        return this.flight_origin;
    }
    public void setFlight_origin(String flight_origin) {
        this.flight_origin = flight_origin;
    }
    public String getFlight_destination() {
        return this.flight_destination;
    }
    public void setFlight_destination(String flight_destination) {
        this.flight_destination = flight_destination;
    }
    public Date getFlight_date() {
        return this.flight_date;
    }
    public void setFlight_date(Date flight_date) {
        this.flight_date = flight_date;
    }
    public String getFlight_capability() {
        return this.flight_capability;
    }
    public void setFlight_capability(String flight_capability) {
        this.flight_capability = flight_capability;
    }
    public int getFlight_seats_avaliable() {
        return this.flight_seats_avaliable;
    }
    public void setFlight_seats_avaliable(int flight_seats_avaliable) {
        this.flight_seats_avaliable = flight_seats_avaliable;
    } 
}