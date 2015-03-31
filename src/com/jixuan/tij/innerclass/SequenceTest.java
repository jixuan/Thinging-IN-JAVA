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
        Sequence s = new Sequence(3);
        Selector ss = s.sequenceSelector();
        for (int i = 0; i < 3; i++) {
            s.add(Integer.toString(i));
        }
        println(s);
        while (!ss.end()) {
            println(ss.current());
            ss.next();
        }
    }
}
