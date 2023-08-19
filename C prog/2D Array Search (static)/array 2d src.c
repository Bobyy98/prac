#include <stdio.h>

void main()
{
    int i, j, a, b;
    int arr[2][3] = {{1, 2, 3}, {4, 5, 6}};

    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }

    printf("Enter row: ");
    scanf("%d", &a);

    printf("Enter column: ");
    scanf("%d", &b);

    printf("%d", arr[a - 1][b - 1]);
}
