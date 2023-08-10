#include <stdio.h>

void main()
{
    int r, i, j, k;
    
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    
    for (i = 0; i <= r; i++)
    {
        for (k = 0; k <= i - 1; k++)
        {
            printf(" \t");
        }
        
        for (j = r - i; j > 0; j--)
        {
            printf("%d\t", j);
        }
        
        printf("\n");
    }
}
