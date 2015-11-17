package io.github.karolkalinski.tax.policy;

import io.github.karolkalinski.CountryCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TaxPolicyConfiguration {
    @Bean
    TaxPolicy taxPolicy(@Value("${country.code:NONE}") CountryCode countryCode) {
        switch (countryCode) {
            case SE: return new SeTaxPolicy();
            case BE: return new BeTaxPolicy();
            case ME: return new MeTaxPolicy();
        }
        return new DefaultTaxPolicy();
    }
}
