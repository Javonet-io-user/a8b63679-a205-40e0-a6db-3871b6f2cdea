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
import jio.System.ServiceModel.*;
import jio.System.*;
import jio.System.Xml.Linq.*;
import jio.System.ServiceModel.Channels.*;
import jio.System.ComponentModel.*;

public class CoreServiceClient extends ClientBase<ICoreService>
    implements ICommunicationObject, IDisposable, ICoreService {
  protected NObject javonetHandle;

  public CoreServiceClient() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Tridion.ContentManager.CoreService.Client.CoreServiceClient");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs1> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs1> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>
                  handler : _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs1> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DecommissionPublicationTargetCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DecommissionPublicationTargetCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXsdToSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemovePublishStatesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _RemovePublishStatesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveContainingPagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeWorkflowHistoryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeWorkflowHistoryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BroadcastNotificationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _BroadcastNotificationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemPrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs1> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs1> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs1> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs1> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetDefaultDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs1> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs1> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs1> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs1> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs1> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs1> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs1> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs1> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs1> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs1> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs1> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs1> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs1> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SaveApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApplicationIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParsePredefinedBatchOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>
                  handler : _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs1> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs1> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs1> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs1> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ValidateXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsValidTridionWebSchemaXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReIndexCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ReIndexCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastPredefinedQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs1.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceClient(java.lang.String endpointConfigurationName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceClient",
              endpointConfigurationName);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs1> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs1> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>
                  handler : _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs1> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DecommissionPublicationTargetCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DecommissionPublicationTargetCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXsdToSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemovePublishStatesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _RemovePublishStatesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveContainingPagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeWorkflowHistoryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeWorkflowHistoryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BroadcastNotificationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _BroadcastNotificationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemPrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs1> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs1> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs1> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs1> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetDefaultDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs1> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs1> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs1> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs1> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs1> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs1> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs1> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs1> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs1> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs1> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs1> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs1> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs1> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SaveApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApplicationIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParsePredefinedBatchOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>
                  handler : _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs1> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs1> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs1> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs1> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ValidateXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsValidTridionWebSchemaXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReIndexCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ReIndexCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastPredefinedQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs1.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceClient(
      java.lang.String endpointConfigurationName, java.lang.String remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs1> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs1> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>
                  handler : _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs1> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DecommissionPublicationTargetCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DecommissionPublicationTargetCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXsdToSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemovePublishStatesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _RemovePublishStatesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveContainingPagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeWorkflowHistoryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeWorkflowHistoryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BroadcastNotificationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _BroadcastNotificationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemPrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs1> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs1> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs1> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs1> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetDefaultDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs1> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs1> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs1> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs1> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs1> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs1> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs1> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs1> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs1> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs1> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs1> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs1> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs1> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SaveApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApplicationIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParsePredefinedBatchOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>
                  handler : _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs1> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs1> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs1> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs1> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ValidateXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsValidTridionWebSchemaXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReIndexCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ReIndexCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastPredefinedQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs1.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceClient(
      java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs1> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs1> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>
                  handler : _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs1> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DecommissionPublicationTargetCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DecommissionPublicationTargetCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXsdToSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemovePublishStatesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _RemovePublishStatesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveContainingPagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeWorkflowHistoryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeWorkflowHistoryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BroadcastNotificationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _BroadcastNotificationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemPrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs1> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs1> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs1> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs1> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetDefaultDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs1> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs1> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs1> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs1> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs1> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs1> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs1> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs1> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs1> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs1> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs1> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs1> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs1> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SaveApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApplicationIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParsePredefinedBatchOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>
                  handler : _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs1> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs1> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs1> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs1> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ValidateXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsValidTridionWebSchemaXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReIndexCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ReIndexCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastPredefinedQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs1.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceClient(Binding binding, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceClient",
              binding,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs1> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs1> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>
                  handler : _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs1> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DecommissionPublicationTargetCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DecommissionPublicationTargetCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXsdToSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemovePublishStatesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _RemovePublishStatesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveContainingPagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeWorkflowHistoryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeWorkflowHistoryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BroadcastNotificationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _BroadcastNotificationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemPrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs1> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs1> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs1> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs1> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetDefaultDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs1> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs1> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs1> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs1> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs1> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs1> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs1> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs1> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs1> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs1> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs1> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs1> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs1> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SaveApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _DeleteApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApplicationIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _PurgeApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParsePredefinedBatchOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>
                  handler : _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs1> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs1> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs1> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs1> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ValidateXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsValidTridionWebSchemaXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReIndexCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ReIndexCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastPredefinedQueueCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs1.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CastActionsAsync(java.lang.Integer numericActions, Object userState) {
    try {
      javonetHandle.invoke("CastActionsAsync", numericActions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateXml(IdentifiableObjectData data) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("ValidateXml", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginValidateXml(
      IdentifiableObjectData data, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginValidateXml", data, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndValidateXml(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndValidateXml", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateXmlAsync(IdentifiableObjectData data) {
    try {
      javonetHandle.invoke("ValidateXmlAsync", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateXmlAsync(IdentifiableObjectData data, Object userState) {
    try {
      javonetHandle.invoke("ValidateXmlAsync", data, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsValidTridionWebSchemaXml(SchemaData data) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("IsValidTridionWebSchemaXml", data);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsValidTridionWebSchemaXml(
      SchemaData data, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginIsValidTridionWebSchemaXml", data, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsValidTridionWebSchemaXml(IAsyncResult result) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndIsValidTridionWebSchemaXml", result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsValidTridionWebSchemaXmlAsync(SchemaData data) {
    try {
      javonetHandle.invoke("IsValidTridionWebSchemaXmlAsync", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsValidTridionWebSchemaXmlAsync(SchemaData data, Object userState) {
    try {
      javonetHandle.invoke("IsValidTridionWebSchemaXmlAsync", data, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ArrayOfTcmUri GetSubjectIdsWithApplicationData(java.lang.String applicationId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSubjectIdsWithApplicationData", applicationId);
      if (res == null) return null;
      return new ArrayOfTcmUri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSubjectIdsWithApplicationData(
      java.lang.String applicationId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSubjectIdsWithApplicationData", applicationId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ArrayOfTcmUri EndGetSubjectIdsWithApplicationData(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSubjectIdsWithApplicationData", result);
      if (res == null) return null;
      return new ArrayOfTcmUri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSubjectIdsWithApplicationDataAsync(java.lang.String applicationId) {
    try {
      javonetHandle.invoke("GetSubjectIdsWithApplicationDataAsync", applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSubjectIdsWithApplicationDataAsync(
      java.lang.String applicationId, Object userState) {
    try {
      javonetHandle.invoke("GetSubjectIdsWithApplicationDataAsync", applicationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationDataDictionary ReadApplicationDataForSubjectsIds(
      java.lang.String[] subjectIds, java.lang.String[] applicationIds) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "ReadApplicationDataForSubjectsIds",
                  new Object[] {subjectIds},
                  new Object[] {applicationIds});
      if (res == null) return null;
      return new ApplicationDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadApplicationDataForSubjectsIds(
      java.lang.String[] subjectIds,
      java.lang.String[] applicationIds,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginReadApplicationDataForSubjectsIds",
                  new Object[] {subjectIds},
                  new Object[] {applicationIds},
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationDataDictionary EndReadApplicationDataForSubjectsIds(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReadApplicationDataForSubjectsIds", result);
      if (res == null) return null;
      return new ApplicationDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadApplicationDataForSubjectsIdsAsync(
      java.lang.String[] subjectIds, java.lang.String[] applicationIds) {
    try {
      javonetHandle.invoke(
          "ReadApplicationDataForSubjectsIdsAsync",
          new Object[] {subjectIds},
          new Object[] {applicationIds});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadApplicationDataForSubjectsIdsAsync(
      java.lang.String[] subjectIds, java.lang.String[] applicationIds, Object userState) {
    try {
      javonetHandle.invoke(
          "ReadApplicationDataForSubjectsIdsAsync",
          new Object[] {subjectIds},
          new Object[] {applicationIds},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary GetSecurityDescriptorsForSubjectsIds(
      java.lang.String[] subjectIds) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSecurityDescriptorsForSubjectsIds", new Object[] {subjectIds});
      if (res == null) return null;
      return new SecurityDescriptorDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSecurityDescriptorsForSubjectsIds(
      java.lang.String[] subjectIds, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetSecurityDescriptorsForSubjectsIds",
                  new Object[] {subjectIds},
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary EndGetSecurityDescriptorsForSubjectsIds(
      IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSecurityDescriptorsForSubjectsIds", result);
      if (res == null) return null;
      return new SecurityDescriptorDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSecurityDescriptorsForSubjectsIdsAsync(java.lang.String[] subjectIds) {
    try {
      javonetHandle.invoke("GetSecurityDescriptorsForSubjectsIdsAsync", new Object[] {subjectIds});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSecurityDescriptorsForSubjectsIdsAsync(
      java.lang.String[] subjectIds, Object userState) {
    try {
      javonetHandle.invoke(
          "GetSecurityDescriptorsForSubjectsIdsAsync", new Object[] {subjectIds}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary GetContentSecurityDescriptorsForOrgItemIds(
      java.lang.String[] organizationalItemIds) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "GetContentSecurityDescriptorsForOrgItemIds",
                  new Object[] {organizationalItemIds});
      if (res == null) return null;
      return new SecurityDescriptorDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetContentSecurityDescriptorsForOrgItemIds(
      java.lang.String[] organizationalItemIds, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetContentSecurityDescriptorsForOrgItemIds",
                  new Object[] {organizationalItemIds},
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary EndGetContentSecurityDescriptorsForOrgItemIds(
      IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetContentSecurityDescriptorsForOrgItemIds", result);
      if (res == null) return null;
      return new SecurityDescriptorDataDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetContentSecurityDescriptorsForOrgItemIdsAsync(
      java.lang.String[] organizationalItemIds) {
    try {
      javonetHandle.invoke(
          "GetContentSecurityDescriptorsForOrgItemIdsAsync", new Object[] {organizationalItemIds});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetContentSecurityDescriptorsForOrgItemIdsAsync(
      java.lang.String[] organizationalItemIds, Object userState) {
    try {
      javonetHandle.invoke(
          "GetContentSecurityDescriptorsForOrgItemIdsAsync",
          new Object[] {organizationalItemIds},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReIndex(java.lang.String id) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("ReIndex", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReIndex(java.lang.String id, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginReIndex", id, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndReIndex(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndReIndex", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReIndexAsync(java.lang.String id) {
    try {
      javonetHandle.invoke("ReIndexAsync", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReIndexAsync(java.lang.String id, Object userState) {
    try {
      javonetHandle.invoke("ReIndexAsync", id, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedQueue> CastPredefinedQueue(java.lang.Integer queueId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("CastPredefinedQueue", queueId);
      if (res == null) return null;
      return new Nullable<PredefinedQueue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCastPredefinedQueue(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginCastPredefinedQueue", queueId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedQueue> EndCastPredefinedQueue(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCastPredefinedQueue", result);
      if (res == null) return null;
      return new Nullable<PredefinedQueue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CastPredefinedQueueAsync(java.lang.Integer queueId) {
    try {
      javonetHandle.invoke("CastPredefinedQueueAsync", queueId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CastPredefinedQueueAsync(java.lang.Integer queueId, Object userState) {
    try {
      javonetHandle.invoke("CastPredefinedQueueAsync", queueId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PurgeOldVersions(PurgeOldVersionsInstructionData instruction) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("PurgeOldVersions", instruction);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeOldVersions(
      PurgeOldVersionsInstructionData instruction, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginPurgeOldVersions", instruction, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer EndPurgeOldVersions(IAsyncResult result) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndPurgeOldVersions", result);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeOldVersionsAsync(PurgeOldVersionsInstructionData instruction) {
    try {
      javonetHandle.invoke("PurgeOldVersionsAsync", instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeOldVersionsAsync(PurgeOldVersionsInstructionData instruction, Object userState) {
    try {
      javonetHandle.invoke("PurgeOldVersionsAsync", instruction, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement GetListExternalLinks(java.lang.String id) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListExternalLinks", id);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListExternalLinks(
      java.lang.String id, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListExternalLinks", id, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetListExternalLinks(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListExternalLinks", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListExternalLinksAsync(java.lang.String id) {
    try {
      javonetHandle.invoke("GetListExternalLinksAsync", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListExternalLinksAsync(java.lang.String id, Object userState) {
    try {
      javonetHandle.invoke("GetListExternalLinksAsync", id, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SearchQueryData ConvertXmlToSearchQuery(XElement searchQueryXml) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ConvertXmlToSearchQuery", searchQueryXml);
      if (res == null) return null;
      return new SearchQueryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertXmlToSearchQuery(
      XElement searchQueryXml, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginConvertXmlToSearchQuery", searchQueryXml, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SearchQueryData EndConvertXmlToSearchQuery(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndConvertXmlToSearchQuery", result);
      if (res == null) return null;
      return new SearchQueryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertXmlToSearchQueryAsync(XElement searchQueryXml) {
    try {
      javonetHandle.invoke("ConvertXmlToSearchQueryAsync", searchQueryXml);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertXmlToSearchQueryAsync(XElement searchQueryXml, Object userState) {
    try {
      javonetHandle.invoke("ConvertXmlToSearchQueryAsync", searchQueryXml, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement ConvertSearchQueryToXml(SearchQueryData searchQueryData) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ConvertSearchQueryToXml", searchQueryData);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertSearchQueryToXml(
      SearchQueryData searchQueryData, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginConvertSearchQueryToXml", searchQueryData, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndConvertSearchQueryToXml(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndConvertSearchQueryToXml", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertSearchQueryToXmlAsync(SearchQueryData searchQueryData) {
    try {
      javonetHandle.invoke("ConvertSearchQueryToXmlAsync", searchQueryData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertSearchQueryToXmlAsync(SearchQueryData searchQueryData, Object userState) {
    try {
      javonetHandle.invoke("ConvertSearchQueryToXmlAsync", searchQueryData, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData CheckIn(java.lang.String id, ReadOptions readBackOptions) {
    try {
      Object res = javonetHandle.invoke("CheckIn", id, readBackOptions);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData ConvertXsdToSchemaFields(
      XElement xsd, SchemaPurpose purpose, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "ConvertXsdToSchemaFields", xsd, NEnum.fromJavaEnum(purpose), readOptions);
      if (res == null) return null;
      return new SchemaFieldsData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadAllApplicationDataAsync(java.lang.String subjectId) {
    try {
      javonetHandle.invoke("ReadAllApplicationDataAsync", subjectId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadAllApplicationDataAsync(java.lang.String subjectId, Object userState) {
    try {
      javonetHandle.invoke("ReadAllApplicationDataAsync", subjectId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveApplicationData(java.lang.String subjectId, ApplicationData[] applicationData) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("SaveApplicationData", subjectId, new Object[] {applicationData});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSaveApplicationData(
      java.lang.String subjectId,
      ApplicationData[] applicationData,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginSaveApplicationData",
                  subjectId,
                  new Object[] {applicationData},
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndSaveApplicationData(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndSaveApplicationData", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveApplicationDataAsync(
      java.lang.String subjectId, ApplicationData[] applicationData) {
    try {
      javonetHandle.invoke("SaveApplicationDataAsync", subjectId, new Object[] {applicationData});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveApplicationDataAsync(
      java.lang.String subjectId, ApplicationData[] applicationData, Object userState) {
    try {
      javonetHandle.invoke(
          "SaveApplicationDataAsync", subjectId, new Object[] {applicationData}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteApplicationData(java.lang.String subjectId, java.lang.String applicationId) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("DeleteApplicationData", subjectId, applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDeleteApplicationData(
      java.lang.String subjectId,
      java.lang.String applicationId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginDeleteApplicationData", subjectId, applicationId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndDeleteApplicationData(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndDeleteApplicationData", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteApplicationDataAsync(
      java.lang.String subjectId, java.lang.String applicationId) {
    try {
      javonetHandle.invoke("DeleteApplicationDataAsync", subjectId, applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteApplicationDataAsync(
      java.lang.String subjectId, java.lang.String applicationId, Object userState) {
    try {
      javonetHandle.invoke("DeleteApplicationDataAsync", subjectId, applicationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetApplicationIds(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetApplicationIds");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetApplicationIds(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetApplicationIds", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] EndGetApplicationIds(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetApplicationIds", result);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetApplicationIdsAsync() {
    try {
      javonetHandle.invoke("GetApplicationIdsAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetApplicationIdsAsync(Object userState) {
    try {
      javonetHandle.invoke("GetApplicationIdsAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeApplicationData(java.lang.String applicationId) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("PurgeApplicationData", applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeApplicationData(
      java.lang.String applicationId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginPurgeApplicationData", applicationId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeApplicationData(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndPurgeApplicationData", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeApplicationDataAsync(java.lang.String applicationId) {
    try {
      javonetHandle.invoke("PurgeApplicationDataAsync", applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeApplicationDataAsync(java.lang.String applicationId, Object userState) {
    try {
      javonetHandle.invoke("PurgeApplicationDataAsync", applicationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedBatchOperation> ParsePredefinedBatchOperation(
      java.lang.String operation) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ParsePredefinedBatchOperation", operation);
      if (res == null) return null;
      return new Nullable<PredefinedBatchOperation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginParsePredefinedBatchOperation(
      java.lang.String operation, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginParsePredefinedBatchOperation", operation, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedBatchOperation> EndParsePredefinedBatchOperation(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndParsePredefinedBatchOperation", result);
      if (res == null) return null;
      return new Nullable<PredefinedBatchOperation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ParsePredefinedBatchOperationAsync(java.lang.String operation) {
    try {
      javonetHandle.invoke("ParsePredefinedBatchOperationAsync", operation);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ParsePredefinedBatchOperationAsync(java.lang.String operation, Object userState) {
    try {
      javonetHandle.invoke("ParsePredefinedBatchOperationAsync", operation, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPredefinedBatchOperationName(PredefinedBatchOperation operation) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetPredefinedBatchOperationName", NEnum.fromJavaEnum(operation));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPredefinedBatchOperationName(
      PredefinedBatchOperation operation, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetPredefinedBatchOperationName",
                  NEnum.fromJavaEnum(operation),
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetPredefinedBatchOperationName(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetPredefinedBatchOperationName", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPredefinedBatchOperationNameAsync(PredefinedBatchOperation operation) {
    try {
      javonetHandle.invoke("GetPredefinedBatchOperationNameAsync", NEnum.fromJavaEnum(operation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPredefinedBatchOperationNameAsync(
      PredefinedBatchOperation operation, Object userState) {
    try {
      javonetHandle.invoke(
          "GetPredefinedBatchOperationNameAsync", NEnum.fromJavaEnum(operation), userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishContextData[] ResolveItems(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "ResolveItems",
                  new Object[] {ids},
                  resolveInstruction,
                  new Object[] {targetIdsOrPurposes},
                  readOptions);
      if (res == null) return null;
      return (PublishContextData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveItems(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginResolveItems",
                  new Object[] {ids},
                  resolveInstruction,
                  new Object[] {targetIdsOrPurposes},
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishContextData[] EndResolveItems(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndResolveItems", result);
      if (res == null) return null;
      return (PublishContextData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveItemsAsync(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "ResolveItemsAsync",
          new Object[] {ids},
          resolveInstruction,
          new Object[] {targetIdsOrPurposes},
          readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveItemsAsync(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ResolveItemsAsync",
          new Object[] {ids},
          resolveInstruction,
          new Object[] {targetIdsOrPurposes},
          readOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement GetSearchResultsXml(SearchQueryData filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSearchResultsXml", filter);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsXml(
      SearchQueryData filter, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSearchResultsXml", filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSearchResultsXml(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSearchResultsXml", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsXmlAsync(SearchQueryData filter) {
    try {
      javonetHandle.invoke("GetSearchResultsXmlAsync", filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsXmlAsync(SearchQueryData filter, Object userState) {
    try {
      javonetHandle.invoke("GetSearchResultsXmlAsync", filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement GetSearchResultsXmlPaged(
      SearchQueryData filter, java.lang.Integer startRowIndex, java.lang.Integer maxRows) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSearchResultsXmlPaged", filter, startRowIndex, maxRows);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsXmlPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetSearchResultsXmlPaged",
                  filter,
                  startRowIndex,
                  maxRows,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSearchResultsXmlPaged(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSearchResultsXmlPaged", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsXmlPagedAsync(
      SearchQueryData filter, java.lang.Integer startRowIndex, java.lang.Integer maxRows) {
    try {
      javonetHandle.invoke("GetSearchResultsXmlPagedAsync", filter, startRowIndex, maxRows);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsXmlPagedAsync(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      Object userState) {
    try {
      javonetHandle.invoke(
          "GetSearchResultsXmlPagedAsync", filter, startRowIndex, maxRows, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSearchResults(
      SearchQueryData filter, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSearchResults", filter);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResults(
      SearchQueryData filter, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSearchResults", filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSearchResults(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSearchResults", result);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsAsync(SearchQueryData filter) {
    try {
      javonetHandle.invoke("GetSearchResultsAsync", filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsAsync(SearchQueryData filter, Object userState) {
    try {
      javonetHandle.invoke("GetSearchResultsAsync", filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSearchResultsPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSearchResultsPaged", filter, startRowIndex, maxRows);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetSearchResultsPaged",
                  filter,
                  startRowIndex,
                  maxRows,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSearchResultsPaged(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSearchResultsPaged", result);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsPagedAsync(
      SearchQueryData filter, java.lang.Integer startRowIndex, java.lang.Integer maxRows) {
    try {
      javonetHandle.invoke("GetSearchResultsPagedAsync", filter, startRowIndex, maxRows);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSearchResultsPagedAsync(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      Object userState) {
    try {
      javonetHandle.invoke("GetSearchResultsPagedAsync", filter, startRowIndex, maxRows, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData RenderItem(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "RenderItem",
                  itemId,
                  templateId,
                  publishInstruction,
                  publicationTargetIdOrPurpose);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRenderItem(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginRenderItem",
                  itemId,
                  templateId,
                  publishInstruction,
                  publicationTargetIdOrPurpose,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndRenderItem(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndRenderItem", result);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RenderItemAsync(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose) {
    try {
      javonetHandle.invoke(
          "RenderItemAsync", itemId, templateId, publishInstruction, publicationTargetIdOrPurpose);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RenderItemAsync(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose,
      Object userState) {
    try {
      javonetHandle.invoke(
          "RenderItemAsync",
          itemId,
          templateId,
          publishInstruction,
          publicationTargetIdOrPurpose,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData PreviewItem(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "PreviewItem", itemData, templateData, publishInstruction, publicationTargetId);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPreviewItem(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginPreviewItem",
                  itemData,
                  templateData,
                  publishInstruction,
                  publicationTargetId,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndPreviewItem(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndPreviewItem", result);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PreviewItemAsync(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId) {
    try {
      javonetHandle.invoke(
          "PreviewItemAsync", itemData, templateData, publishInstruction, publicationTargetId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PreviewItemAsync(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId,
      Object userState) {
    try {
      javonetHandle.invoke(
          "PreviewItemAsync",
          itemData,
          templateData,
          publishInstruction,
          publicationTargetId,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] Publish(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "Publish",
                  new Object[] {ids},
                  publishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
                  readOptions);
      if (res == null) return null;
      return (PublishTransactionData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPublish(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginPublish",
                  new Object[] {ids},
                  publishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] EndPublish(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndPublish", result);
      if (res == null) return null;
      return (PublishTransactionData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PublishAsync(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "PublishAsync",
          new Object[] {ids},
          publishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PublishAsync(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "PublishAsync",
          new Object[] {ids},
          publishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          readOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] UnPublish(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "UnPublish",
                  new Object[] {ids},
                  unPublishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
                  readOptions);
      if (res == null) return null;
      return (PublishTransactionData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnPublish(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginUnPublish",
                  new Object[] {ids},
                  unPublishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] EndUnPublish(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUnPublish", result);
      if (res == null) return null;
      return (PublishTransactionData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnPublishAsync(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "UnPublishAsync",
          new Object[] {ids},
          unPublishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnPublishAsync(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UnPublishAsync",
          new Object[] {ids},
          unPublishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          readOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsPublished(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("IsPublished", itemId, publishingTargetIdOrPurpose, isPublishedInContext);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsPublished(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginIsPublished",
                  itemId,
                  publishingTargetIdOrPurpose,
                  isPublishedInContext,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsPublished(IAsyncResult result) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndIsPublished", result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsPublishedAsync(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext) {
    try {
      javonetHandle.invoke(
          "IsPublishedAsync", itemId, publishingTargetIdOrPurpose, isPublishedInContext);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsPublishedAsync(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext,
      Object userState) {
    try {
      javonetHandle.invoke(
          "IsPublishedAsync", itemId, publishingTargetIdOrPurpose, isPublishedInContext, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData GetWorkItemSnapshot(java.lang.String workItemId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetWorkItemSnapshot", workItemId);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetWorkItemSnapshot(
      java.lang.String workItemId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetWorkItemSnapshot", workItemId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndGetWorkItemSnapshot(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetWorkItemSnapshot", result);
      if (res == null) return null;
      return new RenderedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetWorkItemSnapshotAsync(java.lang.String workItemId) {
    try {
      javonetHandle.invoke("GetWorkItemSnapshotAsync", workItemId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetWorkItemSnapshotAsync(java.lang.String workItemId, Object userState) {
    try {
      javonetHandle.invoke("GetWorkItemSnapshotAsync", workItemId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishInfoData[] GetListPublishInfo(java.lang.String itemId, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListPublishInfo", itemId);
      if (res == null) return null;
      return (PublishInfoData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListPublishInfo(
      java.lang.String itemId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListPublishInfo", itemId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishInfoData[] EndGetListPublishInfo(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListPublishInfo", result);
      if (res == null) return null;
      return (PublishInfoData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListPublishInfoAsync(java.lang.String itemId) {
    try {
      javonetHandle.invoke("GetListPublishInfoAsync", itemId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListPublishInfoAsync(java.lang.String itemId, Object userState) {
    try {
      javonetHandle.invoke("GetListPublishInfoAsync", itemId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActionFlags CastActions(java.lang.Integer numericActions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("CastActions", numericActions);
      if (res == null) return null;
      return new ActionFlags((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCastActions(
      java.lang.Integer numericActions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginCastActions", numericActions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActionFlags EndCastActions(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCastActions", result);
      if (res == null) return null;
      return new ActionFlags((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CastActionsAsync(java.lang.Integer numericActions) {
    try {
      javonetHandle.invoke("CastActionsAsync", numericActions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListAsync(java.lang.String id, SubjectRelatedListFilterData filter) {
    try {
      javonetHandle.invoke("GetListAsync", id, filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListAsync(
      java.lang.String id, SubjectRelatedListFilterData filter, Object userState) {
    try {
      javonetHandle.invoke("GetListAsync", id, filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetListDirectoryServiceNames(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListDirectoryServiceNames");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceNames(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListDirectoryServiceNames", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] EndGetListDirectoryServiceNames(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListDirectoryServiceNames", result);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceNamesAsync() {
    try {
      javonetHandle.invoke("GetListDirectoryServiceNamesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceNamesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetListDirectoryServiceNamesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WindowsUser[] GetListWindowsDomainUsers(
      java.lang.String domainName, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListWindowsDomainUsers", domainName);
      if (res == null) return null;
      return (WindowsUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListWindowsDomainUsers(
      java.lang.String domainName, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListWindowsDomainUsers", domainName, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WindowsUser[] EndGetListWindowsDomainUsers(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListWindowsDomainUsers", result);
      if (res == null) return null;
      return (WindowsUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListWindowsDomainUsersAsync(java.lang.String domainName) {
    try {
      javonetHandle.invoke("GetListWindowsDomainUsersAsync", domainName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListWindowsDomainUsersAsync(java.lang.String domainName, Object userState) {
    try {
      javonetHandle.invoke("GetListWindowsDomainUsersAsync", domainName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceAllUsers(
      java.lang.String directoryServiceName, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListDirectoryServiceAllUsers", directoryServiceName);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceAllUsers(
      java.lang.String directoryServiceName, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetListDirectoryServiceAllUsers",
                  directoryServiceName,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceAllUsers(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListDirectoryServiceAllUsers", result);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceAllUsersAsync(java.lang.String directoryServiceName) {
    try {
      javonetHandle.invoke("GetListDirectoryServiceAllUsersAsync", directoryServiceName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceAllUsersAsync(
      java.lang.String directoryServiceName, Object userState) {
    try {
      javonetHandle.invoke("GetListDirectoryServiceAllUsersAsync", directoryServiceName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceGroupMembers(
      java.lang.String directoryServiceName, java.lang.String groupDN, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListDirectoryServiceGroupMembers", directoryServiceName, groupDN);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceGroupMembers(
      java.lang.String directoryServiceName,
      java.lang.String groupDN,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetListDirectoryServiceGroupMembers",
                  directoryServiceName,
                  groupDN,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceGroupMembers(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListDirectoryServiceGroupMembers", result);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceGroupMembersAsync(
      java.lang.String directoryServiceName, java.lang.String groupDN) {
    try {
      javonetHandle.invoke(
          "GetListDirectoryServiceGroupMembersAsync", directoryServiceName, groupDN);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceGroupMembersAsync(
      java.lang.String directoryServiceName, java.lang.String groupDN, Object userState) {
    try {
      javonetHandle.invoke(
          "GetListDirectoryServiceGroupMembersAsync", directoryServiceName, groupDN, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceUsers(
      java.lang.String directoryServiceName,
      DirectoryUsersFilter filter,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListDirectoryServiceUsers", directoryServiceName, filter);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceUsers(
      java.lang.String directoryServiceName,
      DirectoryUsersFilter filter,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetListDirectoryServiceUsers",
                  directoryServiceName,
                  filter,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceUsers(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListDirectoryServiceUsers", result);
      if (res == null) return null;
      return (DirectoryServiceUser[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceUsersAsync(
      java.lang.String directoryServiceName, DirectoryUsersFilter filter) {
    try {
      javonetHandle.invoke("GetListDirectoryServiceUsersAsync", directoryServiceName, filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListDirectoryServiceUsersAsync(
      java.lang.String directoryServiceName, DirectoryUsersFilter filter, Object userState) {
    try {
      javonetHandle.invoke(
          "GetListDirectoryServiceUsersAsync", directoryServiceName, filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData Classify(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Classify", id, new Object[] {keywordIds}, readOptions);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginClassify(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginClassify",
                  id,
                  new Object[] {keywordIds},
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndClassify(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndClassify", result);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClassifyAsync(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("ClassifyAsync", id, new Object[] {keywordIds}, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClassifyAsync(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke("ClassifyAsync", id, new Object[] {keywordIds}, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData UnClassify(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("UnClassify", id, new Object[] {keywordIds}, readOptions);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnClassify(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginUnClassify",
                  id,
                  new Object[] {keywordIds},
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndUnClassify(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUnClassify", result);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnClassifyAsync(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("UnClassifyAsync", id, new Object[] {keywordIds}, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnClassifyAsync(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UnClassifyAsync", id, new Object[] {keywordIds}, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData ReClassify(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "ReClassify",
                  id,
                  new Object[] {keywordIdsToRemove},
                  new Object[] {keywordIdsToAdd},
                  readOptions);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReClassify(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginReClassify",
                  id,
                  new Object[] {keywordIdsToRemove},
                  new Object[] {keywordIdsToAdd},
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndReClassify(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReClassify", result);
      if (res == null) return null;
      return new ClassificationInfoData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReClassifyAsync(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "ReClassifyAsync",
          id,
          new Object[] {keywordIdsToRemove},
          new Object[] {keywordIdsToAdd},
          readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReClassifyAsync(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ReClassifyAsync",
          id,
          new Object[] {keywordIdsToRemove},
          new Object[] {keywordIdsToAdd},
          readOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData StartActivity(
      java.lang.String activityInstanceId, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("StartActivity", activityInstanceId, readBackOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStartActivity(
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginStartActivity", activityInstanceId, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndStartActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndStartActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartActivityAsync(java.lang.String activityInstanceId, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("StartActivityAsync", activityInstanceId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartActivityAsync(
      java.lang.String activityInstanceId, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("StartActivityAsync", activityInstanceId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData SuspendActivity(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "SuspendActivity",
                  activityInstanceId,
                  reason,
                  resumeAt,
                  resumeBookmark,
                  readBackOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSuspendActivity(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginSuspendActivity",
                  activityInstanceId,
                  reason,
                  resumeAt,
                  resumeBookmark,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndSuspendActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndSuspendActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SuspendActivityAsync(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke(
          "SuspendActivityAsync",
          activityInstanceId,
          reason,
          resumeAt,
          resumeBookmark,
          readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SuspendActivityAsync(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "SuspendActivityAsync",
          activityInstanceId,
          reason,
          resumeAt,
          resumeBookmark,
          readBackOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData RestartActivity(
      java.lang.String activityInstanceId, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("RestartActivity", activityInstanceId, readBackOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRestartActivity(
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginRestartActivity",
                  activityInstanceId,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndRestartActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndRestartActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RestartActivityAsync(
      java.lang.String activityInstanceId, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("RestartActivityAsync", activityInstanceId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RestartActivityAsync(
      java.lang.String activityInstanceId, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("RestartActivityAsync", activityInstanceId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData ReAssignActivity(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ReAssignActivity", activityInstanceId, newAssigneeId, readBackOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReAssignActivity(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginReAssignActivity",
                  activityInstanceId,
                  newAssigneeId,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndReAssignActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReAssignActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReAssignActivityAsync(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke(
          "ReAssignActivityAsync", activityInstanceId, newAssigneeId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReAssignActivityAsync(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ReAssignActivityAsync", activityInstanceId, newAssigneeId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData FinishActivity(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("FinishActivity", activityInstanceId, activityFinishData, readOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginFinishActivity(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginFinishActivity",
                  activityInstanceId,
                  activityFinishData,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndFinishActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndFinishActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void FinishActivityAsync(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "FinishActivityAsync", activityInstanceId, activityFinishData, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void FinishActivityAsync(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "FinishActivityAsync", activityInstanceId, activityFinishData, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessHistoryData ForceFinishProcess(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ForceFinishProcess", processInstanceId, approvalStatusId, readOptions);
      if (res == null) return null;
      return new ProcessHistoryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginForceFinishProcess(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginForceFinishProcess",
                  processInstanceId,
                  approvalStatusId,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessHistoryData EndForceFinishProcess(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndForceFinishProcess", result);
      if (res == null) return null;
      return new ProcessHistoryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ForceFinishProcessAsync(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "ForceFinishProcessAsync", processInstanceId, approvalStatusId, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ForceFinishProcessAsync(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ForceFinishProcessAsync", processInstanceId, approvalStatusId, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData ResumeActivity(
      java.lang.String activityInstanceId, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ResumeActivity", activityInstanceId, readOptions);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResumeActivity(
      java.lang.String activityInstanceId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginResumeActivity", activityInstanceId, readOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndResumeActivity(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndResumeActivity", result);
      if (res == null) return null;
      return new ActivityInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResumeActivityAsync(java.lang.String activityInstanceId, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("ResumeActivityAsync", activityInstanceId, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResumeActivityAsync(
      java.lang.String activityInstanceId, ReadOptions readOptions, Object userState) {
    try {
      javonetHandle.invoke("ResumeActivityAsync", activityInstanceId, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QueueMessageData[] GetListQueueMessages(
      java.lang.Integer queueId, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListQueueMessages", queueId);
      if (res == null) return null;
      return (QueueMessageData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListQueueMessages(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListQueueMessages", queueId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QueueMessageData[] EndGetListQueueMessages(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListQueueMessages", result);
      if (res == null) return null;
      return (QueueMessageData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListQueueMessagesAsync(java.lang.Integer queueId) {
    try {
      javonetHandle.invoke("GetListQueueMessagesAsync", queueId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListQueueMessagesAsync(java.lang.Integer queueId, Object userState) {
    try {
      javonetHandle.invoke("GetListQueueMessagesAsync", queueId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeQueue(java.lang.Integer queueId) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("PurgeQueue", queueId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeQueue(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginPurgeQueue", queueId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeQueue(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndPurgeQueue", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeQueueAsync(java.lang.Integer queueId) {
    try {
      javonetHandle.invoke("PurgeQueueAsync", queueId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeQueueAsync(java.lang.Integer queueId, Object userState) {
    try {
      javonetHandle.invoke("PurgeQueueAsync", queueId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QueueData[] GetListQueues(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListQueues");
      if (res == null) return null;
      return (QueueData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListQueues(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListQueues", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QueueData[] EndGetListQueues(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListQueues", result);
      if (res == null) return null;
      return (QueueData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListQueuesAsync() {
    try {
      javonetHandle.invoke("GetListQueuesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListQueuesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetListQueuesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationData ReadApplicationData(
      java.lang.String subjectId, java.lang.String applicationId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ReadApplicationData", subjectId, applicationId);
      if (res == null) return null;
      return new ApplicationData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadApplicationData(
      java.lang.String subjectId,
      java.lang.String applicationId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginReadApplicationData", subjectId, applicationId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationData EndReadApplicationData(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReadApplicationData", result);
      if (res == null) return null;
      return new ApplicationData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadApplicationDataAsync(java.lang.String subjectId, java.lang.String applicationId) {
    try {
      javonetHandle.invoke("ReadApplicationDataAsync", subjectId, applicationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadApplicationDataAsync(
      java.lang.String subjectId, java.lang.String applicationId, Object userState) {
    try {
      javonetHandle.invoke("ReadApplicationDataAsync", subjectId, applicationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationData[] ReadAllApplicationData(
      java.lang.String subjectId, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ReadAllApplicationData", subjectId);
      if (res == null) return null;
      return (ApplicationData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadAllApplicationData(
      java.lang.String subjectId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginReadAllApplicationData", subjectId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ApplicationData[] EndReadAllApplicationData(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReadAllApplicationData", result);
      if (res == null) return null;
      return (ApplicationData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetDefaultDataAsync(
      ItemType itemType, java.lang.String containerId, ReadOptions readOptions, Object userState) {
    try {
      javonetHandle.invoke(
          "GetDefaultDataAsync", NEnum.fromJavaEnum(itemType), containerId, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Move(
      java.lang.String id, java.lang.String destinationId, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Move", id, destinationId, readBackOptions);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginMove(
      java.lang.String id,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginMove", id, destinationId, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndMove(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndMove", result);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveAsync(
      java.lang.String id, java.lang.String destinationId, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("MoveAsync", id, destinationId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveAsync(
      java.lang.String id,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke("MoveAsync", id, destinationId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Copy(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Copy", id, destinationId, makeUnique, readBackOptions);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCopy(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginCopy",
                  id,
                  destinationId,
                  makeUnique,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndCopy(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCopy", result);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyAsync(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("CopyAsync", id, destinationId, makeUnique, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyAsync(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke("CopyAsync", id, destinationId, makeUnique, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public InstanceData GetInstanceData(
      java.lang.String schemaId, java.lang.String containerItemId, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetInstanceData", schemaId, containerItemId, readOptions);
      if (res == null) return null;
      return new InstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetInstanceData(
      java.lang.String schemaId,
      java.lang.String containerItemId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetInstanceData",
                  schemaId,
                  containerItemId,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public InstanceData EndGetInstanceData(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetInstanceData", result);
      if (res == null) return null;
      return new InstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetInstanceDataAsync(
      java.lang.String schemaId, java.lang.String containerItemId, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("GetInstanceDataAsync", schemaId, containerItemId, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetInstanceDataAsync(
      java.lang.String schemaId,
      java.lang.String containerItemId,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "GetInstanceDataAsync", schemaId, containerItemId, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData TryCheckOut(java.lang.String id, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("TryCheckOut", id, readBackOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryCheckOut(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginTryCheckOut", id, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndTryCheckOut(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndTryCheckOut", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryCheckOutAsync(java.lang.String id, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("TryCheckOutAsync", id, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryCheckOutAsync(java.lang.String id, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("TryCheckOutAsync", id, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData CheckOut(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("CheckOut", id, permanentLock, readBackOptions);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCheckOut(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginCheckOut", id, permanentLock, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndCheckOut(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCheckOut", result);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CheckOutAsync(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("CheckOutAsync", id, permanentLock, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CheckOutAsync(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke("CheckOutAsync", id, permanentLock, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData CheckIn(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("CheckIn", id, removePermanentLock, userComment, readBackOptions);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCheckIn(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginCheckIn",
                  id,
                  removePermanentLock,
                  userComment,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndCheckIn(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCheckIn", result);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CheckInAsync(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("CheckInAsync", id, removePermanentLock, userComment, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CheckInAsync(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "CheckInAsync", id, removePermanentLock, userComment, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Update(
      IdentifiableObjectData deltaData, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Update", deltaData, readBackOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUpdate(
      IdentifiableObjectData deltaData,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginUpdate", deltaData, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndUpdate(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUpdate", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateAsync(IdentifiableObjectData deltaData, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("UpdateAsync", deltaData, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateAsync(
      IdentifiableObjectData deltaData, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("UpdateAsync", deltaData, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Create(IdentifiableObjectData data, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Create", data, readBackOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCreate(
      IdentifiableObjectData data,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginCreate", data, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndCreate(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCreate", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateAsync(IdentifiableObjectData data, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("CreateAsync", data, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateAsync(
      IdentifiableObjectData data, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("CreateAsync", data, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData UndoCheckOut(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("UndoCheckOut", id, permanentLock, readBackOptions);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUndoCheckOut(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginUndoCheckOut", id, permanentLock, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndUndoCheckOut(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUndoCheckOut", result);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UndoCheckOutAsync(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("UndoCheckOutAsync", id, permanentLock, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UndoCheckOutAsync(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke("UndoCheckOutAsync", id, permanentLock, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData Rollback(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Rollback", id, deleteVersions, comment, readBackOptions);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRollback(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginRollback",
                  id,
                  deleteVersions,
                  comment,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndRollback(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndRollback", result);
      if (res == null) return null;
      return new VersionedItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RollbackAsync(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("RollbackAsync", id, deleteVersions, comment, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RollbackAsync(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "RollbackAsync", id, deleteVersions, comment, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Localize(java.lang.String id, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Localize", id, readBackOptions);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginLocalize(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginLocalize", id, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndLocalize(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndLocalize", result);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LocalizeAsync(java.lang.String id, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("LocalizeAsync", id, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LocalizeAsync(java.lang.String id, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("LocalizeAsync", id, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData UnLocalize(java.lang.String id, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("UnLocalize", id, readBackOptions);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnLocalize(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginUnLocalize", id, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndUnLocalize(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUnLocalize", result);
      if (res == null) return null;
      return new RepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnLocalizeAsync(java.lang.String id, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("UnLocalizeAsync", id, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnLocalizeAsync(java.lang.String id, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("UnLocalizeAsync", id, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData Promote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Promote", id, destinationRepositoryId, instruction, readBackOptions);
      if (res == null) return null;
      return new OperationResultDataOfRepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPromote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginPromote",
                  id,
                  destinationRepositoryId,
                  instruction,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData EndPromote(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndPromote", result);
      if (res == null) return null;
      return new OperationResultDataOfRepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PromoteAsync(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke(
          "PromoteAsync", id, destinationRepositoryId, instruction, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PromoteAsync(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "PromoteAsync", id, destinationRepositoryId, instruction, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData Demote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Demote", id, destinationRepositoryId, instruction, readBackOptions);
      if (res == null) return null;
      return new OperationResultDataOfRepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDemote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginDemote",
                  id,
                  destinationRepositoryId,
                  instruction,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData EndDemote(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndDemote", result);
      if (res == null) return null;
      return new OperationResultDataOfRepositoryLocalObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DemoteAsync(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke(
          "DemoteAsync", id, destinationRepositoryId, instruction, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DemoteAsync(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "DemoteAsync", id, destinationRepositoryId, instruction, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TemplateType[] GetListTemplateTypes(
      Nullable<ItemType> itemType, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListTemplateTypes", itemType);
      if (res == null) return null;
      return (TemplateType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListTemplateTypes(
      Nullable<ItemType> itemType, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListTemplateTypes", itemType, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TemplateType[] EndGetListTemplateTypes(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListTemplateTypes", result);
      if (res == null) return null;
      return (TemplateType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListTemplateTypesAsync(Nullable<ItemType> itemType) {
    try {
      javonetHandle.invoke("GetListTemplateTypesAsync", itemType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListTemplateTypesAsync(Nullable<ItemType> itemType, Object userState) {
    try {
      javonetHandle.invoke("GetListTemplateTypesAsync", itemType, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublicationType[] GetListPublicationTypes(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListPublicationTypes");
      if (res == null) return null;
      return (PublicationType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListPublicationTypes(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListPublicationTypes", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublicationType[] EndGetListPublicationTypes(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListPublicationTypes", result);
      if (res == null) return null;
      return (PublicationType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListPublicationTypesAsync() {
    try {
      javonetHandle.invoke("GetListPublicationTypesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListPublicationTypesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetListPublicationTypesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement GetSystemWideListXml(SystemWideListFilterData filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSystemWideListXml", filter);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemWideListXml(
      SystemWideListFilterData filter, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSystemWideListXml", filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSystemWideListXml(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSystemWideListXml", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemWideListXmlAsync(SystemWideListFilterData filter) {
    try {
      javonetHandle.invoke("GetSystemWideListXmlAsync", filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemWideListXmlAsync(SystemWideListFilterData filter, Object userState) {
    try {
      javonetHandle.invoke("GetSystemWideListXmlAsync", filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSystemWideList(
      SystemWideListFilterData filter, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSystemWideList", filter);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemWideList(
      SystemWideListFilterData filter, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSystemWideList", filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSystemWideList(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSystemWideList", result);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemWideListAsync(SystemWideListFilterData filter) {
    try {
      javonetHandle.invoke("GetSystemWideListAsync", filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemWideListAsync(SystemWideListFilterData filter, Object userState) {
    try {
      javonetHandle.invoke("GetSystemWideListAsync", filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement GetListXml(java.lang.String id, SubjectRelatedListFilterData filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListXml", id, filter);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListXml(
      java.lang.String id,
      SubjectRelatedListFilterData filter,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListXml", id, filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetListXml(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListXml", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListXmlAsync(java.lang.String id, SubjectRelatedListFilterData filter) {
    try {
      javonetHandle.invoke("GetListXmlAsync", id, filter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListXmlAsync(
      java.lang.String id, SubjectRelatedListFilterData filter, Object userState) {
    try {
      javonetHandle.invoke("GetListXmlAsync", id, filter, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetList(
      java.lang.String id, SubjectRelatedListFilterData filter, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetList", id, filter);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetList(
      java.lang.String id,
      SubjectRelatedListFilterData filter,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetList", id, filter, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetList(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetList", result);
      if (res == null) return null;
      return (IdentifiableObjectData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPublishSourceByUrlAsync(java.lang.String url) {
    try {
      javonetHandle.invoke("GetPublishSourceByUrlAsync", url);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPublishSourceByUrlAsync(java.lang.String url, Object userState) {
    try {
      javonetHandle.invoke("GetPublishSourceByUrlAsync", url, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemovePublishStates(
      java.lang.String publicationId, java.lang.String targetTypeIdOrPurpose) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("RemovePublishStates", publicationId, targetTypeIdOrPurpose);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRemovePublishStates(
      java.lang.String publicationId,
      java.lang.String targetTypeIdOrPurpose,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginRemovePublishStates",
                  publicationId,
                  targetTypeIdOrPurpose,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndRemovePublishStates(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndRemovePublishStates", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemovePublishStatesAsync(
      java.lang.String publicationId, java.lang.String targetTypeIdOrPurpose) {
    try {
      javonetHandle.invoke("RemovePublishStatesAsync", publicationId, targetTypeIdOrPurpose);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemovePublishStatesAsync(
      java.lang.String publicationId, java.lang.String targetTypeIdOrPurpose, Object userState) {
    try {
      javonetHandle.invoke(
          "RemovePublishStatesAsync", publicationId, targetTypeIdOrPurpose, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ContainingPagesDictionary ResolveContainingPages(
      java.lang.String componentId, ResolveContainingPagesInstructionData instruction) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ResolveContainingPages", componentId, instruction);
      if (res == null) return null;
      return new ContainingPagesDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveContainingPages(
      java.lang.String componentId,
      ResolveContainingPagesInstructionData instruction,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginResolveContainingPages", componentId, instruction, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ContainingPagesDictionary EndResolveContainingPages(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndResolveContainingPages", result);
      if (res == null) return null;
      return new ContainingPagesDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveContainingPagesAsync(
      java.lang.String componentId, ResolveContainingPagesInstructionData instruction) {
    try {
      javonetHandle.invoke("ResolveContainingPagesAsync", componentId, instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveContainingPagesAsync(
      java.lang.String componentId,
      ResolveContainingPagesInstructionData instruction,
      Object userState) {
    try {
      javonetHandle.invoke("ResolveContainingPagesAsync", componentId, instruction, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeWorkflowHistory(PurgeWorkflowHistoryInstructionData instruction) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("PurgeWorkflowHistory", instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeWorkflowHistory(
      PurgeWorkflowHistoryInstructionData instruction, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginPurgeWorkflowHistory", instruction, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeWorkflowHistory(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndPurgeWorkflowHistory", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeWorkflowHistoryAsync(PurgeWorkflowHistoryInstructionData instruction) {
    try {
      javonetHandle.invoke("PurgeWorkflowHistoryAsync", instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PurgeWorkflowHistoryAsync(
      PurgeWorkflowHistoryInstructionData instruction, Object userState) {
    try {
      javonetHandle.invoke("PurgeWorkflowHistoryAsync", instruction, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BroadcastNotification(NotificationMessage notification) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("BroadcastNotification", notification);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBroadcastNotification(
      NotificationMessage notification, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginBroadcastNotification", notification, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndBroadcastNotification(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndBroadcastNotification", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BroadcastNotificationAsync(NotificationMessage notification) {
    try {
      javonetHandle.invoke("BroadcastNotificationAsync", notification);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BroadcastNotificationAsync(NotificationMessage notification, Object userState) {
    try {
      javonetHandle.invoke("BroadcastNotificationAsync", notification, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SystemPrivilege[] GetSystemPrivileges(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSystemPrivileges");
      if (res == null) return null;
      return (SystemPrivilege[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemPrivileges(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSystemPrivileges", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SystemPrivilege[] EndGetSystemPrivileges(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSystemPrivileges", result);
      if (res == null) return null;
      return (SystemPrivilege[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemPrivilegesAsync() {
    try {
      javonetHandle.invoke("GetSystemPrivilegesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemPrivilegesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetSystemPrivilegesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetApiVersion() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetApiVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetApiVersion(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetApiVersion", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetApiVersion(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetApiVersion", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetApiVersionAsync() {
    try {
      javonetHandle.invoke("GetApiVersionAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetApiVersionAsync(Object userState) {
    try {
      javonetHandle.invoke("GetApiVersionAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData GetCurrentUser() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetCurrentUser");
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetCurrentUser(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetCurrentUser", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndGetCurrentUser(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetCurrentUser", result);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetCurrentUserAsync() {
    try {
      javonetHandle.invoke("GetCurrentUserAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetCurrentUserAsync(Object userState) {
    try {
      javonetHandle.invoke("GetCurrentUserAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsExistingObject(java.lang.String id) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("IsExistingObject", id);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsExistingObject(
      java.lang.String id, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginIsExistingObject", id, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsExistingObject(IAsyncResult result) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndIsExistingObject", result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsExistingObjectAsync(java.lang.String id) {
    try {
      javonetHandle.invoke("IsExistingObjectAsync", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IsExistingObjectAsync(java.lang.String id, Object userState) {
    try {
      javonetHandle.invoke("IsExistingObjectAsync", id, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetTcmUri", baseUri, contextRepositoryUri, version);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetTcmUri", baseUri, contextRepositoryUri, version, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetTcmUri(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetTcmUri", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTcmUriAsync(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version) {
    try {
      javonetHandle.invoke("GetTcmUriAsync", baseUri, contextRepositoryUri, version);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTcmUriAsync(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      Object userState) {
    try {
      javonetHandle.invoke("GetTcmUriAsync", baseUri, contextRepositoryUri, version, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String TryGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("TryGetTcmUri", baseUri, contextRepositoryUri, version);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginTryGetTcmUri",
                  baseUri,
                  contextRepositoryUri,
                  version,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndTryGetTcmUri(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndTryGetTcmUri", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryGetTcmUriAsync(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version) {
    try {
      javonetHandle.invoke("TryGetTcmUriAsync", baseUri, contextRepositoryUri, version);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryGetTcmUriAsync(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      Object userState) {
    try {
      javonetHandle.invoke("TryGetTcmUriAsync", baseUri, contextRepositoryUri, version, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Read(java.lang.String id, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Read", id, readOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRead(
      java.lang.String id, ReadOptions readOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginRead", id, readOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndRead(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndRead", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadAsync(java.lang.String id, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("ReadAsync", id, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadAsync(java.lang.String id, ReadOptions readOptions, Object userState) {
    try {
      javonetHandle.invoke("ReadAsync", id, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData TryRead(java.lang.String id, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("TryRead", id, readOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryRead(
      java.lang.String id, ReadOptions readOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginTryRead", id, readOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndTryRead(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndTryRead", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryReadAsync(java.lang.String id, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("TryReadAsync", id, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TryReadAsync(java.lang.String id, ReadOptions readOptions, Object userState) {
    try {
      javonetHandle.invoke("TryReadAsync", id, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemReadResultDictionary BulkRead(java.lang.String[] ids, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BulkRead", new Object[] {ids}, readOptions);
      if (res == null) return null;
      return new ItemReadResultDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBulkRead(
      java.lang.String[] ids, ReadOptions readOptions, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginBulkRead", new Object[] {ids}, readOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemReadResultDictionary EndBulkRead(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndBulkRead", result);
      if (res == null) return null;
      return new ItemReadResultDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BulkReadAsync(java.lang.String[] ids, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("BulkReadAsync", new Object[] {ids}, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BulkReadAsync(java.lang.String[] ids, ReadOptions readOptions, Object userState) {
    try {
      javonetHandle.invoke("BulkReadAsync", new Object[] {ids}, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData ReadSchemaFields(
      java.lang.String schemaId, java.lang.Boolean expandEmbeddedFields, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ReadSchemaFields", schemaId, expandEmbeddedFields, readOptions);
      if (res == null) return null;
      return new SchemaFieldsData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadSchemaFields(
      java.lang.String schemaId,
      java.lang.Boolean expandEmbeddedFields,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginReadSchemaFields",
                  schemaId,
                  expandEmbeddedFields,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData EndReadSchemaFields(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndReadSchemaFields", result);
      if (res == null) return null;
      return new SchemaFieldsData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadSchemaFieldsAsync(
      java.lang.String schemaId, java.lang.Boolean expandEmbeddedFields, ReadOptions readOptions) {
    try {
      javonetHandle.invoke("ReadSchemaFieldsAsync", schemaId, expandEmbeddedFields, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadSchemaFieldsAsync(
      java.lang.String schemaId,
      java.lang.Boolean expandEmbeddedFields,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ReadSchemaFieldsAsync", schemaId, expandEmbeddedFields, readOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement ConvertSchemaFieldsToXsd(SchemaFieldsData schemaFieldsData) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ConvertSchemaFieldsToXsd", schemaFieldsData);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertSchemaFieldsToXsd(
      SchemaFieldsData schemaFieldsData, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginConvertSchemaFieldsToXsd", schemaFieldsData, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XElement EndConvertSchemaFieldsToXsd(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndConvertSchemaFieldsToXsd", result);
      if (res == null) return null;
      return new XElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertSchemaFieldsToXsdAsync(SchemaFieldsData schemaFieldsData) {
    try {
      javonetHandle.invoke("ConvertSchemaFieldsToXsdAsync", schemaFieldsData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertSchemaFieldsToXsdAsync(SchemaFieldsData schemaFieldsData, Object userState) {
    try {
      javonetHandle.invoke("ConvertSchemaFieldsToXsdAsync", schemaFieldsData, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Save(
      IdentifiableObjectData deltaData, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Save", deltaData, readBackOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSave(
      IdentifiableObjectData deltaData,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginSave", deltaData, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndSave(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndSave", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsync(IdentifiableObjectData deltaData, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("SaveAsync", deltaData, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsync(
      IdentifiableObjectData deltaData, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("SaveAsync", deltaData, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Delete(java.lang.String id) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("Delete", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDelete(java.lang.String id, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginDelete", id, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndDelete(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndDelete", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteAsync(java.lang.String id) {
    try {
      javonetHandle.invoke("DeleteAsync", id);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteAsync(java.lang.String id, Object userState) {
    try {
      javonetHandle.invoke("DeleteAsync", id, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteTaxonomyNode(
      java.lang.String id, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("DeleteTaxonomyNode", id, NEnum.fromJavaEnum(deleteTaxonomyNodeMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDeleteTaxonomyNode(
      java.lang.String id,
      DeleteTaxonomyNodeMode deleteTaxonomyNodeMode,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginDeleteTaxonomyNode",
                  id,
                  NEnum.fromJavaEnum(deleteTaxonomyNodeMode),
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndDeleteTaxonomyNode(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndDeleteTaxonomyNode", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteTaxonomyNodeAsync(
      java.lang.String id, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode) {
    try {
      javonetHandle.invoke(
          "DeleteTaxonomyNodeAsync", id, NEnum.fromJavaEnum(deleteTaxonomyNodeMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteTaxonomyNodeAsync(
      java.lang.String id, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode, Object userState) {
    try {
      javonetHandle.invoke(
          "DeleteTaxonomyNodeAsync", id, NEnum.fromJavaEnum(deleteTaxonomyNodeMode), userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData GetDefaultData(
      ItemType itemType, java.lang.String containerId, ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetDefaultData", NEnum.fromJavaEnum(itemType), containerId, readOptions);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetDefaultData(
      ItemType itemType,
      java.lang.String containerId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetDefaultData",
                  NEnum.fromJavaEnum(itemType),
                  containerId,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndGetDefaultData(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetDefaultData", result);
      if (res == null) return null;
      return new IdentifiableObjectData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetDefaultDataAsync(
      ItemType itemType, java.lang.String containerId, ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "GetDefaultDataAsync", NEnum.fromJavaEnum(itemType), containerId, readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyToKeywordAsync(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("CopyToKeywordAsync", sourceKeywordId, destinationId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyToKeywordAsync(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "CopyToKeywordAsync", sourceKeywordId, destinationId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeywordData MoveToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("MoveToKeyword", sourceKeywordId, destinationId, readBackOptions);
      if (res == null) return null;
      return new KeywordData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginMoveToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginMoveToKeyword",
                  sourceKeywordId,
                  destinationId,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeywordData EndMoveToKeyword(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndMoveToKeyword", result);
      if (res == null) return null;
      return new KeywordData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveToKeywordAsync(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("MoveToKeywordAsync", sourceKeywordId, destinationId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveToKeywordAsync(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "MoveToKeywordAsync", sourceKeywordId, destinationId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TridionLanguageInfo[] GetTridionLanguages(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetTridionLanguages");
      if (res == null) return null;
      return (TridionLanguageInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetTridionLanguages(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetTridionLanguages", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TridionLanguageInfo[] EndGetTridionLanguages(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetTridionLanguages", result);
      if (res == null) return null;
      return (TridionLanguageInfo[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTridionLanguagesAsync() {
    try {
      javonetHandle.invoke("GetTridionLanguagesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTridionLanguagesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetTridionLanguagesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkflowScriptType[] GetListWorkflowScriptTypes(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetListWorkflowScriptTypes");
      if (res == null) return null;
      return (WorkflowScriptType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListWorkflowScriptTypes(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetListWorkflowScriptTypes", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkflowScriptType[] EndGetListWorkflowScriptTypes(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetListWorkflowScriptTypes", result);
      if (res == null) return null;
      return (WorkflowScriptType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListWorkflowScriptTypesAsync() {
    try {
      javonetHandle.invoke("GetListWorkflowScriptTypesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetListWorkflowScriptTypesAsync(Object userState) {
    try {
      javonetHandle.invoke("GetListWorkflowScriptTypesAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] AddToWorkflow(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "AddToWorkflow", new Object[] {subjectIds}, activityInstanceId, readBackOptions);
      if (res == null) return null;
      return (WorkItemData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginAddToWorkflow(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginAddToWorkflow",
                  new Object[] {subjectIds},
                  activityInstanceId,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] EndAddToWorkflow(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndAddToWorkflow", result);
      if (res == null) return null;
      return (WorkItemData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddToWorkflowAsync(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke(
          "AddToWorkflowAsync", new Object[] {subjectIds}, activityInstanceId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddToWorkflowAsync(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "AddToWorkflowAsync",
          new Object[] {subjectIds},
          activityInstanceId,
          readBackOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] RemoveFromWorkflow(
      java.lang.String[] subjectIds, ReadOptions readBackOptions, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("RemoveFromWorkflow", new Object[] {subjectIds}, readBackOptions);
      if (res == null) return null;
      return (WorkItemData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRemoveFromWorkflow(
      java.lang.String[] subjectIds,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginRemoveFromWorkflow",
                  new Object[] {subjectIds},
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] EndRemoveFromWorkflow(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndRemoveFromWorkflow", result);
      if (res == null) return null;
      return (WorkItemData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveFromWorkflowAsync(java.lang.String[] subjectIds, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("RemoveFromWorkflowAsync", new Object[] {subjectIds}, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveFromWorkflowAsync(
      java.lang.String[] subjectIds, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke(
          "RemoveFromWorkflowAsync", new Object[] {subjectIds}, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData Lock(
      java.lang.String organizationalItemId, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Lock", organizationalItemId, readBackOptions);
      if (res == null) return null;
      return new OrganizationalItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginLock(
      java.lang.String organizationalItemId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginLock", organizationalItemId, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData EndLock(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndLock", result);
      if (res == null) return null;
      return new OrganizationalItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LockAsync(java.lang.String organizationalItemId, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("LockAsync", organizationalItemId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LockAsync(
      java.lang.String organizationalItemId, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("LockAsync", organizationalItemId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData Unlock(
      java.lang.String organizationalItemId, ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Unlock", organizationalItemId, readBackOptions);
      if (res == null) return null;
      return new OrganizationalItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnlock(
      java.lang.String organizationalItemId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginUnlock", organizationalItemId, readBackOptions, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData EndUnlock(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndUnlock", result);
      if (res == null) return null;
      return new OrganizationalItemData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnlockAsync(java.lang.String organizationalItemId, ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("UnlockAsync", organizationalItemId, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UnlockAsync(
      java.lang.String organizationalItemId, ReadOptions readBackOptions, Object userState) {
    try {
      javonetHandle.invoke("UnlockAsync", organizationalItemId, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessInstanceData StartWorkflow(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("StartWorkflow", repositoryId, instruction, readBackOptions);
      if (res == null) return null;
      return new ProcessInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStartWorkflow(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginStartWorkflow",
                  repositoryId,
                  instruction,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessInstanceData EndStartWorkflow(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndStartWorkflow", result);
      if (res == null) return null;
      return new ProcessInstanceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartWorkflowAsync(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions) {
    try {
      javonetHandle.invoke("StartWorkflowAsync", repositoryId, instruction, readBackOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartWorkflowAsync(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "StartWorkflowAsync", repositoryId, instruction, readBackOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessDefinitionAssociationDictionary GetProcessDefinitionsForItems(
      java.lang.String[] itemIds, ProcessDefinitionType processDefinitionType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "GetProcessDefinitionsForItems",
                  new Object[] {itemIds},
                  NEnum.fromJavaEnum(processDefinitionType));
      if (res == null) return null;
      return new ProcessDefinitionAssociationDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetProcessDefinitionsForItems(
      java.lang.String[] itemIds,
      ProcessDefinitionType processDefinitionType,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetProcessDefinitionsForItems",
                  new Object[] {itemIds},
                  NEnum.fromJavaEnum(processDefinitionType),
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ProcessDefinitionAssociationDictionary EndGetProcessDefinitionsForItems(
      IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetProcessDefinitionsForItems", result);
      if (res == null) return null;
      return new ProcessDefinitionAssociationDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetProcessDefinitionsForItemsAsync(
      java.lang.String[] itemIds, ProcessDefinitionType processDefinitionType) {
    try {
      javonetHandle.invoke(
          "GetProcessDefinitionsForItemsAsync",
          new Object[] {itemIds},
          NEnum.fromJavaEnum(processDefinitionType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetProcessDefinitionsForItemsAsync(
      java.lang.String[] itemIds, ProcessDefinitionType processDefinitionType, Object userState) {
    try {
      javonetHandle.invoke(
          "GetProcessDefinitionsForItemsAsync",
          new Object[] {itemIds},
          NEnum.fromJavaEnum(processDefinitionType),
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSystemXsd(java.lang.String filename) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSystemXsd", filename);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemXsd(
      java.lang.String filename, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetSystemXsd", filename, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetSystemXsd(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSystemXsd", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemXsdAsync(java.lang.String filename) {
    try {
      javonetHandle.invoke("GetSystemXsdAsync", filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSystemXsdAsync(java.lang.String filename, Object userState) {
    try {
      javonetHandle.invoke("GetSystemXsdAsync", filename, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LinkToSchemaData[] GetSchemasByNamespaceUri(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetSchemasByNamespaceUri", repositoryId, namespaceUri, rootElementName);
      if (res == null) return null;
      return (LinkToSchemaData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSchemasByNamespaceUri(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginGetSchemasByNamespaceUri",
                  repositoryId,
                  namespaceUri,
                  rootElementName,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LinkToSchemaData[] EndGetSchemasByNamespaceUri(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetSchemasByNamespaceUri", result);
      if (res == null) return null;
      return (LinkToSchemaData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSchemasByNamespaceUriAsync(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName) {
    try {
      javonetHandle.invoke(
          "GetSchemasByNamespaceUriAsync", repositoryId, namespaceUri, rootElementName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSchemasByNamespaceUriAsync(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName,
      Object userState) {
    try {
      javonetHandle.invoke(
          "GetSchemasByNamespaceUriAsync", repositoryId, namespaceUri, rootElementName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ValidationErrorData[] Validate(
      IdentifiableObjectData deltaData, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("Validate", deltaData);
      if (res == null) return null;
      return (ValidationErrorData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginValidate(
      IdentifiableObjectData deltaData, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginValidate", deltaData, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ValidationErrorData[] EndValidate(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndValidate", result);
      if (res == null) return null;
      return (ValidationErrorData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateAsync(IdentifiableObjectData deltaData) {
    try {
      javonetHandle.invoke("ValidateAsync", deltaData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ValidateAsync(IdentifiableObjectData deltaData, Object userState) {
    try {
      javonetHandle.invoke("ValidateAsync", deltaData, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BinaryContentData GetExternalBinaryContentData(java.lang.String uri) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetExternalBinaryContentData", uri);
      if (res == null) return null;
      return new BinaryContentData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetExternalBinaryContentData(
      java.lang.String uri, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetExternalBinaryContentData", uri, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BinaryContentData EndGetExternalBinaryContentData(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetExternalBinaryContentData", result);
      if (res == null) return null;
      return new BinaryContentData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetExternalBinaryContentDataAsync(java.lang.String uri) {
    try {
      javonetHandle.invoke("GetExternalBinaryContentDataAsync", uri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetExternalBinaryContentDataAsync(java.lang.String uri, Object userState) {
    try {
      javonetHandle.invoke("GetExternalBinaryContentDataAsync", uri, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult SynchronizeWithSchema(
      IdentifiableObjectData dataObject, SynchronizeOptions synchronizeOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("SynchronizeWithSchema", dataObject, synchronizeOptions);
      if (res == null) return null;
      return new SynchronizationResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSynchronizeWithSchema(
      IdentifiableObjectData dataObject,
      SynchronizeOptions synchronizeOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginSynchronizeWithSchema",
                  dataObject,
                  synchronizeOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult EndSynchronizeWithSchema(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndSynchronizeWithSchema", result);
      if (res == null) return null;
      return new SynchronizationResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SynchronizeWithSchemaAsync(
      IdentifiableObjectData dataObject, SynchronizeOptions synchronizeOptions) {
    try {
      javonetHandle.invoke("SynchronizeWithSchemaAsync", dataObject, synchronizeOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SynchronizeWithSchemaAsync(
      IdentifiableObjectData dataObject, SynchronizeOptions synchronizeOptions, Object userState) {
    try {
      javonetHandle.invoke("SynchronizeWithSchemaAsync", dataObject, synchronizeOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult SynchronizeWithSchemaAndUpdate(
      java.lang.String itemId, SynchronizeOptions synchronizeOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("SynchronizeWithSchemaAndUpdate", itemId, synchronizeOptions);
      if (res == null) return null;
      return new SynchronizationResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSynchronizeWithSchemaAndUpdate(
      java.lang.String itemId,
      SynchronizeOptions synchronizeOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginSynchronizeWithSchemaAndUpdate",
                  itemId,
                  synchronizeOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult EndSynchronizeWithSchemaAndUpdate(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndSynchronizeWithSchemaAndUpdate", result);
      if (res == null) return null;
      return new SynchronizationResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SynchronizeWithSchemaAndUpdateAsync(
      java.lang.String itemId, SynchronizeOptions synchronizeOptions) {
    try {
      javonetHandle.invoke("SynchronizeWithSchemaAndUpdateAsync", itemId, synchronizeOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SynchronizeWithSchemaAndUpdateAsync(
      java.lang.String itemId, SynchronizeOptions synchronizeOptions, Object userState) {
    try {
      javonetHandle.invoke(
          "SynchronizeWithSchemaAndUpdateAsync", itemId, synchronizeOptions, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DecommissionPublicationTarget(java.lang.String publicationTargetId) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("DecommissionPublicationTarget", publicationTargetId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDecommissionPublicationTarget(
      java.lang.String publicationTargetId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginDecommissionPublicationTarget", publicationTargetId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndDecommissionPublicationTarget(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
          .invoke("EndDecommissionPublicationTarget", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DecommissionPublicationTargetAsync(java.lang.String publicationTargetId) {
    try {
      javonetHandle.invoke("DecommissionPublicationTargetAsync", publicationTargetId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DecommissionPublicationTargetAsync(
      java.lang.String publicationTargetId, Object userState) {
    try {
      javonetHandle.invoke("DecommissionPublicationTargetAsync", publicationTargetId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData ConvertXsdToSchemaFields(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "ConvertXsdToSchemaFields",
                  xsd,
                  NEnum.fromJavaEnum(purpose),
                  rootElementName,
                  readOptions);
      if (res == null) return null;
      return new SchemaFieldsData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertXsdToSchemaFields(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginConvertXsdToSchemaFields",
                  xsd,
                  NEnum.fromJavaEnum(purpose),
                  rootElementName,
                  readOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData EndConvertXsdToSchemaFields(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndConvertXsdToSchemaFields", result);
      if (res == null) return null;
      return new SchemaFieldsData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertXsdToSchemaFieldsAsync(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions) {
    try {
      javonetHandle.invoke(
          "ConvertXsdToSchemaFieldsAsync",
          xsd,
          NEnum.fromJavaEnum(purpose),
          rootElementName,
          readOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertXsdToSchemaFieldsAsync(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions,
      Object userState) {
    try {
      javonetHandle.invoke(
          "ConvertXsdToSchemaFieldsAsync",
          xsd,
          NEnum.fromJavaEnum(purpose),
          rootElementName,
          readOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPublishUrl(
      java.lang.String id, java.lang.String targetTypeIdOrPurpose) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetPublishUrl", id, targetTypeIdOrPurpose);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPublishUrl(
      java.lang.String id,
      java.lang.String targetTypeIdOrPurpose,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetPublishUrl", id, targetTypeIdOrPurpose, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetPublishUrl(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetPublishUrl", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPublishUrlAsync(java.lang.String id, java.lang.String targetTypeIdOrPurpose) {
    try {
      javonetHandle.invoke("GetPublishUrlAsync", id, targetTypeIdOrPurpose);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetPublishUrlAsync(
      java.lang.String id, java.lang.String targetTypeIdOrPurpose, Object userState) {
    try {
      javonetHandle.invoke("GetPublishUrlAsync", id, targetTypeIdOrPurpose, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LinkToBusinessProcessTypeData[] GetBusinessProcessTypes(
      java.lang.String cdTopologyTypeId, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetBusinessProcessTypes", cdTopologyTypeId);
      if (res == null) return null;
      return (LinkToBusinessProcessTypeData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetBusinessProcessTypes(
      java.lang.String cdTopologyTypeId, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetBusinessProcessTypes", cdTopologyTypeId, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public LinkToBusinessProcessTypeData[] EndGetBusinessProcessTypes(
      IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetBusinessProcessTypes", result);
      if (res == null) return null;
      return (LinkToBusinessProcessTypeData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetBusinessProcessTypesAsync(java.lang.String cdTopologyTypeId) {
    try {
      javonetHandle.invoke("GetBusinessProcessTypesAsync", cdTopologyTypeId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetBusinessProcessTypesAsync(java.lang.String cdTopologyTypeId, Object userState) {
    try {
      javonetHandle.invoke("GetBusinessProcessTypesAsync", cdTopologyTypeId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishSourceData GetPublishSourceByUrl(java.lang.String url) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetPublishSourceByUrl", url);
      if (res == null) return null;
      return new PublishSourceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPublishSourceByUrl(
      java.lang.String url, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetPublishSourceByUrl", url, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PublishSourceData EndGetPublishSourceByUrl(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetPublishSourceByUrl", result);
      if (res == null) return null;
      return new PublishSourceData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaData GetVirtualFolderTypeSchema(java.lang.String namespaceUri) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetVirtualFolderTypeSchema", namespaceUri);
      if (res == null) return null;
      return new SchemaData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetVirtualFolderTypeSchema(
      java.lang.String namespaceUri, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetVirtualFolderTypeSchema", namespaceUri, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SchemaData EndGetVirtualFolderTypeSchema(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetVirtualFolderTypeSchema", result);
      if (res == null) return null;
      return new SchemaData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVirtualFolderTypeSchemaAsync(java.lang.String namespaceUri) {
    try {
      javonetHandle.invoke("GetVirtualFolderTypeSchemaAsync", namespaceUri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVirtualFolderTypeSchemaAsync(java.lang.String namespaceUri, Object userState) {
    try {
      javonetHandle.invoke("GetVirtualFolderTypeSchemaAsync", namespaceUri, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TridionEnumValue[] GetEnumValues(java.lang.String type, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("GetEnumValues", type);
      if (res == null) return null;
      return (TridionEnumValue[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetEnumValues(
      java.lang.String type, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("BeginGetEnumValues", type, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TridionEnumValue[] EndGetEnumValues(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndGetEnumValues", result);
      if (res == null) return null;
      return (TridionEnumValue[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetEnumValuesAsync(java.lang.String type) {
    try {
      javonetHandle.invoke("GetEnumValuesAsync", type);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetEnumValuesAsync(java.lang.String type, Object userState) {
    try {
      javonetHandle.invoke("GetEnumValuesAsync", type, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BundleTypeData[] ResolveBundleTypes(
      java.lang.String[] itemIds, java.lang.Boolean pruneTree, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("ResolveBundleTypes", new Object[] {itemIds}, pruneTree);
      if (res == null) return null;
      return (BundleTypeData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveBundleTypes(
      java.lang.String[] itemIds,
      java.lang.Boolean pruneTree,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginResolveBundleTypes",
                  new Object[] {itemIds},
                  pruneTree,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public BundleTypeData[] EndResolveBundleTypes(IAsyncResult result, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndResolveBundleTypes", result);
      if (res == null) return null;
      return (BundleTypeData[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveBundleTypesAsync(java.lang.String[] itemIds, java.lang.Boolean pruneTree) {
    try {
      javonetHandle.invoke("ResolveBundleTypesAsync", new Object[] {itemIds}, pruneTree);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResolveBundleTypesAsync(
      java.lang.String[] itemIds, java.lang.Boolean pruneTree, Object userState) {
    try {
      javonetHandle.invoke("ResolveBundleTypesAsync", new Object[] {itemIds}, pruneTree, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeywordData CopyToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("CopyToKeyword", sourceKeywordId, destinationId, readBackOptions);
      if (res == null) return null;
      return new KeywordData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCopyToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke(
                  "BeginCopyToKeyword",
                  sourceKeywordId,
                  destinationId,
                  readBackOptions,
                  callback,
                  asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KeywordData EndCopyToKeyword(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreService")
              .invoke("EndCopyToKeyword", result);
      if (res == null) return null;
      return new KeywordData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1>>
      _GetVirtualFolderTypeSchemaCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1>>();

  public void addGetVirtualFolderTypeSchemaCompleted(
      EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> toAdd) {
    _GetVirtualFolderTypeSchemaCompletedListeners.add(toAdd);
  }

  public void removeGetVirtualFolderTypeSchemaCompleted(
      EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs1> toRemove) {
    _GetVirtualFolderTypeSchemaCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1>>
      _GetEnumValuesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1>>();

  public void addGetEnumValuesCompleted(
      EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> toAdd) {
    _GetEnumValuesCompletedListeners.add(toAdd);
  }

  public void removeGetEnumValuesCompleted(
      EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs1> toRemove) {
    _GetEnumValuesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1>>
      _ResolveBundleTypesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1>>();

  public void addResolveBundleTypesCompleted(
      EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> toAdd) {
    _ResolveBundleTypesCompletedListeners.add(toAdd);
  }

  public void removeResolveBundleTypesCompleted(
      EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs1> toRemove) {
    _ResolveBundleTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1>>
      _CopyToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1>>();

  public void addCopyToKeywordCompleted(
      EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> toAdd) {
    _CopyToKeywordCompletedListeners.add(toAdd);
  }

  public void removeCopyToKeywordCompleted(
      EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs1> toRemove) {
    _CopyToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1>>
      _MoveToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1>>();

  public void addMoveToKeywordCompleted(
      EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> toAdd) {
    _MoveToKeywordCompletedListeners.add(toAdd);
  }

  public void removeMoveToKeywordCompleted(
      EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs1> toRemove) {
    _MoveToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1>>
      _GetTridionLanguagesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1>>();

  public void addGetTridionLanguagesCompleted(
      EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> toAdd) {
    _GetTridionLanguagesCompletedListeners.add(toAdd);
  }

  public void removeGetTridionLanguagesCompleted(
      EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs1> toRemove) {
    _GetTridionLanguagesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1>>
      _GetListWorkflowScriptTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1>>();

  public void addGetListWorkflowScriptTypesCompleted(
      EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> toAdd) {
    _GetListWorkflowScriptTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListWorkflowScriptTypesCompleted(
      EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs1> toRemove) {
    _GetListWorkflowScriptTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1>>
      _AddToWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1>>();

  public void addAddToWorkflowCompleted(
      EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> toAdd) {
    _AddToWorkflowCompletedListeners.add(toAdd);
  }

  public void removeAddToWorkflowCompleted(
      EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs1> toRemove) {
    _AddToWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1>>
      _RemoveFromWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1>>();

  public void addRemoveFromWorkflowCompleted(
      EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> toAdd) {
    _RemoveFromWorkflowCompletedListeners.add(toAdd);
  }

  public void removeRemoveFromWorkflowCompleted(
      EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs1> toRemove) {
    _RemoveFromWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<LockCompletedEventArgs1>>
      _LockCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<LockCompletedEventArgs1>>();

  public void addLockCompleted(EventHandlerTEventArgs<LockCompletedEventArgs1> toAdd) {
    _LockCompletedListeners.add(toAdd);
  }

  public void removeLockCompleted(EventHandlerTEventArgs<LockCompletedEventArgs1> toRemove) {
    _LockCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnlockCompletedEventArgs1>>
      _UnlockCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnlockCompletedEventArgs1>>();

  public void addUnlockCompleted(EventHandlerTEventArgs<UnlockCompletedEventArgs1> toAdd) {
    _UnlockCompletedListeners.add(toAdd);
  }

  public void removeUnlockCompleted(EventHandlerTEventArgs<UnlockCompletedEventArgs1> toRemove) {
    _UnlockCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1>>
      _StartWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1>>();

  public void addStartWorkflowCompleted(
      EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> toAdd) {
    _StartWorkflowCompletedListeners.add(toAdd);
  }

  public void removeStartWorkflowCompleted(
      EventHandlerTEventArgs<StartWorkflowCompletedEventArgs1> toRemove) {
    _StartWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>>
      _GetProcessDefinitionsForItemsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1>>();

  public void addGetProcessDefinitionsForItemsCompleted(
      EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1> toAdd) {
    _GetProcessDefinitionsForItemsCompletedListeners.add(toAdd);
  }

  public void removeGetProcessDefinitionsForItemsCompleted(
      EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs1> toRemove) {
    _GetProcessDefinitionsForItemsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1>>
      _GetSystemXsdCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1>>();

  public void addGetSystemXsdCompleted(
      EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> toAdd) {
    _GetSystemXsdCompletedListeners.add(toAdd);
  }

  public void removeGetSystemXsdCompleted(
      EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs1> toRemove) {
    _GetSystemXsdCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1>>
      _GetSchemasByNamespaceUriCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1>>();

  public void addGetSchemasByNamespaceUriCompleted(
      EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> toAdd) {
    _GetSchemasByNamespaceUriCompletedListeners.add(toAdd);
  }

  public void removeGetSchemasByNamespaceUriCompleted(
      EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs1> toRemove) {
    _GetSchemasByNamespaceUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ValidateCompletedEventArgs1>>
      _ValidateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ValidateCompletedEventArgs1>>();

  public void addValidateCompleted(EventHandlerTEventArgs<ValidateCompletedEventArgs1> toAdd) {
    _ValidateCompletedListeners.add(toAdd);
  }

  public void removeValidateCompleted(
      EventHandlerTEventArgs<ValidateCompletedEventArgs1> toRemove) {
    _ValidateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1>>
      _GetExternalBinaryContentDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1>>();

  public void addGetExternalBinaryContentDataCompleted(
      EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> toAdd) {
    _GetExternalBinaryContentDataCompletedListeners.add(toAdd);
  }

  public void removeGetExternalBinaryContentDataCompleted(
      EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs1> toRemove) {
    _GetExternalBinaryContentDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1>>
      _SynchronizeWithSchemaCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1>>();

  public void addSynchronizeWithSchemaCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> toAdd) {
    _SynchronizeWithSchemaCompletedListeners.add(toAdd);
  }

  public void removeSynchronizeWithSchemaCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs1> toRemove) {
    _SynchronizeWithSchemaCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>>
      _SynchronizeWithSchemaAndUpdateCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1>>();

  public void addSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1> toAdd) {
    _SynchronizeWithSchemaAndUpdateCompletedListeners.add(toAdd);
  }

  public void removeSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs1> toRemove) {
    _SynchronizeWithSchemaAndUpdateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _DecommissionPublicationTargetCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addDecommissionPublicationTargetCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _DecommissionPublicationTargetCompletedListeners.add(toAdd);
  }

  public void removeDecommissionPublicationTargetCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _DecommissionPublicationTargetCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1>>
      _ConvertXsdToSchemaFieldsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1>>();

  public void addConvertXsdToSchemaFieldsCompleted(
      EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> toAdd) {
    _ConvertXsdToSchemaFieldsCompletedListeners.add(toAdd);
  }

  public void removeConvertXsdToSchemaFieldsCompleted(
      EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs1> toRemove) {
    _ConvertXsdToSchemaFieldsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1>>
      _GetPublishUrlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1>>();

  public void addGetPublishUrlCompleted(
      EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> toAdd) {
    _GetPublishUrlCompletedListeners.add(toAdd);
  }

  public void removeGetPublishUrlCompleted(
      EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs1> toRemove) {
    _GetPublishUrlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1>>
      _GetBusinessProcessTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1>>();

  public void addGetBusinessProcessTypesCompleted(
      EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> toAdd) {
    _GetBusinessProcessTypesCompletedListeners.add(toAdd);
  }

  public void removeGetBusinessProcessTypesCompleted(
      EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs1> toRemove) {
    _GetBusinessProcessTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1>>
      _GetPublishSourceByUrlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1>>();

  public void addGetPublishSourceByUrlCompleted(
      EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> toAdd) {
    _GetPublishSourceByUrlCompletedListeners.add(toAdd);
  }

  public void removeGetPublishSourceByUrlCompleted(
      EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs1> toRemove) {
    _GetPublishSourceByUrlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _RemovePublishStatesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addRemovePublishStatesCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _RemovePublishStatesCompletedListeners.add(toAdd);
  }

  public void removeRemovePublishStatesCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _RemovePublishStatesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1>>
      _ResolveContainingPagesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1>>();

  public void addResolveContainingPagesCompleted(
      EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> toAdd) {
    _ResolveContainingPagesCompletedListeners.add(toAdd);
  }

  public void removeResolveContainingPagesCompleted(
      EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs1> toRemove) {
    _ResolveContainingPagesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _PurgeWorkflowHistoryCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addPurgeWorkflowHistoryCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _PurgeWorkflowHistoryCompletedListeners.add(toAdd);
  }

  public void removePurgeWorkflowHistoryCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _PurgeWorkflowHistoryCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _BroadcastNotificationCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addBroadcastNotificationCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _BroadcastNotificationCompletedListeners.add(toAdd);
  }

  public void removeBroadcastNotificationCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _BroadcastNotificationCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1>>
      _GetSystemPrivilegesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1>>();

  public void addGetSystemPrivilegesCompleted(
      EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> toAdd) {
    _GetSystemPrivilegesCompletedListeners.add(toAdd);
  }

  public void removeGetSystemPrivilegesCompleted(
      EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs1> toRemove) {
    _GetSystemPrivilegesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1>>
      _GetApiVersionCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1>>();

  public void addGetApiVersionCompleted(
      EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> toAdd) {
    _GetApiVersionCompletedListeners.add(toAdd);
  }

  public void removeGetApiVersionCompleted(
      EventHandlerTEventArgs<GetApiVersionCompletedEventArgs1> toRemove) {
    _GetApiVersionCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1>>
      _GetCurrentUserCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1>>();

  public void addGetCurrentUserCompleted(
      EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> toAdd) {
    _GetCurrentUserCompletedListeners.add(toAdd);
  }

  public void removeGetCurrentUserCompleted(
      EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs1> toRemove) {
    _GetCurrentUserCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1>>
      _IsExistingObjectCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1>>();

  public void addIsExistingObjectCompleted(
      EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> toAdd) {
    _IsExistingObjectCompletedListeners.add(toAdd);
  }

  public void removeIsExistingObjectCompleted(
      EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs1> toRemove) {
    _IsExistingObjectCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1>>
      _GetTcmUriCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1>>();

  public void addGetTcmUriCompleted(EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> toAdd) {
    _GetTcmUriCompletedListeners.add(toAdd);
  }

  public void removeGetTcmUriCompleted(
      EventHandlerTEventArgs<GetTcmUriCompletedEventArgs1> toRemove) {
    _GetTcmUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1>>
      _TryGetTcmUriCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1>>();

  public void addTryGetTcmUriCompleted(
      EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> toAdd) {
    _TryGetTcmUriCompletedListeners.add(toAdd);
  }

  public void removeTryGetTcmUriCompleted(
      EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs1> toRemove) {
    _TryGetTcmUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadCompletedEventArgs1>>
      _ReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadCompletedEventArgs1>>();

  public void addReadCompleted(EventHandlerTEventArgs<ReadCompletedEventArgs1> toAdd) {
    _ReadCompletedListeners.add(toAdd);
  }

  public void removeReadCompleted(EventHandlerTEventArgs<ReadCompletedEventArgs1> toRemove) {
    _ReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryReadCompletedEventArgs1>>
      _TryReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryReadCompletedEventArgs1>>();

  public void addTryReadCompleted(EventHandlerTEventArgs<TryReadCompletedEventArgs1> toAdd) {
    _TryReadCompletedListeners.add(toAdd);
  }

  public void removeTryReadCompleted(EventHandlerTEventArgs<TryReadCompletedEventArgs1> toRemove) {
    _TryReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BulkReadCompletedEventArgs1>>
      _BulkReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BulkReadCompletedEventArgs1>>();

  public void addBulkReadCompleted(EventHandlerTEventArgs<BulkReadCompletedEventArgs1> toAdd) {
    _BulkReadCompletedListeners.add(toAdd);
  }

  public void removeBulkReadCompleted(
      EventHandlerTEventArgs<BulkReadCompletedEventArgs1> toRemove) {
    _BulkReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1>>
      _ReadSchemaFieldsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1>>();

  public void addReadSchemaFieldsCompleted(
      EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> toAdd) {
    _ReadSchemaFieldsCompletedListeners.add(toAdd);
  }

  public void removeReadSchemaFieldsCompleted(
      EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs1> toRemove) {
    _ReadSchemaFieldsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1>>
      _ConvertSchemaFieldsToXsdCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1>>();

  public void addConvertSchemaFieldsToXsdCompleted(
      EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> toAdd) {
    _ConvertSchemaFieldsToXsdCompletedListeners.add(toAdd);
  }

  public void removeConvertSchemaFieldsToXsdCompleted(
      EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs1> toRemove) {
    _ConvertSchemaFieldsToXsdCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SaveCompletedEventArgs1>>
      _SaveCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<SaveCompletedEventArgs1>>();

  public void addSaveCompleted(EventHandlerTEventArgs<SaveCompletedEventArgs1> toAdd) {
    _SaveCompletedListeners.add(toAdd);
  }

  public void removeSaveCompleted(EventHandlerTEventArgs<SaveCompletedEventArgs1> toRemove) {
    _SaveCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _DeleteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addDeleteCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _DeleteCompletedListeners.add(toAdd);
  }

  public void removeDeleteCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _DeleteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _DeleteTaxonomyNodeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addDeleteTaxonomyNodeCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _DeleteTaxonomyNodeCompletedListeners.add(toAdd);
  }

  public void removeDeleteTaxonomyNodeCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _DeleteTaxonomyNodeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1>>
      _GetDefaultDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1>>();

  public void addGetDefaultDataCompleted(
      EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> toAdd) {
    _GetDefaultDataCompletedListeners.add(toAdd);
  }

  public void removeGetDefaultDataCompleted(
      EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs1> toRemove) {
    _GetDefaultDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MoveCompletedEventArgs1>>
      _MoveCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MoveCompletedEventArgs1>>();

  public void addMoveCompleted(EventHandlerTEventArgs<MoveCompletedEventArgs1> toAdd) {
    _MoveCompletedListeners.add(toAdd);
  }

  public void removeMoveCompleted(EventHandlerTEventArgs<MoveCompletedEventArgs1> toRemove) {
    _MoveCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CopyCompletedEventArgs1>>
      _CopyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CopyCompletedEventArgs1>>();

  public void addCopyCompleted(EventHandlerTEventArgs<CopyCompletedEventArgs1> toAdd) {
    _CopyCompletedListeners.add(toAdd);
  }

  public void removeCopyCompleted(EventHandlerTEventArgs<CopyCompletedEventArgs1> toRemove) {
    _CopyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1>>
      _GetInstanceDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1>>();

  public void addGetInstanceDataCompleted(
      EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> toAdd) {
    _GetInstanceDataCompletedListeners.add(toAdd);
  }

  public void removeGetInstanceDataCompleted(
      EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs1> toRemove) {
    _GetInstanceDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1>>
      _TryCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1>>();

  public void addTryCheckOutCompleted(
      EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> toAdd) {
    _TryCheckOutCompletedListeners.add(toAdd);
  }

  public void removeTryCheckOutCompleted(
      EventHandlerTEventArgs<TryCheckOutCompletedEventArgs1> toRemove) {
    _TryCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CheckOutCompletedEventArgs1>>
      _CheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CheckOutCompletedEventArgs1>>();

  public void addCheckOutCompleted(EventHandlerTEventArgs<CheckOutCompletedEventArgs1> toAdd) {
    _CheckOutCompletedListeners.add(toAdd);
  }

  public void removeCheckOutCompleted(
      EventHandlerTEventArgs<CheckOutCompletedEventArgs1> toRemove) {
    _CheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CheckInCompletedEventArgs1>>
      _CheckInCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CheckInCompletedEventArgs1>>();

  public void addCheckInCompleted(EventHandlerTEventArgs<CheckInCompletedEventArgs1> toAdd) {
    _CheckInCompletedListeners.add(toAdd);
  }

  public void removeCheckInCompleted(EventHandlerTEventArgs<CheckInCompletedEventArgs1> toRemove) {
    _CheckInCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UpdateCompletedEventArgs1>>
      _UpdateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UpdateCompletedEventArgs1>>();

  public void addUpdateCompleted(EventHandlerTEventArgs<UpdateCompletedEventArgs1> toAdd) {
    _UpdateCompletedListeners.add(toAdd);
  }

  public void removeUpdateCompleted(EventHandlerTEventArgs<UpdateCompletedEventArgs1> toRemove) {
    _UpdateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CreateCompletedEventArgs1>>
      _CreateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CreateCompletedEventArgs1>>();

  public void addCreateCompleted(EventHandlerTEventArgs<CreateCompletedEventArgs1> toAdd) {
    _CreateCompletedListeners.add(toAdd);
  }

  public void removeCreateCompleted(EventHandlerTEventArgs<CreateCompletedEventArgs1> toRemove) {
    _CreateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1>>
      _UndoCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1>>();

  public void addUndoCheckOutCompleted(
      EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> toAdd) {
    _UndoCheckOutCompletedListeners.add(toAdd);
  }

  public void removeUndoCheckOutCompleted(
      EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs1> toRemove) {
    _UndoCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RollbackCompletedEventArgs1>>
      _RollbackCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RollbackCompletedEventArgs1>>();

  public void addRollbackCompleted(EventHandlerTEventArgs<RollbackCompletedEventArgs1> toAdd) {
    _RollbackCompletedListeners.add(toAdd);
  }

  public void removeRollbackCompleted(
      EventHandlerTEventArgs<RollbackCompletedEventArgs1> toRemove) {
    _RollbackCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<LocalizeCompletedEventArgs1>>
      _LocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<LocalizeCompletedEventArgs1>>();

  public void addLocalizeCompleted(EventHandlerTEventArgs<LocalizeCompletedEventArgs1> toAdd) {
    _LocalizeCompletedListeners.add(toAdd);
  }

  public void removeLocalizeCompleted(
      EventHandlerTEventArgs<LocalizeCompletedEventArgs1> toRemove) {
    _LocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1>>
      _UnLocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1>>();

  public void addUnLocalizeCompleted(EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> toAdd) {
    _UnLocalizeCompletedListeners.add(toAdd);
  }

  public void removeUnLocalizeCompleted(
      EventHandlerTEventArgs<UnLocalizeCompletedEventArgs1> toRemove) {
    _UnLocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PromoteCompletedEventArgs1>>
      _PromoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PromoteCompletedEventArgs1>>();

  public void addPromoteCompleted(EventHandlerTEventArgs<PromoteCompletedEventArgs1> toAdd) {
    _PromoteCompletedListeners.add(toAdd);
  }

  public void removePromoteCompleted(EventHandlerTEventArgs<PromoteCompletedEventArgs1> toRemove) {
    _PromoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<DemoteCompletedEventArgs1>>
      _DemoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<DemoteCompletedEventArgs1>>();

  public void addDemoteCompleted(EventHandlerTEventArgs<DemoteCompletedEventArgs1> toAdd) {
    _DemoteCompletedListeners.add(toAdd);
  }

  public void removeDemoteCompleted(EventHandlerTEventArgs<DemoteCompletedEventArgs1> toRemove) {
    _DemoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1>>
      _GetListTemplateTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1>>();

  public void addGetListTemplateTypesCompleted(
      EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> toAdd) {
    _GetListTemplateTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListTemplateTypesCompleted(
      EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs1> toRemove) {
    _GetListTemplateTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1>>
      _GetListPublicationTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1>>();

  public void addGetListPublicationTypesCompleted(
      EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> toAdd) {
    _GetListPublicationTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListPublicationTypesCompleted(
      EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs1> toRemove) {
    _GetListPublicationTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1>>
      _GetSystemWideListXmlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1>>();

  public void addGetSystemWideListXmlCompleted(
      EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> toAdd) {
    _GetSystemWideListXmlCompletedListeners.add(toAdd);
  }

  public void removeGetSystemWideListXmlCompleted(
      EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs1> toRemove) {
    _GetSystemWideListXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1>>
      _GetSystemWideListCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1>>();

  public void addGetSystemWideListCompleted(
      EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> toAdd) {
    _GetSystemWideListCompletedListeners.add(toAdd);
  }

  public void removeGetSystemWideListCompleted(
      EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs1> toRemove) {
    _GetSystemWideListCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListXmlCompletedEventArgs1>>
      _GetListXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListXmlCompletedEventArgs1>>();

  public void addGetListXmlCompleted(EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> toAdd) {
    _GetListXmlCompletedListeners.add(toAdd);
  }

  public void removeGetListXmlCompleted(
      EventHandlerTEventArgs<GetListXmlCompletedEventArgs1> toRemove) {
    _GetListXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListCompletedEventArgs1>>
      _GetListCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListCompletedEventArgs1>>();

  public void addGetListCompleted(EventHandlerTEventArgs<GetListCompletedEventArgs1> toAdd) {
    _GetListCompletedListeners.add(toAdd);
  }

  public void removeGetListCompleted(EventHandlerTEventArgs<GetListCompletedEventArgs1> toRemove) {
    _GetListCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1>>
      _GetListDirectoryServiceNamesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1>>();

  public void addGetListDirectoryServiceNamesCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> toAdd) {
    _GetListDirectoryServiceNamesCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceNamesCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs1> toRemove) {
    _GetListDirectoryServiceNamesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1>>
      _GetListWindowsDomainUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1>>();

  public void addGetListWindowsDomainUsersCompleted(
      EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> toAdd) {
    _GetListWindowsDomainUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListWindowsDomainUsersCompleted(
      EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs1> toRemove) {
    _GetListWindowsDomainUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>>
      _GetListDirectoryServiceAllUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1>>();

  public void addGetListDirectoryServiceAllUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1> toAdd) {
    _GetListDirectoryServiceAllUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceAllUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs1> toRemove) {
    _GetListDirectoryServiceAllUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>>
      _GetListDirectoryServiceGroupMembersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1>>();

  public void addGetListDirectoryServiceGroupMembersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1> toAdd) {
    _GetListDirectoryServiceGroupMembersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceGroupMembersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs1> toRemove) {
    _GetListDirectoryServiceGroupMembersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1>>
      _GetListDirectoryServiceUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1>>();

  public void addGetListDirectoryServiceUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> toAdd) {
    _GetListDirectoryServiceUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs1> toRemove) {
    _GetListDirectoryServiceUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ClassifyCompletedEventArgs1>>
      _ClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ClassifyCompletedEventArgs1>>();

  public void addClassifyCompleted(EventHandlerTEventArgs<ClassifyCompletedEventArgs1> toAdd) {
    _ClassifyCompletedListeners.add(toAdd);
  }

  public void removeClassifyCompleted(
      EventHandlerTEventArgs<ClassifyCompletedEventArgs1> toRemove) {
    _ClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnClassifyCompletedEventArgs1>>
      _UnClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnClassifyCompletedEventArgs1>>();

  public void addUnClassifyCompleted(EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> toAdd) {
    _UnClassifyCompletedListeners.add(toAdd);
  }

  public void removeUnClassifyCompleted(
      EventHandlerTEventArgs<UnClassifyCompletedEventArgs1> toRemove) {
    _UnClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReClassifyCompletedEventArgs1>>
      _ReClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReClassifyCompletedEventArgs1>>();

  public void addReClassifyCompleted(EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> toAdd) {
    _ReClassifyCompletedListeners.add(toAdd);
  }

  public void removeReClassifyCompleted(
      EventHandlerTEventArgs<ReClassifyCompletedEventArgs1> toRemove) {
    _ReClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<StartActivityCompletedEventArgs1>>
      _StartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<StartActivityCompletedEventArgs1>>();

  public void addStartActivityCompleted(
      EventHandlerTEventArgs<StartActivityCompletedEventArgs1> toAdd) {
    _StartActivityCompletedListeners.add(toAdd);
  }

  public void removeStartActivityCompleted(
      EventHandlerTEventArgs<StartActivityCompletedEventArgs1> toRemove) {
    _StartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1>>
      _SuspendActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1>>();

  public void addSuspendActivityCompleted(
      EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> toAdd) {
    _SuspendActivityCompletedListeners.add(toAdd);
  }

  public void removeSuspendActivityCompleted(
      EventHandlerTEventArgs<SuspendActivityCompletedEventArgs1> toRemove) {
    _SuspendActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RestartActivityCompletedEventArgs1>>
      _RestartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RestartActivityCompletedEventArgs1>>();

  public void addRestartActivityCompleted(
      EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> toAdd) {
    _RestartActivityCompletedListeners.add(toAdd);
  }

  public void removeRestartActivityCompleted(
      EventHandlerTEventArgs<RestartActivityCompletedEventArgs1> toRemove) {
    _RestartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1>>
      _ReAssignActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1>>();

  public void addReAssignActivityCompleted(
      EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> toAdd) {
    _ReAssignActivityCompletedListeners.add(toAdd);
  }

  public void removeReAssignActivityCompleted(
      EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs1> toRemove) {
    _ReAssignActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<FinishActivityCompletedEventArgs1>>
      _FinishActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<FinishActivityCompletedEventArgs1>>();

  public void addFinishActivityCompleted(
      EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> toAdd) {
    _FinishActivityCompletedListeners.add(toAdd);
  }

  public void removeFinishActivityCompleted(
      EventHandlerTEventArgs<FinishActivityCompletedEventArgs1> toRemove) {
    _FinishActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1>>
      _ForceFinishProcessCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1>>();

  public void addForceFinishProcessCompleted(
      EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> toAdd) {
    _ForceFinishProcessCompletedListeners.add(toAdd);
  }

  public void removeForceFinishProcessCompleted(
      EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs1> toRemove) {
    _ForceFinishProcessCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1>>
      _ResumeActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1>>();

  public void addResumeActivityCompleted(
      EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> toAdd) {
    _ResumeActivityCompletedListeners.add(toAdd);
  }

  public void removeResumeActivityCompleted(
      EventHandlerTEventArgs<ResumeActivityCompletedEventArgs1> toRemove) {
    _ResumeActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1>>
      _GetListQueueMessagesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1>>();

  public void addGetListQueueMessagesCompleted(
      EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> toAdd) {
    _GetListQueueMessagesCompletedListeners.add(toAdd);
  }

  public void removeGetListQueueMessagesCompleted(
      EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs1> toRemove) {
    _GetListQueueMessagesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _PurgeQueueCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addPurgeQueueCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _PurgeQueueCompletedListeners.add(toAdd);
  }

  public void removePurgeQueueCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _PurgeQueueCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1>>
      _GetListQueuesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1>>();

  public void addGetListQueuesCompleted(
      EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> toAdd) {
    _GetListQueuesCompletedListeners.add(toAdd);
  }

  public void removeGetListQueuesCompleted(
      EventHandlerTEventArgs<GetListQueuesCompletedEventArgs1> toRemove) {
    _GetListQueuesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1>>
      _ReadApplicationDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1>>();

  public void addReadApplicationDataCompleted(
      EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> toAdd) {
    _ReadApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeReadApplicationDataCompleted(
      EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs1> toRemove) {
    _ReadApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1>>
      _ReadAllApplicationDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1>>();

  public void addReadAllApplicationDataCompleted(
      EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> toAdd) {
    _ReadAllApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeReadAllApplicationDataCompleted(
      EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs1> toRemove) {
    _ReadAllApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _SaveApplicationDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addSaveApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _SaveApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeSaveApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _SaveApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _DeleteApplicationDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addDeleteApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _DeleteApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeDeleteApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _DeleteApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1>>
      _GetApplicationIdsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1>>();

  public void addGetApplicationIdsCompleted(
      EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> toAdd) {
    _GetApplicationIdsCompletedListeners.add(toAdd);
  }

  public void removeGetApplicationIdsCompleted(
      EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs1> toRemove) {
    _GetApplicationIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _PurgeApplicationDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addPurgeApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _PurgeApplicationDataCompletedListeners.add(toAdd);
  }

  public void removePurgeApplicationDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _PurgeApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>>
      _ParsePredefinedBatchOperationCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1>>();

  public void addParsePredefinedBatchOperationCompleted(
      EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1> toAdd) {
    _ParsePredefinedBatchOperationCompletedListeners.add(toAdd);
  }

  public void removeParsePredefinedBatchOperationCompleted(
      EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs1> toRemove) {
    _ParsePredefinedBatchOperationCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>>
      _GetPredefinedBatchOperationNameCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1>>();

  public void addGetPredefinedBatchOperationNameCompleted(
      EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1> toAdd) {
    _GetPredefinedBatchOperationNameCompletedListeners.add(toAdd);
  }

  public void removeGetPredefinedBatchOperationNameCompleted(
      EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs1> toRemove) {
    _GetPredefinedBatchOperationNameCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1>>
      _ResolveItemsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1>>();

  public void addResolveItemsCompleted(
      EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> toAdd) {
    _ResolveItemsCompletedListeners.add(toAdd);
  }

  public void removeResolveItemsCompleted(
      EventHandlerTEventArgs<ResolveItemsCompletedEventArgs1> toRemove) {
    _ResolveItemsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1>>
      _GetSearchResultsXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1>>();

  public void addGetSearchResultsXmlCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> toAdd) {
    _GetSearchResultsXmlCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsXmlCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs1> toRemove) {
    _GetSearchResultsXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1>>
      _GetSearchResultsXmlPagedCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1>>();

  public void addGetSearchResultsXmlPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> toAdd) {
    _GetSearchResultsXmlPagedCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsXmlPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs1> toRemove) {
    _GetSearchResultsXmlPagedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1>>
      _GetSearchResultsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1>>();

  public void addGetSearchResultsCompleted(
      EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> toAdd) {
    _GetSearchResultsCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsCompleted(
      EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs1> toRemove) {
    _GetSearchResultsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1>>
      _GetSearchResultsPagedCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1>>();

  public void addGetSearchResultsPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> toAdd) {
    _GetSearchResultsPagedCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs1> toRemove) {
    _GetSearchResultsPagedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RenderItemCompletedEventArgs1>>
      _RenderItemCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RenderItemCompletedEventArgs1>>();

  public void addRenderItemCompleted(EventHandlerTEventArgs<RenderItemCompletedEventArgs1> toAdd) {
    _RenderItemCompletedListeners.add(toAdd);
  }

  public void removeRenderItemCompleted(
      EventHandlerTEventArgs<RenderItemCompletedEventArgs1> toRemove) {
    _RenderItemCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PreviewItemCompletedEventArgs1>>
      _PreviewItemCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PreviewItemCompletedEventArgs1>>();

  public void addPreviewItemCompleted(
      EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> toAdd) {
    _PreviewItemCompletedListeners.add(toAdd);
  }

  public void removePreviewItemCompleted(
      EventHandlerTEventArgs<PreviewItemCompletedEventArgs1> toRemove) {
    _PreviewItemCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PublishCompletedEventArgs1>>
      _PublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PublishCompletedEventArgs1>>();

  public void addPublishCompleted(EventHandlerTEventArgs<PublishCompletedEventArgs1> toAdd) {
    _PublishCompletedListeners.add(toAdd);
  }

  public void removePublishCompleted(EventHandlerTEventArgs<PublishCompletedEventArgs1> toRemove) {
    _PublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnPublishCompletedEventArgs1>>
      _UnPublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnPublishCompletedEventArgs1>>();

  public void addUnPublishCompleted(EventHandlerTEventArgs<UnPublishCompletedEventArgs1> toAdd) {
    _UnPublishCompletedListeners.add(toAdd);
  }

  public void removeUnPublishCompleted(
      EventHandlerTEventArgs<UnPublishCompletedEventArgs1> toRemove) {
    _UnPublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<IsPublishedCompletedEventArgs1>>
      _IsPublishedCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<IsPublishedCompletedEventArgs1>>();

  public void addIsPublishedCompleted(
      EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> toAdd) {
    _IsPublishedCompletedListeners.add(toAdd);
  }

  public void removeIsPublishedCompleted(
      EventHandlerTEventArgs<IsPublishedCompletedEventArgs1> toRemove) {
    _IsPublishedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1>>
      _GetWorkItemSnapshotCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1>>();

  public void addGetWorkItemSnapshotCompleted(
      EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> toAdd) {
    _GetWorkItemSnapshotCompletedListeners.add(toAdd);
  }

  public void removeGetWorkItemSnapshotCompleted(
      EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs1> toRemove) {
    _GetWorkItemSnapshotCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1>>
      _GetListPublishInfoCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1>>();

  public void addGetListPublishInfoCompleted(
      EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> toAdd) {
    _GetListPublishInfoCompletedListeners.add(toAdd);
  }

  public void removeGetListPublishInfoCompleted(
      EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs1> toRemove) {
    _GetListPublishInfoCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CastActionsCompletedEventArgs1>>
      _CastActionsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CastActionsCompletedEventArgs1>>();

  public void addCastActionsCompleted(
      EventHandlerTEventArgs<CastActionsCompletedEventArgs1> toAdd) {
    _CastActionsCompletedListeners.add(toAdd);
  }

  public void removeCastActionsCompleted(
      EventHandlerTEventArgs<CastActionsCompletedEventArgs1> toRemove) {
    _CastActionsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _ValidateXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addValidateXmlCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _ValidateXmlCompletedListeners.add(toAdd);
  }

  public void removeValidateXmlCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _ValidateXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1>>
      _IsValidTridionWebSchemaXmlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1>>();

  public void addIsValidTridionWebSchemaXmlCompleted(
      EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> toAdd) {
    _IsValidTridionWebSchemaXmlCompletedListeners.add(toAdd);
  }

  public void removeIsValidTridionWebSchemaXmlCompleted(
      EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs1> toRemove) {
    _IsValidTridionWebSchemaXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>>
      _GetSubjectIdsWithApplicationDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1>>();

  public void addGetSubjectIdsWithApplicationDataCompleted(
      EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1> toAdd) {
    _GetSubjectIdsWithApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeGetSubjectIdsWithApplicationDataCompleted(
      EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs1> toRemove) {
    _GetSubjectIdsWithApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>>
      _ReadApplicationDataForSubjectsIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1>>();

  public void addReadApplicationDataForSubjectsIdsCompleted(
      EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1> toAdd) {
    _ReadApplicationDataForSubjectsIdsCompletedListeners.add(toAdd);
  }

  public void removeReadApplicationDataForSubjectsIdsCompleted(
      EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs1> toRemove) {
    _ReadApplicationDataForSubjectsIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>>
      _GetSecurityDescriptorsForSubjectsIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1>>();

  public void addGetSecurityDescriptorsForSubjectsIdsCompleted(
      EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1> toAdd) {
    _GetSecurityDescriptorsForSubjectsIdsCompletedListeners.add(toAdd);
  }

  public void removeGetSecurityDescriptorsForSubjectsIdsCompleted(
      EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs1> toRemove) {
    _GetSecurityDescriptorsForSubjectsIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>>
      _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<
                  GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>>();

  public void addGetContentSecurityDescriptorsForOrgItemIdsCompleted(
      EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1> toAdd) {
    _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners.add(toAdd);
  }

  public void removeGetContentSecurityDescriptorsForOrgItemIdsCompleted(
      EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs1>
          toRemove) {
    _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _ReIndexCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addReIndexCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _ReIndexCompletedListeners.add(toAdd);
  }

  public void removeReIndexCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _ReIndexCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1>>
      _CastPredefinedQueueCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1>>();

  public void addCastPredefinedQueueCompleted(
      EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> toAdd) {
    _CastPredefinedQueueCompletedListeners.add(toAdd);
  }

  public void removeCastPredefinedQueueCompleted(
      EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs1> toRemove) {
    _CastPredefinedQueueCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1>>
      _PurgeOldVersionsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1>>();

  public void addPurgeOldVersionsCompleted(
      EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> toAdd) {
    _PurgeOldVersionsCompletedListeners.add(toAdd);
  }

  public void removePurgeOldVersionsCompleted(
      EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs1> toRemove) {
    _PurgeOldVersionsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1>>
      _GetListExternalLinksCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1>>();

  public void addGetListExternalLinksCompleted(
      EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> toAdd) {
    _GetListExternalLinksCompletedListeners.add(toAdd);
  }

  public void removeGetListExternalLinksCompleted(
      EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs1> toRemove) {
    _GetListExternalLinksCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1>>
      _ConvertXmlToSearchQueryCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1>>();

  public void addConvertXmlToSearchQueryCompleted(
      EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> toAdd) {
    _ConvertXmlToSearchQueryCompletedListeners.add(toAdd);
  }

  public void removeConvertXmlToSearchQueryCompleted(
      EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs1> toRemove) {
    _ConvertXmlToSearchQueryCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1>>
      _ConvertSearchQueryToXmlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1>>();

  public void addConvertSearchQueryToXmlCompleted(
      EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> toAdd) {
    _ConvertSearchQueryToXmlCompletedListeners.add(toAdd);
  }

  public void removeConvertSearchQueryToXmlCompleted(
      EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs1> toRemove) {
    _ConvertSearchQueryToXmlCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
