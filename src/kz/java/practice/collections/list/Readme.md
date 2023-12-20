# List

When elements are added, the `ArrayList` automatically grows. 

Use it when you aren't sure about selecting the collection.

## Methods in List

1. можно добавлять дубликать
2. можно получить доступ к элементу как у массива

## ArrayList
– Получение элемента по индексу
– Ordered
– В основе реализации лежит массив
– Индексация с нуля
– Преимущество в скорости:
    • получении объекта по индексу
    • запись объекта по индексу

## LinkedList
LinkedList
– В основе реализации лежит «двунаправленный связанный список» (двусвязный список) 
– можно проходить в обоих направлениях
– Ordered
– Часто используется для создания очереди, стека
– Преимущества в скорости
    • Добавление объекта
    • Удаление объект

## List Algorithms
Most polymorphic algorithms in the Collections class apply specifically to List. Having all these algorithms at your disposal makes it very easy to manipulate lists. Here's a summary of these algorithms, which are described in more detail in the Algorithms section.

* sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
* shuffle — randomly permutes the elements in a List.
* reverse — reverses the order of the elements in a List.
* rotate — rotates all the elements in a List by a specified distance.
* swap — swaps the elements at specified positions in a List.
* replaceAll — replaces all occurrences of one specified value with another.
* fill — overwrites every element in a List with the specified value.
* copy — copies the source List into the destination List.
* binarySearch — searches for an element in an ordered List using the binary search algorithm.
* indexOfSubList — returns the index of the first sublist of one List that is equal to another.
* lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.