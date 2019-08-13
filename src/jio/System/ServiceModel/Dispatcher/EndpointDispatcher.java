package jio.System.ServiceModel.Dispatcher;

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
import jio.System.ServiceModel.Dispatcher.*;
import jio.System.ServiceModel.*;

public class EndpointDispatcher {
  public NObject javonetHandle;

  public EndpointDispatcher(
      EndpointAddress address, java.lang.String contractName, java.lang.String contractNamespace) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ServiceModel.Dispatcher.EndpointDispatcher",
              address,
              contractName,
              contractNamespace);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointDispatcher(
      EndpointAddress address,
      java.lang.String contractName,
      java.lang.String contractNamespace,
      java.lang.Boolean isSystemEndpoint) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ServiceModel.Dispatcher.EndpointDispatcher",
              address,
              contractName,
              contractNamespace,
              isSystemEndpoint);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointDispatcher(NObject handle) {
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
