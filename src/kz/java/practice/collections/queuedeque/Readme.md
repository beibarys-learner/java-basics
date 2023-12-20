# Using the Queue and Deque

## Queue

We use it when we want elements to be added and removed in a specific order.

FIFO:
First-in, first-out.

Implementation of a queue:
1. A queue (of bounded size) can be efficiently implemented in an array. Look at JavaHypertext entry “queue”.
2. A queue can be efficiently implemented using any linked list that supports deletion in the front and insertion at
the end in constant time. The first (last) element of the queue is at the front (end) of the linked list.
### More about:

https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html
https://www.cs.cornell.edu/courses/JavaAndDS/files/queueStack.pdf

## Deque

We use it when we want elements to insert and remove elements from both:
1. the front (head) 
2. and back (tail).

The Deque interface enables insertion, deletion, and inspection operations at both the ends. 
Elements in a Deque can be used in both LIFO and FIFO.


### More about:
https://javarush.com/quests/lectures/jru.module1.lecture23


## Stack

Stacks are also referred also as LIFO queues.

Functionality:
1. push (E e) - add to the front/top
2. pop() - remove from the front/top
3. peek() - get first element