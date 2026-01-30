package app;

public class Main {


    private static final double MILES_TO_KM = 1.60934;
    private static final double KM_TO_MILES = 0.621371;

    public static void main(String[] args) {
        System.out.println("Temperature Converter App");
        System.out.println("Celsius ↔ Fahrenheit");


        double fahrenheit = 98;
        double celsiusFromF = convFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsiusFromF + "°C");


        double celsius = 37;
        double fahrenheitFromC = convCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheitFromC + "°F");
    }


    private static double convFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }


    private static double convCelsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
}


