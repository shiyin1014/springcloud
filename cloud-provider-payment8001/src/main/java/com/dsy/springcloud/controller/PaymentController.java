package com.dsy.springcloud.controller;

import com.dsy.springcloud.entity.CommonResult;
import com.dsy.springcloud.entity.Payment;
import com.dsy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created on 2020/4/20
 * Package com.dsy.springcloud.controller
 *
 * @author dsy
 */
@Controller
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @ResponseBody
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("****插入结果:****" + i);
        if (i > 0) {
            return new CommonResult(200, "插入数据库成功", i);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @ResponseBody
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果 :******" + "嘻嘻嘻嘻嘻" + payment);
        if (payment != null) {
            return new CommonResult<Payment>(200, "查询成功", payment);
        } else {
            return new CommonResult<Payment>(444, "没有对应记录,查询ID：" + id, null);
        }
    }


}
