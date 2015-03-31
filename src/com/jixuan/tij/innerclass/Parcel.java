package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class Parcel {

     class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private class PDistination implements Distination {
        private String label;

        public PDistination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Distination distination(String s) {
        return new PDistination(s);
    }

    public Contents contents() {
        return new PContents();
    }

}
