package com.ursus;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ConverterTest {
    private static final BigDecimal EUR_TO_USD = new BigDecimal("1.09");
    private static final BigDecimal USD_TO_EUR = new BigDecimal("0.92");

    private final Converter converter = new ConverterImpl();
    @Test
    public void testConvertUSDToEUR() {
        BigDecimal value = new BigDecimal("100.0");
        BigDecimal result = converter.convert(value, Currency.USD, Currency.EUR);
        Assertions.assertThat(result).isEqualTo(value.multiply(USD_TO_EUR));
    }

    @Test
    public void testConvertEURToUSD() {
        BigDecimal value = new BigDecimal("100.0");
        BigDecimal result = converter.convert(value, Currency.EUR, Currency.USD);
        Assertions.assertThat(result).isEqualTo(value.multiply(EUR_TO_USD));
    }
}
