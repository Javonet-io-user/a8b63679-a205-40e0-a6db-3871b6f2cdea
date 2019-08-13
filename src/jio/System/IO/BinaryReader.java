package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.Text.*;
import jio.System.*;

public class BinaryReader implements IDisposable {
  protected NObject javonetHandle;

  public BinaryReader(Stream input) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryReader", input);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryReader(Stream input, Encoding encoding) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryReader", input, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryReader(Stream input, Encoding encoding, java.lang.Boolean leaveOpen) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryReader", input, encoding, leaveOpen);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryReader(NObject handle) {
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
