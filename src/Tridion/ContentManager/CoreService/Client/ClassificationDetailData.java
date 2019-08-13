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

public class ClassificationDetailData implements IExtensibleDataObject {
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
  public void setCategory(LinkToCategoryData value) {
    try {
      javonetHandle.set("Category", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToCategoryData getCategory() {
    try {
      Object res = javonetHandle.<NObject>get("Category");
      if (res == null) return null;
      return new LinkToCategoryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFieldName(java.lang.String value) {
    try {
      javonetHandle.set("FieldName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFieldName() {
    try {
      java.lang.String res = javonetHandle.get("FieldName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsMetadataField(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsMetadataField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsMetadataField() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsMetadataField");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setKeywords(LinkToKeywordData[] value) {
    try {
      javonetHandle.set("Keywords", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToKeywordData[] getKeywords(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Keywords");
      if (res == null) return null;
      return (LinkToKeywordData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXPath(java.lang.String value) {
    try {
      javonetHandle.set("XPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getXPath() {
    try {
      java.lang.String res = javonetHandle.get("XPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ClassificationDetailData() {
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.ClassificationDetailData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassificationDetailData(NObject handle) {
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
