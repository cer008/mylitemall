package com.cer.mall.mylitemall.service;

import com.cer.mall.mylitemall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @ClassName: PmsBrandService
 * @Description: TODO
 * @Author: xujin
 * @Date: 2019/11/18 16:41
 * @Version: 1.0
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
