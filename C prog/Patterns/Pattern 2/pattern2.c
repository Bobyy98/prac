#include <stdio.h>

void main()
{
    printf("Name: PRITHVIRAJ SAWANT\n");
    printf("Roll No: 16010622147\n");

    int r, i, j, k;

    printf("Enter the number of rows: ");
    scanf("%d", &r);

    for (i = 0; i < r; i++)
    {
        for (k = 0; k <= i - 1; k++)
        {
            printf(" ");
        }
        for (j = r - i; j > 0; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}
