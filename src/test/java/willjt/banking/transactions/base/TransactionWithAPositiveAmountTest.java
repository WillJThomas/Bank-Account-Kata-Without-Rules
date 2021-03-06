package willjt.banking.transactions.base;

import org.junit.Test;

public class TransactionWithAPositiveAmountTest {

    TransactionWithAPositiveAmount transaction;
    private static final int NEGATIVE_AMOUNT = -7;
    private static final int ZERO_AMOUNT = 0;
    private static final int POSITIVE_AMOUNT = 1;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnIllegalArgumentExceptionIfRequestedToCreateATransactionWithANegativeAmount() {
        transaction = new TransactionWithAPositiveAmount(NEGATIVE_AMOUNT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnIllegalArgumentExceptionIfRequestedToCreateATransactionWithAZeroAmount() {
        transaction = new TransactionWithAPositiveAmount(ZERO_AMOUNT);
    }

    @Test
    public void shouldNotThrowAnyExceptionIfRequestedToCreateATransactionWithAPositiveAmount() {
        transaction = new TransactionWithAPositiveAmount(POSITIVE_AMOUNT);
    }
}