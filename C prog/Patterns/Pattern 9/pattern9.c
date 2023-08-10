#include <stdio.h>

int main()
{
    int r, i, j, k;
    
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    
    for (i = 0; i < r; i++)
    {
        for (k = 0; k < r - i - 1; k++)
        {
            printf("\t");
        }
        
        for (j = 0; j <= i; j++)
        {
            if ((i + j) % 2 == 0)
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
    
    return 0;
}
