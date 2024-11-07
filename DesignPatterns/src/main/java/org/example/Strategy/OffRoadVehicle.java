package org.example.Strategy;

public class OffRoadVehicle extends Vehicle {


    OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SportDriveStrategy());
    }

}

