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

public class PublicationData extends RepositoryData implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setComponentSnapshotTemplate(LinkToComponentTemplateData value) {
    try {
      javonetHandle.set("ComponentSnapshotTemplate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToComponentTemplateData getComponentSnapshotTemplate() {
    try {
      Object res = javonetHandle.<NObject>get("ComponentSnapshotTemplate");
      if (res == null) return null;
      return new LinkToComponentTemplateData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setComponentTemplateProcess(LinkToProcessDefinitionData value) {
    try {
      javonetHandle.set("ComponentTemplateProcess", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToProcessDefinitionData getComponentTemplateProcess() {
    try {
      Object res = javonetHandle.<NObject>get("ComponentTemplateProcess");
      if (res == null) return null;
      return new LinkToProcessDefinitionData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultComponentTemplate(LinkToComponentTemplateData value) {
    try {
      javonetHandle.set("DefaultComponentTemplate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToComponentTemplateData getDefaultComponentTemplate() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultComponentTemplate");
      if (res == null) return null;
      return new LinkToComponentTemplateData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultPageTemplate(LinkToPageTemplateData value) {
    try {
      javonetHandle.set("DefaultPageTemplate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToPageTemplateData getDefaultPageTemplate() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultPageTemplate");
      if (res == null) return null;
      return new LinkToPageTemplateData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultTemplateBuildingBlock(LinkToTemplateBuildingBlockData value) {
    try {
      javonetHandle.set("DefaultTemplateBuildingBlock", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToTemplateBuildingBlockData getDefaultTemplateBuildingBlock() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultTemplateBuildingBlock");
      if (res == null) return null;
      return new LinkToTemplateBuildingBlockData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultimediaPath(java.lang.String value) {
    try {
      javonetHandle.set("MultimediaPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMultimediaPath() {
    try {
      java.lang.String res = javonetHandle.get("MultimediaPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultimediaUrl(java.lang.String value) {
    try {
      javonetHandle.set("MultimediaUrl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMultimediaUrl() {
    try {
      java.lang.String res = javonetHandle.get("MultimediaUrl");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageSnapshotTemplate(LinkToPageTemplateData value) {
    try {
      javonetHandle.set("PageSnapshotTemplate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToPageTemplateData getPageSnapshotTemplate() {
    try {
      Object res = javonetHandle.<NObject>get("PageSnapshotTemplate");
      if (res == null) return null;
      return new LinkToPageTemplateData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageTemplateProcess(LinkToProcessDefinitionData value) {
    try {
      javonetHandle.set("PageTemplateProcess", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToProcessDefinitionData getPageTemplateProcess() {
    try {
      Object res = javonetHandle.<NObject>get("PageTemplateProcess");
      if (res == null) return null;
      return new LinkToProcessDefinitionData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublicationPath(java.lang.String value) {
    try {
      javonetHandle.set("PublicationPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPublicationPath() {
    try {
      java.lang.String res = javonetHandle.get("PublicationPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublicationType(java.lang.String value) {
    try {
      javonetHandle.set("PublicationType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPublicationType() {
    try {
      java.lang.String res = javonetHandle.get("PublicationType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPublicationUrl(java.lang.String value) {
    try {
      javonetHandle.set("PublicationUrl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPublicationUrl() {
    try {
      java.lang.String res = javonetHandle.get("PublicationUrl");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRootStructureGroup(LinkToStructureGroupData value) {
    try {
      javonetHandle.set("RootStructureGroup", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToStructureGroupData getRootStructureGroup() {
    try {
      Object res = javonetHandle.<NObject>get("RootStructureGroup");
      if (res == null) return null;
      return new LinkToStructureGroupData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShareProcessAssociations(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("ShareProcessAssociations", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getShareProcessAssociations() {
    try {
      Object res = javonetHandle.<NObject>get("ShareProcessAssociations");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTemplateBundleProcess(LinkToProcessDefinitionData value) {
    try {
      javonetHandle.set("TemplateBundleProcess", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToProcessDefinitionData getTemplateBundleProcess() {
    try {
      Object res = javonetHandle.<NObject>get("TemplateBundleProcess");
      if (res == null) return null;
      return new LinkToProcessDefinitionData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PublicationData() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.PublicationData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PublicationData(NObject handle) {
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
