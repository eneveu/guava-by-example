package com.headexplodes.example.base.part2;

import java.math.BigDecimal;
import java.util.Currency;

public class Money1 {

    private final BigDecimal amount;

    private final Currency currency;

    public Money1(BigDecimal amount, Currency currency) {
        if (amount == null) {
            throw new NullPointerException("amount must not be null");
        }
        if (currency == null) {
            throw new NullPointerException("currency must not be null");
        }
        if (amount.signum() < 0) {
            throw new IllegalArgumentException("amount must be positive, but was " + amount);
        }
        this.amount = amount;
        this.currency = currency;
    }
}
