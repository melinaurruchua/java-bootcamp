
public class Constructor {
	private String name;
	private Builder buildingBuilder;
	  
	public Constructor(String name, Builder buildingBuilder){
		this.setName(name);
		this.buildingBuilder = buildingBuilder;
	}
	
	  
	public Building getBuilding(){
		return this.buildingBuilder.getBuilding();
	}
	  
	public void construct(){
		buildingBuilder.buildBasement();
		buildingBuilder.buildWalls();
	    buildingBuilder.buildRoof();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
