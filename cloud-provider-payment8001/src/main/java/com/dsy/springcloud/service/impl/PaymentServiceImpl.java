package com.dsy.springcloud.service.impl;

import com.dsy.springcloud.dao.PaymentDao;
import com.dsy.springcloud.entity.Payment;
import com.dsy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created on 2020/4/20
 * Package com.dsy.springcloud.service.impl
 *
 * @author dsy
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
