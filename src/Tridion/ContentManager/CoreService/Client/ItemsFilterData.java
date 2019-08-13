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

public class ItemsFilterData extends SubjectRelatedListFilterData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setComponentTypes(ComponentType[] value) {
    try {
      javonetHandle.set("ComponentTypes", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ComponentType[] getComponentTypes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ComponentTypes");
      if (res == null) return null;
      return (ComponentType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeRelativeWebDavUrlColumn(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("IncludeRelativeWebDavUrlColumn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIncludeRelativeWebDavUrlColumn() {
    try {
      Object res = javonetHandle.<NObject>get("IncludeRelativeWebDavUrlColumn");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemTypes(ItemType[] value) {
    try {
      javonetHandle.set("ItemTypes", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ItemType[] getItemTypes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ItemTypes");
      if (res == null) return null;
      return (ItemType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLockFilter(Nullable<LockType> value) {
    try {
      javonetHandle.set("LockFilter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<LockType> getLockFilter() {
    try {
      Object res = javonetHandle.<NObject>get("LockFilter");
      if (res == null) return null;
      return new Nullable<LockType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLockResult(Nullable<LockType> value) {
    try {
      javonetHandle.set("LockResult", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<LockType> getLockResult() {
    try {
      Object res = javonetHandle.<NObject>get("LockResult");
      if (res == null) return null;
      return new Nullable<LockType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRecursive(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("Recursive", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getRecursive() {
    try {
      Object res = javonetHandle.<NObject>get("Recursive");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSchemaPurposes(SchemaPurpose[] value) {
    try {
      javonetHandle.set("SchemaPurposes", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SchemaPurpose[] getSchemaPurposes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("SchemaPurposes");
      if (res == null) return null;
      return (SchemaPurpose[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeDescriptionColumn(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeDescriptionColumn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeDescriptionColumn() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeDescriptionColumn");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowDynamicVersionIfReadableByUser(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("ShowDynamicVersionIfReadableByUser", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getShowDynamicVersionIfReadableByUser() {
    try {
      Object res = javonetHandle.<NObject>get("ShowDynamicVersionIfReadableByUser");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ItemsFilterData() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.ItemsFilterData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemsFilterData(NObject handle) {
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
