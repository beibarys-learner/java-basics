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