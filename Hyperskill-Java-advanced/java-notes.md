# Java

> Creador: James Gosling
>
> Fecha de lanzamiento: 1995
>
> filosofia: Write Once, Run anywhere (WORA)

###### Hello word example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

###### Break

There is another way to stop the outer loop: the labeled break operator. However, it's not good practice to use it. Google it if you are really interested.

Here's an example demonstrating the use of `break` with a label:

```java
outerLoop:
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
        if (i == j) {
            break outerLoop; // Break out of both loops.
        }
    }
    System.out.println();
}
```

###### Switch

1. Switch statement

   ```java
   private enum ThingsToTaste {PIZZA, BROCCOLI, STEAK, SUGAR, DIRT, MEATBALLS, CHOCOLATE}

   int tasteValue = 0;
   ThingsToTaste taste = ThingsToTaste.DIRT;

   switch (taste) {
       case SUGAR:
       case PIZZA:
       case CHOCOLATE:
           tasteValue = 10;
           break;
       case MEATBALLS:
       case STEAK:
           tasteValue = 7;
           break;
       case BROCCOLI:
           tasteValue = 4;
           break;
       case DIRT:
           tasteValue = 1;
           break;
       default:
           throw new IllegalStateException("Invalid tastable object: " + taste);
   }
   System.out.println(taste + ": " + tasteValue);
   ```
2. Switch expresion (Java 12)

   ```java
   int tasteValue = switch (taste) {
       case SUGAR, PIZZA, CHOCOLATE -> 10;
       case MEATBALLS, STEAK -> 7;
       case BROCCOLI -> 4;
       case DIRT -> 1;
       default -> throw new IllegalStateException("Invalid tastable object: " + taste);
   };
   ```
3. Switch expresion with yield (java 13)

   ```java
   int tasteValue = switch (taste) {   
       case SUGAR:   
       case PIZZA:   
       case CHOCOLATE:   
           yield 10;   
       case MEATBALLS:   
       case STEAK:   
           yield 7;  
       case BROCCOLI:  
           yield 4;  
       case DIRT:  
           yield 1;  
       default:  
           throw new IllegalStateException("Invalid tastable object: " + taste);   
   };
   ```
   `yield` no puede ser usado en un switch statement asi como `break` no puede ser usado en switch expresion
   `yield` es una sentencia que reemplaza `break`, busca poder omitir la asignacion de variables y se recomienda utilizando al final para tener codigo mas legible

   - Otros ejemplos de uso (java 13):

   ```java
   tasteValue = switch (taste) {
       case SUGAR, PIZZA, CHOCOLATE -> {
           System.out.println(10);
           yield 10;
       }
       case MEATBALLS, STEAK -> {
           System.out.println(7);
           yield 7;
       }
       case BROCCOLI -> {
           System.out.println(4);
           yield 4;
       }
       case DIRT -> {
           System.out.println(1);
           yield 1;
       }
       default -> {
           throw new IllegalStateException("Invalid tastable object: " + taste);
       }
   };
   ```
