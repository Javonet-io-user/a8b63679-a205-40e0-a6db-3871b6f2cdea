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
import jio.System.*;
import Tridion.ContentManager.CoreService.Client.*;
import jio.System.ServiceModel.*;
import jio.System.ServiceModel.Channels.*;

public interface ISessionAwareCoreServiceChannel
    extends ISessionAwareCoreService,
        IClientChannel,
        IContextChannel,
        IChannel,
        ICommunicationObject,
        IExtensibleObject<IContextChannel>,
        IDisposable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Dispose();
}
