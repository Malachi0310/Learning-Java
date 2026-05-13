class Driver_earnings{
    public static void main(String[] args){

        Trip[] trips = new Trip[3];
        
        trips[0] = new Trip("John Doe", "Sam Smith", 12.0, 10.0);
        trips[1] = new Trip("Denver Adams", "James Micheal", 3.0, 10.0);
        trips[2] = new Trip("Connor Tels", "Adam Watkins", 6, 10.0);        
        double total_earnings  = 0.0;
        
        // Display details
        for(Trip trip: trips ){
            trip.displayTrip();
            double fare = trip.calculateFare();
            
            total_earnings += fare;
            
            
        }
        
        System.out.println("\nTotal Earnings: " + total_earnings);
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
        System.out.println("\nTrip Summary:");
        System.out.println("Driver: " + driverName);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Rate (per Km): " + ratePerKm);
        System.out.println("Distance: " + distanceKm);
    }
    
    
}
