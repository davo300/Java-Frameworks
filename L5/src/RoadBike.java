/*###################################################
	This code should go in a RoadBike.java File
####################################################*/


public class RoadBike extends Bicycle {
    private int TireWidth;

    public RoadBike(               // RoadBike constructor
               int startCadence,
               int startSpeed,
               int startGear,
               int TireWidth){
        super(startCadence,
              startSpeed,
              startGear);
        this.setTireWidth(TireWidth);
    }

    public int getTireWidth(){
      return this.TireWidth;
    }

    public void setTireWidth(int TireWidth) {
        this.TireWidth = TireWidth;
    }

    public void printDescription() {
       System.out.println("The " + "road bike has a " +
            getTireWidth() + " tire width.");
    }
    
    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement*2;
    }
}

