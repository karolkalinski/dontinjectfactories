package io.github.karolkalinski;

import io.github.karolkalinski.tax.policy.TaxPolicy;
import io.github.karolkalinski.tax.statement.TaxStatementView;
import io.github.karolkalinski.tax.statement.UiGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaxService {
    public static void main(String[] args) {
        System.setProperty("country.code", "BE");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        TaxPolicy taxPolicy = context.getBean(TaxPolicy.class);
        System.out.println(taxPolicy.calculate());
        UiGenerator uiGenerator = context.getBean(UiGenerator.class);
        uiGenerator.showData();
    }
}
