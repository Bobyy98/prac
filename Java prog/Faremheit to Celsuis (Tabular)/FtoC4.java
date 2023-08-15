public class FtoC4
{
    public static void main(String[] args)
    {
        System.out.println("Farenheit\tCelsius");
        System.out.println("-----------------------");

        for (int f = 0; f <= 100; f += 10)
        {
            double c = (f - 32) / 1.8;
            System.out.printf("%d F\t\t%.2f C%n", f, c);
        }
    }
}
