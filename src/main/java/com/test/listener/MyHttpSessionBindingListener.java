package com.test.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by SERGE on 06.07.2014.
 */
public class MyHttpSessionBindingListener implements HttpSessionBindingListener {
    // HttpSessionBindingEvent когда кладём в сессию объекты, реализующие интерфейс
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(">>[MyHttpSessionBindingListener] valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(">>[MyHttpSessionBindingListener] valueBound");
    }
}
