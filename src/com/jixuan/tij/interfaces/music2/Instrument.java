package com.jixuan.tij.interfaces.music2;

import com.jixuan.tij.polymorphism.music.Note;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public interface Instrument {
    void play(Note note);

    void adjust();
}
