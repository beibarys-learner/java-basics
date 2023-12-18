# Working with Strings

String is a sequence of characters, and implements the interface `CharSequence`. 

```
String name = "Singularity";
```

## String concatenation
The expression is evaluated left to right.
```
// String concatenation
System.out.println("a" + "b");
System.out.println("a" + "b" + 3);
System.out.println(1 + 2 + "b");
System.out.println("b" + 1 + 2);
System.out.println(1 + 2 + "c");
System.out.println(null + "c");
System.out.println("c" + null);
```
Below result will be:
```
ab
ab3
3b
b12
3c
nullc
cnull
```

## Getting a single character
The method charAt() lets you query the string to find out what character is at a specific index.
```
 var name = "animals";
System.out.println(name.length()); // 7
System.out.println(name.charAt(0)); // prints a
```
Trying to find `System.out.println(name.charAt(7));`will cause an error.
```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1515)
	at kz.java.practice.string.Main.main(Main.java:11)
```

## Adjusting the case

```
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
```
## Checking for Equality
```
System.out.println("abc".equals("ABC"));
System.out.println("ABC".equals("ABC"));
System.out.println("abc".equalsIgnoreCase("ABC"));
```

## ToString(), equals(Object), hashCode()
You should override them

## StringBuilder vs StringBuffer
StringBuilder is not safe and doesn't support threads.

