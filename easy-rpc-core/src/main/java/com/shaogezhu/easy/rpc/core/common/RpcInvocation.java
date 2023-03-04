package com.shaogezhu.easy.rpc.core.common;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Author peng
 * @Date 2023/2/24
 * @description:
 */
public class RpcInvocation implements Serializable {

    private static final long serialVersionUID = 2951293262547830249L;

    /**
     * 请求的目标方法, 例如sendData
     */
    private String targetMethod;

    /**
     * 请求的目标服务名称, 例如：com.rpc.interfaces.DataService
     */
    private String targetServiceName;

    /**
     * 请求参数信息
     */
    private Object[] args;

    private String uuid;

    /**
     * 接口响应的数据（如果是异步调用或者void类型，这里就为空）
     */
    private Object response;

    public String getTargetMethod() {
        return targetMethod;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public String getTargetServiceName() {
        return targetServiceName;
    }

    public void setTargetServiceName(String targetServiceName) {
        this.targetServiceName = targetServiceName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "RpcInvocation{" +
                "targetMethod='" + targetMethod + '\'' +
                ", targetServiceName='" + targetServiceName + '\'' +
                ", args=" + Arrays.toString(args) +
                ", uuid='" + uuid + '\'' +
                ", response=" + response +
                '}';
    }
}
