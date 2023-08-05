#include <stdio.h>
#include <stdbool.h>

typedef struct {
    int num;
    int den;
} rational;

rational radd(rational r1, rational r2)
{
    rational r;
    r.num = r1.num * r2.den + r2.num * r1.den;
    r.den = r1.den * r2.den;
    return r;
}

rational rsub(rational r1, rational r2)
{
    rational r;
    r.num = r1.num * r2.den - r2.num * r1.den;
    r.den = r1.den * r2.den;
    return r;
}

rational rmul(rational r1, rational r2)
{
    rational r;
    r.num = r1.num * r2.num;
    r.den = r2.den * r2.den;
    return r;
}

rational rdiv(rational r1, rational r2)
{
    rational r;
    r.num = r1.num * r2.den;
    r.den = r1.den * r2.num;
    return r;
}

void rprn(rational r)
{
    printf("%d/%d", r.num, r.den);
}

bool req(rational r1, rational r2)
{
    return r1.num == r2.num && r1.den == r2.den;
}

int main()
{
    int xn, xd, yn, yd;
    int choice;

    printf("Enter the numerator of r1: ");
    scanf("%d", &xn);

    printf("Enter the denominator of r1: ");
    scanf("%d", &xd);

    printf("Enter the numerator of r2: ");
    scanf("%d", &yn);

    printf("Enter the denominator of r2: ");
    scanf("%d", &yd);

    rational r1 = {xn, xd};
    rational r2 = {yn, yd};

    rational sum = radd(r1, r2);
    rational sub = rsub(r1, r2);
    rational prod = rmul(r1, r2);
    rational div = rdiv(r1, r2);

    printf("\nr1: ");
    rprn(r1);
    printf("\n");

    printf("r2: ");
    rprn(r2);
    printf("\n");

    printf("\nSelect an operation:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division\n");
    printf("5. Equality Check\n");
    scanf("%d", &choice);

    switch (choice)
    {
        case 1:
            printf("\nSum: ");
            rprn(sum);
            printf("\n");
            break;

        case 2:
            printf("\nSubtract: ");
            rprn(sub);
            printf("\n");
            break;

        case 3:
            printf("\nProduct: ");
            rprn(prod);
            printf("\n");
            break;

        case 4:
            printf("\nDivision: ");
            rprn(div);
            printf("\n");
            break;

        case 5:
            if (req(r1, r2))
            {
                printf("\nr1 is equal to r2.\n");
            }
            else
            {
                printf("\nr1 is not equal to r2.\n");
            }
            break;

        default:
            printf("\nInvalid Choice.\n");
    }

    return 0;
}
