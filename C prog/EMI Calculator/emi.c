#include <stdio.h>
#include <math.h>

int main() {
    float p, r, n, emi;

    printf("Enter the principal amount: ");
    scanf("%f", &p);

    printf("Enter the rate of interest: ");
    scanf("%f", &r);

    printf("Enter the time: ");
    scanf("%f", &n);

    emi = p * r * pow(1 + r, n) / (pow(1 + r, n) - 1);

    printf("EMI is %f\n", emi);

    return 0;
}
