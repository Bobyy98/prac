import java.util.Scanner;

public class StudentMarksClassifier5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int num = sc.nextInt();

        int[] marks = new int[num];

        System.out.println("Enter the marks of each student: ");
        for (int i = 0; i < num; i++)
        {
            marks[i] = sc.nextInt();
        }

        int range1Count = 0;
        int range2Count = 0;
        int range3Count = 0;
        int range4Count = 0;

        for (int mark : marks)
        {
            if (mark >= 81 && mark <= 100)
            {
                range1Count++;
            }
            else if (mark >= 61 && mark <= 80)
            {
                range2Count++;
            }
            else if(mark >= 41 && mark <= 60)
            {
                range3Count++;
            }
            else
            {
                range4Count++;
            }
        }

        System.out.println("Number of students in the range 81-100: " + range1Count);
        System.out.println("Number of students in the range 61-80: " + range2Count);
        System.out.println("Number of students in the range 41-60: " + range3Count);
        System.out.println("Number of students with marks less than 40: " + range4Count);

        sc.close();
    }
}
