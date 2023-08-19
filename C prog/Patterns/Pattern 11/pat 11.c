#include <stdio.h>

void main()
{
    int r, i, j;

    printf("\nEnter the number of rows: ");
    scanf("%d", &r);

    for (i = 1; i <= r; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d\t", i * j);
        }
        printf("\n");
    }
}
