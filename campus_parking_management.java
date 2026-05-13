class campus_parking_management{
    public static void main(String[] args){
        
        ParkingRecord[] parkings = new ParkingRecord[4];
        
    }
}

class ParkingRecord{
    String ownerName;
    int vehicleNumber;
    int ratePerHour;
    int hoursParked;
    
    ParkingRecord(String ownerName, int vehicleNumber, int ratePerHour, int hoursParked){
        this.ownerName = ownerName;
        this.vehicleName = vehicleName;
        this.ratePerHour = ratePerHour;
        this.hoursParked = hoursParked;
    }
    
    double calculateFee(){
        return hoursParked * ratePerHour;
    }
    
    void displayRecord(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle: " + vehicleName);
        System.out.println("Rate: " + ratePerHour);
        System.out.println("Hours Parked: " + hoursParked);
    }
    
    
    
}


// Question 14 — Campus Parking Management (20 marks)
// Create class ParkingRecord:
// vehicleNumber 
// hoursParked 
// ratePerHour 
// ownerName 
// Requirements:
// Constructor 
// Method calculateFee() 
// Method displayRecord() 
// Create ArrayList of 4 records 
// Display all records using loop 
// Display total revenue 
// Display longest parked vehicle 
// Use switch to categorize fee: 
// < 50 → Short Stay 
// 50–100 → Medium Stay 
// 100 → Long Stay
