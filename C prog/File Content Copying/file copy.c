#include <stdio.h>

int main() {
    const char* file1 = "file1.txt"; 
    const char* file2 = "file2.txt";
    FILE* fp1 = fopen(file1, "r");
    
    if (fp1 == NULL) {
        printf("Error opening file %s\n", file1);
        return 1;
    }
    
    FILE* fp2 = fopen(file2, "w");
    
    if (fp2 == NULL) {
        printf("Error opening file %s\n", file2);
        fclose(fp1);
        return 1;
    }
    
    int c; 
    while ((c = fgetc(fp1)) != EOF) {
        fputc(c, fp2);
    }
    
    fclose(fp1);
    fclose(fp2);
    printf("Successfully copied contents of %s to %s\n", file1, file2);
    
    return 0;
}
