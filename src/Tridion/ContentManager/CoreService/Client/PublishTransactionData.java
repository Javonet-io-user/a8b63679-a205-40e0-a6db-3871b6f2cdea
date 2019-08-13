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

public class PublishTransactionData extends SystemWideObjectData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCreator(LinkToUserData value) {
    try {
      javonetHandle.set("Creator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToUserData getCreator() {
    try {
      Object res = javonetHandle.<NObject>get("Creator");
      if (res == null) return null;
      return new LinkToUserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeployerAction(Nullable<DeployerAction> value) {
    try {
      javonetHandle.set("DeployerAction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DeployerAction> getDeployerAction() {
    try {
      Object res = javonetHandle.<NObject>get("DeployerAction");
      if (res == null) return null;
      return new Nullable<DeployerAction>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHasRenderFailures(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("HasRenderFailures", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getHasRenderFailures() {
    try {
      Object res = javonetHandle.<NObject>get("HasRenderFailures");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInformation(java.lang.String value) {
    try {
      javonetHandle.set("Information", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInformation() {
    try {
      java.lang.String res = javonetHandle.get("Information");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInstruction(PublishInstructionBaseData value) {
    try {
      javonetHandle.set("Instruction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PublishInstructionBaseData getInstruction() {
    try {
      Object res = javonetHandle.<NObject>get("Instruction");
      if (res == null) return null;
      return new PublishInstructionBaseData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItems(LinkToIdentifiableObjectData[] value) {
    try {
      javonetHandle.set("Items", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToIdentifiableObjectData[] getItems(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Items");
      if (res == null) return null;
      return (LinkToIdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPriority(Nullable<PublishPriority> value) {
    try {
      javonetHandle.set("Priority", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<PublishPriority> getPriority() {
    try {
      Object res = javonetHandle.<NObject>get("Priority");
      if (res == null) return null;
      return new Nullable<PublishPriority>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublishContexts(PublishContextData[] value) {
    try {
      javonetHandle.set("PublishContexts", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PublishContextData[] getPublishContexts(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("PublishContexts");
      if (res == null) return null;
      return (PublishContextData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setState(Nullable<PublishTransactionState> value) {
    try {
      javonetHandle.set("State", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<PublishTransactionState> getState() {
    try {
      Object res = javonetHandle.<NObject>get("State");
      if (res == null) return null;
      return new Nullable<PublishTransactionState>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStateChangeDateTime(Nullable<DateTime> value) {
    try {
      javonetHandle.set("StateChangeDateTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getStateChangeDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("StateChangeDateTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsCompleted(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("IsCompleted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIsCompleted() {
    try {
      Object res = javonetHandle.<NObject>get("IsCompleted");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublisherHost(java.lang.String value) {
    try {
      javonetHandle.set("PublisherHost", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPublisherHost() {
    try {
      java.lang.String res = javonetHandle.get("PublisherHost");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  public void setRenderingTime(Nullable<TimeSpan> value) {
    try {
      javonetHandle.set("RenderingTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TimeSpan> getRenderingTime() {
    try {
      Object res = javonetHandle.<NObject>get("RenderingTime");
      if (res == null) return null;
      return new Nullable<TimeSpan>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResolvingTime(Nullable<TimeSpan> value) {
    try {
      javonetHandle.set("ResolvingTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TimeSpan> getResolvingTime() {
    try {
      Object res = javonetHandle.<NObject>get("ResolvingTime");
      if (res == null) return null;
      return new Nullable<TimeSpan>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalExecutionTime(Nullable<TimeSpan> value) {
    try {
      javonetHandle.set("TotalExecutionTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TimeSpan> getTotalExecutionTime() {
    try {
      Object res = javonetHandle.<NObject>get("TotalExecutionTime");
      if (res == null) return null;
      return new Nullable<TimeSpan>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PublishTransactionData() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.PublishTransactionData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PublishTransactionData(NObject handle) {
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
