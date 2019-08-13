package jio.System.Xml.Linq;

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
import jio.System.Xml.Linq.*;
import jio.System.*;
import jio.System.Xml.*;
import jio.System.Xml.Serialization.*;
import jio.System.Xml.Schema.*;

public class XElement extends XContainer implements IXmlLineInfo, IXmlSerializable {
  protected NObject javonetHandle;

  public XElement(XName name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XElement", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XElement(XName name, Object content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XElement", name, content);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XElement(XName name, Object[] content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XElement", name, new Object[] {content});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XElement(XElement other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XElement", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XElement(XStreamingElement other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XElement", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XElement(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XmlSchema GetSchema() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
              .invoke("GetSchema");
      if (res == null) return null;
      return new XmlSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadXml(XmlReader reader) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("ReadXml", reader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteXml(XmlWriter writer) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("WriteXml", writer);
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
