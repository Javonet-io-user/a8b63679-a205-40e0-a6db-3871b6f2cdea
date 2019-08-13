package jio.System.ServiceModel.Channels;

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
import jio.System.ServiceModel.Channels.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class AddressHeaderCollection extends ReadOnlyCollection<AddressHeader>
    implements jio.System.Collections.Generic.IList<AddressHeader>,
        jio.System.Collections.Generic.ICollection<AddressHeader>,
        jio.System.Collections.Generic.IEnumerable<AddressHeader>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<AddressHeader>,
        IReadOnlyCollection<AddressHeader>,
        Iterable<AddressHeader> {
  protected NObject javonetHandle;

  @Override
  public Iterator<AddressHeader> iterator() {
    return (Iterator<AddressHeader>) this.GetEnumerator();
  }

  public AddressHeaderCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ServiceModel.Channels.AddressHeaderCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AddressHeaderCollection(
      jio.System.Collections.Generic.IEnumerable<AddressHeader> addressHeaders) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.ServiceModel.Channels.AddressHeaderCollection", addressHeaders);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AddressHeaderCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<AddressHeader> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
