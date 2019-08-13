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
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class PublishedItemsFilterData extends PublishingListFilterData
    implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setForPublication(LinkToPublicationData value) {
    try {
      javonetHandle.set("ForPublication", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToPublicationData getForPublication() {
    try {
      Object res = javonetHandle.<NObject>get("ForPublication");
      if (res == null) return null;
      return new LinkToPublicationData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludePathColumn(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludePathColumn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludePathColumn() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludePathColumn");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeTemplates(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeTemplates", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeTemplates() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeTemplates");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublicationTarget(LinkToPublicationTargetData value) {
    try {
      javonetHandle.set("PublicationTarget", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToPublicationTargetData getPublicationTarget() {
    try {
      Object res = javonetHandle.<NObject>get("PublicationTarget");
      if (res == null) return null;
      return new LinkToPublicationTargetData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResultLimit(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.set("ResultLimit", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getResultLimit() {
    try {
      Object res = javonetHandle.<NObject>get("ResultLimit");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTargetType(LinkToTargetTypeData value) {
    try {
      javonetHandle.set("TargetType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToTargetTypeData getTargetType() {
    try {
      Object res = javonetHandle.<NObject>get("TargetType");
      if (res == null) return null;
      return new LinkToTargetTypeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPurpose(java.lang.String value) {
    try {
      javonetHandle.set("Purpose", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPurpose() {
    try {
      java.lang.String res = javonetHandle.get("Purpose");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PublishedItemsFilterData() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.PublishedItemsFilterData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PublishedItemsFilterData(NObject handle) {
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
