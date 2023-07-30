#include <stdio.h>
#include <stdbool.h>

typedef struct {
    double real;
    double imag;
} complex;

complex cadd(complex z1, complex z2)
{
    complex z;
    z.real = z1.real + z2.real;
    z.imag = z1.imag + z2.imag;
    return z;
}

complex csub(complex z1, complex z2)
{
    complex z;
    z.real = z1.real - z2.real;
    z.imag = z1.imag - z2.imag;
    return z;
}

complex cmul(complex z1, complex z2)
{
    complex z;
    z.real = z1.real * z2.real - z1.imag * z2.imag;
    z.imag = z1.real * z2.imag + z1.imag * z2.real;
    return z;
}

complex cconj_z1(complex z1)
{
    complex z;
    z.real = z1.real;
    z.imag = -z1.imag;
    return z;
}

complex cconj_z2(complex z2)
{
    complex z;
    z.real = z2.real;
    z.imag = -z2.imag;
    return z;
}

void cprn(complex z)
{
    printf("(%.2f) + i(%.2f)", z.real, z.imag);
}

bool ceq(complex z1, complex z2)
{
    return z1.real == z2.real && z1.imag == z2.imag;
}

int main()
{
    double xr, xi, yr, yi;
    int choice;

    printf("Enter real part of z1: ");
    scanf("%lf", &xr);

    printf("Enter imaginary part of z1: ");
    scanf("%lf", &xi);

    printf("Enter real part of z2: ");
    scanf("%lf", &yr);

    printf("Enter imaginary part of z2: ");
    scanf("%lf", &yi);

    complex z1 = {xr, xi};
    complex z2 = {yr, yi};

    complex sum = cadd(z1, z2);
    complex sub = csub(z1, z2);
    complex product = cmul(z1, z2);
    complex conju_z1 = cconj_z1(z1);
    complex conju_z2 = cconj_z2(z2);

    printf("\nz1: ");
    cprn(z1);
    printf("\n");

    printf("z2: ");
    cprn(z2);
    printf("\n");

    printf("\nSelect an operation:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Conjugate\n");
    printf("5. Equality Check\n");
    scanf("%d", &choice);

    switch(choice)
    {
        case 1:
            printf("\nSum: ");
            cprn(sum);
            printf("\n");
            break;

        case 2:
            printf("\nSubtract");
            cprn(sub);
            printf("\n");
            break;
        
        case 3:
            printf("\nProduct: ");
            cprn(product);
            printf("\n");
            break;

        case 4:
            printf("\nConjugate: ");
            printf("\nz1: ");
            cprn(conju_z1);
            printf("\nz2: ");
            cprn(conju_z2);
            printf("\n");
            break;

        case 5:
            if (ceq(z1, z2))
            {
                printf("\nz1 is equal to z2.\n");
            }
            else
            {
                printf("\nz1 is not equal to z2.\n");
            }
            break;
        
        default:
            printf("\nInvalid choice.\n");
    }

    return 0;
}
