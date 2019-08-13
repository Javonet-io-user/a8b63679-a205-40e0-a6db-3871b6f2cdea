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

public class TcmSystemPrivileges {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmSystemAdministration() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmSystemAdministration");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmSystemAdministration(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmSystemAdministration", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmApprovalStatusManagement() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmApprovalStatusManagement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmApprovalStatusManagement(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmApprovalStatusManagement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmMultimediaTypeManagement() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmMultimediaTypeManagement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmMultimediaTypeManagement(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmMultimediaTypeManagement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmGroupManagement() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmGroupManagement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmGroupManagement(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmGroupManagement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmSystemPrivilegeManagement() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmSystemPrivilegeManagement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmSystemPrivilegeManagement(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmSystemPrivilegeManagement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmPublishTransactionManagement() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmPublishTransactionManagement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmPublishTransactionManagement(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmPublishTransactionManagement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTcmChildPublicationCreation() {
    try {
      java.lang.String res =
          Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
              .get("TcmChildPublicationCreation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTcmChildPublicationCreation(java.lang.String param) {
    try {
      Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges")
          .set("TcmChildPublicationCreation", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TcmSystemPrivileges() {
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.TcmSystemPrivileges");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TcmSystemPrivileges(NObject handle) {
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
