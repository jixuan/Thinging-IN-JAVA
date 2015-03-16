package com.jixuan.tij.interfaces.classprocessor;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        println("Using Processor is : "+processor.name());
        println(processor.process(object));
    }

    public static void main(String[] args) {
        String str = "Disagreement with beliefs is by definition incorrect";
        process(new Processor(),str);
        process(new Upcase(),str);
        process(new LowerCase(),str);
        process(new Splitter(),str);
    }
}

class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Object process(Object object) {
        return object;
    }
}

class Upcase extends Processor {
    @Override
    public String process(Object object) {
        return ((String) object).toUpperCase();
    }
}

class LowerCase extends Processor {
    @Override
    public Object process(Object object) {
        return ((String)object).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    public Object process(Object object) {
        return Arrays.toString(((String) object).split(" "));
    }
}