# Part 1 Continue - Data types

## Primitive Data types

A `float` requires the letter `f` or `F` following the number so Java knows it is a float.
Without an `f` or `F`, Java interprets a decimal value as a `double`.

A `long` requires the letter `l` or `L` following the number so Java knows it is a long.
Without an `l` or `L`, Java interprets a number without decimal point as a `int`.

`short` and `char` are closely related, since they store the same 16-bit length. The main difference
is that `short` is _signed_ so it splits its range across the positive and negative integers.

Alternatively, char is unsigned its range is strictly positive, including 0.

### Task 1

Answer the question: what is the difference between primitive and reference data types?

## Wrapper Classes

Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.

### Task 2
Go and study example in DemoWrapper and DemoText

## Declaring variables

You can declare multiple variables in a statement.

```
void sand(){
    String s1, s2;
    String s3 = "yes", s4 = "no";
}
```
In above case, `s3` and `s4` are declared and initialized. Other two variables remain undeclared.

Below, Java doesn't allow to declare two different types in the same statement.
```
double d1, doouble d2;  // is not allowed 
```
## Initializing variables 

Local variable type inference:

```
public class DemoVar {
    public void what(){
        var name = "Hello";
        var size = 7;
    }
}
```

It doesn't work for instance variables.
```
public class DemoVar {
    var name = "Hello";
}
```

In Java, `var` is still a specific type defined at compile time. Javascript allows take any type at runtime.

## Reviewing the scope

1. Local variables - In scope from declaration to the end of the block
2. Method parameters - In scope for the duration of method
3. Instance variables - in scope from declaration until the object is eligible for garbage collection.
4. Class variables - in scope from declaration until the program ends

## Destroying the objects

All objects in Java are stored in program memory's heap.

Garbage collection - process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program.

