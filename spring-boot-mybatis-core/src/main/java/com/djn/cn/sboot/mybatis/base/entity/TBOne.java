package com.djn.cn.sboot.mybatis.base.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T_TK_TBOne
 */
@Table(name = "T_TK_TBOne")
public class TBOne {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastUpdateTime;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     *  创建者,developerId或者managerId
     */
    @Column(name = "creatorId")
    private String creatorId;

    /**
     * 最后修改者
     */
    @Column(name = "lastUpdateUserId")
    private String lastUpdateUserId;

    /**
     * secret
     */
    @Column(name = "secret")
    private String secret;

    /**
     * 是否隐藏
     */
    @Column(name = "hidden")
    private Boolean hidden;

    /**
     * 应用全称
     */
    @Column(name = "fullName")
    private String fullName;

    /**
     * 应用简称
     */
    @Column(name = "shortName")
    private String shortName;

    /**
     * 应用类型
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除
     */
    @Column(name = "state")
    private Integer state;

    /**
     * 展示地址
     */
    @Column(name = "showUrl")
    private String showUrl;

    /**
     * 回调地址
     */
    @Column(name = "callbackAddrUrl")
    private String callbackAddrUrl;

    /**
     * 发布时间
     */
    @Column(name = "publishDate")
    private Date publishDate;

    /**
     * 应用图标
     */
    @Column(name = "origin")
    private String origin;

    /**
     * 应用图标
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 版本
     */
    @Column(name = "version")
    private String version;

    /**
     * 是否推荐
     */
    @Column(name = "recommend")
    private Boolean recommend;

    /**
     * 是否免费
     */
    @Column(name = "free")
    private Boolean free;

    /**
     * 关联应用类型
     */
    @Column(name = "appCategoryId")
    private String appCategoryId;

    /**
     * ID
     * @return id ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 生成时间
     * @return createTime 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 生成时间
     * @param createTime 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * @return lastUpdateTime 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后修改时间
     * @param lastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     *  创建者,developerId或者managerId
     * @return creatorId  创建者,developerId或者managerId
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     *  创建者,developerId或者managerId
     * @param creatorId  创建者,developerId或者managerId
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * 最后修改者
     * @return lastUpdateUserId 最后修改者
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 最后修改者
     * @param lastUpdateUserId 最后修改者
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * secret
     * @return secret secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * secret
     * @param secret secret
     */
    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    /**
     * 是否隐藏
     * @return hidden 是否隐藏
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 是否隐藏
     * @param hidden 是否隐藏
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 应用全称
     * @return fullName 应用全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 应用全称
     * @param fullName 应用全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 应用简称
     * @return shortName 应用简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 应用简称
     * @param shortName 应用简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 应用类型
     * @return type 应用类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 应用类型
     * @param type 应用类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除
     * @return state 应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除
     * @param state 应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 展示地址
     * @return showUrl 展示地址
     */
    public String getShowUrl() {
        return showUrl;
    }

    /**
     * 展示地址
     * @param showUrl 展示地址
     */
    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl == null ? null : showUrl.trim();
    }

    /**
     * 回调地址
     * @return callbackAddrUrl 回调地址
     */
    public String getCallbackAddrUrl() {
        return callbackAddrUrl;
    }

    /**
     * 回调地址
     * @param callbackAddrUrl 回调地址
     */
    public void setCallbackAddrUrl(String callbackAddrUrl) {
        this.callbackAddrUrl = callbackAddrUrl == null ? null : callbackAddrUrl.trim();
    }

    /**
     * 发布时间
     * @return publishDate 发布时间
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * 发布时间
     * @param publishDate 发布时间
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 应用图标
     * @return origin 应用图标
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 应用图标
     * @param origin 应用图标
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * 应用图标
     * @return icon 应用图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 应用图标
     * @param icon 应用图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 版本
     * @return version 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 是否推荐
     * @return recommend 是否推荐
     */
    public Boolean getRecommend() {
        return recommend;
    }

    /**
     * 是否推荐
     * @param recommend 是否推荐
     */
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    /**
     * 是否免费
     * @return free 是否免费
     */
    public Boolean getFree() {
        return free;
    }

    /**
     * 是否免费
     * @param free 是否免费
     */
    public void setFree(Boolean free) {
        this.free = free;
    }

    /**
     * 关联应用类型
     * @return appCategoryId 关联应用类型
     */
    public String getAppCategoryId() {
        return appCategoryId;
    }

    /**
     * 关联应用类型
     * @param appCategoryId 关联应用类型
     */
    public void setAppCategoryId(String appCategoryId) {
        this.appCategoryId = appCategoryId == null ? null : appCategoryId.trim();
    }

	@Override
	public String toString() {
		return "TBOne [id=" + id + ", name=" + name + ", createTime=" + createTime + ", lastUpdateTime="
				+ lastUpdateTime + ", description=" + description + ", creatorId=" + creatorId + ", lastUpdateUserId="
				+ lastUpdateUserId + ", secret=" + secret + ", hidden=" + hidden + ", fullName=" + fullName
				+ ", shortName=" + shortName + ", type=" + type + ", state=" + state + ", showUrl=" + showUrl
				+ ", callbackAddrUrl=" + callbackAddrUrl + ", publishDate=" + publishDate + ", origin=" + origin
				+ ", icon=" + icon + ", version=" + version + ", recommend=" + recommend + ", free=" + free
				+ ", appCategoryId=" + appCategoryId + "]";
	}
    
}