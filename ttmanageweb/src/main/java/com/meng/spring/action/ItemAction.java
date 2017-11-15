package com.meng.spring.action;


import com.meng.spring.pojo.TbItem;
import com.meng.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemAction {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem findByItem(@PathVariable Long itemId){
        TbItem byId = itemService.findById(itemId);

        return byId;


    }

}
