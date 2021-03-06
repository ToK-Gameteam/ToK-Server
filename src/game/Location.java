package game;

import java.io.Serializable;

public class Location implements Serializable{
	private static final long serialVersionUID = 1L;
	private int locationX;
	private int locationY;
	
	public Location(int locationX, int locationY){
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public void setLocation(int[] newLocation){
		locationX = newLocation[0];
		locationY = newLocation[1];
	}
	
	public void setLocationX(int locationX){
		this.locationX = locationX;
	}
	
	public void setLocationY( int locationY ){
		this.locationY = locationY;
	}
	
	public int getLocationX(){
		return locationX;
	}
	
	public int getLocationY(){
		return locationY;
	}
	
	public int[] getLocation(){
		int[] location = {locationX, locationY};
		return location;
	}
	
	public boolean equals(Location location){
		if(location.getLocationX() == locationX && location.getLocationY() == locationY){
			return true;
		}else{
			return false;
		}
	}
}
