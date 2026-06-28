package com.junior0.ecommerce.kafka;

import com.junior0.ecommerce.customer.CustomerResponse;
import com.junior0.ecommerce.order.PaymentMethod;
import com.junior0.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
