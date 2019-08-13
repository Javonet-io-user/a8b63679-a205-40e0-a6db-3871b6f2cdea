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
import jio.System.IO.*;
import jio.System.*;

public interface IStreamDownload {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadBinaryContent(java.lang.String itemIdOrTempFileId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadBinaryContent(
      java.lang.String itemIdOrTempFileId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadBinaryContent(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadBinaryContentByUser(
      java.lang.String itemIdOrTempFileId, AccessTokenData accessToken);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadBinaryContentByUser(
      java.lang.String itemIdOrTempFileId,
      AccessTokenData accessToken,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadBinaryContentByUser(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadRenderedBinary(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadRenderedBinary(
      java.lang.String path, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadRenderedBinary(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DownloadExternalBinaryContent(java.lang.String uri);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDownloadExternalBinaryContent(
      java.lang.String uri, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream EndDownloadExternalBinaryContent(IAsyncResult result);
}
