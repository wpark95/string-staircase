---
title: Implementation
nav_order: 1
parent: "Fibonacci staircase"
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs %}

# {{ page.title }}
{:.no_toc}

<details markdown="block">
  <summary>Page contents</summary>
* TOC
{:toc}
</details>

## Declaration

In the `com.tlglearning.Staircase` class, the `buildFibonacciStaircase` method is declared with the following signature, return type, and modifiers:

```java
public static String[] buildFibonacciStaircase(int height)
```

The implementation **must not** change the modifiers, return type, method name, or parameter types/number/order of the above method.

## Specifications

The functionality of this method is very similar to that of `buildLinearStaircase`, but with a couple of key differences:

1. You may assume that the value of the `height` parameter will always be in the range 0 to 30, inclusive. (Your code doesn't need to check for a `height` value outside that range---e.g. to throw an exception.) 

2. The first 2 elements (if they are present) of the returned array (i.e. the top 2 steps) have 1 asterisk each (left-padded with spaces), the next element has 2 asterisks, the next has 3, then 5, 8, 13, and so on, following the Fibonacci sequence. 

3. The bottom step (the last element of the array) once again contains only asterisks; however, the number of asterisks it contains is not necessarily `height` (since this isn't a linear sequence), but is instead the Fibonacci number corresponding to that step.

4. The requirement that each step in a given staircase must have the same total number of characters (including both spaces and asterisks) still holds; however, as noted in the previous point, this doesn't mean that the length of each step in a staircase with a given height will be equal to that height (as is the case for a linear staircase).

For example, 

```java
Staircase.buildFibonacciStaircase(6)
```

would return 

```java
{
    "       *",
    "       *",
    "      **".
    "     ***",
    "   *****",
    "********"
}
```

Here, `height` is 6, but the length of each element of the array is 8, since the Fibonacci number corresponding to the last step is 8. Thus, each of the elements preceding the last one must be left-padded with spaces, as required, for a total length of 8 characters.

## Tips

1. Consider building the `String[]` in 2 passes: one to generate the asterisk characters for each step, and another to pad each step with the appropriate number of spaces.

2. After the initial 2 values, the Fibonacci sequence follows the recurrence relation $F_n = F_{n - 1} + F_{n - 2}$. That is, each value is the sum of the previous 2 values. One non-obvious way of using that recurrence, in this case, is to obtain a string of asterisk characters from the concatenation of the previous 2 strings of asterisks.

3. Whether your code prints anything out is up to you. What it **must** do is return a `String[]` (an array of `String`); printing does not accomplish that.

4. The method to be completed includes a `TODO` comment, intended to make it easy to locate. However, there are two methods---make sure that you implement the above specifications in `buildFibonacciStaircase`.
