package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature Converter App");
        System.out.println("Celsius ↔ Fahrenheit");

        double fahrenheit = 98;
        double celsius = convFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }

    
    private static double convFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}


