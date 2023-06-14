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

#ended pg 125 or p163






