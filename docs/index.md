---
title: Overview
nav_order: 1
---

{% include abbreviations.md %}

# {{ page.title }}
{:.no_toc}

In this task, you will implement and test a method that constructs and returns a `String[]` containing a "staircase" made of sequences of asterisk (`*`) and space characters. Each successive element in the array will increase the number of asterisks, with a corresponding decrease in the number of spaces. For example, a linear staircase of height 5 would be returned as this array:

```java
{
    "    *",
    "   **",
    "  ***".
    " ****",
    "*****"
}
```
