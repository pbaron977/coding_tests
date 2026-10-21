package org.pablo.code.headstart;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSum2Test {

  static Stream<Arguments> cases() {
    return Stream.of(
        Arguments.of("2 + 7 = 9", new int[] {2, 7, 11, 15}, 9, new int[] {1, 2}),
        Arguments.of("2 + 4 = 6", new int[] {2, 3, 4}, 6, new int[] {1, 3}),
        Arguments.of("-1 + 0 = -1", new int[] {-1, 0}, -1, new int[] {1, 2}),
        Arguments.of(
            "duplicate values 4 + 4 = 8", new int[] {1, 2, 3, 4, 4, 9}, 8, new int[] {4, 5}) // ,
        // Arguments.of("-2 + 3 = 1", new int[]{-5, -2, 0, 3, 6}, 1, new int[]{2, 4})
        );
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("cases")
  void twoSum(String name, int[] numbers, int target, int[] expected) {
    assertArrayEquals(expected, new TwoSum2().twoSum(numbers, target), name);
  }
}
