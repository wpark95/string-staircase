package com.tlglearning;

/**
 * Defines the {@link #buildLinearStaircase(int)} and {@link #buildFibonacciStaircase(int)} methods,
 * which construct and return {@code String} arrays forming staircases of asterisks and space
 * characters.
 */
public final class Staircase {

  private Staircase() {
    // NOTE: There is NO need to do anything with this constructor! The methods you will implement
    // in this class are static; thus, there is no need to create instances of this class. Making
    // the constructor private prevents this class from being instantiated, and prevents a compiler-
    // generated default from being generated (and from being documented by Javadoc).
  }

  /* LINEAR STAIRCASE */

  /**
   * Constructs and returns an array of strings, where the first element is the top step of the
   * staircase, containing a single asterisk (*), right-aligned (that is, padded on the left with
   * spaces, as necessary), and each successive element is a string containing one more asterisk
   * than the previous. The final string in the array should have {@code height} asterisk
   * characters, without any leading spaces.
   *
   * @param height Staircase height (number of steps).
   * @return       Array of length {@code height}.
   */
  public static String[] buildLinearStaircase(int height) {
    String[] result = new String[height];

    for (int i = 0; i < height; i++) {
      int spacesNeeded = height - i - 1;
      String curr = " ".repeat(spacesNeeded) + "*".repeat(i + 1);

      result[i] = curr;
    }

    return result;
  }

  /* FIBONACCI STAIRCASE */

  /**
   * Constructs and returns an array of strings, where the first element is the top step of the
   * staircase, containing a single asterisk (*), right-aligned (that is, padded on the left with
   * spaces, as necessary); the second element also has a single asterisk, right-aligned
   * (left-padded); each successive element is a string containing a number of asterisks equal to
   * the sum of the number of asterisks in the previous 2 elements. For example, the 3<sup>rd</sup>
   * element will have (1 + 1) = 2 asterisks; the 4<sup>th</sup> will have (2 + 1) = 3 asterisks;
   * etc. The last element of the array should contain nothing but asterisks.
   *
   * @param height Staircase height (number of steps).
   * @return       Array of length {@code height}.
   */
  public static String[] buildFibonacciStaircase(int height) {
    String[] result = new String[height];

    if (height > 0) {
      int counter = 1;
      int prevNum = 0;
      int currNum = 1;
      int maxFibonacci = 1;

      while (counter < height) {
        maxFibonacci = prevNum + currNum;
        prevNum = currNum;
        currNum = maxFibonacci;
        counter++;
      }

      while (counter > 0) {
        int starsNeeded = currNum;
        int spacesNeeded = maxFibonacci - currNum;
        int temp = currNum - prevNum;
        String curr = " ".repeat(spacesNeeded) + "*".repeat(starsNeeded);

        currNum = prevNum;
        prevNum = temp;
        counter--;
        result[counter] = curr;
      }
    }
    return result;
  }

}
