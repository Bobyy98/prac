#include <stdio.h>
#include <string.h> 
struct cricket
{
    int mat, bbf;
    char name[25];
} player[5], t;
int i, j, n;
void insert();
void display();
void sort();
void delete();
void search();

int main() 
{
    int ch;
    while (ch != 6)
    {
        printf("\n1. Insert \n2. Display \n3. Sort \n4. Delete \n5. Search \n6. End \n\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            insert();
            break;
        case 2:
            display();
            break;
        case 3:
            sort();
            break;
        case 4:
            delete();
            break;
        case 5:
            search();
            break;
        case 6:
            break;
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}

void insert()
{
    printf("\nInsert data for how many players: ");
    scanf("%d", &n);
    if (n > 5)
    {
        printf("Maximum number of players exceeded (5)\n");
        return;
    }
    printf("\nEnter player info as name , matches played , bowfig: \n");
    for (i = 0; i < n; i++)
    {
        scanf("%s %d %d", player[i].name, &player[i].mat, &player[i].bbf);
    }
}

void display()
{
    printf("\nCricketer info in terms of matches played and bowling fig \n");
    printf("\nNAME\t\tMatches played\t\t\tBOWLING figure\n");
    printf("-------------------------------------------------------------------------------\n");

    for (i = 0; i < n; i++)
    {
        printf("%s\t\t\t%d\t\t\t%d\n", player[i].name, player[i].mat, player[i].bbf);
    }
}

void sort()
{
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n - 1; j++)
        {
            if (player[j].bbf < player[j + 1].bbf)
            {
                t = player[j];
                player[j] = player[j + 1];
                player[j + 1] = t;
            }
        }
    }
    display();
}

void delete()
{
    int x;
    char n1[25];
    printf("\nEnter player name which you want to delete: ");
    scanf("%s", n1);
    printf("\nDisplaying after deletion: \n");
    for (i = 0; i < n; i++)
    {
        if (strcmp(n1, player[i].name) != 0)
        {
            printf("%s\t\t\t%d\t\t\t%d\n", player[i].name, player[i].mat, player[i].bbf);
        }
    }
    n = n - 1;
}

void search()
{
    char n1[25];
    printf("\nEnter player name which you want to search: ");
    scanf("%s", n1);
    printf("\nName to be searched: %s\t ", n1);
    printf("\n\nDisplaying after search: \n");
    for (i = 0; i < n; i++)
    {
        if (strcmp(n1, player[i].name) == 0)
        {
            printf("%s\t\t\t%d\t\t\t%d\n", player[i].name, player[i].mat, player[i].bbf);
        }
    }
}
