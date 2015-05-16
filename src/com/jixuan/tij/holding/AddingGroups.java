package com.jixuan.tij.holding;

import java.util.*;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/3/20.
 */
public class AddingGroups {
    /*先构建一个不包含元素的Collection，然后调用Collections.addAll(),这样最快*/
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        println(arr);
        /** List a = Arrays.asList(333, 444, 555, 666);
         a.add(123);
         println(a);
         Arrays.asList()方法转换的List是固定大小的，不能添加或删除,要想可变的List，用下面的格式
         */
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55, 66, 77));//一组参数列表转化成 list
        list1.add(1234);
        println(list1);
        Collection<Integer> coll = new ArrayList<Integer>(Arrays.asList(arr));//数组转化成list
        println(coll);
        coll.addAll(Arrays.asList(8, 9, 10, 11));//在Collection 后添加元素一组参数
        coll.add(9999);
        println(coll);
        Collections.addAll(coll, 12, 13, 14, 15, 16, 17);//在Collection 后添加一组参数
        println(coll);
        Collections.addAll(coll, arr);//在Collection 后添加一个数组
        println(coll);
        //最快的方式是下面
        Collection cc = new ArrayList();
        cc.addAll(coll);
//        cc.addAll(arr);这种初始化的方法的限制是只能添加一个collection对象，不能用数组初始化
//        cc.addAll(list1，coll); 也不能用两个
        println(cc);
    }
}
