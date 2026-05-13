class Driver_earnings{
    public static void main(String[] args){

        Trip[] trips = new Trip[3];
        
        trips[0] = new Trip("John Doe", "Sam Smith", 12.0, 10.0);
        trips[1] = new Trip("Denver Adams", "James Micheal", 3.0, 10.0);
        trips[2] = new Trip("Connor Tels", "Adam Watkins", 5, 10.0);        
        
        
        // Display details
        for(Trips trip: trips ){
            trip.displayTrip();
        }
    }
}

class Trip{
    String driverName;
    String passengerName;
    double distanceKm;
    double ratePerKm;
    
    Trip(String driverName, String passengerName, double distanceKm, double ratePerKm){
        this.driverName = driverName;
        this.passengerName = passengerName;
        this.distanceKm = distanceKm;
        this.ratePerKm = ratePerKm;
    }
    
    double calculateFare(){
        double fare = distanceKm * ratePerKm;
        return fare;
    }
    
    void displayTrip(){
        System.out.println("Trip Summary:");
        System.out.println("Driver: " + driverName);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Rate (per Km): " + ratePerKm);
        System.out.println("Distance: " + distanceKm);
    }
    
    
}
