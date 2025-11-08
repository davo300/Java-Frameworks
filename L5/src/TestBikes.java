/*###################################################
	This code should go in a TestBikes.java File
####################################################*/


import java.util.ArrayList;

public class TestBikes {
	public static void main(String[] args){
	 ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();
	 bikes.add(new MountainBike(2,10,1,"heavy"));
	 bikes.add(new MountainBike(5,25,3,"light"));
	 bikes.add(new RoadBike(2,10,1,1));
	 bikes.add(new RoadBike(5,25,3,2));
	 printList(bikes);
	}

	private static void printList(ArrayList<Bicycle> bikes) 
	{
		for (int i = 0; i < bikes.size(); ++i) 
		{
			Bicycle bike = bikes.get(i);
		
			if (bikes.get(i) instanceof MountainBike)
			{
				System.out.println("This is a mountain bike");
				
			}
			if (bikes.get(i) instanceof RoadBike)
			{
				System.out.println("This is a road bike");
			
			}
			bike.printDescription();
		}

	}
}
	