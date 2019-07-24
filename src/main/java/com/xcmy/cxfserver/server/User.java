package com.xcmy.cxfserver.server;

import java.io.Serializable;

//这是一个测试实体
public class User implements Serializable {
    private static final long serialVersionUID = -5298836913913198040L;

    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
