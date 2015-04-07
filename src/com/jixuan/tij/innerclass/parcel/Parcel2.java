package com.jixuan.tij.innerclass.parcel;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class Parcel2 {
    /*在方法外，就无法访问PD的类*/
    public Distination distination(String sss) {
        class PDistination implements Distination {
            private String label;

            public PDistination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDistination(sss);
    }

}
