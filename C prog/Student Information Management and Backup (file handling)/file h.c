#include <stdio.h>
#include <stdlib.h> 

struct student
{
    char name[50];
    int roll_no;
};

int main()
{
    struct student s[5];
    FILE *fp, *fp2;
    int i;

    for (i = 0; i < 5; i++)
    {
        printf("\nEnter name and roll number of student %d: \n", i + 1);
        scanf("%s %d", s[i].name, &s[i].roll_no);
    }

    fp = fopen("info.txt", "w");
    if (fp == NULL)
    {
        printf("Error creating file!\n");
        exit(1);
    }

    for (i = 0; i < 5; i++)
    {
        fprintf(fp, "Name: %s\tRoll: %d\n", s[i].name, s[i].roll_no);
    }
    fclose(fp);

    fp2 = fopen("backup.txt", "w");
    if (fp2 == NULL)
    {
        printf("Error creating file!\n");
        exit(1);
    }

    fp = fopen("info.txt", "r");
    char c = fgetc(fp);
    while (c != EOF)
    {
        fputc(c, fp2); 
        c = fgetc(fp);
    }

    fclose(fp);
    fclose(fp2);

    return 0;
}
