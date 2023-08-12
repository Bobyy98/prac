#include <stdio.h>
#include <stdlib.h>

void create();
void display();
void insert();
void deletee();
void search();

struct node
{
    int m01;
    struct node *next;
};

struct node *start = NULL;

int main()
{
    int choice;

    while (1)
    {
        printf("\nEnter your choice: \n");
        printf("\n1. Create: ");
        printf("\n2. Display: ");
        printf("\n3. Insert: ");
        printf("\n4. Delete: ");
        printf("\n5. Search: ");
        printf("\n6. Exit: \n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            create();
            break;

        case 2:
            display();
            break;

        case 3:
            insert();
            break;

        case 4:
            deletee();
            break;

        case 5:
            search();
            break;

        case 6:
            printf("\nExiting the program.\n");
            exit(0);
            break;

        default:
            printf("\nInvalid Choice.\n");
        }
    }
}

void create()
{
    struct node *temp, *ptr;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("\ndata value for the node is: ");
    scanf("%d", &temp->m01);
    temp->next = NULL;

    if (start == NULL)
    {
        start = temp;
        temp->next = start; 
    }
    else
    {
        ptr = start;
        while (ptr->next != start)
        {
            ptr = ptr->next;
        }
        ptr->next = temp;
        temp->next = start; 
    }
}

void display()
{
    struct node *ptr;

    if (start == NULL)
    {
        printf("\nList is empty.\n");
        return;
    }
    else
    {
        ptr = start;
        printf("\nThe List elements are: \n");

        do
        {
            printf("%d ", ptr->m01);
            ptr = ptr->next;
        } while (ptr != start);

        printf("\n");
    }
}

void insert()
{
    struct node *temp, *ptr;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("\ndata value you want to insert at the beginning: ");
    scanf("%d", &temp->m01);
    temp->next = start; 

    if (start == NULL)
    {
        start = temp;
        temp->next = start; 
    }
    else
    {
        ptr = start;

        while (ptr->next != start)
        {
            ptr = ptr->next;
        }
        
        ptr->next = temp;
        start = temp; 
    }
}

void deletee()
{
    if (start == NULL)
    {
        printf("\nList is empty. Cannot delete.\n");
        return;
    }

    int val;
    printf("\nEnter the value you want to delete: ");
    scanf("%d", &val);

    struct node *temp, *preptr;
    temp = start;
    preptr = NULL;

    do
    {
        if (temp->m01 == val)
        {
            if (preptr == NULL)
            {
                preptr = temp;
                while (preptr->next != start)
                {
                    preptr = preptr->next;
                }
                
                start = temp->next;
                preptr->next = start;
                free(temp);
            }
            else
            {
                preptr->next = temp->next;
                free(temp);
            }
            printf("\nValue %d deleted from the list.\n", val);
            return;
        }

        preptr = temp;
        temp = temp->next;
    } while (temp != start);

    printf("\nValue %d not found in the list.\n", val);
}

void search()
{
    if (start == NULL)
    {
        printf("\nList is empty.\n");
        return;
    }

    int val;
    printf("\nEnter the value you want to search for: ");
    scanf("%d", &val);

    struct node *ptr = start;
    int found = 0;

    do
    {
        if (ptr->m01 == val)
        {
            printf("\nValue %d found in the list.\n", val);
            found = 1;
            break;
        }

        ptr = ptr->next;
    } while (ptr != start);

    if (!found)
    {
        printf("\nValue %d not found in the list.\n", val);
    }
}
