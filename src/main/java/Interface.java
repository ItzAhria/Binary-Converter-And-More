import java.util.Scanner;

public class Interface
{   
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print(">"); // Make Console

        while (true)
        {
            String input = scanner.nextLine();

            // End Program
            if (input.equalsIgnoreCase("QUIT"))
            {
                System.out.println("See You Soon!");
                scanner.close(); // To close program properly
                break;
            }
            // Number Conversion
            // TODO
            else if (input.equalsIgnoreCase("CONVERT"))
            {
                // Values to be used later
                String value;
                String base;

                // Get the value of the number
                System.out.println("\nWhat is the value?");
                value = scanner.nextLine();

                // Get the value type as a string and convert it to Type
                // validType also checks if value is in valueType
                System.out.println("\nWhat is the base of value?");
                base = scanner.nextLine();

                try {
                    Function.convertNumber(value, Function.validType(value,base));
                } catch (Exception error) {
                    System.out.println(error.getMessage());
                }
            }
            // Assembly Related Command
            // TODO
            else if (input.equalsIgnoreCase("ASSEMBLY"))
            {
                continue;
            }
            // Load input history
            // TODO
            else if (input.equalsIgnoreCase("LOAD"))
            {
                continue;
            }
            System.out.print(">");
        }
    }
}