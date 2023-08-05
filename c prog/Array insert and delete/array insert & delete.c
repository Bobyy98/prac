#include <stdio.h>

int main()
{
    int array[100], pos, c, n, val, choice;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    printf("\nEnter %d elements: \n", n);
    for (c = 0; c < n; c++)
    {
        scanf("%d", &array[c]);
    }

    printf("\nOriginal array is: ");
    for (c = 0; c < n; c++)
    {
        printf("%d ", array[c]);
    }

    printf("\n");

    printf("\nWhich function do you wish to perform?");
    printf("\n1. Insertion");
    printf("\n2. Deletion\n");
    scanf("%d", &choice);

    switch(choice)
    {
        case 1:
        {
            printf("\nEnter the location where you wish to insert an element: ");
            scanf("%d", &pos);

            printf("Enter the value to insert: ");
            scanf("%d", &val);

            for (c = n - 1; c >= pos - 1; c--)
            {
                array[c + 1] = array[c];
            }

            array[pos - 1] = val;

            printf("Resultant array is: ");
            for (c = 0; c < n + 1; c++)
            {
                printf("%d ", array[c]);
            }
            printf("\n");
            break;
        }

        case 2:
        {
            printf("\nEnter the location where you wish to delete an element: ");
            scanf("%d", &pos);

            if(pos >= n + 1)
            {
                printf("Deletion not possible");
            }

            else
            {
                for(c = pos - 1; c < n - 1; c++)
                {
                    array[c] = array [c + 1];
                }

                printf("Resultant array is: ");
                for(c = 0; c < n - 1; c++)
                {
                    printf("%d ", array[c]);
                }
            }
            break;
        }

        default:
        {
            printf("\nInvalid choice.");
        }
    }
    return 0;
}
