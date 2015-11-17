package io.github.karolkalinski.tax.policy;

import java.math.BigDecimal;

public interface TaxPolicy {
    BigDecimal calculate();
}
