package com.djn.cn.sboot.mybatis.base.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 
 * <b>类   名：</b>MyMapper<br/>
 * <b>类描述：</b>通用Mapper<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年1月27日 下午4:44:44<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年1月27日 下午4:44:44<br/>
 * <b>修改备注：</b><br/>
 * @param <T>
 *
 * @version   1.0<br/>
 *
 */
public interface MyMapper <T> extends Mapper<T>, MySqlMapper<T>{

}
