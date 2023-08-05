import java.util.Scanner;

public class circle2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double radius, area, perimeter;
        
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble(); //to store the value of radius

        if (radius < 0)
        {
            System.out.println("radius cannot be -ve"); //shows an error if radius is -ve
        }

        else
        {
            area = Math.PI * radius * radius; //formula to calculate area
            perimeter = 2 * Math.PI * radius; //formula to calculare perimeter

            System.out.println("\nArea of the circle: " + area);
            System.out.println("Perimeter of the circle: " + perimeter); //print the answers

        }
        scanner.close();
    }
}
