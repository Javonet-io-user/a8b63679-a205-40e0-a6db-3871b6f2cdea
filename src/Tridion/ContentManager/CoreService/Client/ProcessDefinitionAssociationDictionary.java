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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class ProcessDefinitionAssociationDictionary
    extends Dictionary<java.lang.String, LinkToProcessDefinitionData>
    implements jio.System.Collections.Generic.IDictionary<
            java.lang.String, LinkToProcessDefinitionData>,
        jio.System.Collections.Generic.ICollection<
            KeyValuePair<java.lang.String, LinkToProcessDefinitionData>>,
        jio.System.Collections.Generic.IEnumerable<
            KeyValuePair<java.lang.String, LinkToProcessDefinitionData>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<java.lang.String, LinkToProcessDefinitionData>,
        IReadOnlyCollection<KeyValuePair<java.lang.String, LinkToProcessDefinitionData>>,
        ISerializable,
        IDeserializationCallback {
  protected NObject javonetHandle;

  public ProcessDefinitionAssociationDictionary() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.ProcessDefinitionAssociationDictionary");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProcessDefinitionAssociationDictionary(NObject handle) {
    super(handle);
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
