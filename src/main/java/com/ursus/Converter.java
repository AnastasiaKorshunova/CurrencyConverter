package com.ursus;

import java.math.BigDecimal;

public interface Converter {

    BigDecimal convert(BigDecimal value, Currency from, Currency to);
}
