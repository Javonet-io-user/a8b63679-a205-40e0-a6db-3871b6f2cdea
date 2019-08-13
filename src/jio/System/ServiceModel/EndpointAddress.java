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
import jio.System.ServiceModel.Channels.*;
import jio.System.Xml.*;

public class EndpointAddress {
  public NObject javonetHandle;

  public EndpointAddress(java.lang.String uri) {
    try {
      javonetHandle = Javonet.New("System.ServiceModel.EndpointAddress", uri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointAddress(Uri uri, AddressHeader[] addressHeaders) {
    try {
      javonetHandle =
          Javonet.New("System.ServiceModel.EndpointAddress", uri, new Object[] {addressHeaders});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointAddress(Uri uri, EndpointIdentity identity, AddressHeader[] addressHeaders) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ServiceModel.EndpointAddress", uri, identity, new Object[] {addressHeaders});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointAddress(Uri uri, EndpointIdentity identity, AddressHeaderCollection headers) {
    try {
      javonetHandle = Javonet.New("System.ServiceModel.EndpointAddress", uri, identity, headers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointAddress(
      Uri uri,
      EndpointIdentity identity,
      AddressHeaderCollection headers,
      XmlDictionaryReader metadataReader,
      XmlDictionaryReader extensionReader) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ServiceModel.EndpointAddress",
              uri,
              identity,
              headers,
              metadataReader,
              extensionReader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EndpointAddress(NObject handle) {
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
