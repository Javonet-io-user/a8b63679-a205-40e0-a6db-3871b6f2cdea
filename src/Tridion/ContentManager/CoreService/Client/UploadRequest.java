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
import jio.System.IO.*;

public class UploadRequest {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public AccessTokenData getAccessToken() {
    try {
      Object res = javonetHandle.<NObject>get("AccessToken");
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAccessToken(AccessTokenData param) {
    try {
      javonetHandle.set("AccessToken", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getUploadContent() {
    try {
      Object res = javonetHandle.<NObject>get("UploadContent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setUploadContent(Stream param) {
    try {
      javonetHandle.set("UploadContent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadRequest() {
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.UploadRequest");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadRequest(AccessTokenData AccessToken, Stream UploadContent) {
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.UploadRequest",
              AccessToken,
              UploadContent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UploadRequest(NObject handle) {
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
