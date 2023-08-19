#include <stdio.h>

void main()
{
    int n, i, k, s, no, x;

    printf("\nEnter the number of terms: ");
    scanf("%d", &n);
    printf("\n");

    int arr[n];

    for (i = 0; i < n; i++)
    {
        printf("Enter the element [%d]: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("\nYour array is: \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\n\nArray in reverse order: \n");
    for (i = n - 1; i >= 0; i--)
    {
        printf("%d\t", arr[i]);
    }
}
