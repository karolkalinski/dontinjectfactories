package io.github.karolkalinski.tax.statement;

import io.github.karolkalinski.ClientId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Component
public class UiGenerator {
    private ApplicationContext appCtx;

    @Autowired
    UiGenerator(ApplicationContext appCtx) {
        this.appCtx = appCtx;
    }

    public void showData() {
        Stream.of(1, 3, 5).forEach(id -> appCtx.getBean(TaxStatementView.class, id).show());
    }
}
