package draft1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airport {

    public static void main(String[] args) {

        Aircraft aircraft1 = new Aircraft("Boeing 777-200x", "USA", 16405, 2000);
        Aircraft aircraft2 = new Aircraft("Boeing 777-200ER", "USA", 8910, 2003);
        Aircraft aircraft3 = new Aircraft("Airbus", "France", 15200, 2005);

        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();

//        allFlightVehicle.setAircrafts((List<Aircraft>) aircraft1);
//        allFlightVehicle.setAircrafts((List<Aircraft>) aircraft2);
//        allFlightVehicle.setAircrafts((List<Aircraft>) aircraft3);

        //!

//for(ArrayList i : aircrafts){
//    System.out.println(i);
//}

        System.out.println(aircraft1);

        Iterator iterator = allFlightVehicle.getAircrafts().iterator();
        while (iterator.hasNext()) {
            Aircraft aircraft = (Aircraft) iterator.next();
            System.out.println(aircraft);
        }
    }

        /*
        for (Aircraft item : aircrafts){
            System.out.println(item);}
    }
*/

    // method to add aircraft into ArrayList<Aircraft>

    public static void addAircraft(String name, String country, int flyDistance, int firstFlyght) {
        Aircraft aircraft = new Aircraft(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.getAircrafts().add(aircraft);
    }

    //method to add gelicopter into ArrayList<Lesson2.task.Helicopter>

    public static void addHelicopter(String name, String country, int flyDistance, int firstFlyght) {
        Helicopter helicopter = new Helicopter(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.getHelicopters().add(helicopter);
    }

    //method to add quadcopter into ArrayList<Lesson2.task.Quadcopter>

    public static void addQuadcopter(String name, String country, int flyDistance, int firstFlyght) {
        Quadcopter quadcopter = new Quadcopter(name, country, flyDistance, firstFlyght);
        AllFlightVehicle allFlightVehicle = new AllFlightVehicle();
        allFlightVehicle.getQuadcopters().add(quadcopter);
    }
    // sort method will be here byDistance
}
