public class TrafficLightState{
	public static void main(String args[]){
		enum TrafficLight {RED,YELLOW,GREEN;}
		
		TrafficLight currentLight = TrafficLight.RED;
		
		switch (currentLight)
		{
		case RED:
				System.out.println("stop");
		break;
		case YELLOW:
				   System.out.println("Prepare to stop");
		break;
		case GREEN:
		        System.out.println("GO");
		break;		
	}   }
}
