package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/4/1.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory serviceFactory) {
        Service s = serviceFactory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ServiceFactory1(2));
    }
}

interface Service {
    void method1();

    void method2();
}

class Service1 implements Service {

    @Override
    public void method1() {
        println("Service1 method1");
    }

    @Override
    public void method2() {
        println("Service1 method2");
    }
}

class Service2 implements Service {

    @Override
    public void method1() {
        println("Service2 method1");
    }

    @Override
    public void method2() {
        println("Service2 method2");
    }
}

interface ServiceFactory {
    Service getService();
}

class ServiceFactory1 implements ServiceFactory {
    private int i;

    public ServiceFactory1(int i) {
        this.i = i;
    }

    @Override
    public Service getService() {
        if (i == 1) {
            return new Service1();
        } else {
            return new Service2();
        }
    }
}