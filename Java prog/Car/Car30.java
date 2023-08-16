import java.util.Scanner;

public class Car30
{
    private String make;
    private String model;
    private int year;

    public Car30(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the make of the car: ");
        String make = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = sc.nextInt();

        Car30 userCar = new Car30(make, model, year);

        System.out.println("\nUser's Car Details:");
        System.out.println("Make: " + userCar.getMake());
        System.out.println("Model: " + userCar.getModel());
        System.out.println("Year: " + userCar.getYear());

        sc.close();
    }
}
