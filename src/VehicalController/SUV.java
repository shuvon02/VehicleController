package VehicalController;

public class SUV extends Car{

	public SUV(String name, boolean isManual) {
		super(name, 4, 5, 6, isManual, "SUV");
		/*name
		 * wheel
		 * door
		 * gear
		 * isManual
		 * type
		 */
		
	}
	
	public void accelerate(int rate)
	{
		int newSpeed=getCurrentSpeed()+rate;
		/*
		 * speed 0-10 : gear 1
		 * speed 10 -20 : gear 2
		 * speed 20-30 : gear 3
		 * speed 30-50 : gear 4
		 *  speed 50-70 gear 5
		 *  6
		 */
		if(newSpeed==0)
		{
			stop();
			ChangeGear(newSpeed=1);
		}
		else if(newSpeed>0 && newSpeed<=10)ChangeGear(1);
		else if(newSpeed>10 && newSpeed<=20)ChangeGear(2);
		else if(newSpeed>20 && newSpeed<=30)ChangeGear(3);
		else if(newSpeed>30 && newSpeed<=50)ChangeGear(4);
		else if(newSpeed>50 && newSpeed<=70)ChangeGear(5);
		else
			ChangeGear(6);
		if(newSpeed>0)ChangeSpeed(newSpeed, getCurrentDirection());
	}

}
