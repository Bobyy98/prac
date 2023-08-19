#include <stdio.h>
#include <string.h>

struct player
{
    char name[15];
    int mat;
    int runs;
    float bowlf;
};

struct player p[100];
int n; 

void insert();
void del();
void sear();
void sort();
void display();

int main()
{
    int choice;

    printf("Enter the number of players: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("\nPlayer %d:\n", i + 1);
        printf("Enter player name: ");
        scanf("%s", p[i].name);
        printf("Enter number of matches: ");
        scanf("%d", &p[i].mat);
        printf("Enter runs scored: ");
        scanf("%d", &p[i].runs);
        p[i].bowlf = (p[i].mat > 0) ? (float)(p[i].runs) / p[i].mat : 0;
        printf("Best bowling figure: %f\n", p[i].bowlf);
    }

    while (1)
    {
        printf("\nEnter 1 to insert new player\n");
        printf("Enter 2 to delete a player\n");
        printf("Enter 3 to search for a player\n");
        printf("Enter 4 to sort and display players by descending bowling figure\n");
        printf("Enter 5 to exit\n");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                insert();
                break;

            case 2:
                del();
                break;

            case 3:
                sear();
                break;

            case 4:
                sort();
                display();
                break;

            case 5:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}

void insert()
{
    if (n >= 100)
    {
        printf("Maximum player limit reached.\n");
        return;
    }

    printf("\nPlayer %d:\n", n + 1);
    printf("Enter player name: ");
    scanf("%s", p[n].name);
    printf("Enter number of matches: ");
    scanf("%d", &p[n].mat);
    printf("Enter runs scored: ");
    scanf("%d", &p[n].runs);
    p[n].bowlf = (p[n].mat > 0) ? (float)(p[n].runs) / p[n].mat : 0;
    printf("Best bowling figure: %f\n", p[n].bowlf);
    n++;
}

void del()
{
    char ch[15];
    printf("Enter the player name you want to delete: ");
    scanf("%s", ch);

    int playerIndex = -1;

    for (int i = 0; i < n; i++)
    {
        if (strcmp(ch, p[i].name) == 0)
        {
            playerIndex = i;
            break;
        }
    }

    if (playerIndex == -1)
    {
        printf("Player not found.\n");
        return;
    }

    for (int j = playerIndex; j < n - 1; j++)
    {
        p[j] = p[j + 1];
    }
    n--;
    printf("Player deleted successfully.\n");
}

void sear()
{
    char ch[15];
    printf("Enter the name of player you want to search: ");
    scanf("%s", ch);

    int found = 0;

    for (int i = 0; i < n; i++)
    {
        if (strcmp(ch, p[i].name) == 0)
        {
            printf("\nPlayer %d:\n", i + 1);
            printf("Name: %s\n", p[i].name);
            printf("Number of matches: %d\n", p[i].mat);
            printf("Runs scored: %d\n", p[i].runs);
            printf("Best bowling figure: %f\n", p[i].bowlf);
            found = 1;
            break;
        }
    }

    if (!found)
    {
        printf("Player not found.\n");
    }
}

void sort()
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (p[j].bowlf < p[j + 1].bowlf)
            {
                struct player temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void display()
{
    printf("\nList of players sorted by descending bowling figure:\n");
    printf("Name\tMatches\tRuns\tBowling Figure\n");
    printf("-------------------------------------------\n");

    for (int i = 0; i < n; i++)
    {
        printf("%s\t%d\t%d\t%f\n", p[i].name, p[i].mat, p[i].runs, p[i].bowlf);
    }
}
