package com.atguigu.mygmall.user.bean;

public class BaseCatalog2 {
    private Long id;

    private String name;

    private Long catalog1Id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Long catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}