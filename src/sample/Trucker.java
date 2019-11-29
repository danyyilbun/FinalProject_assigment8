package sample;

public class Trucker {
    private int truck_number;
    private int driver_number;
    private int co_driver_number;
    private int trip_number;
    private String date_departed;
    private String date_returned;
    private String state_code;
    private int miles_driven;
    private int fuel_receipt_number;
    private int gallons_purchased;
    private double taxes_paid;
    private String station_name;
    private String station_street_location;
    private String station_city_location;

    public String getState_code() {
        return state_code;
    }

    public Trucker(int truck_number,
                   int driver_number,
                   int co_driver_number,
                   int trip_number,
                   String date_departed,
                   String date_returned,
                   String state_code,
                   int miles_driven,
                   int fuel_receipt_number,
                   int gallons_purchased,
                   double taxes_paid,
                   String station_name,
                   String station_street_location,
                   String station_city_location) {
        this.truck_number = truck_number;
        this.driver_number = driver_number;
        this.co_driver_number = co_driver_number;
        this.trip_number = trip_number;
        this.date_departed = date_departed;
        this.date_returned = date_returned;
        this.state_code = state_code;
        this.miles_driven = miles_driven;
        this.fuel_receipt_number = fuel_receipt_number;
        this.gallons_purchased = gallons_purchased;
        this.taxes_paid = taxes_paid;
        this.station_name = station_name;
        this.station_street_location = station_street_location;
        this.station_city_location = station_city_location;
    }

    public int getTruck_number() {
        return truck_number;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public int getCo_driver_number() {
        return co_driver_number;
    }

    public int getTrip_number() {
        return trip_number;
    }

    public String getDate_departed() {
        return date_departed;
    }

    public String getDate_returned() {
        return date_returned;
    }

    public int getMiles_driven() {
        return miles_driven;
    }

    public int getFuel_receipt_number() {
        return fuel_receipt_number;
    }

    public int getGallons_purchased() {
        return gallons_purchased;
    }

    public double getTaxes_paid() {
        return taxes_paid;
    }

    public String getStation_name() {
        return station_name;
    }

    public String getStation_street_location() {
        return station_street_location;
    }

    public String getStation_city_location() {
        return station_city_location;
    }
}
