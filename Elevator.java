package Elevator;

public class Elevator
{

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor)
	{
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: " + dest_Floor);
		arrive_atFloor();

	}

	private void arrive_atFloor()
	{

		// Scenario 1: The Elevator must go up
		if (dest_Floor > current_Floor)
		{
			go_up();
		}
		// Scenario 2: The Elevator must go down
		else if (dest_Floor < current_Floor)
		{
			go_down();
		}
		else {
			exit();
		}
		

		

	}

	private void go_down()
	{
		State.Current_State = State.Moving_down;
		current_Floor -= 1;
		//System.out.println("Current floor is" + current_Floor);
		if (dest_Floor < current_Floor)
		{
			//System.out.println("Going down");
			go_down();
		}
		else {
			arrive_atFloor();
		}
		
	}

	private void go_up()
	{
		State.Current_State = State.Moving_up;
		current_Floor += 1;
		//System.out.println("Current floor is " + current_Floor);
		if (dest_Floor > current_Floor)
		{
			//System.out.println("Going up");
			go_up();
		}
		else {
			arrive_atFloor();
		}
	}
	
	private void exit() {
		
	}

}
