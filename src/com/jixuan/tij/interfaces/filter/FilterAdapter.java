package com.jixuan.tij.interfaces.filter;

/**
 * @author jixuan
 *         Create on 15/3/17.
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object object) {
        return filter.process(object);
    }
    /*适配器的主要作用就像转换器一样，iPhone用的充电插头必须是这样的，没有的话，就自己买个转换器就好了*/
}
