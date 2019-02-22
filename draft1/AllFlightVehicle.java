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

  public void setAircrafts(List<Aircraft> aircrafts) {
    this.aircrafts = aircrafts;
  }

  public List<Helicopter> getHelicopters() {
    return helicopters;
  }

  public void setHelicopters(List<Helicopter> helicopters) {
    this.helicopters = helicopters;
  }

  public List<Quadcopter> getQuadcopters() {
    return quadcopters;
  }

  public void setQuadcopters(List<Quadcopter> quadcopters) {
    this.quadcopters = quadcopters;
  }
}
