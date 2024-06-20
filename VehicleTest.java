package Interface;

interface Vehicle {
 void start();
 void stop();
}

interface LandVehicle extends Vehicle {
 void drive();
}

interface SeaVehicle extends Vehicle {
 void floatOnWater();
}

class Car implements LandVehicle {
 @Override
 public void start() {
     System.out.println("Car is starting.");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping.");
 }

 @Override
 public void drive() {
     System.out.println("Car is driving.");
 }
}

class Bicycle implements LandVehicle {
 @Override
 public void start() {
     System.out.println("Bicycle is starting.");
 }

 @Override
 public void stop() {
     System.out.println("Bicycle is stopping.");
 }

 @Override
 public void drive() {
     System.out.println("Bicycle is driving.");
 }
}

class Ship implements SeaVehicle {
 @Override
 public void start() {
     System.out.println("Ship is starting.");
 }

 @Override
 public void stop() {
     System.out.println("Ship is stopping.");
 }

 @Override
 public void floatOnWater() {
     System.out.println("Ship is floating on water.");
 }
}

class Submarine implements SeaVehicle {
 @Override
 public void start() {
     System.out.println("Submarine is starting.");
 }

 @Override
 public void stop() {
     System.out.println("Submarine is stopping.");
 }

 @Override
 public void floatOnWater() {
     System.out.println("Submarine is floating on water.");
 }
}

public class VehicleTest {
 public static void main(String[] args) {

     LandVehicle car = new Car();
     LandVehicle bicycle = new Bicycle();
     SeaVehicle ship = new Ship();
     SeaVehicle submarine = new Submarine();

     System.out.println("Testing Car:");
     car.start();
     car.drive();
     car.stop();
     System.out.println();

     System.out.println("Testing Bicycle:");
     bicycle.start();
     bicycle.drive();
     bicycle.stop();
     System.out.println();

     System.out.println("Testing Ship:");
     ship.start();
     ship.floatOnWater();
     ship.stop();
     System.out.println();

     System.out.println("Testing Submarine:");
     submarine.start();
     submarine.floatOnWater();
     submarine.stop();
 }
}
