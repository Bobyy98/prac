#include <stdio.h>

void main()
{
    int r, i, j;

    printf("Enter the number of rows: ");
    scanf("%d", &r);

    for (i = 0; i < r; i++)
    {
        for (j = 0; j < i + 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}
