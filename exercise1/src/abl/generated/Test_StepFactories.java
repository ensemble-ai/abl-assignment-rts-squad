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
public class Test_StepFactories {
   static public Step stepFactory0(int __$stepID, Behavior __$behaviorParent, final Object[] __$behaviorFrame) {
      final Method __$stepFactory = Test.__$stepFactory0_rfield;
      switch (__$stepID) {
         case -3: {
            // default wait step
            return new WaitStepDebug(-3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null);
         }
         case -2: {
            // default fail step
            return new FailStepDebug(-2, __$stepFactory, __$behaviorParent, false, false, false, (short)-32768, (short)0, false, null, null);
         }
         case -1: {
            // default succeed step
            return new SucceedStepDebug(-1, __$stepFactory, __$behaviorParent, false, false, (short)-32768, (short)0, false, null, null);
         }
         case 0: {
            // fireABullet_1Step1
            return new PrimitiveStepDebug(0, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, Test.__$argumentExecute0_rfield, null, null, null, new Fire(), null, "fire");
         }
         case 1: {
            // Wait_1Step1
            return new MentalStepDebug(1, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, Test.__$mentalExecute0_rfield, null, null, null, (byte)2, "Wait_1Step1");
         }
         case 2: {
            // Wait_1Step2
            return new WaitStepDebug(2, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, Test.__$successTest0_rfield, null, null);
         }
         case 3: {
            // Test_RootCollectionBehaviorStep1
            return new MentalStepDebug(3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, Test.__$mentalExecute0_rfield, null, null, null, (byte)2, "Test_RootCollectionBehaviorStep1");
         }
         case 4: {
            // Test_RootCollectionBehaviorStep2
            return new GoalStepDebug(4, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "fireABullet()", null, (short)0);
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
