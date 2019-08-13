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

public class ComponentTemplateData extends TemplateData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAllowOnPage(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("AllowOnPage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getAllowOnPage() {
    try {
      Object res = javonetHandle.<NObject>get("AllowOnPage");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setApprovalStatus(LinkToApprovalStatusData value) {
    try {
      javonetHandle.set("ApprovalStatus", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToApprovalStatusData getApprovalStatus() {
    try {
      Object res = javonetHandle.<NObject>get("ApprovalStatus");
      if (res == null) return null;
      return new LinkToApprovalStatusData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDynamicTemplate(java.lang.String value) {
    try {
      javonetHandle.set("DynamicTemplate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDynamicTemplate() {
    try {
      java.lang.String res = javonetHandle.get("DynamicTemplate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsRepositoryPublishable(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("IsRepositoryPublishable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIsRepositoryPublishable() {
    try {
      Object res = javonetHandle.<NObject>get("IsRepositoryPublishable");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOutputFormat(java.lang.String value) {
    try {
      javonetHandle.set("OutputFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOutputFormat() {
    try {
      java.lang.String res = javonetHandle.get("OutputFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPriority(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.set("Priority", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getPriority() {
    try {
      Object res = javonetHandle.<NObject>get("Priority");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRelatedSchemas(LinkToSchemaData[] value) {
    try {
      javonetHandle.set("RelatedSchemas", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToSchemaData[] getRelatedSchemas(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("RelatedSchemas");
      if (res == null) return null;
      return (LinkToSchemaData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTrackingCategories(LinkToCategoryData[] value) {
    try {
      javonetHandle.set("TrackingCategories", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToCategoryData[] getTrackingCategories(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("TrackingCategories");
      if (res == null) return null;
      return (LinkToCategoryData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWorkflowInfo(WorkflowInfo value) {
    try {
      javonetHandle.set("WorkflowInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WorkflowInfo getWorkflowInfo() {
    try {
      Object res = javonetHandle.<NObject>get("WorkflowInfo");
      if (res == null) return null;
      return new WorkflowInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ComponentTemplateData() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.ComponentTemplateData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ComponentTemplateData(NObject handle) {
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
