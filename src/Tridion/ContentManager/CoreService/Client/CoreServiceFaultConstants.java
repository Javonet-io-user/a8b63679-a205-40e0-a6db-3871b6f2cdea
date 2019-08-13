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

public class CoreServiceFaultConstants {
  protected NObject javonetHandle;

  public CoreServiceFaultConstants() {
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.CoreServiceFaultConstants");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceFaultConstants(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class Exceptions {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAccessTokenExpiredExceptionName() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
                .get("AccessTokenExpiredExceptionName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAccessTokenExpiredExceptionName(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
            .set("AccessTokenExpiredExceptionName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidAccessTokenExceptionName() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
                .get("InvalidAccessTokenExceptionName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidAccessTokenExceptionName(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
            .set("InvalidAccessTokenExceptionName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getValidationExceptionName() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
                .get("ValidationExceptionName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setValidationExceptionName(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.Exceptions")
            .set("ValidationExceptionName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Exceptions() {
      try {
        javonetHandle =
            Javonet.New(
                "Tridion.ContentManager.CoreService.Client.CoreServiceFaultConstants+Exceptions");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Exceptions(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class TcmErrorCodes {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidURL() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidURL");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidURL(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidURL", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsCheckedOutByOtherUser() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsCheckedOutByOtherUser");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsCheckedOutByOtherUser(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsCheckedOutByOtherUser", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getPermissionDenied() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("PermissionDenied");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setPermissionDenied(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("PermissionDenied", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUniquenessConflict() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UniquenessConflict");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUniquenessConflict(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UniquenessConflict", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getFeatureNotSupported() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("FeatureNotSupported");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setFeatureNotSupported(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("FeatureNotSupported", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidPropertyChange() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidPropertyChange");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidPropertyChange(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidPropertyChange", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAccessDenied() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AccessDenied");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAccessDenied(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AccessDenied", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAssertFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AssertFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAssertFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AssertFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCannotPasteHere() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CannotPasteHere");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCannotPasteHere(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CannotPasteHere", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCircularLinkDetected() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CircularLinkDetected");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCircularLinkDetected(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CircularLinkDetected", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getConversion() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("Conversion");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setConversion(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("Conversion", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getDirectoryCannotBeEmpty() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("DirectoryCannotBeEmpty");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setDirectoryCannotBeEmpty(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("DirectoryCannotBeEmpty", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getDuplicateFieldNames() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("DuplicateFieldNames");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setDuplicateFieldNames(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("DuplicateFieldNames", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getElementNotFound() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ElementNotFound");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setElementNotFound(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ElementNotFound", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getEventFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("EventFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setEventFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("EventFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getFieldDoesNotExist() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("FieldDoesNotExist");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setFieldDoesNotExist(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("FieldDoesNotExist", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getFileNotFound() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("FileNotFound");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setFileNotFound(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("FileNotFound", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidAction() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidAction");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidAction(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidAction", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidAssignment() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidAssignment");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidAssignment(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidAssignment", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidBlueprint() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidBlueprint");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidBlueprint(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidBlueprint", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidCharacters() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidCharacters");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidCharacters(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidCharacters", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidCodePage() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidCodePage");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidCodePage(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidCodePage", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidComponentPresentation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidComponentPresentation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidComponentPresentation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidComponentPresentation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidDateFormat() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidDateFormat");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidDateFormat(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidDateFormat", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidDestination() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidDestination");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidDestination(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidDestination", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidFtpRequest() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidFtpRequest");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidFtpRequest(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidFtpRequest", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidGroupMembership() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidGroupMembership");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidGroupMembership(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidGroupMembership", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidInclude() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidInclude");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidInclude(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidInclude", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidIndex() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidIndex");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidIndex(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidIndex", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidInheritanceRoot() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidInheritanceRoot");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidInheritanceRoot(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidInheritanceRoot", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidNamespace() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidNamespace");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidNamespace(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidNamespace", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidNumberFormat() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidNumberFormat");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidNumberFormat(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidNumberFormat", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidParameter() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidParameter");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidParameter(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidParameter", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidPath() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidPath");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidPath(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidPath", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidPermissions() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidPermissions");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidPermissions(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidPermissions", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidProtocol() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidProtocol");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidProtocol(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidProtocol", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidSchema() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidSchema");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidSchema(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidSchema", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidSchemaPurpose() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidSchemaPurpose");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidSchemaPurpose(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidSchemaPurpose", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidSearchFolderConfiguration() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidSearchFolderConfiguration");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidSearchFolderConfiguration(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidSearchFolderConfiguration", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidTargetGroupLink() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidTargetGroupLink");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidTargetGroupLink(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidTargetGroupLink", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidTrusteeScope() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidTrusteeScope");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidTrusteeScope(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidTrusteeScope", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidURI() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidURI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidURI(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidURI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidVersion() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidVersion");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidVersion(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidVersion", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidXML() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidXML");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidXML(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidXML", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidXSD() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidXSD");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidXSD(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidXSD", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemAlreadyExists() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemAlreadyExists");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemAlreadyExists(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemAlreadyExists", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemDoesNotExist() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemDoesNotExist");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemDoesNotExist(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemDoesNotExist", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsBlueprintParent() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsBlueprintParent");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsBlueprintParent(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsBlueprintParent", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsCheckedOut() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsCheckedOut");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsCheckedOut(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsCheckedOut", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsInUse() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsInUse");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsInUse(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsInUse", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsInWorkflow() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsInWorkflow");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsInWorkflow(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsInWorkflow", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsLocalized() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsLocalized");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsLocalized(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsLocalized", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsNotCheckedOut() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsNotCheckedOut");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsNotCheckedOut(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsNotCheckedOut", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsNotLocalized() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsNotLocalized");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsNotLocalized(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsNotLocalized", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsPublished() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsPublished");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsPublished(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsPublished", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsShared() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsShared");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsShared(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsShared", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMissingAttribute() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MissingAttribute");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMissingAttribute(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MissingAttribute", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMissingElementOrType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MissingElementOrType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMissingElementOrType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MissingElementOrType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMixedLanguages() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MixedLanguages");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMixedLanguages(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MixedLanguages", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNoMultimedia() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NoMultimedia");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNoMultimedia(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NoMultimedia", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNoPrivileges() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NoPrivileges");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNoPrivileges(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NoPrivileges", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNoScriptEndMarker() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NoScriptEndMarker");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNoScriptEndMarker(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NoScriptEndMarker", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNumericalOperandRequired() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NumericalOperandRequired");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNumericalOperandRequired(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NumericalOperandRequired", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getRecursiveCallDetected() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("RecursiveCallDetected");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setRecursiveCallDetected(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("RecursiveCallDetected", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getReservedFileExtension() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ReservedFileExtension");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setReservedFileExtension(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ReservedFileExtension", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getRootOrgItemAlreadyExists() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("RootOrgItemAlreadyExists");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setRootOrgItemAlreadyExists(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("RootOrgItemAlreadyExists", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getSchemaDoesNotExist() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("SchemaDoesNotExist");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSchemaDoesNotExist(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("SchemaDoesNotExist", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getSQLException() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("SQLException");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSQLException(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("SQLException", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTrusteeIsPredefined() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("TrusteeIsPredefined");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTrusteeIsPredefined(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("TrusteeIsPredefined", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTypeMismatch() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("TypeMismatch");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTypeMismatch(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("TypeMismatch", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToDownload() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToDownload");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToDownload(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToDownload", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToOpenInternetConnection() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToOpenInternetConnection");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToOpenInternetConnection(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToOpenInternetConnection", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToTransform() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToTransform");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToTransform(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToTransform", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedElement() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedElement");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedElement(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedElement", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedFieldType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedFieldType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedFieldType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedFieldType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedFileExtension() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedFileExtension");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedFileExtension(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedFileExtension", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedItemType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedItemType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedItemType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedItemType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedListType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedListType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedListType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedListType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedMultimediaType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedMultimediaType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedMultimediaType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedMultimediaType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedRootElement() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedRootElement");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedRootElement(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedRootElement", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnsupportedTargetLanguage() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnsupportedTargetLanguage");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnsupportedTargetLanguage(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnsupportedTargetLanguage", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getVersionDoesNotExist() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("VersionDoesNotExist");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setVersionDoesNotExist(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("VersionDoesNotExist", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getWrongApprovalStatus() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("WrongApprovalStatus");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setWrongApprovalStatus(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("WrongApprovalStatus", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getIncorrectConfiguration() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("IncorrectConfiguration");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setIncorrectConfiguration(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("IncorrectConfiguration", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCachingNotActive() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CachingNotActive");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCachingNotActive(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CachingNotActive", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidActivityState() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidActivityState");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidActivityState(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidActivityState", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidActivityType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidActivityType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidActivityType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidActivityType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidNextActivity() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidNextActivity");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidNextActivity(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidNextActivity", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getADOConnectionError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ADOConnectionError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setADOConnectionError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ADOConnectionError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getFeatureNotImplemented() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("FeatureNotImplemented");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setFeatureNotImplemented(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("FeatureNotImplemented", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getGeneralError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("GeneralError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setGeneralError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("GeneralError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnsupportedFileSize() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnsupportedFileSize");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnsupportedFileSize(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnsupportedFileSize", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getPublishInProgress() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("PublishInProgress");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setPublishInProgress(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("PublishInProgress", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getLicenseViolation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("LicenseViolation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setLicenseViolation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("LicenseViolation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidLicense() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidLicense");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidLicense(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidLicense", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getLicensedProductNotFound() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("LicensedProductNotFound");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setLicensedProductNotFound(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("LicensedProductNotFound", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToRenderPage() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToRenderPage");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToRenderPage(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToRenderPage", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToRenderComponent() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToRenderComponent");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToRenderComponent(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToRenderComponent", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsInUseNoWhereUsed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsInUseNoWhereUsed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsInUseNoWhereUsed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsInUseNoWhereUsed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToExecuteEvent() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToExecuteEvent");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToExecuteEvent(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToExecuteEvent", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnableToDeleteRootSgOfParent() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnableToDeleteRootSgOfParent");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnableToDeleteRootSgOfParent(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnableToDeleteRootSgOfParent", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getSearchError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("SearchError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSearchError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("SearchError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownCacheLevel() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownCacheLevel");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownCacheLevel(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownCacheLevel", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownCacheLifetime() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownCacheLifetime");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownCacheLifetime(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownCacheLifetime", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTooManyResults() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("TooManyResults");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTooManyResults(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("TooManyResults", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getGeneralTypeRegistrationError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("GeneralTypeRegistrationError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setGeneralTypeRegistrationError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("GeneralTypeRegistrationError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownPublicationTypeId() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownPublicationTypeId");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownPublicationTypeId(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownPublicationTypeId", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownPublicationTypeName() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownPublicationTypeName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownPublicationTypeName(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownPublicationTypeName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMissingTypeRegistryConfigurationError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MissingTypeRegistryConfigurationError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMissingTypeRegistryConfigurationError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MissingTypeRegistryConfigurationError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidSchemaFieldValue() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidSchemaFieldValue");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidSchemaFieldValue(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidSchemaFieldValue", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidPropertyValue() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidPropertyValue");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidPropertyValue(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidPropertyValue", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidContextRepository() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidContextRepository");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidContextRepository(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidContextRepository", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsLockedByOtherUser() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsLockedByOtherUser");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsLockedByOtherUser(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsLockedByOtherUser", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsNotLocked() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsNotLocked");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsNotLocked(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsNotLocked", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsLocked() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsLocked");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsLocked(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsLocked", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNotImplemented() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NotImplemented");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNotImplemented(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NotImplemented", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getDeleteFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("DeleteFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setDeleteFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("DeleteFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getPublicationParentsChangeDenied() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("PublicationParentsChangeDenied");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setPublicationParentsChangeDenied(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("PublicationParentsChangeDenied", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemCanBeCheckedInByWorkflow() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemCanBeCheckedInByWorkflow");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemCanBeCheckedInByWorkflow(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemCanBeCheckedInByWorkflow", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getWorkflowNotSupported() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("WorkflowNotSupported");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setWorkflowNotSupported(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("WorkflowNotSupported", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidState() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidState");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidState(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidState", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidWorkflowType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidWorkflowType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidWorkflowType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidWorkflowType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidOwner() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidOwner");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidOwner(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidOwner", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsReserved() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsReserved");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsReserved(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsReserved", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getClassificationConstraintViolation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ClassificationConstraintViolation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setClassificationConstraintViolation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ClassificationConstraintViolation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getLocationConstraintViolation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("LocationConstraintViolation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setLocationConstraintViolation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("LocationConstraintViolation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getOccurenceConstraintViolation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("OccurenceConstraintViolation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setOccurenceConstraintViolation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("OccurenceConstraintViolation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTypeConstraintViolation() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("TypeConstraintViolation");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTypeConstraintViolation(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("TypeConstraintViolation", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnexpectedRegion() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnexpectedRegion");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnexpectedRegion(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnexpectedRegion", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMissingRegion() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MissingRegion");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMissingRegion(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MissingRegion", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidRegion() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidRegion");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidRegion(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidRegion", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getFileInUse() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("FileInUse");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setFileInUse(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("FileInUse", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidMapping() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidMapping");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidMapping(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidMapping", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemModificationDetected() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemModificationDetected");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemModificationDetected(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemModificationDetected", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMissingDependency() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MissingDependency");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMissingDependency(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MissingDependency", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getProcessAborted() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ProcessAborted");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setProcessAborted(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ProcessAborted", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getImportExportException() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ImportExportException");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setImportExportException(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ImportExportException", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTimeout() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("Timeout");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTimeout(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("Timeout", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getProblemDiscovered() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ProblemDiscovered");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setProblemDiscovered(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ProblemDiscovered", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getTopologyManagerException() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("TopologyManagerException");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setTopologyManagerException(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("TopologyManagerException", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCdEnvironmentDoesNotHaveDeployerCapability() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CdEnvironmentDoesNotHaveDeployerCapability");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCdEnvironmentDoesNotHaveDeployerCapability(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CdEnvironmentDoesNotHaveDeployerCapability", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCdEnvironmentDoesNotHavePreviewWebServiceCapability() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CdEnvironmentDoesNotHavePreviewWebServiceCapability");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCdEnvironmentDoesNotHavePreviewWebServiceCapability(
        java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CdEnvironmentDoesNotHavePreviewWebServiceCapability", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAuthenticationFailureInCdDiscoveryService() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AuthenticationFailureInCdDiscoveryService");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAuthenticationFailureInCdDiscoveryService(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AuthenticationFailureInCdDiscoveryService", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCommunicationErrorWithCdDiscoveryService() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CommunicationErrorWithCdDiscoveryService");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCommunicationErrorWithCdDiscoveryService(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CommunicationErrorWithCdDiscoveryService", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAuthenticationFailureInTopologyManager() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AuthenticationFailureInTopologyManager");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAuthenticationFailureInTopologyManager(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AuthenticationFailureInTopologyManager", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCommunicationErrorWithTopologyManager() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CommunicationErrorWithTopologyManager");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCommunicationErrorWithTopologyManager(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CommunicationErrorWithTopologyManager", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getNoMappingFoundInTopologyManager() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("NoMappingFoundInTopologyManager");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setNoMappingFoundInTopologyManager(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("NoMappingFoundInTopologyManager", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemHasPublishedItems() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemHasPublishedItems");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemHasPublishedItems(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemHasPublishedItems", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAccessTokenExpired() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AccessTokenExpired");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAccessTokenExpired(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AccessTokenExpired", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAccessTokenEmptySignature() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AccessTokenEmptySignature");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAccessTokenEmptySignature(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AccessTokenEmptySignature", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getAccessTokenInvalidSignature() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("AccessTokenInvalidSignature");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setAccessTokenInvalidSignature(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("AccessTokenInvalidSignature", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getCdEnvironmentIsOffline() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("CdEnvironmentIsOffline");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setCdEnvironmentIsOffline(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("CdEnvironmentIsOffline", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getItemIsNotLocalInPublication() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ItemIsNotLocalInPublication");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setItemIsNotLocalInPublication(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ItemIsNotLocalInPublication", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getOrgItemIsNotLocalInPublication() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("OrgItemIsNotLocalInPublication");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setOrgItemIsNotLocalInPublication(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("OrgItemIsNotLocalInPublication", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getPromoteDestinationIsInvalid() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("PromoteDestinationIsInvalid");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setPromoteDestinationIsInvalid(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("PromoteDestinationIsInvalid", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getPromoteValidationFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("PromoteValidationFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setPromoteValidationFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("PromoteValidationFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getDemoteDestinationIsInvalid() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("DemoteDestinationIsInvalid");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setDemoteDestinationIsInvalid(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("DemoteDestinationIsInvalid", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getDemoteValidationFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("DemoteValidationFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setDemoteValidationFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("DemoteValidationFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getValidationWarning() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ValidationWarning");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setValidationWarning(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ValidationWarning", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getValidationError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ValidationError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setValidationError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ValidationError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMismatchExpectedValueInDb() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MismatchExpectedValueInDb");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMismatchExpectedValueInDb(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MismatchExpectedValueInDb", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getLocalizeValidationFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("LocalizeValidationFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setLocalizeValidationFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("LocalizeValidationFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnLocalizeValidationFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnLocalizeValidationFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnLocalizeValidationFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnLocalizeValidationFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getMoveValidationFailed() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("MoveValidationFailed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setMoveValidationFailed(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("MoveValidationFailed", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownVFType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownVFType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownVFType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownVFType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getClassNotRegistered() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("ClassNotRegistered");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setClassNotRegistered(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("ClassNotRegistered", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidFilterCondition() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidFilterCondition");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidFilterCondition(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidFilterCondition", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidConditionType() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidConditionType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidConditionType(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidConditionType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getInvalidConditionOperator() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("InvalidConditionOperator");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setInvalidConditionOperator(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("InvalidConditionOperator", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getGeneralTemplateTypeError() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("GeneralTemplateTypeError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setGeneralTemplateTypeError(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("GeneralTemplateTypeError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.String getUnknownTemplateTypeName() {
      try {
        java.lang.String res =
            Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
                .get("UnknownTemplateTypeName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUnknownTemplateTypeName(java.lang.String param) {
      try {
        Javonet.getType("Tridion.ContentManager.CoreService.Client.TcmErrorCodes")
            .set("UnknownTemplateTypeName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TcmErrorCodes() {
      try {
        javonetHandle =
            Javonet.New(
                "Tridion.ContentManager.CoreService.Client.CoreServiceFaultConstants+TcmErrorCodes");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TcmErrorCodes(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
