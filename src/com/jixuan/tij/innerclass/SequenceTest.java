package com.jixuan.tij.innerclass;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;
import static com.jixuan.tij.util.Print.printnb;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class SequenceTest {

    public static void main(String[] args) {
        Sequence s = new Sequence(6);
        Selector ss = s.sequenceSelector();
        Selector rs = s.reverseSelector();
        for (int i = 0; i < 3; i++) {
            s.add(Integer.toString(i));
        }
        s.add("aaaaaaaaaa");
        s.add("bbbbbbbbbb");
        s.add("cccccccccc");
        println(s);
        while (!ss.end()) {
            println(ss.current());
            ss.next();
        }
        while (!rs.end()) {
            println(rs.current());
            rs.next();
        }
    }
}
