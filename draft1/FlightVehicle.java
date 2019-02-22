package draft1;


// abstract class contains main field which every type of flightVehicle has

public abstract class FlightVehicle {

  protected String name;
  protected String country;
  protected int flyDistance;
  protected int firstFlyght;

  public FlightVehicle(String name, String country, int flyDistance, int firstFlyght) {
    this.name = name;
    this.country = country;
    this.flyDistance = flyDistance;
    this.firstFlyght = firstFlyght;
  }

  public abstract void fly();

  public abstract void carryWeight();

  @Override
  public String toString() {
    return "FlightVehicle{" +
            "name='" + name + '\'' +
            ", country='" + country + '\'' +
            ", flyDistance=" + flyDistance +
            ", firstFlyght=" + firstFlyght +
            '}';
  }
}
