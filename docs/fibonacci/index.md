---
title: Fibonacci staircase
nav_order: 3
has_children: true
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs %}

# {{ page.title }}
{:.no_toc}

For an additional challenge, try completing the implementation of a second method, which generates a string staircase according to a different rule: the number of asterisks must increase in a nonlinear fashion, following the Fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, ... . Notice that each term is the sum of the 2 terms immediately preceding it.

Translated into spaces and asterisks, we have this example for a staircase of height 5:

```java
{
    "    *",
    "    *",
    "   **".
    "  ***",
    "*****"
}
```

While this looks almost identical to the [linear staircase example](../linear/), we can see that the increase in asterisks from step to step, and the corresponding decrease in the number of spaces, isn't constant: the number of asterisks in element 2 is equal to the sum of the asterisks in element 0 and element 1; the number of asterisks in element 3 is equal to the sum of asterisks in element 1 and element 2; and so on.
