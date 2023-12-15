# Building blocks

Classes are building blocks of any program in Java.
An object is a runtime instance of a class in memory.
A reference is a variable that points to an object.

## Fields and methods
Fields and methods are 2 primary elements: methods (functions) and fields (variables).

Simple Java class looks like:
```
public class Animal {

}
```

The method name and parameter types are called method signature.

## Comments
A single line comment looks like:

`// single line comment`

Multiple line comment:
```
/*
    *line comment
*/

```

Java doc comment:
```
/**
    * Java Author comment
    * @author Jeanne and Scott
*/
```
## Classes and Source Files
Most of the time, each Java class defined in `.java` file.

## Writing a main() method
Main method is often called an entry point into the program, sample of which is shown below.
```
public class Main {
    public static void main(String[] args) {
        
    }
}
```

`public` is called an access modifier.
`static` is a keyword.
`void` represents the return type.
`String[] args` is a `main's` method's parameter list, which represents as an array of java.util.String objects.

## Passing parameters to a Java Program 
Run below this command and show it to me
```
javac Main.java
java Main.java Bob Marley
```
if you will pass only 1 argument, then you will have:
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at kz.java.lessons.part1.Main.main(Main.java:6)
```

## Package declarations

Run the DemoPackage file and see the result. Java puts classes in packages, that are logical grouping of classes.

`import java.util.Random // tells you where to find Random`

`import java.util.*` is a shortcut to import all classes in a package and is a wildcard that matches all classes in the package.

Also, `import java.lang.System` means that we refer to `System` and it is automatically imported.

## Creating objects
To create an instance of class, here's an example:

```
Park p = new Park();
```
In this case, type of class is `Park` and `p` is a variable name.
`new Park()` is actually creating the object.
`Park()` is a constructor, which a special method that creates a new object.

