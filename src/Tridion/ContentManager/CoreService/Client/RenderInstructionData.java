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
import jio.System.*;

public class RenderInstructionData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionData(ExtensionDataObject value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IExtensibleDataObject")
          .invoke("set_ExtensionData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtensionDataObject getExtensionData() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.Serialization.IExtensibleDataObject")
              .invoke("get_ExtensionData");
      if (res == null) return null;
      return new ExtensionDataObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBinaryStoragePath(java.lang.String value) {
    try {
      javonetHandle.set("BinaryStoragePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBinaryStoragePath() {
    try {
      java.lang.String res = javonetHandle.get("BinaryStoragePath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionXml(java.lang.String value) {
    try {
      javonetHandle.set("ExtensionXml", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getExtensionXml() {
    try {
      java.lang.String res = javonetHandle.get("ExtensionXml");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRenderMode(Nullable<RenderMode> value) {
    try {
      javonetHandle.set("RenderMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<RenderMode> getRenderMode() {
    try {
      Object res = javonetHandle.<NObject>get("RenderMode");
      if (res == null) return null;
      return new Nullable<RenderMode>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RenderInstructionData() {
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.RenderInstructionData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RenderInstructionData(NObject handle) {
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
