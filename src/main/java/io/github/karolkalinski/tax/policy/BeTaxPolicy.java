package io.github.karolkalinski.tax.policy;

import java.math.BigDecimal;

class BeTaxPolicy implements TaxPolicy {
    @Override
    public BigDecimal calculate() {
        return new BigDecimal("33.99");
    }
}
