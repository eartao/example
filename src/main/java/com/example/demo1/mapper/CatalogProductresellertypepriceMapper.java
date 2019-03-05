package com.example.demo1.mapper;

import com.example.demo1.pojo.CatalogProductresellertypeprice;
import com.example.demo1.pojo.CatalogProductresellertypepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatalogProductresellertypepriceMapper {
    long countByExample(CatalogProductresellertypepriceExample example);

    int deleteByExample(CatalogProductresellertypepriceExample example);

    int insert(CatalogProductresellertypeprice record);

    int insertSelective(CatalogProductresellertypeprice record);

    List<CatalogProductresellertypeprice> selectByExample(CatalogProductresellertypepriceExample example);

    int updateByExampleSelective(@Param("record") CatalogProductresellertypeprice record, @Param("example") CatalogProductresellertypepriceExample example);

    int updateByExample(@Param("record") CatalogProductresellertypeprice record, @Param("example") CatalogProductresellertypepriceExample example);
}