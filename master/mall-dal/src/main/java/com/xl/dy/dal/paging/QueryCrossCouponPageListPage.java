package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_COUPON TA_COUPON
 */
public class QueryCrossCouponPageListPage extends BasePage<Map>{

    /**
     * shopId .
     */
    private Long shopId;

    /**
     * Set shopId .
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId .
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
