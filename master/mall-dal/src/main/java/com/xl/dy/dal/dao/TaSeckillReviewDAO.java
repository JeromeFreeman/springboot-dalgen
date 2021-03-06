package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaSeckillReviewDO;
import com.xl.dy.dal.paging.QuerySeckillReviewListPage;
import com.xl.dy.dal.paging.QueryShowAllowSeckillListPage;
import com.xl.dy.dal.paging.QueryRegisteredSeckillListPage;
import java.lang.Long;
import com.xl.dy.dal.paging.QueryCountBySeckillIdPage;
import com.xl.dy.dal.paging.QueryExamineSeckillGoodsPage;
import java.lang.Integer;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TaSeckillReviewDOMapper;

/**
* The Table TA_SECKILL_REVIEW.
* TA_SECKILL_REVIEW
*/
@Repository
public class TaSeckillReviewDAO{

    @Autowired
    private TaSeckillReviewDOMapper taSeckillReviewDOMapper;

    /**
     * desc:???�表:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SECKILL_REVIEW( ID ,INX ,REASON ,REMARK ,SHOP_ID ,DISCOUNT ,ALTER_EMPL ,ALTER_TIME ,SECKILL_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SHOP_GOODS_ID ,VALID_STATUS ,SECKILL_PRICE ,ACTIVE_INVENTORY ,SECKILL_REVIEW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{reason,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{discount,jdbcType=DECIMAL} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{seckillId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{seckillPrice,jdbcType=DECIMAL} , #{activeInventory,jdbcType=DECIMAL} , #{seckillReviewStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaSeckillReviewDO entity){
        return taSeckillReviewDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_SECKILL_REVIEW.<br/>
     * descSql =  UPDATE TA_SECKILL_REVIEW SET INX = #{inx,jdbcType=INTEGER} ,REASON = #{reason,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,DISCOUNT = #{discount,jdbcType=DECIMAL} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,SECKILL_ID = #{seckillId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SECKILL_PRICE = #{seckillPrice,jdbcType=DECIMAL} ,ACTIVE_INVENTORY = #{activeInventory,jdbcType=DECIMAL} ,SECKILL_REVIEW_STATUS = #{seckillReviewStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaSeckillReviewDO entity){
        return taSeckillReviewDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_SECKILL_REVIEW.<br/>
     * descSql =  DELETE FROM TA_SECKILL_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taSeckillReviewDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT * FROM TA_SECKILL_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaSeckillReviewDO
     */
    public TaSeckillReviewDO getByPrimary(Long id){
        return taSeckillReviewDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询店铺列表.<br/>
     * descSql =  SELECT a.`ID`, a.`SECKILL_ID`, d.SKU_TITLE, c.GOODS_PRICE, a.SECKILL_PRICE, (a.SECKILL_PRICE/c.GOODS_PRICE) count, a.ACTIVE_INVENTORY, a.CREATE_TIME, e.`SHOP_NAME`, e.`MALL_NAME`, e.`COMPANY_NAME`, a.`SECKILL_REVIEW_STATUS`, f.PHOTO_URL, b.sku_id, a.`SHOP_GOODS_ID`, h.MG_FR_ID, (SELECT GROUP_CONCAT(A.NAME SEPARATOR '/') FROM tg_mg_category A WHERE find_in_set(A.ID, h.MG_FR_ID)) as fr_category FROM `ta_seckill_review` a LEFT JOIN TA_SHOP_GOODS b on a.`SHOP_GOODS_ID`= b.id LEFT JOIN TA_GOODS h on h.id = b.GOODS_ID LEFT JOIN TA_SHOP_GOODS_PRICE c on c.SHOP_GOODS_ID= b.id LEFT JOIN TA_SKU d ON d.id= b.sku_id LEFT JOIN ta_shop e on e.`ID`= a.`SHOP_ID` LEFT JOIN TA_GOODS_PHOTO f on f.SKU_ID= d.id LEFT JOIN TA_SECKILL g on g.id= a.`SECKILL_ID` f.IS_MAST_PHOTO=1 and a.`SECKILL_ID`= #{seckillId,jdbcType=BIGINT} AND SECKILL_REVIEW_STATUS = #{seckillReviewStatus,jdbcType=VARCHAR} AND DATE_FORMAT(CREATE_TIME ,'%Y-%m-%d')=#{createTime,jdbcType=TIMESTAMP} AND SKU_TITLE LIKE CONCAT('%',#{searchStr,jdbcType=VARCHAR},'%') ORDER BY CREATE_TIME DESC
     * @param querySeckillReviewList querySeckillReviewList
     * @return QuerySeckillReviewListPage
     */
    public QuerySeckillReviewListPage getSeckillReviewList(QuerySeckillReviewListPage querySeckillReviewList){
        int total = taSeckillReviewDOMapper.getSeckillReviewListCount(querySeckillReviewList);
        if(total>0){
            querySeckillReviewList.setDatas(taSeckillReviewDOMapper.getSeckillReviewListResult(querySeckillReviewList));
        }
        querySeckillReviewList.setTotal(total);
        return querySeckillReviewList;
    }
    /**
     * desc:允许报名列表:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT a.id seckillId, a.`NAME` seckillName , a.PUTAWAY_TIME putawayTime, a.SOLDOUT_TIME soldoutTime, a.PER_REGISTE_LIMIT perRegisteLimit, a.PER_BUY_LIMIT perBuyLimit, a.NOTICE NOTICE FROM `ta_seckill` a WHERE a.`SECKILL_STATUS` = 'ING' AND a.VALID_STATUS =1 AND a.ID NOT IN (SELECT SECKILL_ID FROM ta_seckill_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryShowAllowSeckillList queryShowAllowSeckillList
     * @return QueryShowAllowSeckillListPage
     */
    public QueryShowAllowSeckillListPage showAllowSeckillList(QueryShowAllowSeckillListPage queryShowAllowSeckillList){
        int total = taSeckillReviewDOMapper.showAllowSeckillListCount(queryShowAllowSeckillList);
        if(total>0){
            queryShowAllowSeckillList.setDatas(taSeckillReviewDOMapper.showAllowSeckillListResult(queryShowAllowSeckillList));
        }
        queryShowAllowSeckillList.setTotal(total);
        return queryShowAllowSeckillList;
    }
    /**
     * desc:已报名列表:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT a.id seckillId, a.`NAME` seckillName , a.PUTAWAY_TIME putawayTime, a.SOLDOUT_TIME soldoutTime, a.PER_REGISTE_LIMIT perRegisteLimit, a.PER_BUY_LIMIT perBuyLimit, a.NOTICE NOTICE FROM `ta_seckill` a WHERE a.`SECKILL_STATUS` = 'ING' AND a.VALID_STATUS =1 AND a.ID IN (SELECT SECKILL_ID FROM ta_seckill_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryRegisteredSeckillList queryRegisteredSeckillList
     * @return QueryRegisteredSeckillListPage
     */
    public QueryRegisteredSeckillListPage showRegisteredSeckillList(QueryRegisteredSeckillListPage queryRegisteredSeckillList){
        int total = taSeckillReviewDOMapper.showRegisteredSeckillListCount(queryRegisteredSeckillList);
        if(total>0){
            queryRegisteredSeckillList.setDatas(taSeckillReviewDOMapper.showRegisteredSeckillListResult(queryRegisteredSeckillList));
        }
        queryRegisteredSeckillList.setTotal(total);
        return queryRegisteredSeckillList;
    }
    /**
     * desc:获取秒杀报名数:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT count(*) FROM `ta_seckill_review` WHERE SECKILL_ID = #{seckillId,jdbcType=BIGINT}
     * @param seckillId seckillId
     * @return Long
     */
    public Long getCountBySeckillId(Long seckillId){
        return taSeckillReviewDOMapper.getCountBySeckillId(seckillId);
    }
    /**
     * desc:获取秒杀活动商品:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT a.ID seckillReviewId, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.DISCOUNT discount, a.SECKILL_PRICE seckillPrice, g.GOODS_PRICE goodsPrice, a.INX inx, a.ACTIVE_INVENTORY activeInventory FROM ta_seckill_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_shop_goods e ON e.ID = a.SHOP_GOODS_ID LEFT JOIN ta_sku f ON f.ID = e.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SHOP_GOODS_ID = a.SHOP_GOODS_ID LEFT JOIN ta_goods_photo h on h.SKU_ID = f.ID WHERE a.SECKILL_ID = #{seckillId,jdbcType=BIGINT} AND SECKILL_REVIEW_STATUS = "PASS" AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" ORDER BY a.INX ASC
     * @param queryCountBySeckillId queryCountBySeckillId
     * @return QueryCountBySeckillIdPage
     */
    public QueryCountBySeckillIdPage getGoodsBySeckillId(QueryCountBySeckillIdPage queryCountBySeckillId){
        int total = taSeckillReviewDOMapper.getGoodsBySeckillIdCount(queryCountBySeckillId);
        if(total>0){
            queryCountBySeckillId.setDatas(taSeckillReviewDOMapper.getGoodsBySeckillIdResult(queryCountBySeckillId));
        }
        queryCountBySeckillId.setTotal(total);
        return queryCountBySeckillId;
    }
    /**
     * desc:获取审核商品:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT z.ID seckillId, z.`NAME` seckillName, z.CATEGORY_SET categorySet, z.PER_REGISTE_LIMIT perRegisteLimit, z.NOTICE notice, y.`NAME` categoryName, a.ID seckillReviewId, a.REASON reason, a.SECKILL_REVIEW_STATUS seckillReviewStatus, a.ACTIVE_INVENTORY activeInventory, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, x.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.DISCOUNT discount, a.SECKILL_PRICE seckillPrice, g.GOODS_PRICE goodsPrice FROM ta_seckill z LEFT JOIN ta_seckill_review a ON z.ID=a.SECKILL_ID LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_shop_goods e ON e.ID = a.SHOP_GOODS_ID LEFT JOIN ta_sku f on f.ID = e.SKU_ID LEFT JOIN ta_shop_goods_price g on g.SHOP_GOODS_ID = a.SHOP_GOODS_ID LEFT JOIN tg_mg_category y ON y.id = z.CATEGORY_SET LEFT JOIN ta_goods_photo x on x.SKU_ID = f.ID WHERE a.SECKILL_ID = #{seckillId,jdbcType=BIGINT} AND SECKILL_REVIEW_STATUS = #{seckillReviewStatus,jdbcType=VARCHAR} AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND d.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND c.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND b.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND f.SKU_TITLE LIKE #{skutitle,jdbcType=VARCHAR} 
     * @param queryExamineSeckillGoods queryExamineSeckillGoods
     * @return QueryExamineSeckillGoodsPage
     */
    public QueryExamineSeckillGoodsPage getExamineSeckillGoods(QueryExamineSeckillGoodsPage queryExamineSeckillGoods){
        int total = taSeckillReviewDOMapper.getExamineSeckillGoodsCount(queryExamineSeckillGoods);
        if(total>0){
            queryExamineSeckillGoods.setDatas(taSeckillReviewDOMapper.getExamineSeckillGoodsResult(queryExamineSeckillGoods));
        }
        queryExamineSeckillGoods.setTotal(total);
        return queryExamineSeckillGoods;
    }
    /**
     * desc:获得店铺商品报名数:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT IFNULL(sum(ACTIVE_INVENTORY),0) FROM `ta_seckill_review` WHERE SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} AND SECKILL_ID = #{seckillId,jdbcType=BIGINT}
     * @param seckillId seckillId
     * @param shopGoodsId shopGoodsId
     * @return Integer
     */
    public Integer getSumByShopGoods(Long seckillId,Long shopGoodsId){
        return taSeckillReviewDOMapper.getSumByShopGoods(seckillId, shopGoodsId);
    }
    /**
     * desc:获得店铺已报名的秒杀商品:TA_SECKILL_REVIEW.<br/>
     * descSql =  SELECT b.SHOP_PHOTO_URL photoUrl, d.SHOP_GOODS_NAME goodsName, a.ID seckillReviewId, a.SECKILL_REVIEW_STATUS seckillreviewStatus, a.REASON REASON, c.SKU_TITLE skuTitle FROM `ta_seckill_review` a LEFT JOIN ta_shop_goods b ON a.SHOP_GOODS_ID =b.ID LEFT JOIN ta_sku c ON b.SKU_ID = c.ID LEFT JOIN ta_shop_goods_prop d ON b.GOODS_ID = d.GOODS_ID WHERE a.SECKILL_ID =#{seckillId,jdbcType=BIGINT} AND a.SHOP_ID =#{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param seckillId seckillId
     * @return List<Map>
     */
    public List<Map> getRegistedShopGoods(Long shopId,Long seckillId){
        return taSeckillReviewDOMapper.getRegistedShopGoods(shopId, seckillId);
    }
}
