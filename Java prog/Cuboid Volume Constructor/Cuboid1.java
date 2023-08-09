import java.util.Scanner;

class Cuboid1 {
    double len, bre, hei, lend, bred, heid;

    Cuboid1() // Default Constructor
    {
        len = 1;
        bre = 2;
        hei = 3;

        lend = 1;
        bred = 2;
        heid = 3;
    }

    Cuboid1(double lend, double bred, double heid) // Parameterized constructor with double arguments
    {
        this.lend = lend;
        this.bred = bred;
        this.heid = heid;
    }

    Cuboid1(int len, int bre, int hei) // Parameterized constructor with int arguments
    {
        this.len = len;
        this.bre = bre;
        this.hei = hei;
    }

    double volume() {
        double vol = len * bre * hei;
        return vol;
    }

    double volumed() {
        double vold = lend * bred * heid;
        return vold;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length(double): ");
        double lend = sc.nextDouble(); 

        System.out.print("Enter breadth(double): "); 
        double bred = sc.nextDouble();

        System.out.print("Enter height(double): ");
        double heid = sc.nextDouble(); 

        System.out.print("Enter length(int): ");
        int len = sc.nextInt();

        System.out.print("Enter breadth(int): ");
        int bre = sc.nextInt();

        System.out.print("Enter height(int): ");
        int hei = sc.nextInt();

        Cuboid1 c1 = new Cuboid1(); // Default
        Cuboid1 c2 = new Cuboid1(lend, bred, heid); // Parameterized
        Cuboid1 c3 = new Cuboid1(len, bre, hei); // Parameterized

        System.out.println("1st Cuboid1: ");
        System.out.println("volume is: " + c1.volume());
        System.out.println("2nd Cuboid1:");
        System.out.println("volume is: " + c2.volumed());
        System.out.println("3rd Cuboid1: ");
        System.out.println("volume is: " + c3.volume());

        sc.close();
    }
}
