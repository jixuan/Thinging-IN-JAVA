package com.jixuan.tij.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jixuan
 *         Create on 15/3/20.
 */
public class AsListInterface {
    public static void main(String[] args) {

        /**如何一个填充List*/
        List<Snow> snows0 = new ArrayList<Snow>(Arrays.asList(new Power(), new Crusty(), new Slush()));
        List<Snow> snows1 = Arrays.asList(new Power(), new Crusty(), new Slush());
        List<Snow> snows2 = Arrays.asList(new Crusty(), new Slush());
        List<Power> snow3 = Arrays.asList(new Light(), new Heavy());
//        Collections.addAll(snows1, snow); 必须是参数
//        Collections.addAll(snows1, snows2);必须是参数
//        Collections.addAll(snows1, new Crusty());  无法添加和删除
//        List<Snow> snows = Arrays.asList(new Light(), new Heavy());
//        Arrays.asList()的方法是根据第一个参数来决定所生成的List的目标类型的Power所以生成的List<Power>
        List<Snow> snows = Arrays.<Snow>asList(new Light(), new Heavy());
//      告诉编译器产生的List的类型，实际的目标应该是什么，这称为显示类型参数说明
        snows0.add(new Power());
//        snows1.add(new Power());无法添加
    }
}

class Snow {

}

class Power extends Snow {

}

class Light extends Power {

}

class Heavy extends Power {

}

class Crusty extends Snow {

}

class Slush extends Snow {

}