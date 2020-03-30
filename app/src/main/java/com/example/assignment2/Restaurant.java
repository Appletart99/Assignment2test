package com.example.assignment2;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cuisine;
    private double rating;
    private int expense;
    private int noOfReview;
    private String location;


    public Restaurant() {
    }

    public Restaurant(String name, String cuisine, double rating, int expense, int noOfReview, String location){
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.expense = expense;
        this.noOfReview = noOfReview;
        this.location = location;
    }

    public String getName(){ return name;}

    public void setName(String name){ this.name = name;}

    public String cuisine(){ return cuisine;}

    public void setCuisine(String cuisine) { this.cuisine = cuisine;}

    public double getRating(){ return rating;}

    public void setRating(double rating) { this.rating = rating;}

    public int getExpense() { return expense;}

    public void setExpense(int expense) { this.expense = expense;}

    public String getLocation(){ return location;}

    public void setLocation(String location){ this.location = location;}

    public int getNoOfReview() {return noOfReview;}

    public void setNoOfReview(int noOfReview) {this.noOfReview = noOfReview; }

    public static Restaurant getRestaurant(String name) {
        for(Restaurant restaurant : getRestaurant()) {
            if(restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    @Override

    public String toString() { return name;}

    public static ArrayList<Restaurant> getRestaurant(){
        ArrayList<Restaurant> restaurants = new ArrayList();
        restaurants.add(new Restaurant("Dare Cafe", "Cafe, Australian", 4.5, 50, 251, "Glebe, Sydney"));
        restaurants.add(new Restaurant("The Gantry Restaurant", "Australian", 4.7, 48, 415, "Walsh Bay, Sydney"));
        restaurants.add(new Restaurant("Blue Eye Dragon", "Asian, Taiwanese", 4.5, 27, 188, "Pyrmont, Sydney"));
        restaurants.add(new Restaurant("Caffee Amici", "European, Italian", 4.2, 20, 222, "CBD, Sydney"));
        restaurants.add(new Restaurant("Vizio Caffe e Cucina", "Vegetarian, Italian", 4.8, 75, 191, "Woolloomooloo, Sydney"));
        restaurants.add(new Restaurant("Zahli", "Middle Eastern, Lebanese", 4.9, 50, 251, "Surry Hills, Sydney"));
        restaurants.add(new Restaurant("Fortune Village Chinese Restaurant", "Asian, Chinese", 4.2, 25, 814, "CBD, Sydney"));
        restaurants.add(new Restaurant("Marrickville Pork Roll", "Asian, Vietnamese", 4.9, 6, 198, "Marrickville, Sydney"));
        restaurants.add(new Restaurant("Claires Kitchen at le Salon", "European, French", 4.8, 55, 385, "Surry Hills, Sydney"));
        restaurants.add(new Restaurant("Tetsuya's", "Asian, Japanese", 5.0, 250, 1349, "CBD, Sydney"));
        return restaurants;
    }
}


