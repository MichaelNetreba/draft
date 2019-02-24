package draft1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Airport {

    public static void main(String[] args) {

        Aircraft aircraft1 = new Aircraft("Boeing 777-200x", "USA", 16405, 2000);
        Aircraft aircraft2 = new Aircraft("Boeing 777-200ER", "USA", 8910, 2003);
        Aircraft aircraft3 = new Aircraft("Airbus", "France", 15200, 2005);

        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();

        allFlightVehicle.setAircrafts(aircraft1);
        allFlightVehicle.setAircrafts(aircraft2);
        allFlightVehicle.setAircrafts(aircraft3);

Airport.sortAircraftsByDistance();

        Iterator iterator = allFlightVehicle.getAircrafts().iterator();
        while (iterator.hasNext()) {
            Aircraft aircraft = (Aircraft) iterator.next();
            System.out.println(aircraft);
        }
    }


    // method to add aircraft into ArrayList<Aircraft>

    public static void addAircraft(String name, String country, int flyDistance, int firstFlyght) {
        Aircraft aircraft = new Aircraft(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.setAircrafts(aircraft);
    }

    //method to add gelicopter into ArrayList<Helicopter>

    public static void addHelicopter(String name, String country, int flyDistance, int firstFlyght) {
        Helicopter helicopter = new Helicopter(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.setHelicopters(helicopter);
    }

    //method to add quadcopter into ArrayList<Quadcopter>

    public static void addQuadcopter(String name, String country, int flyDistance, int firstFlyght) {
        Quadcopter quadcopter = new Quadcopter(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.setQuadcopters(quadcopter);
    }
    // sort method will be here byDistance
    public static void sortAircraftsByDistance(){
      AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
      allFlightVehicle.getAircrafts().sort(Comparator.comparing(Aircraft::getFlyDistance));
    }

    public static void sortHelicopterByDistance(){
    }
    public static void sortQuadcopterByDistance(){
    }


}
