#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Name: PRITHVIRAJ SAWANT\n");
    printf("Roll No: 16010622147\n");
    
    int a, b, c, large;
    
    printf("Enter the value of a, b, c: \n");
    scanf("%d%d%d", &a, &b, &c);
    
    large = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    
    printf("Largest no is %d", large);
    
    return 0;
}
