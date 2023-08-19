#include <stdio.h>

void main()
{
    int r, coef = 1, k, i, j;

    printf("Enter the number of rows: ");
    scanf("%d", &r);

    for (i = 0; i < r; i++)
    {
        for (k = 1; k <= r - i; k++)
            printf("  ");

        for (j = 0; j <= i; j++)
        {
            if (j == 0)
                coef = 1;
            else
                coef = coef * (i - j + 1) / j;

            printf("%4d", coef);
        }
        
        printf("\n");
    }
}
