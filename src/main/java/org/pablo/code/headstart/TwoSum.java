package org.pablo.code.headstart;

/**
 * Two Sum.
 *
 * <p>{@code nums} is not sorted. Find the two different positions whose values add up to {@code
 * target} and return those positions. Positions are 0-based. Either order is acceptable. Each input
 * has exactly one answer. Do not use the same element twice.
 *
 * <p>Examples:
 *
 * <ul>
 *   <li>{@code [2, 7, 11, 15]}, target {@code 9} returns {@code [0, 1]}
 *   <li>{@code [3, 2, 4]}, target {@code 6} returns {@code [1, 2]}
 *   <li>{@code [3, 3]}, target {@code 6} returns {@code [0, 1]}
 * </ul>
 */
public class TwoSum {

  /** Write the solution here. Tests in {@code TwoSumTest} call this method. */
  public int[] twoSum(int[] nums, int target) {

    // throw new UnsupportedOperationException("Implement TwoSum.twoSum");
    int left = 0;
    int right = 1;
    boolean solutionFound = false;
    int[] result = new int[2];
    while (!solutionFound) {
      if (nums[left] + nums[right] == target) {
        solutionFound = true;
        result[0] = left;
        result[1] = right;
      } else {
        if (right == (nums.length - 1)) {
          left = left + 1;
          right = left + 1;

          if (left >= (nums.length - 1) && right >= (nums.length - 1)) {
            solutionFound = true;
            result[0] = -1;
            result[1] = -1;
          }

        } else {
          right = right + 1;
        }
      }
    }
    return result;
  }
}
