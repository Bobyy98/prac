#include <stdio.h>

void main()
{
    int r, i, j;
    
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    
    for (i = r; i >= 1; i--)
    {
        for (j = 1; j <= i; ++j)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}
