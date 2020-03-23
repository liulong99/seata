package com.funtl.spring.cloud.alibaba.provider.service.impl;

import com.funtl.spring.cloud.alibaba.provider.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.provider.domain.TbOrderItem;
import com.funtl.spring.cloud.alibaba.provider.service.api.ProviderTransactionService;
import com.funtl.spring.cloud.alibaba.provider.service.api.TbOrderItemService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Description :
 * @Author 刘龙
 * @Date 2020/3/23 16:16
 * @Version 1.0
 **/
@Service(version = "1.0.0")
public class ProviderTransactionServiceImpl implements ProviderTransactionService {

    @Reference(version = "1.0.0")
    TbOrderService tbOrderService;

    @Reference(version = "1.0.0")
    TbOrderItemService tbOrderItemService;

    @Override
    @GlobalTransactional
    public void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem) {
        tbOrderService.insert(tbOrder);
        tbOrderItemService.insert(tbOrderItem);
        //如果order表中userId插入的为2的话，就让他两阶段回滚
        if(tbOrder.getUserId().equals(2L)){
            throw new RuntimeException("Exception for seata");
        }
    }
}
