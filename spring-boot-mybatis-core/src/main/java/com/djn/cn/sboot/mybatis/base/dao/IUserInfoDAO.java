package com.djn.cn.sboot.mybatis.base.dao;

import java.util.List;

import com.djn.cn.sboot.mybatis.base.entity.UserInfo;




/**
 * 
 * @ClassName IUserInfoDAO
 * @Description 用户信息DAO 
 * @author nie-dongjia
 * @date 2018年7月14日 下午2:43:45
 *
 */
public interface IUserInfoDAO {
    /**
     * 插入
     * @Title  save  
     * @return void   
     *
     */
    void save(UserInfo userInfo);
    /**
     * 删除
     * @Title  delete  
     * @return void   
     *
     */
    void delete(UserInfo userInfo);
    /**
     * 修改
     * @Title  update  
     * @return void   
     *
     */
    void update(UserInfo userInfo);
    /**
     * 查找所有
     * @Title  listAll  
     * @return List<UserInfo>   
     *
     */
    List<UserInfo> listAll();
    /**
     * 
     * @Title  findByNameAndAge  
     * @return UserInfo   
     *
     */
    List<UserInfo>  findByUserNameAndPassword(String userName,String password);
}
