package com.djn.cn.sboot.mybatis.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName AbstractBaseEntity
 * @Description  通用实体公共字段
 * @author 聂冬佳-服务
 * @date 2018年7月12日 下午10:00:38
 *
 */
public abstract class AbstractBaseEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    /**id*/    
    private String id;
    /**名称*/
    private String name;
    /**创建日期*/
    private Date createTime;
    /**  最后修改日期 */ 
    private Date   lastUpdateTime;
    /** 描述 */
    private String description;
    /**创建者*/
    private String creatorId;
    /**最近修改者*/
    private String lastUpdateUserId;
    public AbstractBaseEntity() {
        super();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }
}
