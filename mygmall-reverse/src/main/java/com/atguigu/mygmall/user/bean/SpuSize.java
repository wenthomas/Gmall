package com.atguigu.mygmall.user.bean;

public class SpuSize {
    private Long id;

    private Long spuId;

    private String spuSize;

    private String isEnabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuSize() {
        return spuSize;
    }

    public void setSpuSize(String spuSize) {
        this.spuSize = spuSize == null ? null : spuSize.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }
}