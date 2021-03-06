// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MoveArmTrajectory extends Table {
  public static MoveArmTrajectory getRootAsMoveArmTrajectory(ByteBuffer _bb) { return getRootAsMoveArmTrajectory(_bb, new MoveArmTrajectory()); }
  public static MoveArmTrajectory getRootAsMoveArmTrajectory(ByteBuffer _bb, MoveArmTrajectory obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MoveArmTrajectory __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public grl.flatbuffer.JointState traj(int j) { return traj(new grl.flatbuffer.JointState(), j); }
  public grl.flatbuffer.JointState traj(grl.flatbuffer.JointState obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int trajLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createMoveArmTrajectory(FlatBufferBuilder builder,
      int trajOffset) {
    builder.startObject(1);
    MoveArmTrajectory.addTraj(builder, trajOffset);
    return MoveArmTrajectory.endMoveArmTrajectory(builder);
  }

  public static void startMoveArmTrajectory(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addTraj(FlatBufferBuilder builder, int trajOffset) { builder.addOffset(0, trajOffset, 0); }
  public static int createTrajVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTrajVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMoveArmTrajectory(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

