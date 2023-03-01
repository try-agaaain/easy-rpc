package com.shaogezhu.easy.rpc.core.common.config;

/**
 * @Author peng
 * @Date 2023/2/25
 * @description: 客户端配置类
 */
public class ClientConfig {

    private String registerAddr;

    private String applicationName;

    private String proxyType;

    public String getRegisterAddr() {
        return registerAddr;
    }

    public void setRegisterAddr(String registerAddr) {
        this.registerAddr = registerAddr;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getProxyType() {
        return proxyType;
    }

    public void setProxyType(String proxyType) {
        this.proxyType = proxyType;
    }
}
