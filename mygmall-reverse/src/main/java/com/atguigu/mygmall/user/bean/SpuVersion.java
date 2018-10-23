package com.atguigu.mygmall.user.bean;

public class SpuVersion {
    private Long id;

    private Long spuId;

    private String spuVersion;

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

    public String getSpuVersion() {
        return spuVersion;
    }

    public void setSpuVersion(String spuVersion) {
        this.spuVersion = spuVersion == null ? null : spuVersion.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }
}