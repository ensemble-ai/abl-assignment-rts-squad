package abl.generated;

import abl.runtime.*;
import wm.WME;
import wm.WorkingMemorySet;
import wm.WMEIndex;
import wm.TrackedWorkingMemory;
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
public class Test_ArgumentStepExecute {
   static public Object[] argumentExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity) {
      switch (__$stepID) {
         case 0: {
            // fireABullet_1Step1
            final Object[] args = new Object[4];
            args[0] = new Integer(0);
            args[1] = new Integer(0);
            args[2] = new Integer(1);
            args[3] = new Integer(1);
            return args;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
