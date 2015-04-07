package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/4/7.
 */
public class Factories2 {
    public static void serviceConsumer(ServiceFactories2 serviceFactories2) {
        Service2 s2 = serviceFactories2.getService();
        s2.method1();
        s2.method2();
    }

    public static void main(String[] args) {
       serviceConsumer(new Service2Imp1().serviceFactories2());
       serviceConsumer(Service2Imp2.serviceFactories2);
    }
}

interface Service2 {
    void method1();
    void method2();
}
interface ServiceFactories2{
    Service2 getService();
}
class Service2Imp1 implements Service2{


    @Override
    public void method1() {
        println(" Service2Imp1 method1");
    }

    @Override
    public void method2() {
        println(" Service2Imp1 method2");
    }

    public ServiceFactories2 serviceFactories2() {
        return new ServiceFactories2(){
            @Override
            public Service2 getService() {
                return new Service2Imp1();
            }
        };
    }
}
class Service2Imp2 implements Service2{
    //私有的构造方法无法通过new去创建对象
    private Service2Imp2() {
    }
    //通常只需要单一的工厂对象，所以创建成static域
    public static ServiceFactories2 serviceFactories2 = new ServiceFactories2() {
        @Override
        public Service2 getService() {
            return new Service2Imp2();
        }
    };

    @Override
    public void method1() {
        println(" Service2Imp2 method1");
    }

    @Override
    public void method2() {
        println(" Service2Imp2 method2");
    }

}
