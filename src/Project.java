
package one;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class Project {

	public static Map getCity(String city) {
		Map<String, Object> mexico = new HashMap<>();
        mexico.put("city", "Mexico City");
        mexico.put("zipCode", 10000);
        mexico.put("temperature", 82.4);
        mexico.put("humidity", 65);
        mexico.put("condition", "Sunny");
        mexico.put("feelsLike", 84.2);
        mexico.put("timeUpdated", LocalDateTime.now());

        Map<String, Object> greenland = new HashMap<>();
        greenland.put("city", "Nuuk");
        greenland.put("zipCode", 3900);
        greenland.put("temperature", 34.6);
        greenland.put("humidity", 80);
        greenland.put("condition", "Snow");
        greenland.put("feelsLike", 28.7);
        greenland.put("timeUpdated", LocalDateTime.now());

        Map<String, Object> usa = new HashMap<>();
        usa.put("city", "New York");
        usa.put("zipCode", 10001);
        usa.put("temperature", 78.9);
        usa.put("humidity", 70);
        usa.put("condition", "Cloudy");
        usa.put("feelsLike", 80.1);
        usa.put("timeUpdated", LocalDateTime.now());

        Map<String, Object> spain = new HashMap<>();
        spain.put("city", "Madrid");
        spain.put("zipCode", 28001);
        spain.put("temperature", 91.0);
        spain.put("humidity", 40);
        spain.put("condition", "Clear");
        spain.put("feelsLike", 93.2);
        spain.put("timeUpdated", LocalDateTime.now());

        Map<String, Object> tokyo = new HashMap<>();
        tokyo.put("city", "Tokyo");
        tokyo.put("zipCode", 1000001);
        tokyo.put("temperature", 88.8);
        tokyo.put("humidity", 75);
        tokyo.put("condition", "Rain");
        tokyo.put("feelsLike", 90.0);
        tokyo.put("timeUpdated", LocalDateTime.now());

        
        List<Map<String, Object>> cities = Arrays.asList(mexico, greenland, usa, spain, tokyo);

        Map <String, Object> output = new HashMap<>();
        
        for (Map<String, Object> cityMap : cities) {
            if (((String) cityMap.get("city")).equalsIgnoreCase(city)) {
                output = cityMap;
                break;
            }
        }
       
		return output;
	}
	// city, or zipCode.
	
	
	public static void getWeatherByCity(Scanner usrInput) {
		
		System.out.println("enter a city: ");
		String city = usrInput.nextLine();
		Map<String, Object> unknownCity = getCity(city);

		
		if (unknownCity.containsKey("city")) {
		    System.out.println("City found: " + unknownCity.get("city"));
		  
			String cit = (String) unknownCity.get("city");
			int zipCode = (int) unknownCity.get("zipCode");
			
			double temperature= (double) unknownCity.get("temperature");
			int humidity = (int) unknownCity.get("humidity");
			String condition = (String) unknownCity.get("condition");
			double feelsLike = (double) unknownCity.get("feelsLike");
			LocalDateTime timeUpdated = LocalDateTime.now();
			
			Weather w = new Weather(city,zipCode, temperature, humidity,condition,feelsLike,timeUpdated);
			
			System.out.println(w.toString());
		    

		} else {
		    System.out.println("City not found.");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		

		
//		String city = "mex";
//		int zipCode = 123;
//		double temperature= 80;
//		int humidity = 90;
//		String condition = "humid";
//		double feelsLike = 90;
//		LocalDateTime timeUpdated = LocalDateTime.now();
//		Weather w = new Weather(city,zipCode, temperature, humidity,condition,feelsLike,timeUpdated);
//		
//		System.out.println(w);
		
		getWeatherByCity(usrInput);
		
		usrInput.close();
		
	}
}

class Weather{
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
	
	
	
	public Weather() {
		city = "";
		zipCode = 0;
		temperature= 0;
		humidity = 0;
		condition = "";
		feelsLike = 0;
		timeUpdated = LocalDateTime.now();
	}
	
	public Weather(String city, int zipCode, double temperature,int humidity,String condition,double feelsLike,LocalDateTime timeUpdated) {
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