package io.github.karolkalinski.tax.policy;

import java.math.BigDecimal;

class SeTaxPolicy implements TaxPolicy {
    @Override
    public BigDecimal calculate() {
        return new BigDecimal("22");
    }
}
