package com.dsy.springcloud.service;

import com.dsy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2020/4/20
 * Package com.dsy.springcloud.service
 *
 * @author dsy
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
