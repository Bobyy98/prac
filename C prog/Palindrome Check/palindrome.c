#include <stdio.h>

void main()
{
    int temp, rev = 0, r, og;

    printf("\nEnter a number: ");
    scanf("%d", &temp);
    og = temp;

    while (temp > 0)
    {
        r = temp % 10;
        rev = rev * 10 + r;
        temp /= 10;
    }

    if (og == rev)
        printf("%d is a palindrome", og);
    else
        printf("%d is not a palindrome", og);
}
