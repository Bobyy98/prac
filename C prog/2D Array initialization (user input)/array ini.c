#include <stdio.h>

void main()
{
    int r, c, i, j, a, b;

    printf("\nEnter the number of rows: ");
    scanf("%d", &r);

    printf("Enter the number of columns: ");
    scanf("%d", &c);

    printf("\n");
    int arr[r][c];

    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            printf("Enter the element [%d][%d]: ", i + 1, j + 1);
            scanf("%d", &arr[i][j]);
        }
    }

    printf("\nYour array is: \n");
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }

    printf("\nEnter row: ");
    scanf("%d", &a);

    printf("Enter column: ");
    scanf("%d", &b);

    printf("\nThe element is %d", arr[a - 1][b - 1]);
}
