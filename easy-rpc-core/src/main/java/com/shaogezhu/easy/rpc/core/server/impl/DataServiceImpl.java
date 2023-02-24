package com.shaogezhu.easy.rpc.core.server.impl;

import com.shaogezhu.easy.rpc.interfaces.DataService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author peng
 * @Date 2023/2/25
 * @description:
 */
public class DataServiceImpl implements DataService {

    @Override
    public String sendData(String body) {
        System.out.println("这里是服务提供者，body is " + body);
        return "success from server";
    }

    @Override
    public List<String> getList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("idea1");
        arrayList.add("idea2");
        arrayList.add("idea3");
        return arrayList;
    }

    @Override
    public void testError() {
        System.out.println(1 / 0);
    }

    @Override
    public String testErrorV2() {
        throw new RuntimeException("测试异常");
    }

}
