package com.yangli.zookeeper.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * Created by Administrator on 2017/12/3.
 */
public class SessionDemo {

    private final static String CONNECTSTRING = "192.168.56.129:2181,192.168.56.130:2181,192.168.56.131:2181,";

    public static void main(String[] args) {
        ZkClient client = new ZkClient(CONNECTSTRING,4000);
        System.out.println(client + "--> susess");
    }
}
