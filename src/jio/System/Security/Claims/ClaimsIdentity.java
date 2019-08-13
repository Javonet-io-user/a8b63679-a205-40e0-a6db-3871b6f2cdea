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
import jio.System.Security.Principal.*;
import jio.System.Collections.Generic.*;
import jio.System.IO.*;

public class ClaimsIdentity implements IIdentity {
  protected NObject javonetHandle;

  public ClaimsIdentity() {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(IIdentity identity) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity", identity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(IEnumerable<Claim> claims) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity", claims);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(java.lang.String authenticationType) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity", authenticationType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(IEnumerable<Claim> claims, java.lang.String authenticationType) {
    try {
      javonetHandle =
          Javonet.New("System.Security.Claims.ClaimsIdentity", claims, authenticationType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(IIdentity identity, IEnumerable<Claim> claims) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity", identity, claims);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(
      java.lang.String authenticationType, java.lang.String nameType, java.lang.String roleType) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Claims.ClaimsIdentity", authenticationType, nameType, roleType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(
      IEnumerable<Claim> claims,
      java.lang.String authenticationType,
      java.lang.String nameType,
      java.lang.String roleType) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Claims.ClaimsIdentity",
              claims,
              authenticationType,
              nameType,
              roleType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(
      IIdentity identity,
      IEnumerable<Claim> claims,
      java.lang.String authenticationType,
      java.lang.String nameType,
      java.lang.String roleType) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Claims.ClaimsIdentity",
              identity,
              claims,
              authenticationType,
              nameType,
              roleType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(BinaryReader reader) {
    try {
      javonetHandle = Javonet.New("System.Security.Claims.ClaimsIdentity", reader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClaimsIdentity(NObject handle) {
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
