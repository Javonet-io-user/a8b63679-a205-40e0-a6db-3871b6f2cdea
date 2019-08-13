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

public class RegionData implements IExtensibleDataObject {
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
  public void setComponentPresentations(ComponentPresentationData[] value) {
    try {
      javonetHandle.set("ComponentPresentations", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ComponentPresentationData[] getComponentPresentations(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ComponentPresentations");
      if (res == null) return null;
      return (ComponentPresentationData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMetadata(java.lang.String value) {
    try {
      javonetHandle.set("Metadata", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMetadata() {
    try {
      java.lang.String res = javonetHandle.get("Metadata");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRegionSchema(LinkToSchemaData value) {
    try {
      javonetHandle.set("RegionSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToSchemaData getRegionSchema() {
    try {
      Object res = javonetHandle.<NObject>get("RegionSchema");
      if (res == null) return null;
      return new LinkToSchemaData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRegions(RegionDictionary value) {
    try {
      javonetHandle.set("Regions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RegionDictionary getRegions() {
    try {
      Object res = javonetHandle.<NObject>get("Regions");
      if (res == null) return null;
      return new RegionDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RegionData() {
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.RegionData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RegionData(NObject handle) {
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
