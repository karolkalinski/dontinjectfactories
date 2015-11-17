package io.github.karolkalinski.interestrate.calculator;

import java.math.BigDecimal;

public interface RatePolicy {
    BigDecimal calculate(BigDecimal amount);
}
