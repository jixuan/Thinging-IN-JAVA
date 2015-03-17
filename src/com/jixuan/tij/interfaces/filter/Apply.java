package com.jixuan.tij.interfaces.filter;


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
        Waveform wf = new Waveform();
        process(new HighPass(3.0),wf);
        process(new LowPass(1.0),wf);
        process(new BandPass(4.0,5.0),wf);
    }
}