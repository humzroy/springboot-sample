package com.zhen.springbootsample.modle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Created with IntelliJ IDEA
 * <p>
 * Description：用户实体
 * Auth：wuhengzhen
 * Date：2019-01-29
 * Time：14:38
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User extends BaseEntity {
    private String userCde;
    private String username;
    private String idCard;
    private String phone;
    private String password;
}
