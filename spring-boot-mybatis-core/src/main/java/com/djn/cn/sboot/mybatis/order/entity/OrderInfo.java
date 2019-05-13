package com.djn.cn.sboot.mybatis.order.entity;

import java.util.Date;

/**
 * 
 * <b>类   名：</b>OrderInfo<br/>
 * <b>类描述：</b>订单单据实体<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年5月12日 下午11:21:40<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年5月12日 下午11:21:40<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */

public class OrderInfo {
	private Long id;
	private String Code;
	private String systemCode;
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
    /** 状态 */
    private Integer status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", Code=" + Code + ", systemCode=" + systemCode + ", createTime=" + createTime
				+ ", lastUpdateTime=" + lastUpdateTime + ", description=" + description + ", creatorId=" + creatorId
				+ ", lastUpdateUserId=" + lastUpdateUserId + ", status=" + status + "]";
	}
}	
