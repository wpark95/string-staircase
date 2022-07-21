---
title: Linear staircase
nav_order: 2
has_children: true
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs %}

# {{ page.title }}
{:.no_toc}

For this problem, the `String[]` staircase you will construct will be linear: each successive step (i.e. element of the array) will have one space fewer, and one asterisk (`*`) more.

Repeating the example from the [overview](../index.md), a linear staircase of height 5 would be represented by this array:

```java
{
    "    *",
    "   **",
    "  ***".
    " ****",
    "*****"
}
```

Note that each element of the array contains 5 characters (which is also the height of the staircase---i.e. the `length` of the array). Element 0 contains 4 space characters, followed by a single asterisk; element 1 contains 3 space characters, followed by 2 asterisks; and so on.
