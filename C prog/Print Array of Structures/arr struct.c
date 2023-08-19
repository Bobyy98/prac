#include <stdio.h>

struct temp {
    int a;
    int b;
    int c;
};

int main() {
    struct temp p[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Print the values of the first element in the array
    printf("p[0].a = %d\n", p[0].a);
    printf("p[0].b = %d\n", p[0].b);
    printf("p[0].c = %d\n", p[0].c);

    // Print the values of the second element in the array
    printf("p[1].a = %d\n", p[1].a);
    printf("p[1].b = %d\n", p[1].b);
    printf("p[1].c = %d\n", p[1].c);

    // Print the values of the third element in the array
    printf("p[2].a = %d\n", p[2].a);
    printf("p[2].b = %d\n", p[2].b);
    printf("p[2].c = %d\n", p[2].c);

    return 0;
}
