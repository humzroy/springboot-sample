package com.zhen.springbootsample.mapper;

import com.zhen.springbootsample.modle.User;
import com.zhen.springbootsample.util.MyMapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA
 * <p>
 * Description：
 * Auth：wuhengzhen
 * Date：2019-01-29
 * Time：14:41
 */
public interface UserMapper extends MyMapper<User>{
    /**
     * 根据用户姓名查询用户信息
     *
     * @param username 姓名
     * @return 用户信息
     */

    User selectByName(String username);

    /**
     * 根据用户Cde查询用户信息
     *
     * @param userCde 用户cde
     * @return 用户信息
     */
    @Select("select * from user where user_cde=#{userCde}")
    User selectByCde(String userCde);
}
