// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_ran_discrete_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_ran_discrete_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_ran_discrete_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_ran_discrete_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_ran_discrete_t position(long position) {
        return (gsl_ran_discrete_t)super.position(position);
    }
                /* struct for Walker algorithm */
    public native @Cast("size_t") long K(); public native gsl_ran_discrete_t K(long K);
    public native @Cast("size_t*") SizeTPointer A(); public native gsl_ran_discrete_t A(SizeTPointer A);
    public native DoublePointer F(); public native gsl_ran_discrete_t F(DoublePointer F);
}