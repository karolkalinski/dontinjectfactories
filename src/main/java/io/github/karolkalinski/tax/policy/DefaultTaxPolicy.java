package io.github.karolkalinski.tax.policy;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

class DefaultTaxPolicy implements TaxPolicy {
    @Override
    public BigDecimal calculate() {
        return ZERO;
    }
}
