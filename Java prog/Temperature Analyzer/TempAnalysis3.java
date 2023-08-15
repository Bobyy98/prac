import java.util.Scanner;

public class TempAnalysis3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] temp = new int[7][10]; // 7 days, 10 cities
        for (int day = 0; day < 7; day++)
        {
            System.out.println("Enter temperatures for day " + (day + 1));
            for (int city = 0; city < 10; city++)
            {
                temp[day][city] = sc.nextInt();
            }
        }

        int maxTemp = Integer.MIN_VALUE;
        int maxDay = -1;
        int maxCity = -1;

        for (int day = 0; day < 7; day++)
        {
            for (int city = 0; city < 10; city++)
            {
                if (temp[day][city] > maxTemp)
                {
                    maxTemp = temp[day][city];
                    maxDay = day + 1;
                    maxCity = city + 1;
                }
            }
        }

        System.out.println("The highesst temperature is " + maxTemp + " recorded in city " + maxCity + " on day " + maxDay);

        sc.close();
    }
}
