package com.funtl.spring.cloud.alibaba.provider.service.impl;

import com.funtl.spring.cloud.alibaba.provider.domain.TbOrderItem;

import javax.annotation.Resource;
import com.funtl.spring.cloud.alibaba.provider.mapper.TbOrderItemMapper;
import com.funtl.spring.cloud.alibaba.provider.service.api.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem tbOrderItem) {
        tbOrderItemMapper.insert(tbOrderItem);
    }
}
