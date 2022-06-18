package com.yang.gulimall.product;

import com.yang.gulimall.product.entity.BrandEntity;
import com.yang.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("牛");
        brandEntity.setSort(2);
        boolean save = brandService.save(brandEntity);
        System.out.println(save);
    }

}
