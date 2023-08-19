#include <stdio.h>

void main()
{
    int r, i, j, k;

    printf("\nEnter the number of rows: ");
    scanf("%d", &r);

    for (i = 0; i < r; i++)
    {
        for (k = r - i - 1; k > 0; k--)
        {
            printf("\t");
        }
        
        for (j = 0; j <= i; j++)
        {
            if (j % 2 == 0)
                printf("1\t");
            else
                printf("0\t");
        }

        printf("\n");
    }
}
