package jio.System.Collections.ObjectModel;

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
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public abstract class KeyedCollection<TKey, TItem> extends Collection<TItem>
    implements jio.System.Collections.Generic.IList<TItem>,
        jio.System.Collections.Generic.ICollection<TItem>,
        jio.System.Collections.Generic.IEnumerable<TItem>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<TItem>,
        IReadOnlyCollection<TItem>,
        Iterable<TItem> {
  protected NObject javonetHandle;

  @Override
  public Iterator<TItem> iterator() {
    return (Iterator<TItem>) this.GetEnumerator();
  }

  public KeyedCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<TItem> GetEnumerator() {
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
