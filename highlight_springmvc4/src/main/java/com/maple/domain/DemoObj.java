package com.maple.domain;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 19:45
 */

public class DemoObj {
    public String name;
    private long id;

    public DemoObj() {
        super();
    }

    public DemoObj(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
