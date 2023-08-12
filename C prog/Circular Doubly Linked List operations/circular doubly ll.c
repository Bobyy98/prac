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
    struct node *prev;
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
    temp->prev = NULL;
    temp->next = NULL;

    if (start == NULL)
    {
        start = temp;
        start->prev = start; 
        start->next = start; 
    }
    else
    {
        ptr = start;
        while (ptr->next != start)
        {
            ptr = ptr->next;
        }
        ptr->next = temp;
        temp->prev = ptr;
        temp->next = start;
        start->prev = temp;
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
    temp->prev = NULL;
    temp->next = NULL;

    if (start == NULL)
    {
        start = temp;
        start->prev = start; 
        start->next = start; 
    }
    else
    {
        temp->next = start;
        temp->prev = start->prev;
        start->prev->next = temp;
        start->prev = temp;
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

    do
    {
        if (temp->m01 == val)
        {
            if (temp == start)
            {
                start = temp->next;
                start->prev = temp->prev;
            }
            else
            {
                temp->prev->next = temp->next;
                temp->next->prev = temp->prev;
            }
            free(temp);
            printf("\nValue %d deleted from the list.\n", val);
            return;
        }

        temp = temp->next;
    } while (temp != start);

    printf("\nValue %d not found in the list.\n", val);
}

void search()
{
    if (start == NULL)
    {
        printf("\nList is empty. Cannot search.\n");
        return;
    }

    int val;
    printf("\nEnter the value you want to search: ");
    scanf("%d", &val);

    struct node *temp;
    temp = start;

    do
    {
        if (temp->m01 == val)
        {
            printf("\nValue %d found in the list.\n", val);
            return;
        }

        temp = temp->next;
    } while (temp != start);

    printf("\nValue %d not found in the list.\n", val);
}
