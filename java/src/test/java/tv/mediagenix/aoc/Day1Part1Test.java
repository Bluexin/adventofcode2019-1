package tv.mediagenix.aoc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Part1Test {

    @ParameterizedTest
    @MethodSource("inputs")
    void something(List<Integer> masses, int expected) {
        Day1Part1 day1Part1 = new Day1Part1(masses);
        int fuel = day1Part1.calculateFuel();
        assertThat(fuel).isEqualTo(expected);
    }

    private static Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.of(Arrays.asList(12), 2),
                Arguments.of(Arrays.asList(1969), 654),
                Arguments.of(Arrays.asList(100756), 33583),
                Arguments.of(Arrays.asList(100756, 100756), 33583 + 33583),
                Arguments.of(Arrays.asList(12, 12), 4)
        );
    }
}