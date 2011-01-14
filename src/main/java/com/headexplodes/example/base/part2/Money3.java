package com.headexplodes.example.base.part2;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.Currency;

public class Money3 {

    private final BigDecimal amount;

    private final Currency currency;

    public Money3(BigDecimal amount, Currency currency) {
        this.amount = Preconditions.checkNotNull(amount, "amount must not be null");
        this.currency = Preconditions.checkNotNull(currency, "currency must not be null");

        Preconditions.checkArgument(amount.signum() >= 0, "amount must be positive, but was %S", amount);
    }
}
