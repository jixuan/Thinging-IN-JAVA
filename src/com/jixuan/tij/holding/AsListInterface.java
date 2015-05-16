package com.jixuan.tij.holding;

import java.util.*;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/20.
 */
public class AsListInterface {
    public static void main(String[] args) {

        /**如何一个填充List*/
        List<Snow> s1 = Arrays.asList(new Power(), new Crusty(), new Slush());
//        s1.add(new Snow());s1是固定大小的数组，不可添加
        println("s1 : " + s1);
        List<Snow> s2 = new ArrayList<Snow>(Arrays.asList(new Snow(), new Light()));
        s2.add(new Heavy());//这种方式就可以产生可变的数组，一般这么用
        println("s2 : " + s2);
//        List<Snow> s3 = Arrays.asList(new Light(),new Heavy());Arrays.asList这种方式会将两个参数识别成List<Power>
        List<Snow> s33 = Arrays.<Snow>asList(new Light(), new Heavy());//可以像这样，显示类型参数说明
        println("s33 : "+s33);
        List<Power> s3 = Arrays.asList(new Light(), new Heavy());//或者直接声明称Power
        println("s3 : "+s3);
        //Collection.addAll 和Collections.addAll 就不会搞错,应为它从第一个参数中了解到参数类型是什么
        List<Snow> cc = new ArrayList<Snow>();
        cc.addAll(Arrays.asList(new Light(), new Heavy()));
        println("cc : "+cc);
        Collections.addAll(cc, new Light(), new Heavy());
        println("cc : "+cc);
    }
}

class Snow {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Power extends Snow {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Crusty extends Snow {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Slush extends Snow {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
class Light extends Power {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Heavy extends Power {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}