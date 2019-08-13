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
import jio.System.ServiceModel.*;
import jio.System.IO.*;
import jio.System.*;
import jio.System.ServiceModel.Channels.*;

public class StreamUploadClient extends ClientBase<IStreamUpload>
    implements ICommunicationObject, IDisposable, IStreamUpload {
  protected NObject javonetHandle;

  public StreamUploadClient() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.StreamUploadClient");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UploadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> handler :
                  _UploadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadBinaryByteArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> handler :
                  _UploadBinaryByteArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryByteArrayCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamUploadClient(java.lang.String endpointConfigurationName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamUploadClient",
              endpointConfigurationName);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UploadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> handler :
                  _UploadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadBinaryByteArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> handler :
                  _UploadBinaryByteArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryByteArrayCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamUploadClient(
      java.lang.String endpointConfigurationName, java.lang.String remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamUploadClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UploadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> handler :
                  _UploadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadBinaryByteArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> handler :
                  _UploadBinaryByteArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryByteArrayCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamUploadClient(
      java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamUploadClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UploadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> handler :
                  _UploadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadBinaryByteArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> handler :
                  _UploadBinaryByteArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryByteArrayCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamUploadClient(Binding binding, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamUploadClient",
              binding,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UploadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> handler :
                  _UploadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadBinaryByteArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> handler :
                  _UploadBinaryByteArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadBinaryByteArrayCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamUploadClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String UploadBinaryContent(AccessTokenData AccessToken, Stream UploadContent) {
    try {
      java.lang.String res =
          javonetHandle.invoke("UploadBinaryContent", AccessToken, UploadContent);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUploadBinaryContent(
      AccessTokenData AccessToken,
      Stream UploadContent,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginUploadBinaryContent", AccessToken, UploadContent, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndUploadBinaryContent(IAsyncResult result) {
    try {
      java.lang.String res = javonetHandle.invoke("EndUploadBinaryContent", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadBinaryContentAsync(AccessTokenData AccessToken, Stream UploadContent) {
    try {
      javonetHandle.invoke("UploadBinaryContentAsync", AccessToken, UploadContent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadBinaryContentAsync(
      AccessTokenData AccessToken, Stream UploadContent, Object userState) {
    try {
      javonetHandle.invoke("UploadBinaryContentAsync", AccessToken, UploadContent, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String UploadBinaryByteArray(
      AccessTokenData accessToken, java.lang.Byte[] data) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke("UploadBinaryByteArray", accessToken, new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUploadBinaryByteArray(
      AccessTokenData accessToken,
      java.lang.Byte[] data,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke(
                  "BeginUploadBinaryByteArray",
                  accessToken,
                  new Object[] {data},
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndUploadBinaryByteArray(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke("EndUploadBinaryByteArray", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadBinaryByteArrayAsync(AccessTokenData accessToken, java.lang.Byte[] data) {
    try {
      javonetHandle.invoke("UploadBinaryByteArrayAsync", accessToken, new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UploadBinaryByteArrayAsync(
      AccessTokenData accessToken, java.lang.Byte[] data, Object userState) {
    try {
      javonetHandle.invoke(
          "UploadBinaryByteArrayAsync", accessToken, new Object[] {data}, userState);
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UploadResponse UploadBinaryContent(UploadRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke("UploadBinaryContent", request);
      if (res == null) return null;
      return new UploadResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUploadBinaryContent(
      UploadRequest request, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke("BeginUploadBinaryContent", request, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UploadResponse IStreamUpload_EndUploadBinaryContent(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamUpload")
              .invoke("EndUploadBinaryContent", result);
      if (res == null) return null;
      return new UploadResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs>>
      _UploadBinaryContentCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs>>();

  public void addUploadBinaryContentCompleted(
      EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> toAdd) {
    _UploadBinaryContentCompletedListeners.add(toAdd);
  }

  public void removeUploadBinaryContentCompleted(
      EventHandlerTEventArgs<UploadBinaryContentCompletedEventArgs> toRemove) {
    _UploadBinaryContentCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs>>
      _UploadBinaryByteArrayCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs>>();

  public void addUploadBinaryByteArrayCompleted(
      EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> toAdd) {
    _UploadBinaryByteArrayCompletedListeners.add(toAdd);
  }

  public void removeUploadBinaryByteArrayCompleted(
      EventHandlerTEventArgs<UploadBinaryByteArrayCompletedEventArgs> toRemove) {
    _UploadBinaryByteArrayCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
