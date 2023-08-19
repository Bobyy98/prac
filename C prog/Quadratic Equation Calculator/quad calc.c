#include <stdio.h>
#include <math.h>
void main()
{
    double a, b, c, x, d;
    printf("In the quadratic equation ax^2 + bx + c = 0\n");
    printf("Enter a: ");
    scanf("%lf", &a);
    printf("Enter b: ");
    scanf("%lf", &b);
    printf("Enter c: ");
    scanf("%lf", &c);
    d = pow(b, 2) - 4 * a * c;

    if (d >= 0)
    {
        printf("\nRoots are real");
        double root1 = (-b + sqrt(d)) / (2 * a);
        double root2 = (-b - sqrt(d)) / (2 * a);
        printf("\nRoots of the quadratic equation are: %lf and %lf", root1, root2);
    }
    else
    {
        printf("\nRoots are imaginary");
        double realPart = -b / (2 * a);
        double imaginaryPart = sqrt(-d) / (2 * a);
        printf("\nRoots of the quadratic equation are: %lf + %lfi and %lf - %lfi", realPart, imaginaryPart, realPart, imaginaryPart);
    }
}
