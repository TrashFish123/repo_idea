package com.lagou.service;

import com.lagou.domain.PromotionSpace;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface PromotionSpaceService {
    /*
    查询所有广告位
     */
    List<PromotionSpace> findAllPromotionSpace();

    /**
添加广告位
*/
    void savePromotionSpace(PromotionSpace promotionSpace);
    /**
     修改广告位
     */
    void updatePromotionSpace(PromotionSpace promotionSpace);


  /*
  根据id回显信息
   */
    PromotionSpace findPromotionSpaceById(int id);

}
