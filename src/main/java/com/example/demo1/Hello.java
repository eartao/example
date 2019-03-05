package com.example.demo1;

import com.example.demo1.mapper.CatalogProductresellertypepriceMapper;
import com.example.demo1.pojo.CatalogProductresellertypeprice;
import com.example.demo1.pojo.CatalogProductresellertypepriceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/index")
public class Hello {
    @Autowired
    CatalogProductresellertypepriceMapper mapper;
    @RequestMapping("/aa")
    public String index(){
        System.out.println("进入首页");
        return "hello.html";
    }

    @RequestMapping("/bb")
    @ResponseBody
    public CatalogProductresellertypeprice get(){
        CatalogProductresellertypeprice c = new CatalogProductresellertypeprice();
        c.setCreatedate("2019");
        c.setPfId("888888888");
        int a = mapper.insert(c);
        System.out.println(a);
        CatalogProductresellertypeprice catalogProductresellertypeprice = mapper.selectOne(2);
        System.out.println(catalogProductresellertypeprice.getPfId());
        System.out.println(catalogProductresellertypeprice.toString());
        return catalogProductresellertypeprice;
    }
}
