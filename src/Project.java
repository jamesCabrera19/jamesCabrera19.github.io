
package one;

import java.time.LocalDateTime;


public class Project {

	public static void main(String[] args) {
		
	}
}

class City{
	private String city;
	private int zipCode;
	private double temperature;
	private int humidity;
	private String condition;
	private double feelsLike;
	private LocalDateTime timeUpdated;
	// private List<Forecast> forecast -- array to store forecast data
	
	
	public String getCity() {
	    return city;
	}

	public void setCity(String city) {
	    this.city = city;
	}

	public int getZipCode() {
	    return zipCode;
	}

	public void setZipCode(int zipCode) {
	    this.zipCode = zipCode;
	}

	public double getTemperature() {
	    return temperature;
	}

	public void setTemperature(double temperature) {
	    this.temperature = temperature;
	}

	public int getHumidity() {
	    return humidity;
	}

	public void setHumidity(int humidity) {
	    this.humidity = humidity;
	}

	public String getCondition() {
	    return condition;
	}

	public void setCondition(String condition) {
	    this.condition = condition;
	}

	public double getFeelsLike() {
	    return feelsLike;
	}

	public void setFeelsLike(double feelsLike) {
	    this.feelsLike = feelsLike;
	}

	public LocalDateTime getTimeUpdated() {
	    return timeUpdated;
	}

	public void setTimeUpdated(LocalDateTime timeUpdated) {
	    this.timeUpdated = timeUpdated;
	}
	
	
	
	public City() {
		city = "";
		zipCode = 0;
		temperature= 0;
		humidity = 0;
		condition = "";
		feelsLike = 0;
		timeUpdated = LocalDateTime.now();
	}
	
	public City(String city, int zipCode, double temperature,int humidity,String condition,double feelsLike,LocalDateTime timeUpdated) {
		this.city = city;
		this.zipCode = zipCode;
		this.temperature= temperature;
		this.humidity = humidity;
		this.condition = condition;
		this.feelsLike = feelsLike;
		this.timeUpdated = timeUpdated;
	}
	
	
	@Override
	public String toString() {
	    return "City: " + city +
	           ", Zip Code: " + zipCode +
	           ", Temp: " + temperature + "°" +
	           ", Feels Like: " + feelsLike + "°" +
	           ", Condition: " + condition +
	           ", Humidity: " + humidity + "%" +
	           ", Updated: " + timeUpdated;
	}
	
}