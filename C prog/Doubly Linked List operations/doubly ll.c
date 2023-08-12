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
    struct node *prev;
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

    return 0;
}

void create()
{
    struct node *temp, *ptr;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("\ndata value for node is: ");
    scanf("%d", &temp->m01);
    temp->next = NULL;
    temp->prev = NULL;

    if (start == NULL)
    {
        start = temp;
    }

    else
    {
        ptr = start;
        while(ptr->next != NULL)
        {
            ptr = ptr->next;
        }
        ptr->next = temp;
        temp->prev = ptr;
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

        while (ptr != NULL)
        {
            printf("%d ", ptr->m01);
            ptr = ptr->next;
        }
        printf("\n");
    }
}

void insert()
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("\ndata value you want to insert at the beginning: ");
    scanf("%d", &temp->m01);
    temp->next = NULL;
    temp->prev = NULL;

    if (start == NULL)
    {
        start = temp;
    }

    else
    {
        temp->next = start;
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
    preptr = NULL;

    while (temp != NULL)
    {
        if (temp->m01 == val)
        {
            if(preptr == NULL)
            {
                start = temp->next;
                if(temp->next != NULL)
                {
                    temp->next->prev = NULL;
                }
                free(temp);
            }

            else
            {
                preptr->next = temp -> next;
                if (temp->next != NULL)
                {
                    temp->next->prev = preptr;
                }
                free(temp);
            }
            
            printf("\nValue %d deleted from the list.\n", val);
            return;
        }

        preptr = temp;
        temp = temp->next;
    }

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
    printf("\nEnter the value you want to search for: ");
    scanf("%d", &val);

    struct node *temp;
    temp = start;

    while (temp != NULL)
    {
        if(temp->m01 == val)
        {
            printf("\nValue %d found in the list.\n", val);
            return;
        }

        temp = temp->next;
    }

    printf("\nValue %d not found in the list.\n", val);
}
