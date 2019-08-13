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
import jio.System.ServiceModel.Description.*;
import jio.System.ServiceModel.Channels.*;
import jio.System.ServiceModel.*;

public class ServiceEndpoint {
  public NObject javonetHandle;

  public ServiceEndpoint(ContractDescription contract) {
    try {
      javonetHandle = Javonet.New("System.ServiceModel.Description.ServiceEndpoint", contract);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ServiceEndpoint(ContractDescription contract, Binding binding, EndpointAddress address) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ServiceModel.Description.ServiceEndpoint", contract, binding, address);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ServiceEndpoint(NObject handle) {
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
