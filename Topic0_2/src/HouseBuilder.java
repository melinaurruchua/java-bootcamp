
public class HouseBuilder extends Builder{
	private House house;
	  
	public HouseBuilder(){
	   house = new House();
	}
	  
	@Override
	public void buildBasement() {
		house.setBasement("Basement");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Walls");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Roof");
	}

	@Override
	public Building getBuilding() {
		return this.house;
	}

}
