#include <stdio.h>

void main()
{
    int a, b, c;
    
    printf("Enter the value of a, b, c\n");
    scanf("%d%d%d", &a, &b, &c);
    
    if (a > b && a > c)
        printf("Largest number is %d", a);
    else if (b > a && b > c)
        printf("Largest number is %d", b);
    else
        printf("Largest number is %d", c);
}
