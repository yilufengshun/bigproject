package com.meng.spring.service.impl;

import com.meng.spring.dao.TbItemMapper;
import com.meng.spring.pojo.TbItem;
import com.meng.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements ItemService {
   @Autowired
   private TbItemMapper tbItemMapper;


    @Override
    public TbItem findById(Long itenId) {
        return tbItemMapper.selectByPrimaryKey(itenId);
    }
}
