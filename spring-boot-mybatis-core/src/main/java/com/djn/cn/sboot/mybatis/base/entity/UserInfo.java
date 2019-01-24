package com.djn.cn.sboot.mybatis.base.entity;

/**
 * 
 * @ClassName UserInfo
 * @Description 系统用户表
 * @author BigJia-Perfect
 * @date 2017年3月16日 下午10:25:11
 *
 */
public class UserInfo extends AbstractBaseEntity {
    private static final long serialVersionUID = 1L;
    /** 用户名 */
    private String userName;
    /** 密码 */
    private String password;
    /** 邮箱 */
    private String email;
    /** 用户年龄 */
    private Integer age;
    /** QQ号码 */
    private String qq;
    /** 移动电话 */
    private String telphone;
    /** 地址 */
    private String address;
    /** 性别 */
    private String sex;
    /** 是否锁定 */
    private boolean locked;
    /** 是否激活 */
    private boolean activated;
    /** 是否删除 */
    private boolean deleted;

    public UserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    @Override
    public String toString() {
        return "UserInfo [userName=" + userName + ", password=" + password + ", email=" + email + ", age=" + age
                + ", qq=" + qq + ", telphone=" + telphone + ", address=" + address + ", sex=" + sex + ", locked="
                + locked + ", activated=" + activated + ", deleted=" + deleted + "]";
    }
}
