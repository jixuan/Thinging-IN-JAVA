package com.jixuan.tij.interfaces.classprocessor;

import com.jixuan.tij.interfaces.filter.BandPass;
import com.jixuan.tij.interfaces.filter.HighPass;
import com.jixuan.tij.interfaces.filter.LowPass;
import com.jixuan.tij.interfaces.filter.Waveform;
import com.jixuan.tij.polymorphism.shape.Wave;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        println("Using Processor is : " + processor.name());
        processor.process(object);
    }

    public static void main(String[] args) {
//        String str = "Disagreement with beliefs is by definition incorrect";
//        process(new Upcase(), str);
//        process(new LowerCase(), str);
//        process(new Splitter(), str);
        Waveform w = new Waveform();
        process(new HighPass(2.0), w);
        process(new LowPass(1.0), w);
        process(new BandPass(3.0, 4.0), w);
    }
}

