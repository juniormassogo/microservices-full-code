package com.junior0.ecommerce.payment;

import com.junior0.ecommerce.customer.CustomerResponse;
import com.junior0.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
