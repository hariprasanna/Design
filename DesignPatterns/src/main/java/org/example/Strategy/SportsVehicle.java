package org.example.Strategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(DriveStrategy driveStrategy) {
        super(new SportDriveStrategy());
    }

}
