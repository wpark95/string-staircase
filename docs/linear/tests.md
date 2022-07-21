---
title: Unit tests
nav_order: 2
parent: "Linear staircase"
---

{% include abbreviations.md %}

# {{ page.title }}
{:.no_toc}

<details markdown="block">
  <summary>Page contents</summary>
* TOC
{:toc}
</details>

Use JUnit5 to verify your code with the inputs and expected outputs below. (Note that JUnit5 is already included in the `dependencies` task in `build.gradle`; there's no need to add it to the project dependencies again.)

## Test cases

| `height` |                 Expected return value of `Staircase.buildLinearStaircase(height)`                  |
|:--------:|:--------------------------------------------------------------------------------------------------:|
| `0` |                           {::nomarkdown}<pre><code>{}</code></pre>{:/}                             |
| `2` |                                           {::nomarkdown}<pre><code>{" *", "**"}</code></pre>{:/}                                           |
| `5` |                          {::nomarkdown}<pre><code>{"    *", "   **", "  ***", " ****", "*****"}</code></pre>{:/}                           |
| `8` | {::nomarkdown}<pre><code>{"       *", "      **", "     ***", "    ****", "   *****", "  ******", " *******", "********"}</code></pre>{:/} |

Additional test cases may be used by the automated tests; an implementation that conforms to the [specifications](implementation.md#specifications) stated previously will pass all such additional tests.
 
## Tips

1. The `Staircase.buildLinearStaircase` method to be completed is `static`, and the constructor is `private`; do not attempt to create an instance of `Staircase` in your tests.

2. In unit testing with JUnit5, when comparing an array returned from a method to an array of expected values, use `assertArrayEquals` instead of `assertEquals`. For more information, see the [Javadocs documentation for the `assertArrayEquals(Object[], Object[])` method](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html#assertArrayEquals(java.lang.Object[],java.lang.Object[])){:target='_blank'}.
