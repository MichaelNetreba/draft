package draft1;


import java.util.ArrayList;
import java.util.List;

public class AllFlightVehicle {

    private List<Aircraft> aircrafts = new ArrayList<>();

    private List<Helicopter> helicopters = new ArrayList<>();

    private List<Quadcopter> quadcopters = new ArrayList<>();


    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public List<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(Helicopter helicopter) {this.helicopters.add(helicopter); }

    public List<Quadcopter> getQuadcopters() {
        return quadcopters;
    }

    public void setQuadcopters(Quadcopter quadcopter) {this.quadcopters.add(quadcopter); }
}
