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

public class ContractDescription {
  public NObject javonetHandle;

  public ContractDescription(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("System.ServiceModel.Description.ContractDescription", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ContractDescription(java.lang.String name, java.lang.String ns) {
    try {
      javonetHandle = Javonet.New("System.ServiceModel.Description.ContractDescription", name, ns);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ContractDescription(NObject handle) {
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
