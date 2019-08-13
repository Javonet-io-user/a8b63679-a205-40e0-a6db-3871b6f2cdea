package jio.System.ServiceModel.Description;

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
import jio.System.ServiceModel.Security.*;
import jio.System.ServiceModel.Description.*;
import jio.System.ServiceModel.Channels.*;
import jio.System.ServiceModel.Dispatcher.*;

public class ClientCredentials extends SecurityCredentialsManager implements IEndpointBehavior {
  protected NObject javonetHandle;

  public ClientCredentials() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ServiceModel.Description.ClientCredentials");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClientCredentials(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Validate(ServiceEndpoint serviceEndpoint) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.Description.IEndpointBehavior")
          .invoke("Validate", serviceEndpoint);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddBindingParameters(
      ServiceEndpoint serviceEndpoint, BindingParameterCollection bindingParameters) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.Description.IEndpointBehavior")
          .invoke("AddBindingParameters", serviceEndpoint, bindingParameters);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ApplyDispatchBehavior(
      ServiceEndpoint serviceEndpoint, EndpointDispatcher endpointDispatcher) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ServiceModel.Description.IEndpointBehavior")
          .invoke("ApplyDispatchBehavior", serviceEndpoint, endpointDispatcher);
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
