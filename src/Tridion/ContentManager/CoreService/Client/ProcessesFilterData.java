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

public class ProcessesFilterData extends WorkflowManagerFilterData
    implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setForPerformer(LinkToUserData value) {
    try {
      javonetHandle.set("ForPerformer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToUserData getForPerformer() {
    try {
      Object res = javonetHandle.<NObject>get("ForPerformer");
      if (res == null) return null;
      return new LinkToUserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForProcessDefinition(LinkToProcessDefinitionData value) {
    try {
      javonetHandle.set("ForProcessDefinition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToProcessDefinitionData getForProcessDefinition() {
    try {
      Object res = javonetHandle.<NObject>get("ForProcessDefinition");
      if (res == null) return null;
      return new LinkToProcessDefinitionData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForRepository(LinkToRepositoryData value) {
    try {
      javonetHandle.set("ForRepository", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToRepositoryData getForRepository() {
    try {
      Object res = javonetHandle.<NObject>get("ForRepository");
      if (res == null) return null;
      return new LinkToRepositoryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProcessType(Nullable<ProcessType> value) {
    try {
      javonetHandle.set("ProcessType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ProcessType> getProcessType() {
    try {
      Object res = javonetHandle.<NObject>get("ProcessType");
      if (res == null) return null;
      return new Nullable<ProcessType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setForSubject(LinkToIdentifiableObjectData value) {
    try {
      javonetHandle.set("ForSubject", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToIdentifiableObjectData getForSubject() {
    try {
      Object res = javonetHandle.<NObject>get("ForSubject");
      if (res == null) return null;
      return new LinkToIdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeWorkflowTypeColumns(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeWorkflowTypeColumns", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeWorkflowTypeColumns() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeWorkflowTypeColumns");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLegacyMode(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("LegacyMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getLegacyMode() {
    try {
      Object res = javonetHandle.<NObject>get("LegacyMode");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWorkflowType(LinkToWorkflowTypeData value) {
    try {
      javonetHandle.set("WorkflowType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToWorkflowTypeData getWorkflowType() {
    try {
      Object res = javonetHandle.<NObject>get("WorkflowType");
      if (res == null) return null;
      return new LinkToWorkflowTypeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeSubjectsColumn(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeSubjectsColumn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeSubjectsColumn() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeSubjectsColumn");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ProcessesFilterData() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.ProcessesFilterData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProcessesFilterData(NObject handle) {
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
