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

public class StreamDownloadClient extends ClientBase<IStreamDownload>
    implements ICommunicationObject, IDisposable, IStreamDownload {
  protected NObject javonetHandle;

  public StreamDownloadClient() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.StreamDownloadClient");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> handler :
                  _DownloadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadBinaryContentByUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> handler :
                  _DownloadBinaryContentByUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentByUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRenderedBinaryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> handler :
                  _DownloadRenderedBinaryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRenderedBinaryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadExternalBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> handler :
                  _DownloadExternalBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadExternalBinaryContentCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamDownloadClient(java.lang.String endpointConfigurationName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamDownloadClient",
              endpointConfigurationName);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> handler :
                  _DownloadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadBinaryContentByUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> handler :
                  _DownloadBinaryContentByUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentByUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRenderedBinaryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> handler :
                  _DownloadRenderedBinaryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRenderedBinaryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadExternalBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> handler :
                  _DownloadExternalBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadExternalBinaryContentCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamDownloadClient(
      java.lang.String endpointConfigurationName, java.lang.String remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamDownloadClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> handler :
                  _DownloadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadBinaryContentByUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> handler :
                  _DownloadBinaryContentByUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentByUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRenderedBinaryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> handler :
                  _DownloadRenderedBinaryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRenderedBinaryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadExternalBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> handler :
                  _DownloadExternalBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadExternalBinaryContentCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamDownloadClient(
      java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamDownloadClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> handler :
                  _DownloadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadBinaryContentByUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> handler :
                  _DownloadBinaryContentByUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentByUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRenderedBinaryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> handler :
                  _DownloadRenderedBinaryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRenderedBinaryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadExternalBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> handler :
                  _DownloadExternalBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadExternalBinaryContentCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamDownloadClient(Binding binding, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.StreamDownloadClient",
              binding,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> handler :
                  _DownloadBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadBinaryContentByUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> handler :
                  _DownloadBinaryContentByUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadBinaryContentByUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRenderedBinaryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> handler :
                  _DownloadRenderedBinaryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRenderedBinaryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadExternalBinaryContentCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> handler :
                  _DownloadExternalBinaryContentCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadExternalBinaryContentCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StreamDownloadClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadBinaryContent(java.lang.String itemIdOrTempFileId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("DownloadBinaryContent", itemIdOrTempFileId);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadBinaryContent(
      java.lang.String itemIdOrTempFileId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("BeginDownloadBinaryContent", itemIdOrTempFileId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadBinaryContent(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("EndDownloadBinaryContent", result);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadBinaryContentAsync(java.lang.String itemIdOrTempFileId) {
    try {
      javonetHandle.invoke("DownloadBinaryContentAsync", itemIdOrTempFileId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadBinaryContentAsync(java.lang.String itemIdOrTempFileId, Object userState) {
    try {
      javonetHandle.invoke("DownloadBinaryContentAsync", itemIdOrTempFileId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadBinaryContentByUser(
      java.lang.String itemIdOrTempFileId, AccessTokenData accessToken) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("DownloadBinaryContentByUser", itemIdOrTempFileId, accessToken);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadBinaryContentByUser(
      java.lang.String itemIdOrTempFileId,
      AccessTokenData accessToken,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke(
                  "BeginDownloadBinaryContentByUser",
                  itemIdOrTempFileId,
                  accessToken,
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
  public Stream EndDownloadBinaryContentByUser(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("EndDownloadBinaryContentByUser", result);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadBinaryContentByUserAsync(
      java.lang.String itemIdOrTempFileId, AccessTokenData accessToken) {
    try {
      javonetHandle.invoke("DownloadBinaryContentByUserAsync", itemIdOrTempFileId, accessToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadBinaryContentByUserAsync(
      java.lang.String itemIdOrTempFileId, AccessTokenData accessToken, Object userState) {
    try {
      javonetHandle.invoke(
          "DownloadBinaryContentByUserAsync", itemIdOrTempFileId, accessToken, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadRenderedBinary(java.lang.String path) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("DownloadRenderedBinary", path);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadRenderedBinary(
      java.lang.String path, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("BeginDownloadRenderedBinary", path, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadRenderedBinary(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("EndDownloadRenderedBinary", result);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadRenderedBinaryAsync(java.lang.String path) {
    try {
      javonetHandle.invoke("DownloadRenderedBinaryAsync", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadRenderedBinaryAsync(java.lang.String path, Object userState) {
    try {
      javonetHandle.invoke("DownloadRenderedBinaryAsync", path, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadExternalBinaryContent(java.lang.String uri) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("DownloadExternalBinaryContent", uri);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadExternalBinaryContent(
      java.lang.String uri, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("BeginDownloadExternalBinaryContent", uri, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadExternalBinaryContent(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.IStreamDownload")
              .invoke("EndDownloadExternalBinaryContent", result);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadExternalBinaryContentAsync(java.lang.String uri) {
    try {
      javonetHandle.invoke("DownloadExternalBinaryContentAsync", uri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DownloadExternalBinaryContentAsync(java.lang.String uri, Object userState) {
    try {
      javonetHandle.invoke("DownloadExternalBinaryContentAsync", uri, userState);
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
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs>>
      _DownloadBinaryContentCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs>>();

  public void addDownloadBinaryContentCompleted(
      EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> toAdd) {
    _DownloadBinaryContentCompletedListeners.add(toAdd);
  }

  public void removeDownloadBinaryContentCompleted(
      EventHandlerTEventArgs<DownloadBinaryContentCompletedEventArgs> toRemove) {
    _DownloadBinaryContentCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs>>
      _DownloadBinaryContentByUserCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs>>();

  public void addDownloadBinaryContentByUserCompleted(
      EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> toAdd) {
    _DownloadBinaryContentByUserCompletedListeners.add(toAdd);
  }

  public void removeDownloadBinaryContentByUserCompleted(
      EventHandlerTEventArgs<DownloadBinaryContentByUserCompletedEventArgs> toRemove) {
    _DownloadBinaryContentByUserCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs>>
      _DownloadRenderedBinaryCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs>>();

  public void addDownloadRenderedBinaryCompleted(
      EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> toAdd) {
    _DownloadRenderedBinaryCompletedListeners.add(toAdd);
  }

  public void removeDownloadRenderedBinaryCompleted(
      EventHandlerTEventArgs<DownloadRenderedBinaryCompletedEventArgs> toRemove) {
    _DownloadRenderedBinaryCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs>>
      _DownloadExternalBinaryContentCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs>>();

  public void addDownloadExternalBinaryContentCompleted(
      EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> toAdd) {
    _DownloadExternalBinaryContentCompletedListeners.add(toAdd);
  }

  public void removeDownloadExternalBinaryContentCompleted(
      EventHandlerTEventArgs<DownloadExternalBinaryContentCompletedEventArgs> toRemove) {
    _DownloadExternalBinaryContentCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
