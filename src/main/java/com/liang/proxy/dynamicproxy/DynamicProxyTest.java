package com.liang.proxy.dynamicproxy;

import com.liang.proxy.Girl;
import com.liang.proxy.Person;

/**
 * 2019/3/30
 * Liangyudi-PC
 */
public class DynamicProxyTest {

    public static void main(String[] args) {

        JDKMeipo meipo = new JDKMeipo();
        Person person = (Person) meipo.getInstance(new Girl());
        person.findlove();
    }
}
