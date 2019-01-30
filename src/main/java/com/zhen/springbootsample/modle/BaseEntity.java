package com.zhen.springbootsample.modle;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA
 * <p>
 * Description：基类
 * Auth：wuhengzhen
 * Date：2019-01-29
 * Time：14:35
 */
public class BaseEntity implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
