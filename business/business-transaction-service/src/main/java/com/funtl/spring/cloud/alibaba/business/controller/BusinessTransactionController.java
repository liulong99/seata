package com.funtl.spring.cloud.alibaba.business.controller;

import com.funtl.spring.cloud.alibaba.provider.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.provider.domain.TbOrderItem;
import com.funtl.spring.cloud.alibaba.provider.service.api.ProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author 刘龙
 * @Date 2020/3/23 16:35
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {

    @Reference(version = "1.0.0")
    private ProviderTransactionService providerTransactionService;

    @GetMapping(value = "create/order")
    public String createOrder(){
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
//        tbOrder.setUserId(1L);
        //两阶段回滚
        tbOrder.setUserId(2L);

        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setUserId(1L);
        tbOrderItem.setOrderId(1L);
        tbOrderItem.setOrderItemId(1L);

        providerTransactionService.createOrder(tbOrder,tbOrderItem);

        return "ok";
    }

}
