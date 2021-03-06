package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgSubdistictDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_SUBDISTICT.
 * TG_SUBDISTICT
 */
public interface TgSubdistictDOMapper{

    /**
     * desc:插入表:TG_SUBDISTICT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_SUBDISTICT( ID ,C_CODE ,D_CODE ,P_CODE ,CITY_ID ,REMARK ,CITY_NAME ,ALTER_EMPL ,ALTER_TIME ,CITY_SPELL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,DISTRICT_ID ,PROVINCE_ID ,VALID_STATUS ,DISTRICT_NAME ,PROVINCE_NAME ,DISTRICT_SPELL ,PROVINCE_SPELL ,SUBDISTICT_NAME ,SUBDISTICT_SPELL )VALUES( #{id,jdbcType=BIGINT} , #{cCode,jdbcType=VARCHAR} , #{dCode,jdbcType=VARCHAR} , #{pCode,jdbcType=VARCHAR} , #{cityId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{cityName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{citySpell,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{districtId,jdbcType=BIGINT} , #{provinceId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{districtName,jdbcType=VARCHAR} , #{provinceName,jdbcType=VARCHAR} , #{districtSpell,jdbcType=VARCHAR} , #{provinceSpell,jdbcType=VARCHAR} , #{subdistictName,jdbcType=VARCHAR} , #{subdistictSpell,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgSubdistictDO entity);
    /**
     * desc:更新表:TG_SUBDISTICT.<br/>
     * descSql =  UPDATE TG_SUBDISTICT SET C_CODE = #{cCode,jdbcType=VARCHAR} ,D_CODE = #{dCode,jdbcType=VARCHAR} ,P_CODE = #{pCode,jdbcType=VARCHAR} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,CITY_NAME = #{cityName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CITY_SPELL = #{citySpell,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISTRICT_NAME = #{districtName,jdbcType=VARCHAR} ,PROVINCE_NAME = #{provinceName,jdbcType=VARCHAR} ,DISTRICT_SPELL = #{districtSpell,jdbcType=VARCHAR} ,PROVINCE_SPELL = #{provinceSpell,jdbcType=VARCHAR} ,SUBDISTICT_NAME = #{subdistictName,jdbcType=VARCHAR} ,SUBDISTICT_SPELL = #{subdistictSpell,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgSubdistictDO entity);
    /**
     * desc:根据主键删除数据:TG_SUBDISTICT.<br/>
     * descSql =  DELETE FROM TG_SUBDISTICT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_SUBDISTICT.<br/>
     * descSql =  SELECT * FROM TG_SUBDISTICT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgSubdistictDO
     */
    TgSubdistictDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_SUBDISTICT.<br/>
     * descSql =  SELECT * FROM TG_SUBDISTICT WHERE DISTRICT_ID = #{districtId,jdbcType=BIGINT}
     * @param districtId districtId
     * @return List<TgSubdistictDO>
     */
    List<TgSubdistictDO> showSubdistictListByPid(Long districtId);
}
