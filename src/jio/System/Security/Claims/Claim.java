package jio.System.Security.Claims;

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
import jio.System.Security.Claims.*;
import jio.System.IO.*;

public class Claim {
  public NObject javonetHandle;

  public Claim(BinaryReader reader) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.Claim", reader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(BinaryReader reader, ClaimsIdentity subject) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.Claim", reader, subject);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(java.lang.String type, java.lang.String value) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.Claim", type, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(java.lang.String type, java.lang.String value, java.lang.String valueType) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.Claim", type, value, valueType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(
      java.lang.String type,
      java.lang.String value,
      java.lang.String valueType,
      java.lang.String issuer) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.Claim", type, value, valueType, issuer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(
      java.lang.String type,
      java.lang.String value,
      java.lang.String valueType,
      java.lang.String issuer,
      java.lang.String originalIssuer) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Claims.Claim", type, value, valueType, issuer, originalIssuer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(
      java.lang.String type,
      java.lang.String value,
      java.lang.String valueType,
      java.lang.String issuer,
      java.lang.String originalIssuer,
      ClaimsIdentity subject) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Claims.Claim",
              type,
              value,
              valueType,
              issuer,
              originalIssuer,
              subject);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Claim(NObject handle) {
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
