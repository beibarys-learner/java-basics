# Intro to OOP

1. Каждый объект обычно имеет: СВОЙСТВА (поля) и МЕТОДЫ (действия) – это основные рабочие механизмы
2. Объект в коде создается ключевым слово new
3. Класс (class) – это трафарет, слепок для создания объектов (экземпляр класса, instance) уже с конкретными данными (полями)

## Basics

Типы данных
1. Примитивные - хранятся в стэке
2. Ссылочные - хранятся в куче

## From Baeldung

There are two broad categories of data types in Java: primitive types and objects/reference types.

Primitive types are the basic data types that store simple data and form the foundation of data manipulation. For example, Java has primitive types for integer values (int, long, byte, short), floating-point values (float and double), character values (char), and logical values (boolean).

On the other hand, reference types are objects that contain references to values and/or other objects, or to the special value null to denote the absence of value.

## Character

The final primitive data type to look at is char.

Also called a character, char is a 16-bit integer representing a Unicode-encoded character. Its range is from 0 to 65,535. In Unicode, this represents ‘\u0000’ to ‘\uffff’.

For a list of all possible Unicode values, check out sites such as Unicode Table.

## Overflow and autoboxing
The primitive data types have size limits. Overflow is a such situation 
when happens if we try to store a value that’s larger than the maximum value.

Each primitive data type also has a full Java class implementation that can wrap it. For instance, the Integer class can wrap an int. There is sometimes a need to convert from the primitive type to its object wrapper (e.g., using them with generics).
Luckily, Java can perform this conversion for us automatically, a process called Autoboxing:

```
Character c = 'c';

Integer i = 1;
```
