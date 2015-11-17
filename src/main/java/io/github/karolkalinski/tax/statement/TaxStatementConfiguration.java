package io.github.karolkalinski.tax.statement;

import io.github.karolkalinski.ClientId;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Configuration
class TaxStatementConfiguration {
    @Bean
    @Scope(SCOPE_PROTOTYPE)
    TaxStatementView taxStatement(int clientId) {
        return new TaxStatementView(clientId(clientId));
    }

    ClientId clientId(int clientId) {
        return ClientId.fromInt(clientId);
    }
}
