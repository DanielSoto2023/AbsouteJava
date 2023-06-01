# Chapter 1 Check point questions and notes
This is where I type my notes and answers to questions

```
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 5;
        int b = 2;
        int c = a + b;
        String str = "A Message";
        System.out.println(str.length());
        System.out.println(c);
    }
```

**Bold**
*d*
```
doo doo
```

**Primative Types**
boolean | true/false

char | single charecter

byte | -128 to 127 (short but shorter)

short | -32768 to 32767 (Int but shorter)

int | (-2147483648 to 2147483647)

long | int but longer

float | int but decimals

double | float but larger

you can assign values to anything higher in the list

byte -> short -> int -> long -> float -> double

experessions (math shortcuts)

x += 2 means x = x + 2

x -= b means x = x - b

x *= 2 means x = x * 2

x /= b means x = x / b

It evaluates x before it is been changed

x--; means x - 1
x++; means x + 1

example

```
int n = 2;
int valueProduced = 2 *(n++);
System.out.println(valueProduced);
System.out.println(n);
```
would print out 

4

3

doing

++x or --x

does it before it is evaluated

leading to the same code producing

6

3

x *insert modulo symbol*= 100 means x = x *modulo* 100

x *= a + b means x = x * (a + b)


**Self Test Exersize 1.1**

1. Java is not a drink. Would be printed
2. ```
    System.out.println(I like Java.)
    System.out.println(I like Java.)
    System.out.println(You Like Tea.)
    ```
3. ```
    public class CodeYeah {

    public static void main(String[] args) {
      
        System.out.println("Hello World");
        }
    }
    ```
4. A compiler lets you run code

5. Java

6. Regular Code

7.  A bite code interperator

8. NiceClass.java

9. NiceClass.java

10. rate1, TimeLimit, numberOfWindows

11. Yes

12. ```
    int feet = 0, inches = 0;
    ```

13. ```
    int count = 0;
    double distance = 1.5;
    ```

14. ```
    int time = 2;
    int distance = time * 80;
    ```

15. ```
    double balance = 2, rate = 3, intrest = balance * rate;
    ```

16. The output is
```
b
c
c
```

17. 3 * x
    (3 * x) + y
    (x + y) / 7
    ((3 * x) + y) / (z + 2)

18.  0.0

19. the results are 
    ```
    2
    1
    ```
20. 5

21. 
a. 2.5
b. Dont know something happening
c. bruh

Type Casting basically allows you to do stuff with variables and store in a different variable like

double ans = n/(double)m;

where n and m are ints

the expression (double)m; is a type cast if it was 2 it would become 2.0

a type cast from float/double into int would remove anything past the decimal point

```
int i = 5.5; is illigal 
while
int i = (int)5.5;
isnt
```

22. result would be 3

23. result would be

4

3

Class String yaey

```
String example = "I did it!";
String noun = "Amongus ";
String sentance;
sentance = noun + "are cool.";
String solutoin = "The answer is " + 42; 
# is just
String solution2 = "The answer is " + "42";

if you sysout("100" + 42); you get 10042
if you sysout(100 + 42); you get 142
```

int n = "Hello".length(); would get you n = 5

#you can also do 
String greeting = "Airpod Shotty Ima catch a body";
int n = greeting.length();


#Returns booleans
String Shoe = "One Two Buckle Shoe";

Shoe.equals("One Two Buckle Shoe"); returns true

Shoe.equals("Three Four Buckle Some More"); false

Shoe.equals("Five Six Nike Kicks"); False

equalsIgnoreCase(Give_String);

String MountainDew = "I slept 5 hours";

MountainDew.equalsIgnoreCase("i SLEPT 5 HOURS"); true

MountainDew.toLowerCase(); returns "i slept 5 hours"

MountainDew.toUpperCase(); returns "I SLEPT 5 HOURS"

String Example = " HMMMMMM ";

Example.trim() returns "HMMMMMM"

Example.charAt(1) returns 'H'

Example.charAt(0) returns ' ' (allegadly)

String sample = "abcdefG";
sample.substring(2) returns "cdefG" count from 0,1,2 include 2

sample.substring(2, 5) returns "cde"

#displays -1 if not found

String greeting = "Fuck Yimmu Audul";

greeting.indexOf("Yimmu"); returns 5

greeting.indexOf("Love"); returns -1

String greeting = "Mary, Mary quite contrary";

greeting.indexOf("Mary", 1); returns 6

greeting.indexOf("Mary", 8); returns -1 cuz theres not 8

entry = "adventure";
entry.compareTo("zoo"); returns a negative number
entry.compareTo("adventure"); returns 0
entry.compareTo("above"); returns a positive

#treats uppercase as lowercase
entry.compareToIgnoreCase("Zoo"); returns positive
entry.compareToIgnoreCase("adventure"); returns 0
entry.compareToIgnoreCase("Adventure"); returns positive number

#Escape Sequences
```
\" Double Quote
\' Single Quote
\\ Backslash
\n New line
\r cariage return go to beginning of current line
\t Tab, white space up to the next tab stop
```

String name = "Amongus";

name = "Amongus " + name;

sysout(name); would result "Amongus Amongus"

24. Timeis money

25. 7,  b

26. abcd

27. 
abc

def

28. abc\ndef

29. "HELLO TONY"

30. "2 + 2 = 4"

"2 + 2 = 22"

bc it does it from left to right

31.

What 

32. because it isnt test = test.toLowerCase();

GLOBAL VARIABLES

public static final int EXAMPLE_EXAMPLE = 10;

^ must be placed outside main

final int dodobird = 20;

^ must be inside a main

33. Block comments and line comments

34. "Hello" and "student"

35. fully typed out

36. 

```
public static final int ANSWER = 43;
```







