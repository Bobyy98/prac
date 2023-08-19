#include <stdio.h>

void main()
{
    int a, b, c, d, e, choice;

    printf("\nEnter 1st number: ");
    scanf("%d", &a);
    printf("Enter 2nd number: ");
    scanf("%d", &b);
    printf("Enter 3rd number: ");
    scanf("%d", &c);
    printf("Enter 4th number: ");
    scanf("%d", &d);
    printf("Enter 5th number: ");
    scanf("%d", &e);

    printf("\nEnter 1 to display the smallest number entered");
    printf("\nEnter 2 to display the largest number entered");
    printf("\nEnter 3 to display the sum of the five numbers entered");
    printf("\nEnter 4 to display the average of the five numbers entered");
    printf("\nEnter any other key to exit\n");
    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
        case 1:
            printf("\nWelcome to Task 1:\nTo display the smallest number entered\n");
            {
                int min = a;
                if (b < min)
                    min = b;
                if (c < min)
                    min = c;
                if (d < min)
                    min = d;
                if (e < min)
                    min = e;
                printf("\n\nThe smallest number entered is %d\n", min);
            }
            break;

        case 2:
            printf("\nWelcome to Task 2:\nTo display the largest number entered\n");
            {
                int max = a;
                if (b > max)
                    max = b;
                if (c > max)
                    max = c;
                if (d > max)
                    max = d;
                if (e > max)
                    max = e;
                printf("\n\nThe largest number entered is %d\n", max);
            }
            break;

        case 3:
            printf("\nWelcome to Task 3:\nTo display the sum of the five numbers entered\n");
            {
                int sum;
                sum = a + b + c + d + e;
                printf("\n\nThe sum of the five numbers entered is %d\n", sum);
            }
            break;

        case 4:
            printf("\nWelcome to Task 4:\nTo display the average of the five numbers entered\n");
            {
                int sum;
                float avg;
                sum = a + b + c + d + e;
                avg = sum / (float) 5;
                printf("\n\nThe average of the five numbers entered is %f\n", avg);
            }
            break;

        default:
            printf("\nExit\n");
    }
}
