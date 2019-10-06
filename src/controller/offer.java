package controller;

public class offer {
    private String offer_id;
    private String location;
    private String hotel_name;
    private String duration;
    private String transportation;
    private float rate;
    private int cost;

    public offer(String offer_id, String location, String hotel_name, String duration, String transportation, float rate, int cost) {
        this.offer_id = offer_id;
        this.location = location;
        this.hotel_name = hotel_name;
        this.duration = duration;
        this.transportation = transportation;
        this.rate = rate;
        this.cost = cost;
    }

    public offer() {

    }

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
