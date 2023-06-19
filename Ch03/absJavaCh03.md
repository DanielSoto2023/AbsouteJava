# Chapter 3

`if else` statements can be used to do `If` X is true, do the code, `else` execute something else. Example below

If you wanted to make someone be paid overtime hours it would be something like this
```java
if (hours > 40)
    {
    grossPay = rate*40 + 1.5*rate *(hours -40);
    }

else
    {
    grosspay = rate*hours
    }

```

You can ommit the `else` if you dont want `else` to do anything

there are also `else if`

```java
if (Statement = true)

else if (Statement2 = true)

else if (Statment3 = true)

else
```

some modifiers for the stuff in `if`

`==` means equals to

`>` means greater than

`<` means less than

`!=` not equal to

`>=` greater than or equal

`<=` less than or equal

`&&` means and so

`||` means or as in (count < 3) || (count > 12)

# WHEN TESTING STRINGS

use `.equals("Example")` example below, you can substitute "Hello" for a string variable like `s2`

you can also use `.equalsIgnoreCase`

example in Display3ComparingStrings

```java
String s1, s2;

if (s1.equals("Hello"))
    System.out.println("The string is Hello.")
else
    System.out.println("The string is not Hello.");
```
```java
else if ((Variable > 300)&& (Variable2 > 30))
```

# Switch Statements

you use `case` and if you dont have `break;` it activates the other case, making the example below actvate the `print` statement either way

```java
case 'a';
case 'A';
    Sysout("java");
    break;
```
a `default` in the switch means it isnt in any `cases`, an example below

```java
int vehicleClass;
double toll;
switch(vehicleClass)
{
    case 1:
        Sysout("Passenger car.");
        toll = 0.50;
        break;
    case 2:
        Sysout("Bus.");
        toll = 1.50;
        break;
    case 3:
        Sysout("Truck.");
        toll = 2.00;
        break;
    default:
        Sysout("Unknown Vehicle Class!");
        break;
}
```
# boolean expressions

you can do 

`!` to mean Not like `!=` not equal

``` java
boolean madeIt = (time < limit) && (limit < max);
```

it can be evaluated like arithmatic, the example below demonstrates

```java
!((count< 3) || (count > 7))
```
`if` count is 8 the first statement is false, the other is true, leading to

!(false || true) , false or true means true

so we have

!(true)

which is

(false)

there are tables to see what output whats
    And
Exp_ 1  Exp_2 | Exp_ 1 && Exp_2
True    True  | true
True    False | false
False   True  | false
False   False | false

    Or
Exp_ 1  Exp_2 | Exp_ 1 || Exp_2
True    True  | true
True    False | true
False   True  | true
False   False | false

    Not
Exp
true | false
false | true

parentasis are not needed for
```java
int number = -5
boolean isPositive;
isPositive = (number > 0);

boolean isPosivite = (number > 0)

```
# Flow Of Controll

theres a prededence chart at pv 160 PDF or pg 126 book

# loops
`while` loops check boolean then activate the body,

`do-while` loops once then checks the boolean and if its false it stops


check `WhileDemo.java` for an example

there is another example
where they average a list of scores

check `Averager.java` 

` for loop` 
```java
for (n=1; n<= 10; n++)
    sum = sum + n;
```

the `for loop` is broken down into

for (Initializaiton; boolean expressoin; update)

which means you need a `true` or `false` statement and something to trigger it, and something to make sure it dont go infinate if you dont want to.

# DO NOT PLACE `;` AFTER YOUR LOOPS `for();` is not bueno but `for()` is :)

there are `statements` to get out of a `loop`, like the matrix, for example `break;` breaks you out of the nearest `loop` or `switch`, while `continue;` statement ends the current iteration of the `loop`.

"Every code can be built to not use `break;` or `continue;`" -Absolute Java 5th Edition

there is an `exit` statement that ends the program it is

```java
System.exit(0);
```

most bugs in loops are `infinate` or `one off errors` which is you making a misteak in the boolean area.




left off at page 152 or pg 186

basically code better and dont mix `||` and `&&` 

[comment]: <> (a comment to rant in, this hotel wifi is so shit, but i should say the pool that i havent tried out is packed and so i should probably enjoy it on monday, ong, fr, not like anybody is gonna see this other than my teacher, and if push comes to shove i can just delete it frfrfr. Ong, no cap)

[comment]: <> (maybe coding while stressed bc you procrastinated isnt the beeeeeeeeeeeeest idea ong. fr, day log 6/18 kinda stressed)

assertion checks are cool, if you do

```java
int n = 0;
int sum = 0;
assert (n==0) && (sum == 0);
```
it will return nothing in the console but if it `false` it will return an `error` the syntax is `assert Boolean_Expression;`

# random number generation

[comment]: <> (since i learned this neat commenting trick i might put in opinions, dunno, feelin like it maybe)

the `random` numbers are really `psudorandom` because java uses a set `seed` 

you have to import random with ` java.util.Random;` then you have to do the same thing you did with 
```java
Scanner keyboard = new Scanner(System.in)
```
and then you do it with random, note you dont need to name it `keyboard` or `randomGenerator` you can name it anything.
```java
Random randomGenerator = new Random();
```
to generate a number you do
```java
int r = randomGenerator.nextInt();
```
ill be going over the special ways you can modify by editing the thing in the parentasis 


range of all positive intergers u leave it empty `()`

from range 0 to n-1 `(n)`

you can offset by adding `()` + `n`
where  it is a number example being

```java
int r = randomGenerator.nextInt(3) + 4;
```
which would generate a `0,1, or 2` and then add 4

you can do 
```java
double r = randomGenerator.nextDouble();
```

and it will return a number equal or greater to `0.0` but less than `1.0`

example code in 
`CoinFlipDemo.java`

`Math.random()` is a meathod that does the same as `.nextDouble` so well that java internally creates a random object to call `.nextDouble`  to get an `int` from range 1 to 6 you would do
```java
int num = (int) (Math.random() * 6) + 1;
```
[comment]: <> (so hard to stay focued its only been 30 mins aaaaa made it to the programming projects yaey )

[comment]: <> (cant wait to re-read this old stuff and be like "this is where my decent into madness started")

[comment]: <> (not to mention this hotel room smells like SMOKE because we got a smokers room and some shit is burnt like cmon please we paid money to gamble at YOUR casino and this is the quality we get at least the bath rooms are clean ong)

# programming projects start on pg 168 or 202

