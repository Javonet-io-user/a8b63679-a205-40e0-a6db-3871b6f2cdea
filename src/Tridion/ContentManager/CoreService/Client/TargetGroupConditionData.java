package Tridion.ContentManager.CoreService.Client;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Tridion.ContentManager.CoreService.Client.*;
import jio.System.Runtime.Serialization.*;

public class TargetGroupConditionData extends ConditionData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTargetGroup(LinkToTargetGroupData value) {
    try {
      javonetHandle.set("TargetGroup", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToTargetGroupData getTargetGroup() {
    try {
      Object res = javonetHandle.<NObject>get("TargetGroup");
      if (res == null) return null;
      return new LinkToTargetGroupData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TargetGroupConditionData() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.TargetGroupConditionData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TargetGroupConditionData(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
