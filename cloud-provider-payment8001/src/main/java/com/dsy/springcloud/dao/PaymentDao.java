package com.dsy.springcloud.dao;

import com.dsy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2020/4/20
 * Package com.dsy.springcloud.dao
 *
 * @author dsy
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
