package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ERP_REG
 */
public class TaErpRegDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * drive 驱动实现类.
     */
    private String drive;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * erpType 业务系统类型(DIC).
     */
    private String erpType;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * initParam 驱动初始参数.
     */
    private String initParam;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * erpRegName 业务系统注册名称.
     */
    private String erpRegName;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set drive 驱动实现类.
     */
    public void setDrive(String drive){
        this.drive = drive;
    }

    /**
     * Get drive 驱动实现类.
     *
     * @return the string
     */
    public String getDrive(){
        return drive;
    }

    /**
     * Set remark 公共-备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 公共-备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set erpType 业务系统类型(DIC).
     */
    public void setErpType(String erpType){
        this.erpType = erpType;
    }

    /**
     * Get erpType 业务系统类型(DIC).
     *
     * @return the string
     */
    public String getErpType(){
        return erpType;
    }

    /**
     * Set alterEmpl 公共-修改人.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl 公共-修改人.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime 公共-修改时间.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime 公共-修改时间.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set initParam 驱动初始参数.
     */
    public void setInitParam(String initParam){
        this.initParam = initParam;
    }

    /**
     * Get initParam 驱动初始参数.
     *
     * @return the string
     */
    public String getInitParam(){
        return initParam;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set createEmpl 公共-创建人.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl 公共-创建人.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime 公共-创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 公共-创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set erpRegName 业务系统注册名称.
     */
    public void setErpRegName(String erpRegName){
        this.erpRegName = erpRegName;
    }

    /**
     * Get erpRegName 业务系统注册名称.
     *
     * @return the string
     */
    public String getErpRegName(){
        return erpRegName;
    }

    /**
     * Set validStatus 公共-有效性状态.
     */
    public void setValidStatus(Integer validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus 公共-有效性状态.
     *
     * @return the string
     */
    public Integer getValidStatus(){
        return validStatus;
    }
}
