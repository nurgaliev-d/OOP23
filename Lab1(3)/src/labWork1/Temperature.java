package labWork1;

public class Temperature {
	double temperature;
	String scale;
	
	public Temperature(double value){
		this.temperature = value;
	}
	public Temperature(String newScale) {
		this.scale = newScale;
	}
	public Temperature(double newValue, String newScale) {
		this.temperature = newValue;
		this.scale = newScale;
	}
	public Temperature() {
		this.temperature = 0;
		this.scale = "C";
	}
	
	public double toC() {
		if(this.scale == "F") {
			return 5 * (this.temperature - 32) / 9;
		}
		return this.temperature;
	}
	public double toF() {
		if(this.scale == "C") {
			return (9 * (this.temperature / 5) + 32);
		}
		return this.temperature;
	}
	public void setTemperature(double newValue) {
		this.temperature = newValue;
	}
	public void setScale(String newScale) {
		this.scale = newScale;
	}
	public void setBoth(double newTemperature, String newScale) {
		this.temperature = newTemperature;
		this.scale = newScale;
	}
	public String getScale() {
		return this.scale;
	}
	public String toString() {
		return "Temperature is: " + this.temperature +" "+ this.scale;
	}
}

