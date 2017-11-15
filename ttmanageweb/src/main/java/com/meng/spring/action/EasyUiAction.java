package com.meng.spring.action;


import com.meng.spring.dto.EIDataGridDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
public class EasyUiAction {

    @RequestMapping("easyui")
    public List<String> easyui(){
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("hehe");
        return list;


    }
    @RequestMapping("easyui2.json")
    public List<EIDataGridDTO> dataGrid(Integer page){
    if(page==null)
            page=1;
        List<EIDataGridDTO> list = new ArrayList<EIDataGridDTO>();
        for (int i = 0; i < 100; i++) {
            list.add(new EIDataGridDTO(i+"",page.toString(),2100D));
        }
        list.add(new EIDataGridDTO("1001","小米",1988D));
        list.add(new EIDataGridDTO("1002","华为",2000D));
        list.add(new EIDataGridDTO("1003","锤子",2100D));

        return  list;
    }








}
