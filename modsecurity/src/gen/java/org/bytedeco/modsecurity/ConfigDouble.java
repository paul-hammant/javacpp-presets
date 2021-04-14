// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;



@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class ConfigDouble extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConfigDouble(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConfigDouble(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConfigDouble position(long position) {
        return (ConfigDouble)super.position(position);
    }
    @Override public ConfigDouble getPointer(long i) {
        return new ConfigDouble((Pointer)this).position(position + i);
    }

    public ConfigDouble() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean m_set(); public native ConfigDouble m_set(boolean setter);
    public native double m_value(); public native ConfigDouble m_value(double setter);

    public native void merge(ConfigDouble from);
}