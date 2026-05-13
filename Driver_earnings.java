class campus_parking_management{
    public static void main(String[] args){
        
        ParkingRecord[] parkings = new ParkingRecord[4];
        
        parkings[0] = new ParkingRecord("John", 001, 10.0, 4);
        parkings[1] = new ParkingRecord("James", 002, 20.0, 1); 
        parkings[2] = new ParkingRecord("Micheal", 003, 15.0, 2.5); 
        parkings[3] = new ParkingRecord("Samson", 004, 20, 3);
        
        double total_revenue = 0;
        double longest_parked = 0;
        
        for (ParkingRecord parking: parkings){
            parking.displayRecord();
            
            double fee = parking.calculateFee();
            total_revenue += fee;
            
            double hours = parking.getHoursParked();
            if (hours > longest_parked){
                longest_parked = hours;
            }
            
            

        }
        
        System.out.println("\nTotal Revenue: " + total_revenue);
        System.out.println("Longest hours parked: " + longest_parked);
        
    }
}

class ParkingRecord{
    String ownerName;
    int vehicleNumber;
    double ratePerHour;
    double hoursParked;
    
    ParkingRecord(String ownerName, int vehicleNumber, double ratePerHour, double hoursParked){
        this.ownerName = ownerName;
        this.vehicleNumber = vehicleNumber;
        this.ratePerHour = ratePerHour;
        this.hoursParked = hoursParked;
    }
    
    double calculateFee(){
        return hoursParked * ratePerHour;
    }
    
    void displayRecord(){
        System.out.println("\n Record Details: ");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle: " + vehicleNumber);
        System.out.println("Rate: " + ratePerHour);
        System.out.println("Hours Parked: " + hoursParked);
    }
    
    double getHoursParked(){
        return hoursParked;
    }
    
    
}



// 50–100 → Medium Stay 
// 100 → Long Stay
