package io.github.karolkalinski.tax.statement;

import io.github.karolkalinski.ClientId;

public class TaxStatementView {
    private ClientId clientId;

    public TaxStatementView(ClientId clientId) {
        this.clientId = clientId;
    }

    public void show() {
        System.out.println(clientId.toString());
    }
}
