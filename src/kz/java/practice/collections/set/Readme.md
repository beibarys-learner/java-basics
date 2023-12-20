# Set

## Main properties
самая простая структура данных, чисто для хранения данных

аналог математического множества

не содержит дупликаты

нельзя получить элемент по индексу

перебор проходит по итератору и циклу

## Когда нужно выбирать Set?
1. все они должны быть уникальными
2. не нужно индексировать

## Implementations of Set

A HashSet stores its elements in a _hash table_, which the keys are a hash, and the values are an `Object`.

A TreeSet stores its elements in a sorted tree structure. 