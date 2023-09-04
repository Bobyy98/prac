#include <stdio.h>
#include <stdlib.h>

#define SIZE 100

int deque[SIZE];
int front = -1;
int rear = -1;

void enqueueFront(int item) {
    if ((front == 0 && rear == SIZE - 1) || (front == rear + 1)) {
        printf("Overflow\n");
        return;
    }
    if (front == -1) {
        front = rear = 0;
    } else if (front == 0) {
        front = SIZE - 1;
    } else {
        front--;
    }
    deque[front] = item;
}

void enqueueRear(int item) {
    if ((front == 0 && rear == SIZE - 1) || (front == rear + 1)) {
        printf("Overflow\n");
        return;
    }
    if (front == -1) {
        front = rear = 0;
    } else if (rear == SIZE - 1) {
        rear = 0;
    } else {
        rear++;
    }
    deque[rear] = item;
}

void dequeueFront() {
    if (front == -1) {
        printf("Underflow\n");
        return;
    }
    printf("Element dequeued from the front: %d\n", deque[front]);
    if (front == rear) {
        front = rear = -1;
    } else if (front == SIZE - 1) {
        front = 0;
    } else {
        front++;
    }
}

void dequeueRear() {
    if (front == -1) {
        printf("Underflow\n");
        return;
    }
    printf("Element dequeued from the rear: %d\n", deque[rear]);
    if (front == rear) {
        front = rear = -1;
    } else if (rear == 0) {
        rear = SIZE - 1;
    } else {
        rear--;
    }
}

void displayDeque() {
    if (front == -1) {
        printf("Empty Deque\n");
        return;
    }
    printf("Deque: ");
    int i = front;
    do {
        printf("%d ", deque[i]);
        if (i == rear) {
            break;
        }
        if (i == SIZE - 1) {
            i = 0;
        } else {
            i++;
        }
    } while (i != front);
    printf("\n");
}

int main() {
    int choice, item;
    while (1) {
        printf("1. Enqueue Front\n");
        printf("2. Enqueue Rear\n");
        printf("3. Dequeue Front\n");
        printf("4. Dequeue Rear\n");
        printf("5. Display Deque\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter element to enqueue at the front: ");
                scanf("%d", &item);
                enqueueFront(item);
                break;
            case 2:
                printf("Enter element to enqueue at the rear: ");
                scanf("%d", &item);
                enqueueRear(item);
                break;
            case 3:
                dequeueFront();
                break;
            case 4:
                dequeueRear();
                break;
            case 5:
                displayDeque();
                break;
            case 6:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
