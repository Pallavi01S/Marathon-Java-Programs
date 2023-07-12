import java.util.Scanner;

public class TheTemperatureConverter {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double fahrenheit=scan.nextDouble();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		
	}

}
