#include <stdio.h>

int main()
{
    int k, i, j, r;
    
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    
    for (i = 0; i < r; i++)
    {
        for (k = 0; k < r - i - 1; k++)
        {
            printf(" ");
        }
        
        for (j = 0; j <= 2 * i; j++)
        {
            if (j % 2 == 0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
        }
        
        printf("\n");
    }
    
    return 0;
}
