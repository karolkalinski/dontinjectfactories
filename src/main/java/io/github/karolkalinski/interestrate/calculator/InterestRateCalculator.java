package io.github.karolkalinski.interestrate.calculator;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class InterestRateCalculator {
    private RatePolicyFactory ratePolicyFactory;

    @Autowired
    InterestRateCalculator(RatePolicyFactory ratePolicyFactory) {
        this.ratePolicyFactory = ratePolicyFactory;
    }

    public BigDecimal calculate(BigDecimal amount) {
        RatePolicy policy = ratePolicyFactory.getPolicy();
        return policy.calculate(amount);
    }
}
