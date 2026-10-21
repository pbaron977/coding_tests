package org.pablo.code.headstart;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("2 + 7 = 9", new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of("2 + 4 = 6", new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of("3 + 3 = 6", new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of("-10 + -1 = -11", new int[]{-10, 7, 3, -1}, -11, new int[]{0, 3})
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("cases")
    void twoSum(String name, int[] nums, int target, int[] expected) {
        int[] actual = new TwoSum().twoSum(nums, target);
        int[] expectedSorted = expected.clone();
        int[] actualSorted = actual.clone();
        Arrays.sort(expectedSorted);
        Arrays.sort(actualSorted);
        assertArrayEquals(expectedSorted, actualSorted, name);
    }
}
