package core.basesyntax.strategy.handlers;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationHandler;

public class SupplyOperation implements OperationHandler {
    @Override
    public void proccessTransaction(FruitTransaction transaction) {
        Storage.change(transaction.getFruit(), transaction.getQuantity());
    }
}
