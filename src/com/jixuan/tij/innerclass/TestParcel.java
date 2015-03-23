package com.jixuan.tij.innerclass;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/23.
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents c = parcel4.contents();
        Distination d = parcel4.distination("Tasmania");
//        Parcel4.PContents 这种方式无法访问
        Distination d2 = parcel4.distination2("tomato");
        parcel4.getInnerClass();
    }


}

class Parcel4 {
    public void getInnerClass() {
        PContents p = new PContents();
        println(p.getClass().getSimpleName());
        PDistinatin d = new PDistinatin("asdasdasda");
        println(d.getClass().getSimpleName());
//        PDistinatin2 无法接触到方法的内部类
    }
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private class PDistinatin implements Distination {
        private String label;

        private PDistinatin(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents() {
        return new PContents();
    }

    public Distination distination(String s) {
        return new PDistinatin(s);
    }

    public Distination distination2(String s) {
        /*方法的内部类*/
        class PDistinatin2 implements Distination {

            private String label;

            private PDistinatin2(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDistinatin2(s);
    }

}

