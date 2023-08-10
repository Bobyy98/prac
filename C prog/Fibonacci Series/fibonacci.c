#include <stdio.h>

void main()
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
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
            i++;
            printf("%d ", n3);
        }
        while (i <= n - 3);

        printf("\nSum of Fibonacci Series up to %d terms: %d", n, sum);
    }
}
