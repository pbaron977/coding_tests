package org.pablo.code.headstart;

/**
 * Two Sum II.
 *
 * <p>{@code numbers} is sorted in non-decreasing order. Find the two different values that add up
 * to {@code target} and return their positions as {@code [index1, index2]}.
 *
 * <p>Positions are 1-based, and {@code index1} is smaller than {@code index2}. Each input has
 * exactly one answer. Do not use the same element twice.
 *
 * <p>Examples:
 *
 * <ul>
 *   <li>{@code [2, 7, 11, 15]}, target {@code 9} returns {@code [1, 2]}
 *   <li>{@code [2, 3, 4]}, target {@code 6} returns {@code [1, 3]}
 *   <li>{@code [-1, 0]}, target {@code -1} returns {@code [1, 2]}
 * </ul>
 */
public class TwoSum2 {

  /** Write the solution here. Tests in {@code TwoSum2Test} call this method. */
  public int[] twoSum(int[] numbers, int target) {
    // throw new UnsupportedOperationException("Implement TwoSum2.twoSum");
    int left = 0;
    int right = numbers.length - 1;
    int[] result = new int[2];
    while (left < right) {
      int test = numbers[left] + numbers[right];
      if (test == target) {
        result[0] = left + 1;
        result[1] = right + 1;
        right = left - 1;
      } else {
        if (test > target) {
          right = right - 1;
        } else {
          left = left + 1;
        }
      }
    }
    return result;
  }
}
