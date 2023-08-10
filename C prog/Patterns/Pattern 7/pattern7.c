#include <stdio.h>

void main()
{
    int r, i, j;
    
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < r; j++)
        {
            if (i == j)
            {
                printf("1\t");
            }
            else
            {
                printf("0\t");
            }
        }
        printf("\n");
    }
}
