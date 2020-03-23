package com.funtl.spring.cloud.alibaba.provider.service.api;

import com.funtl.spring.cloud.alibaba.provider.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.provider.domain.TbOrderItem;

public interface ProviderTransactionService {

    void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem);

}
