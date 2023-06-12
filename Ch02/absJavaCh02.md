# Chapter 2

Sysout println ends the line at the end of the string.

`System.out.println();`

Sysout print does not ned the line at the end of the string.

`System.out.print();`

Sysout Printf lets u format the results.

---
## Conversion Character

**`d`** means decimal (ordinary) integer examples would be` %5d` or` %d`

f means fixedpoint (everyday notation) floating point example %6.2f or %f

e means e-notation floating point, example` %8.3e` or `%e`

g means general floating point example `%8.3g` or` %g`

s means string example %12s or %s

c means charecter example %2c or %c

To use it for example

```
double value = 12.123;
System.out.printf("Start%8.2fEnd", value);
System.out.println();
System.out.printf("Start%-8.2fEnd", value);
System.out.println();
```

The first one would output

Start   12.12End | Counts 8 charecters before so Start would be 5, then since theres no more it adds 3 spaces to count to 8

and the other would output

Start12.12   End |Counts to 8 charecters after the decimalm so 12 would be 2 and End would be 3 they add 3 and put those spaces after the number.

https://www.youtube.com/watch?v=c2B_Av3x65s

code to show that numberformat exists

```
import java.text.NumberFormat;

/**
 * CodeYeah
 */
public class CodeYeah {

    public static void main(String[] args) {
     NumberFormat formatterObject = NumberFormat.getCurrencyInstance();
     double moneyAmount = 9.99;
     System.out.println(formatterObject.format(moneyAmount)); 
    }
}
```

Code for DecimalFormat

```java
import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * CodeYeah
 */
public class CodeYeah {

    public static void main(String[] args) {
    DecimalFormat MyVariable = new DecimalFormat ("000.000");
    String numeral = MyVariable.format((12.3456789));
    System.out.println(numeral);
    }
}
```

how to use scanner

```java
Scanner keyboard = new Scanner(System.in);
int myInt = keyboard.nextInt(); / 23
long myLong = keyboard.nextLong();
byte myByte = keyborad.nextByte();
float myFloat = keyboard.nextFloat();
boolean myBoolean = keyboard.nextBoolean();
double myDouble = keyboard.nextDouble(); /decimal OK 19.2 or 52
String myWord = keyboard.next(); /single word
String myLine = keyboard.nextLine(); /EX:"I made a keyborad input" w/o ""
```










