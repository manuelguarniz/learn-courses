package com.futurelabs;

import com.futurelabs.common.Utils;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

@Getter
@Setter
public class Chocolate {
    private Integer width;
    private Integer height;

    public Chocolate(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public String cut(Integer divider) {
        Set<int[]> divisors = Utils.pairDivisors(divider);
        for (int[] divisor : divisors) {
            if (divisor[0] <= width && divisor[1] <= height
                    && (
                    Stream.of(width, height).anyMatch(e -> e == divisor[0])
                            || Stream.of(width, height).anyMatch(e -> e == divisor[1]))
            ) {
                System.out.println("Se puede dividir en: " + divisor[0] + "x" + divisor[1]);
                return "YES";
            }
        }
        return "NO";
    }

}
