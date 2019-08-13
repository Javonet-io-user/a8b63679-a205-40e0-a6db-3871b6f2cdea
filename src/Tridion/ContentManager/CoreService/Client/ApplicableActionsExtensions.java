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

public class ApplicableActionsExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsActionAllowed(
      ApplicableActionsData applicableActions, java.lang.String customAction) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.ApplicableActionsExtensions")
              .invoke("IsActionAllowed", applicableActions, customAction);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsActionAllowed(
      ApplicableActionsData applicableActions, TcmAction tcmAction) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.ApplicableActionsExtensions")
              .invoke("IsActionAllowed", applicableActions, NEnum.fromJavaEnum(tcmAction));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsActionApplicable(
      ApplicableActionsData applicableActions, java.lang.String customAction) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.ApplicableActionsExtensions")
              .invoke("IsActionApplicable", applicableActions, customAction);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsActionApplicable(
      ApplicableActionsData applicableActions, TcmAction tcmAction) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.ApplicableActionsExtensions")
              .invoke("IsActionApplicable", applicableActions, NEnum.fromJavaEnum(tcmAction));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
