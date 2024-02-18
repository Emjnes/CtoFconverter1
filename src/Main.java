import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = 0, fahrenheit;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature value.");
                scanner.next(); // clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
