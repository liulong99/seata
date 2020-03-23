package com.funtl.spring.cloud.alibaba.provider.service.impl;

import com.funtl.spring.cloud.alibaba.provider.domain.TbOrder;

import javax.annotation.Resource;
import com.funtl.spring.cloud.alibaba.provider.mapper.TbOrderMapper;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void insert(TbOrder tbOrder) {
        tbOrderMapper.insert(tbOrder);
    }
}
