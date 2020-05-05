// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A declarative plan for writing fragments to a partitioned directory structure. */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class WritePlan extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WritePlan() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WritePlan(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WritePlan(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WritePlan position(long position) {
        return (WritePlan)super.position(position);
    }

  /** The partitioning with which paths were generated */
  public native @SharedPtr Partitioning partitioning(); public native WritePlan partitioning(Partitioning setter);

  /** The schema of the Dataset which will be written */
  public native @SharedPtr @ByRef Schema schema(); public native WritePlan schema(Schema setter);

  /** The format into which fragments will be written */
  public native @SharedPtr FileFormat format(); public native WritePlan format(FileFormat setter);

  /** The FileSystem and base directory for partitioned writing */
  public native @SharedPtr FileSystem filesystem(); public native WritePlan filesystem(FileSystem setter);
  public native @StdString String partition_base_dir(); public native WritePlan partition_base_dir(String setter);

  /** If fragment_or_partition_expressions[i] is a Fragment, that Fragment will be
   *  written to paths[i]. If it is an Expression, a directory representing that partition
   *  expression will be created at paths[i] instead. */
  
  public native @ByRef StringVector paths(); public native WritePlan paths(StringVector setter);
}