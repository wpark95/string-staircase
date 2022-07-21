---
title: Implementation
nav_order: 1
parent: "Linear staircase"
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

In the `com.tlglearning.Staircase` class, the `buildLinearStaircase` method is declared with the following signature, return type, and modifiers:

```java
public static String[] buildLinearStaircase(int height)
```

The implementation **must not** change the modifiers, return type, method name, or parameter types/number/order of the above method.

## Specifications

1. The value of `height` parameter may be assumed to be in the range 0 to 1,000,000, inclusive. (Your code doesn't need to check for a `height` value outside that range---e.g. to throw an exception.)

2. The returned `String[]` must have exactly `height` elements.

3. If `height` is greater than 0, Element `0` of the returned array must consist of exactly one `*` character, left-padded with `(height - 1)` spaces.

4. The last element of the returned array must consist entirely of `*` characters.

5. The content of each element of the returned array is constructed as follows:  
    
    First, consider a text staircase of height 6:
    
    ```
         *
        **
       ***
      ****
     *****
    ******
    ```
    
    Note that each line consists of spaces and the asterisk character. Further, each line has the exact same number of characters, so that (when a monospace font is used), the right edges line up. Finally, note that though the last line above may appear to have a leading space, the bottom step of the staircases produced by your code must have no leading spaces.
    
    Now, assume that each line of the above is an element of a `String[]`; our task is to construct and return that array---not just for a staircase of height 6, but for whatever height staircase is specified by the `height` parameter of the `buildLinearStaircase` method.

    Given the above, we have:

    * The value of the `height` parameter tells us the `length` of the array we need to return.
 
    * The `length()` of each of the `String` elements in the array must be equal to `height`.

    * The "bottom step" (the last element in the array) consists entirely of asterisk characters. Each step up from that has one fewer asterisk character, and is left-padded with spaces, so that the length of each element is the same---namely, `height` characters.

For example,

```java
Staircase.buildLinearStaircase(6)
```

would return the staircase shown above as a `String[]`:

```java
{
    "     *",
    "    **",
    "   ***".
    "  ****",
    " *****",
    "******"
}
```

## Tips

1. You may find it useful to create one or more additional `static` methods as "helpers"; the problem can be solved without doing so, however.

2. Do not hesitate to declare any `static` fields (esp. `static final` constants) that you feel might simplify or clarify your code.

3. Whether your code prints anything out is up to you. What it **must** do is return a `String[]` (an array of `String`); printing does not accomplish that.

4. The method to be completed includes a `TODO` comment, intended to make it easy to locate. However, there are two methods---make sure that you implement the above specifications in `buildLinearStaircase`.
