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
import jio.System.*;

public interface IStreamUpload {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UploadResponse UploadBinaryContent(UploadRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUploadBinaryContent(
      UploadRequest request, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UploadResponse IStreamUpload_EndUploadBinaryContent(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String UploadBinaryByteArray(AccessTokenData accessToken, java.lang.Byte[] data);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUploadBinaryByteArray(
      AccessTokenData accessToken,
      java.lang.Byte[] data,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndUploadBinaryByteArray(IAsyncResult result);
}
