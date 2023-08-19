#include <stdio.h>

struct st
{
    int x;
    struct st* next;
};

int main()
{
    struct st temp;
    temp.x = 10;
    temp.next = NULL;  

    printf("%d", temp.x); 
    return 0;
}
