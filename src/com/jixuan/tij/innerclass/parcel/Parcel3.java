package com.jixuan.tij.innerclass.parcel;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class Parcel3 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip t = new TrackingSlip("Tracking slip");
            println(t.getSlip());
        }
        // 不能在if外用内部类       TrackingSlip t = new TrackingSlip("Tracking slip");

    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel3 p3 = new Parcel3();
        p3.track();
    }
}
