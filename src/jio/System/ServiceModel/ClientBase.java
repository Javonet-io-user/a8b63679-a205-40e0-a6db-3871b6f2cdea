package jio.System.ServiceModel;

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
import jio.System.ServiceModel.*;
import jio.System.*;

public abstract class ClientBase<TChannel> implements ICommunicationObject, IDisposable {
  protected NObject javonetHandle;

  public ClientBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_Closed(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("add_Closed", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_Closed(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("remove_Closed", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_Closing(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("add_Closing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_Closing(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("remove_Closing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_Faulted(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("add_Faulted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_Faulted(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("remove_Faulted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_Opened(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("add_Opened", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_Opened(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("remove_Opened", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_Opening(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("add_Opening", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_Opening(EventHandler value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("remove_Opening", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close(TimeSpan timeout) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("Close", timeout);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginClose(AsyncCallback callback, Object state) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
              .invoke("BeginClose", callback, state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginClose(TimeSpan timeout, AsyncCallback callback, Object state) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
              .invoke("BeginClose", timeout, callback, state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndClose(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("EndClose", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open(TimeSpan timeout) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("Open", timeout);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginOpen(AsyncCallback callback, Object state) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
              .invoke("BeginOpen", callback, state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginOpen(TimeSpan timeout, AsyncCallback callback, Object state) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
              .invoke("BeginOpen", timeout, callback, state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndOpen(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.ICommunicationObject")
          .invoke("EndOpen", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
