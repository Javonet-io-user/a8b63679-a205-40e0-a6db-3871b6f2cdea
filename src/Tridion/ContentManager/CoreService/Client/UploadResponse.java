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

public class UploadResponse {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFilePath() {
    try {
      java.lang.String res = javonetHandle.get("FilePath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setFilePath(java.lang.String param) {
    try {
      javonetHandle.set("FilePath", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadResponse() {
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.UploadResponse");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadResponse(java.lang.String FilePath) {
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.UploadResponse", FilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadResponse(NObject handle) {
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
