package com.headexplodes.example.base.part2;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.Currency;

import static com.google.common.base.Preconditions.*;

public class Money4 {

    private final BigDecimal amount;

    private final Currency currency;

    public Money4(BigDecimal amount, Currency currency) {
        this.amount = checkNotNull(amount, "amount must not be null");
        this.currency = checkNotNull(currency, "currency must not be null");

        checkArgument(amount.signum() >= 0, "amount must be positive, but was %S", amount);
    }
}
