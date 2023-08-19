#include <stdio.h>

void main()
{
    int arr[2][3];
    int i, j;

    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("Enter value for arr[%d][%d]: ", i+1, j+1);
            scanf("%d", &arr[i][j]);
        }
    }

    printf("Two 2D array elements:\n");
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d ", arr[i][j]);
            if (j == 2)
            {
                printf("\n");
            }
        }
    }
}
