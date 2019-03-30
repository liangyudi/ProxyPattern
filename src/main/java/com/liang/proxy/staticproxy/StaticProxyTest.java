package com.liang.proxy.staticproxy;

import com.liang.proxy.Girl;

/**
 * 2019/3/30
 * Liangyudi-PC
 */
public class StaticProxyTest {

    public static void main(String[] args) {

        Girl girl = new Girl();

        MeiPo meiPo = new MeiPo(girl);

        meiPo.findlove();
    }
}
