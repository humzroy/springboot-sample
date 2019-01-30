package com.zhen.springbootsample.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created with IntelliJ IDEA
 * <p>
 * Description：
 * Auth：wuhengzhen
 * Date：2019-01-29
 * Time：14:41
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
