package com.liang.proxy.staticproxy;

import com.liang.proxy.Girl;
import com.liang.proxy.Person;

/**
 * 2019/3/30
 * Liangyudi-PC
 */
public class MeiPo implements Person {

    Girl girl;

    public MeiPo(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void findlove() {

        System.out.println("媒婆：开始物色对象");
        System.out.print("女孩：要求");
        this.girl.findlove();
        System.out.println("媒婆：配对成功");
    }
}
