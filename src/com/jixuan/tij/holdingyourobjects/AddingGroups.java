package com.jixuan.tij.holdingyourobjects;

import java.util.*;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/20.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7};
        println(arr);
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77));//一组参数列表转化成 list
        println(list1);
        Collection<Integer> coll = new ArrayList<Integer>(Arrays.asList(arr));//数组转化成list
        println(coll);
        coll.addAll(Arrays.asList(8, 9, 10, 11));//在Collection 后添加元素一组参数
        println(coll);
        Collections.addAll(coll, 12, 13, 14, 15, 16, 17);//在Collection 后添加一组参数
        println(coll);
        Collections.addAll(coll, arr);//在Collection 后添加一个数组
        println(coll);

    }
}
