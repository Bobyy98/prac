#include <stdio.h>
#define pi 3.14

int main() 
{
    float r, circ, area;

    printf("Enter the radius of the circle: ");
    scanf("%f", &r);

    circ = 2 * pi * r;
    area = pi * r * r;

    printf("Circumference of the circle is %f\n", circ);
    printf("Area of the circle is %f\n", area);

    return 0;
}
