# Java-Basics

## Understand the basics of Java SE, its structure, how to declare variables, work with functions, loops, conditionals, algorithms and its programming logic.

---------

In the next link, there are some exercies related to variable concatenation and data conversion related to this course.

https://github.com/DiBarrera/java-basics-exercises

---------

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Overviwe">Overviwe</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#Topics-reviewed">Topics reviewed</a></li>
    <li><a href="#Basics">Basics</a></li>
    <li><a href="#Acquired-skills">Acquired skills</a></li>
  </ol>
</details>



<!-- Overviwe -->
## Overviwe

In this repository you will find a brief summary of what was learned in the [platzi](https://platzi.com/cursos/java-basico/) course of Introduction to Java SE.

Java is a high-level programming language that helps us build applications for different devices and operating systems. This is a summary of what was seen in the course, which covers too many topics, here the essence of what was taught is shown.

This repository is divided into the following parts.
* The steps to clone the repository and be able to view it.
* The main topics seen in the course
* Some of the basics concepts taught.
* Skills acquired at the end of the course.



<!-- GETTING STARTED -->
## Getting Started

## Setup

- Fork this repo
- Clone this repo

```shell
$ mkdir java-basics
$ cd java-basics
$ git clone https://github.com/DiBarrera/java-basics.git
```

You will find the following files:

- **A src directory**, Containing in each file, the lessons seen on the use of the different java methods.
- There are no dependencies, so nothing more is necessary than cloning it

**Tree**

```markdown
README.md
src
   |-- Arrays.java
   |-- Casting.java
   |-- DoWhileLoop.java
   |-- ForLoop.java
   |-- Funciones.java
   |-- HolaMundo.java
   |-- IncrementDecrement.java
   |-- LogicOperations.java
   |-- META-INF
   |   |-- MANIFEST.MF
   |-- MathematicOperations.java
   |-- NamingJava.java
   |-- SwitchStatement.java
   |-- UpdatingVariables.java
   |-- Variables.java
   |-- WhileLoop.java
   |-- ifStatement.java
```

<!-- Topics reviewed -->
## Topics reviewed

The topics seen are an introduction to what Java is, how it is composed, the most used tools, how to create a development environment and basic concepts on how to program in Java, all under the WORA philosophy (Write Once, Run Anywhere).
This course was followed using the IntelliJ IDEA IDE.

### Topics

- What is Java.
- Java versions and JDK:
- Introduction to IDE (Integrated development environment).
- JVM (Java Virtual Machine).
- Variables in Java.
- Updating Variables.
- Naming convention.
- Numeric data types.
- Char data types.
- Assignment operators.
- Increment operators.
- Mathematical operations.
- Cast on variables, etimation and accuracy.
- Cast between data types.
- JAR Archives.
- If statement, conditional.
- Logical operators.
- Switch statement.
- If and else statement.
- Global variables and local variables.
- Boolean expressions.
- What is a function.
- Java Docs.
- Commenting code.
- Java Docs for functions.
- Do while loop.
- Ternary operator.
- For loop.
- Arrays.
- Declaring Arrays.

<!-- Basics -->
## Basics

### In Java we define the main method as follows

#### Main method
```markdown
public static void main (String[] args) {
  // actions
}
``` 

#### First steps, printing anything
```markdown
public class HelloWorld {
  public static void main (String[] args) {
    System.out.println("Hello World!");
  }
}
``` 

#### Updating variables
```markdown
public class UpdatingVariable {
  public static void main(String[] args) {
    // Updating numeric values:
    int salary = 1000;
    salary = salary + 200;
    System.out.println(salary); // 1200

    salary += 300;
    System.out.println(salary); // 1500

    // Updating String variables:
    String employeeName = "Diego";
    employeeName = employeeName + "Barrera";
    System.out.println(salary); // Diego Barrera
  }
}
``` 


#### Numeric data types
```markdown
// Int:
int n = 1234567890;

// Long:
long nL = 123456789012345L;

// Double:
double nD = 123.456123456;

// Float
float nF = 123.456F;
``` 

#### Char data types
```markdown
var salary = 1000; // INT
var pension = salary * 0.03; // DOUBLE
var totalSalary = salary - pension; // DOUBLE
``` 

#### Assignment operators

- `+=`: `a += b` It is equivalent to `a = a + b`.
- `-=`: `a -= b` It is equivalent to `a = a - b`.
- `*=`: `a *= b` It is equivalent to `a = a * b`.
- `/=`: `a /= b` It is equivalent to `a = a / b`.
- `%=`: `a %= b` It is equivalent to `a = a % b`.

#### Increment operators

- `++`: `i++` It is equivalent to `i = i + 1`.
- `--`: `i--` It is equivalent to `i = i - 1`.

#### Cast between data types

Automatic conversion.
byte -> short
short -> int
char -> int
int -> long
long -> float
float -> double

Mandatory cast.
double -> float
float -> long
long -> int
int -> short
short -> byte

char <-> byte
char <-> short
int -> char

#### If statement, conditional
```markdown
if (condition) {
  // instructions
}
``` 

#### Logical operators

- `&&` is the operator "AND".
- `||` is the operator "OR".
- `!` is the operator "NOT".
- `?:` is the ternary operator.
- `Instanceof` is the Instanceof operator.

#### Switch statement
```markdown
switch (Options) {
  case "option 1":
    System.out.println("This is the option 1");
    break;
  case "option 2":
    System.out.println("This is the option 2");
    break;
  case "option 3":
    System.out.println("This is the option 3");
    break;
  default:
    System.out.println("¡Un nuevo profe!");
    break;
}
``` 

#### If and else statement
```markdown
if (condition) {
  Instructions for condition 1;
  System.out.println("Condition 1");
} else {
  // Otherwise run:
  System.out.println("On the contrary, condition 2");
}
``` 

#### Boolean expressions
```markdown
boolean condicionA = 2 + 2 == 4; // true
boolean condicionB = 2 + 2 == 5; // false

boolean condicionC = "Diego" == "Diego"; // true
boolean condicionD = "Diego" == "Di"; // false
``` 

#### Functions
```markdown
public int sum(int a, int b) {
  return a + b;
}
``` 
To execute the function
```markdown
int c = sum(5, 7); // 12
``` 

#### Commenting code
```markdown
// Single line comment 
 
/* Comment 
* in multiple 
* lines */ 
 
/** 
* Comment for Java Docs
* */ 
``` 

#### Java Docs for functions
```markdown
/**
 * General description of our function.
 * 
 * @param parameter1 Description of parameter 1.
 * @param parameter2 Description of parameter 2.
 * @return Description of the value that we return in the function.
 * */
``` 

#### Do while loop
```markdown
do {
  // Instructions
} while (condition);
``` 

#### For loop
```markdown
for (Initialization; Condition; Increase or decrease;) {
  // Instructions
}

// In the majority it is written as follows.
for (int i = 1; i <= 10; i++) {
  printSOS();
}
``` 

#### Arrays
```markdown
import java.util.ArrayList;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        List<String> Days = new ArrayList<>();
        Days.add("Monday");
        Days.add("Tuesday");

        Days.forEach((n) -> System.out.println(n));
    }
}
``` 

<!-- Acquired skills -->
## Acquired skills

- Knowledge in Java as a programming language.
- Work with Variables in Java.
- Implement conditional structures.
- Create functions using Java.
- Java structure.
- Types of variables.
- Logical operators.
- Assignment Operators.
- Increment Operators.
- Use java docs.
