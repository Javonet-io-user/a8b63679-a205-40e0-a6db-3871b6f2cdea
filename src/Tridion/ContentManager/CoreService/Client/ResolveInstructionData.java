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

public class ResolveInstructionData implements IExtensibleDataObject {
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
  public void setIncludeChildPublications(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeChildPublications", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeChildPublications() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeChildPublications");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeComponentLinks(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeComponentLinks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeComponentLinks() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeComponentLinks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeWorkflow(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeWorkflow", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeWorkflow() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeWorkflow");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPurpose(Nullable<ResolvePurpose> value) {
    try {
      javonetHandle.set("Purpose", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ResolvePurpose> getPurpose() {
    try {
      Object res = javonetHandle.<NObject>get("Purpose");
      if (res == null) return null;
      return new Nullable<ResolvePurpose>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStructureResolveOption(StructureResolveOption value) {
    try {
      javonetHandle.set("StructureResolveOption", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StructureResolveOption getStructureResolveOption() {
    try {
      Object res = javonetHandle.<NEnum>get("StructureResolveOption");
      if (res == null) return null;
      return StructureResolveOption.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeDynamicVersion(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("IncludeDynamicVersion", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIncludeDynamicVersion() {
    try {
      Object res = javonetHandle.<NObject>get("IncludeDynamicVersion");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ResolveInstructionData() {
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.ResolveInstructionData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ResolveInstructionData(NObject handle) {
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
