#include <stdio.h>

int main() {
    int n;
    printf("Enter number of rows: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        for (int k = 0; k < n - i - 1; k++) {
            printf(" ");
        }
        
        for (int j = 0; j <= i; j++) {
            if ((i + j) % 2 == 0)
                printf("1 ");
            else
                printf("0 ");
        }
        
        printf("\n");
    }

    return 0;
}
