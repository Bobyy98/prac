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

    printf("\nYour array is : \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    for (k = 0; k < n - 1; k++)
    {
        for (i = k; i < n - 1; i++)
        {
            if (arr[k] > arr[i + 1])
            {
                s = arr[k];
                arr[k] = arr[i + 1];
                arr[i + 1] = s;
            }
        }
    }

    printf("\nArray in ascending order is: \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\n\nEnter new number: ");
    scanf("%d", &no);
    n = n + 1;

    for (i = 0; i < n; i++)
    {
        if (no < arr[i])
        {
            for (x = n - 1; x > i; x--)
            {
                arr[x] = arr[x - 1];
            }
            arr[i] = no;
            break;
        }
    }

    printf("\nArray in ascending order with the new number is: \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}
