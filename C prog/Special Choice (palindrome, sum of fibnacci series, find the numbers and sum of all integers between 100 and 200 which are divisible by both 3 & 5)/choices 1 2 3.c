#include <stdio.h>

void main()
{
    int choice;

    printf("\nEnter 1 to check whether it's palindrome\n");
    printf("Enter 2 to print sum of fibonacci series\n");
    printf("Enter 3 to find the numbers and sum of all integers between 100 and 200 which are divisible by both 3 & 5\n\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
        case 1:
            printf("\nWelcome to task 1\nTo check palindrome\n");
            {
                int temp, rev = 0, r, og;
                printf("\nEnter a number: ");
                scanf("%d", &temp);
                og = temp;

                while (temp > 0)
                {
                    r = temp % 10;
                    rev = rev * 10 + r;
                    temp /= 10;
                }

                if (og == rev)
                    printf("%d is a palindrome", og);
                else
                    printf("%d is not a palindrome", og);
            }
            break;

        case 2:
            printf("\nWelcome to task 2\nTo print fibonacci series\n");
            {
                int n, n1 = 0, n2 = 1, n3, sum = 1, i = 0;
                printf("\nEnter range of Fibonacci Series: ");
                scanf("%d", &n);

                if (n == 1)
                {
                    printf("Fibonacci Series: %d ", n1);
                    printf("\nSum of Fibonacci Series up to 1 term: %d ", n1);
                }
                else if (n == 2)
                {
                    printf("Fibonacci Series: %d %d ", n1, n2);
                    printf("\nSum of Fibonacci series up to 2 terms: %d", n1 + n2);
                }
                else
                {
                    printf("Fibonacci Series: %d %d ", n1, n2);
                    do
                    {
                        n3 = n1 + n2;
                        sum += n3;
                        n1 = n2;
                        n2 = n3;
                        i++;
                        printf("%d ", n3);
                    }
                    while (i <= n - 3);

                    printf("\nSum of Fibonacci Series up to %d terms: %d", n, sum);
                }
            }
            break;

        case 3:
            printf("\nWelcome to task 3\nTo find the numbers and sum of all integers between 100 and 200 which are divisible by both 3 & 5\n");
            {
                int i, sum = 0;
                printf("\nNumbers between 100 and 200, divisible by 3 and 5: \n");
                for (i = 100; i <= 200; i++)
                {
                    if (i % 3 == 0 && i % 5 == 0)
                    {
                        printf("% 5d", i);
                        sum += i;
                    }
                }
                printf("\n\nThe sum: %d \n", sum);
            }
            break;

        default:
            printf("\nEnter from the given choice");
    }
}
