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
        
        for (j = r - i; j <= r; j++)
        {
            printf("%d\t", j);
        }
        
        printf("\n");
    }
}
