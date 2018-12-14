package controller;

public class offer {
    String offer_id;
    String place;
    String duration;
    String stars;
    String trasportation;
    String cost;

    public offer(String offer_id, String place, String duration, String stars, String trasportation, String cost) {
        this.offer_id =offer_id;
        this.place = place;
        this.duration=duration;
        this.stars=stars;
        this.trasportation=trasportation;
        this.cost=cost;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getTrasportation() {
        return trasportation;
    }

    public void setTrasportation(String trasportation) {
        this.trasportation = trasportation;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
