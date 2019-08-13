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

public class SessionAwareCoreServiceClient extends ClientBase<ISessionAwareCoreService>
    implements ICommunicationObject, IDisposable, ISessionAwareCoreService {
  protected NObject javonetHandle;

  public SessionAwareCoreServiceClient() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.SessionAwareCoreServiceClient");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> handler :
                  _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> handler :
                  _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateCompletedEventArgs> handler :
                  _ImpersonateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> handler :
                  _ImpersonateWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TerminateSessionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _TerminateSessionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionIdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> handler :
                  _GetSessionIdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionIdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionContextDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionContextDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> handler :
                  _GetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionTransactionTimeoutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartCachingCompletedEventArgs> handler :
                  _StartCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartCachingCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StopCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _StopCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetWebDavUrlPrefixCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetWebDavUrlPrefixCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnlistInTransactionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _EnlistInTransactionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ElevatePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> handler :
                  _ElevatePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ElevatePrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestorePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> handler :
                  _RestorePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestorePrivilegesCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionAwareCoreServiceClient(java.lang.String endpointConfigurationName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.SessionAwareCoreServiceClient",
              endpointConfigurationName);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> handler :
                  _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> handler :
                  _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateCompletedEventArgs> handler :
                  _ImpersonateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> handler :
                  _ImpersonateWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TerminateSessionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _TerminateSessionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionIdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> handler :
                  _GetSessionIdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionIdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionContextDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionContextDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> handler :
                  _GetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionTransactionTimeoutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartCachingCompletedEventArgs> handler :
                  _StartCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartCachingCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StopCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _StopCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetWebDavUrlPrefixCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetWebDavUrlPrefixCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnlistInTransactionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _EnlistInTransactionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ElevatePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> handler :
                  _ElevatePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ElevatePrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestorePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> handler :
                  _RestorePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestorePrivilegesCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionAwareCoreServiceClient(
      java.lang.String endpointConfigurationName, java.lang.String remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.SessionAwareCoreServiceClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> handler :
                  _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> handler :
                  _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateCompletedEventArgs> handler :
                  _ImpersonateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> handler :
                  _ImpersonateWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TerminateSessionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _TerminateSessionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionIdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> handler :
                  _GetSessionIdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionIdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionContextDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionContextDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> handler :
                  _GetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionTransactionTimeoutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartCachingCompletedEventArgs> handler :
                  _StartCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartCachingCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StopCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _StopCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetWebDavUrlPrefixCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetWebDavUrlPrefixCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnlistInTransactionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _EnlistInTransactionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ElevatePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> handler :
                  _ElevatePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ElevatePrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestorePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> handler :
                  _RestorePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestorePrivilegesCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionAwareCoreServiceClient(
      java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.SessionAwareCoreServiceClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> handler :
                  _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> handler :
                  _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateCompletedEventArgs> handler :
                  _ImpersonateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> handler :
                  _ImpersonateWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TerminateSessionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _TerminateSessionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionIdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> handler :
                  _GetSessionIdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionIdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionContextDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionContextDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> handler :
                  _GetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionTransactionTimeoutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartCachingCompletedEventArgs> handler :
                  _StartCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartCachingCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StopCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _StopCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetWebDavUrlPrefixCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetWebDavUrlPrefixCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnlistInTransactionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _EnlistInTransactionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ElevatePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> handler :
                  _ElevatePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ElevatePrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestorePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> handler :
                  _RestorePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestorePrivilegesCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionAwareCoreServiceClient(Binding binding, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.SessionAwareCoreServiceClient",
              binding,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetVirtualFolderTypeSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> handler :
                  _GetVirtualFolderTypeSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetVirtualFolderTypeSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetEnumValuesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> handler :
                  _GetEnumValuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetEnumValuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveBundleTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> handler :
                  _ResolveBundleTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveBundleTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> handler :
                  _CopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> handler :
                  _MoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTridionLanguagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> handler :
                  _GetTridionLanguagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTridionLanguagesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWorkflowScriptTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> handler :
                  _GetListWorkflowScriptTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWorkflowScriptTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddToWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> handler :
                  _AddToWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AddToWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RemoveFromWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> handler :
                  _RemoveFromWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RemoveFromWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LockCompletedEventArgs> handler :
                  _LockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnlockCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnlockCompletedEventArgs> handler :
                  _UnlockCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnlockCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartWorkflowCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> handler :
                  _StartWorkflowCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartWorkflowCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetProcessDefinitionsForItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> handler :
                  _GetProcessDefinitionsForItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetProcessDefinitionsForItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> handler :
                  _GetSystemXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSchemasByNamespaceUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> handler :
                  _GetSchemasByNamespaceUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSchemasByNamespaceUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ValidateCompletedEventArgs> handler :
                  _ValidateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetExternalBinaryContentDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> handler :
                  _GetExternalBinaryContentDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetExternalBinaryContentDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> handler :
                  _SynchronizeWithSchemaCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _SynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> handler :
                  _ConvertXsdToSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXsdToSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> handler :
                  _GetPublishUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishUrlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetBusinessProcessTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> handler :
                  _GetBusinessProcessTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetBusinessProcessTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPublishSourceByUrlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> handler :
                  _GetPublishSourceByUrlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPublishSourceByUrlCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> handler :
                  _ResolveContainingPagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveContainingPagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> handler :
                  _GetSystemPrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemPrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetApiVersionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> handler :
                  _GetApiVersionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApiVersionCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetCurrentUserCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> handler :
                  _GetCurrentUserCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetCurrentUserCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsExistingObjectCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> handler :
                  _IsExistingObjectCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsExistingObjectCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> handler :
                  _GetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryGetTcmUriCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> handler :
                  _TryGetTcmUriCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryGetTcmUriCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadCompletedEventArgs> handler :
                  _ReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryReadCompletedEventArgs> handler :
                  _TryReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BulkReadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BulkReadCompletedEventArgs> handler :
                  _BulkReadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BulkReadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadSchemaFieldsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> handler :
                  _ReadSchemaFieldsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadSchemaFieldsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSchemaFieldsToXsdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> handler :
                  _ConvertSchemaFieldsToXsdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSchemaFieldsToXsdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SaveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SaveCompletedEventArgs> handler :
                  _SaveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SaveCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> handler :
                  _GetDefaultDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetDefaultDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<MoveCompletedEventArgs> handler :
                  _MoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], MoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CopyCompletedEventArgs> handler :
                  _CopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetInstanceDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> handler :
                  _GetInstanceDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetInstanceDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TryCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> handler :
                  _TryCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], TryCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckOutCompletedEventArgs> handler :
                  _CheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CheckInCompletedEventArgs> handler :
                  _CheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UpdateCompletedEventArgs> handler :
                  _UpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UpdateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CreateCompletedEventArgs> handler :
                  _CreateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> handler :
                  _UndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollbackCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RollbackCompletedEventArgs> handler :
                  _RollbackCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RollbackCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<LocalizeCompletedEventArgs> handler :
                  _LocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> handler :
                  _UnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PromoteCompletedEventArgs> handler :
                  _PromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<DemoteCompletedEventArgs> handler :
                  _DemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListTemplateTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> handler :
                  _GetListTemplateTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListTemplateTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublicationTypesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> handler :
                  _GetListPublicationTypesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublicationTypesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> handler :
                  _GetSystemWideListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSystemWideListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> handler :
                  _GetSystemWideListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSystemWideListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListXmlCompletedEventArgs> handler :
                  _GetListXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListCompletedEventArgs> handler :
                  _GetListCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> handler :
                  _GetListDirectoryServiceNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListWindowsDomainUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> handler :
                  _GetListWindowsDomainUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListWindowsDomainUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceAllUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>
                  handler : _GetListDirectoryServiceAllUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceAllUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceGroupMembersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>
                  handler : _GetListDirectoryServiceGroupMembersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetListDirectoryServiceGroupMembersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListDirectoryServiceUsersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> handler :
                  _GetListDirectoryServiceUsersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListDirectoryServiceUsersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ClassifyCompletedEventArgs> handler :
                  _ClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnClassifyCompletedEventArgs> handler :
                  _UnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReClassifyCompletedEventArgs> handler :
                  _ReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartActivityCompletedEventArgs> handler :
                  _StartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> handler :
                  _SuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestartActivityCompletedEventArgs> handler :
                  _RestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> handler :
                  _ReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FinishActivityCompletedEventArgs> handler :
                  _FinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> handler :
                  _ForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> handler :
                  _ResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListQueueMessagesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> handler :
                  _GetListQueueMessagesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueueMessagesCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> handler :
                  _GetListQueuesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListQueuesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> handler :
                  _ReadApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadAllApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> handler :
                  _ReadAllApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadAllApplicationDataCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> handler :
                  _GetApplicationIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetApplicationIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> handler :
                  _ParsePredefinedBatchOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ParsePredefinedBatchOperationCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetPredefinedBatchOperationNameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>
                  handler : _GetPredefinedBatchOperationNameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetPredefinedBatchOperationNameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ResolveItemsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> handler :
                  _ResolveItemsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ResolveItemsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> handler :
                  _GetSearchResultsXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsXmlPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> handler :
                  _GetSearchResultsXmlPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsXmlPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> handler :
                  _GetSearchResultsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSearchResultsPagedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> handler :
                  _GetSearchResultsPagedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSearchResultsPagedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RenderItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RenderItemCompletedEventArgs> handler :
                  _RenderItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RenderItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewItemCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PreviewItemCompletedEventArgs> handler :
                  _PreviewItemCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewItemCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PublishCompletedEventArgs> handler :
                  _PublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<UnPublishCompletedEventArgs> handler :
                  _UnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "IsPublishedCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<IsPublishedCompletedEventArgs> handler :
                  _IsPublishedCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsPublishedCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetWorkItemSnapshotCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> handler :
                  _GetWorkItemSnapshotCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetWorkItemSnapshotCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListPublishInfoCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> handler :
                  _GetListPublishInfoCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListPublishInfoCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CastActionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<CastActionsCompletedEventArgs> handler :
                  _CastActionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastActionsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> handler :
                  _IsValidTridionWebSchemaXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], IsValidTridionWebSchemaXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSubjectIdsWithApplicationDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>
                  handler : _GetSubjectIdsWithApplicationDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSubjectIdsWithApplicationDataCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadApplicationDataForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>
                  handler : _ReadApplicationDataForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ReadApplicationDataForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSecurityDescriptorsForSubjectsIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>
                  handler : _GetSecurityDescriptorsForSubjectsIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetContentSecurityDescriptorsForOrgItemIdsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<
                      GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
                  handler : _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1],
                        GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs.class));
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
              for (EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> handler :
                  _CastPredefinedQueueCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CastPredefinedQueueCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PurgeOldVersionsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> handler :
                  _PurgeOldVersionsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PurgeOldVersionsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetListExternalLinksCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> handler :
                  _GetListExternalLinksCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetListExternalLinksCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertXmlToSearchQueryCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> handler :
                  _ConvertXmlToSearchQueryCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertXmlToSearchQueryCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ConvertSearchQueryToXmlCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> handler :
                  _ConvertSearchQueryToXmlCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertSearchQueryToXmlCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateCompletedEventArgs> handler :
                  _ImpersonateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> handler :
                  _ImpersonateWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TerminateSessionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _TerminateSessionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionIdCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> handler :
                  _GetSessionIdCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionIdCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionContextDataCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionContextDataCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetSessionTransactionTimeoutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> handler :
                  _GetSessionTransactionTimeoutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetSessionTransactionTimeoutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StartCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<StartCachingCompletedEventArgs> handler :
                  _StartCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StartCachingCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StopCachingCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _StopCachingCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SetWebDavUrlPrefixCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _SetWebDavUrlPrefixCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnlistInTransactionCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _EnlistInTransactionCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ElevatePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> handler :
                  _ElevatePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ElevatePrivilegesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RestorePrivilegesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> handler :
                  _RestorePrivilegesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RestorePrivilegesCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionAwareCoreServiceClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TerminateSessionAsync() {
    try {
      javonetHandle.invoke("TerminateSessionAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TerminateSessionAsync(Object userState) {
    try {
      javonetHandle.invoke("TerminateSessionAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSessionId() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("GetSessionId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSessionId(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginGetSessionId", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetSessionId(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndGetSessionId", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSessionIdAsync() {
    try {
      javonetHandle.invoke("GetSessionIdAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSessionIdAsync(Object userState) {
    try {
      javonetHandle.invoke("GetSessionIdAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionContextData(ApplicationData appData) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("SetSessionContextData", appData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSetSessionContextData(
      ApplicationData appData, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginSetSessionContextData", appData, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndSetSessionContextData(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndSetSessionContextData", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionContextDataAsync(ApplicationData appData) {
    try {
      javonetHandle.invoke("SetSessionContextDataAsync", appData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionContextDataAsync(ApplicationData appData, Object userState) {
    try {
      javonetHandle.invoke("SetSessionContextDataAsync", appData, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionTransactionTimeout(java.lang.Integer transactionTimeout) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("SetSessionTransactionTimeout", transactionTimeout);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSetSessionTransactionTimeout(
      java.lang.Integer transactionTimeout, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke(
                  "BeginSetSessionTransactionTimeout", transactionTimeout, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndSetSessionTransactionTimeout(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndSetSessionTransactionTimeout", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionTransactionTimeoutAsync(java.lang.Integer transactionTimeout) {
    try {
      javonetHandle.invoke("SetSessionTransactionTimeoutAsync", transactionTimeout);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSessionTransactionTimeoutAsync(
      java.lang.Integer transactionTimeout, Object userState) {
    try {
      javonetHandle.invoke("SetSessionTransactionTimeoutAsync", transactionTimeout, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSessionTransactionTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("GetSessionTransactionTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSessionTransactionTimeout(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginGetSessionTransactionTimeout", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer EndGetSessionTransactionTimeout(IAsyncResult result) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndGetSessionTransactionTimeout", result);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSessionTransactionTimeoutAsync() {
    try {
      javonetHandle.invoke("GetSessionTransactionTimeoutAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetSessionTransactionTimeoutAsync(Object userState) {
    try {
      javonetHandle.invoke("GetSessionTransactionTimeoutAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartCaching() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("StartCaching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStartCaching(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginStartCaching", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndStartCaching(IAsyncResult result) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndStartCaching", result);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartCachingAsync() {
    try {
      javonetHandle.invoke("StartCachingAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StartCachingAsync(Object userState) {
    try {
      javonetHandle.invoke("StartCachingAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StopCaching() {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("StopCaching");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStopCaching(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginStopCaching", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndStopCaching(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndStopCaching", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StopCachingAsync() {
    try {
      javonetHandle.invoke("StopCachingAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StopCachingAsync(Object userState) {
    try {
      javonetHandle.invoke("StopCachingAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetWebDavUrlPrefix(java.lang.String prefix) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("SetWebDavUrlPrefix", prefix);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSetWebDavUrlPrefix(
      java.lang.String prefix, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginSetWebDavUrlPrefix", prefix, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndSetWebDavUrlPrefix(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndSetWebDavUrlPrefix", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetWebDavUrlPrefixAsync(java.lang.String prefix) {
    try {
      javonetHandle.invoke("SetWebDavUrlPrefixAsync", prefix);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetWebDavUrlPrefixAsync(java.lang.String prefix, Object userState) {
    try {
      javonetHandle.invoke("SetWebDavUrlPrefixAsync", prefix, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistInTransaction() {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EnlistInTransaction");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginEnlistInTransaction(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginEnlistInTransaction", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndEnlistInTransaction(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndEnlistInTransaction", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistInTransactionAsync() {
    try {
      javonetHandle.invoke("EnlistInTransactionAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistInTransactionAsync(Object userState) {
    try {
      javonetHandle.invoke("EnlistInTransactionAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserData ElevatePrivileges(Privileges privileges) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("ElevatePrivileges", NEnum.fromJavaEnum(privileges));
      if (res == null) return null;
      return new UserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginElevatePrivileges(
      Privileges privileges, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke(
                  "BeginElevatePrivileges", NEnum.fromJavaEnum(privileges), callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserData EndElevatePrivileges(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndElevatePrivileges", result);
      if (res == null) return null;
      return new UserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ElevatePrivilegesAsync(Privileges privileges) {
    try {
      javonetHandle.invoke("ElevatePrivilegesAsync", NEnum.fromJavaEnum(privileges));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ElevatePrivilegesAsync(Privileges privileges, Object userState) {
    try {
      javonetHandle.invoke("ElevatePrivilegesAsync", NEnum.fromJavaEnum(privileges), userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserData RestorePrivileges() {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("RestorePrivileges");
      if (res == null) return null;
      return new UserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRestorePrivileges(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginRestorePrivileges", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserData EndRestorePrivileges(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndRestorePrivileges", result);
      if (res == null) return null;
      return new UserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RestorePrivilegesAsync() {
    try {
      javonetHandle.invoke("RestorePrivilegesAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RestorePrivilegesAsync(Object userState) {
    try {
      javonetHandle.invoke("RestorePrivilegesAsync", userState);
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
  public AccessTokenData Impersonate(java.lang.String userName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("Impersonate", userName);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonate(
      java.lang.String userName, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginImpersonate", userName, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonate(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndImpersonate", result);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateAsync(java.lang.String userName) {
    try {
      javonetHandle.invoke("ImpersonateAsync", userName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateAsync(java.lang.String userName, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateAsync", userName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateWithToken(AccessTokenData accessToken) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("ImpersonateWithToken", accessToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateWithToken(
      AccessTokenData accessToken, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginImpersonateWithToken", accessToken, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndImpersonateWithToken(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndImpersonateWithToken", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateWithTokenAsync(AccessTokenData accessToken) {
    try {
      javonetHandle.invoke("ImpersonateWithTokenAsync", accessToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateWithTokenAsync(AccessTokenData accessToken, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateWithTokenAsync", accessToken, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData ImpersonateWithClaims(ClaimData[] claims) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("ImpersonateWithClaims", new Object[] {claims});
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateWithClaims(
      ClaimData[] claims, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginImpersonateWithClaims", new Object[] {claims}, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonateWithClaims(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndImpersonateWithClaims", result);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateWithClaimsAsync(ClaimData[] claims) {
    try {
      javonetHandle.invoke("ImpersonateWithClaimsAsync", new Object[] {claims});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateWithClaimsAsync(ClaimData[] claims, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateWithClaimsAsync", new Object[] {claims}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void TerminateSession() {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("TerminateSession");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTerminateSession(AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("BeginTerminateSession", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndTerminateSession(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
          .invoke("EndTerminateSession", result);
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
  public SchemaData GetVirtualFolderTypeSchema(java.lang.String namespaceUri) {
    try {
      Object res =
          javonetHandle
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
              .invoke("EndCopyToKeyword", result);
      if (res == null) return null;
      return new KeywordData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
              .explicitInterface(
                  "Tridion.ContentManager.CoreService.Client.ISessionAwareCoreService")
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
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs>>
      _GetVirtualFolderTypeSchemaCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs>>();

  public void addGetVirtualFolderTypeSchemaCompleted(
      EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> toAdd) {
    _GetVirtualFolderTypeSchemaCompletedListeners.add(toAdd);
  }

  public void removeGetVirtualFolderTypeSchemaCompleted(
      EventHandlerTEventArgs<GetVirtualFolderTypeSchemaCompletedEventArgs> toRemove) {
    _GetVirtualFolderTypeSchemaCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs>>
      _GetEnumValuesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs>>();

  public void addGetEnumValuesCompleted(
      EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> toAdd) {
    _GetEnumValuesCompletedListeners.add(toAdd);
  }

  public void removeGetEnumValuesCompleted(
      EventHandlerTEventArgs<GetEnumValuesCompletedEventArgs> toRemove) {
    _GetEnumValuesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs>>
      _ResolveBundleTypesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs>>();

  public void addResolveBundleTypesCompleted(
      EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> toAdd) {
    _ResolveBundleTypesCompletedListeners.add(toAdd);
  }

  public void removeResolveBundleTypesCompleted(
      EventHandlerTEventArgs<ResolveBundleTypesCompletedEventArgs> toRemove) {
    _ResolveBundleTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs>>
      _CopyToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs>>();

  public void addCopyToKeywordCompleted(
      EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> toAdd) {
    _CopyToKeywordCompletedListeners.add(toAdd);
  }

  public void removeCopyToKeywordCompleted(
      EventHandlerTEventArgs<CopyToKeywordCompletedEventArgs> toRemove) {
    _CopyToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs>>
      _MoveToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs>>();

  public void addMoveToKeywordCompleted(
      EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> toAdd) {
    _MoveToKeywordCompletedListeners.add(toAdd);
  }

  public void removeMoveToKeywordCompleted(
      EventHandlerTEventArgs<MoveToKeywordCompletedEventArgs> toRemove) {
    _MoveToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs>>
      _GetTridionLanguagesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs>>();

  public void addGetTridionLanguagesCompleted(
      EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> toAdd) {
    _GetTridionLanguagesCompletedListeners.add(toAdd);
  }

  public void removeGetTridionLanguagesCompleted(
      EventHandlerTEventArgs<GetTridionLanguagesCompletedEventArgs> toRemove) {
    _GetTridionLanguagesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs>>
      _GetListWorkflowScriptTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs>>();

  public void addGetListWorkflowScriptTypesCompleted(
      EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> toAdd) {
    _GetListWorkflowScriptTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListWorkflowScriptTypesCompleted(
      EventHandlerTEventArgs<GetListWorkflowScriptTypesCompletedEventArgs> toRemove) {
    _GetListWorkflowScriptTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs>>
      _AddToWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs>>();

  public void addAddToWorkflowCompleted(
      EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> toAdd) {
    _AddToWorkflowCompletedListeners.add(toAdd);
  }

  public void removeAddToWorkflowCompleted(
      EventHandlerTEventArgs<AddToWorkflowCompletedEventArgs> toRemove) {
    _AddToWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs>>
      _RemoveFromWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs>>();

  public void addRemoveFromWorkflowCompleted(
      EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> toAdd) {
    _RemoveFromWorkflowCompletedListeners.add(toAdd);
  }

  public void removeRemoveFromWorkflowCompleted(
      EventHandlerTEventArgs<RemoveFromWorkflowCompletedEventArgs> toRemove) {
    _RemoveFromWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<LockCompletedEventArgs>>
      _LockCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<LockCompletedEventArgs>>();

  public void addLockCompleted(EventHandlerTEventArgs<LockCompletedEventArgs> toAdd) {
    _LockCompletedListeners.add(toAdd);
  }

  public void removeLockCompleted(EventHandlerTEventArgs<LockCompletedEventArgs> toRemove) {
    _LockCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnlockCompletedEventArgs>>
      _UnlockCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnlockCompletedEventArgs>>();

  public void addUnlockCompleted(EventHandlerTEventArgs<UnlockCompletedEventArgs> toAdd) {
    _UnlockCompletedListeners.add(toAdd);
  }

  public void removeUnlockCompleted(EventHandlerTEventArgs<UnlockCompletedEventArgs> toRemove) {
    _UnlockCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<StartWorkflowCompletedEventArgs>>
      _StartWorkflowCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<StartWorkflowCompletedEventArgs>>();

  public void addStartWorkflowCompleted(
      EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> toAdd) {
    _StartWorkflowCompletedListeners.add(toAdd);
  }

  public void removeStartWorkflowCompleted(
      EventHandlerTEventArgs<StartWorkflowCompletedEventArgs> toRemove) {
    _StartWorkflowCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs>>
      _GetProcessDefinitionsForItemsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs>>();

  public void addGetProcessDefinitionsForItemsCompleted(
      EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> toAdd) {
    _GetProcessDefinitionsForItemsCompletedListeners.add(toAdd);
  }

  public void removeGetProcessDefinitionsForItemsCompleted(
      EventHandlerTEventArgs<GetProcessDefinitionsForItemsCompletedEventArgs> toRemove) {
    _GetProcessDefinitionsForItemsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs>>
      _GetSystemXsdCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs>>();

  public void addGetSystemXsdCompleted(
      EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> toAdd) {
    _GetSystemXsdCompletedListeners.add(toAdd);
  }

  public void removeGetSystemXsdCompleted(
      EventHandlerTEventArgs<GetSystemXsdCompletedEventArgs> toRemove) {
    _GetSystemXsdCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs>>
      _GetSchemasByNamespaceUriCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs>>();

  public void addGetSchemasByNamespaceUriCompleted(
      EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> toAdd) {
    _GetSchemasByNamespaceUriCompletedListeners.add(toAdd);
  }

  public void removeGetSchemasByNamespaceUriCompleted(
      EventHandlerTEventArgs<GetSchemasByNamespaceUriCompletedEventArgs> toRemove) {
    _GetSchemasByNamespaceUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ValidateCompletedEventArgs>>
      _ValidateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ValidateCompletedEventArgs>>();

  public void addValidateCompleted(EventHandlerTEventArgs<ValidateCompletedEventArgs> toAdd) {
    _ValidateCompletedListeners.add(toAdd);
  }

  public void removeValidateCompleted(EventHandlerTEventArgs<ValidateCompletedEventArgs> toRemove) {
    _ValidateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs>>
      _GetExternalBinaryContentDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs>>();

  public void addGetExternalBinaryContentDataCompleted(
      EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> toAdd) {
    _GetExternalBinaryContentDataCompletedListeners.add(toAdd);
  }

  public void removeGetExternalBinaryContentDataCompleted(
      EventHandlerTEventArgs<GetExternalBinaryContentDataCompletedEventArgs> toRemove) {
    _GetExternalBinaryContentDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs>>
      _SynchronizeWithSchemaCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs>>();

  public void addSynchronizeWithSchemaCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> toAdd) {
    _SynchronizeWithSchemaCompletedListeners.add(toAdd);
  }

  public void removeSynchronizeWithSchemaCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaCompletedEventArgs> toRemove) {
    _SynchronizeWithSchemaCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>>
      _SynchronizeWithSchemaAndUpdateCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs>>();

  public void addSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs> toAdd) {
    _SynchronizeWithSchemaAndUpdateCompletedListeners.add(toAdd);
  }

  public void removeSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<SynchronizeWithSchemaAndUpdateCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs>>
      _ConvertXsdToSchemaFieldsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs>>();

  public void addConvertXsdToSchemaFieldsCompleted(
      EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> toAdd) {
    _ConvertXsdToSchemaFieldsCompletedListeners.add(toAdd);
  }

  public void removeConvertXsdToSchemaFieldsCompleted(
      EventHandlerTEventArgs<ConvertXsdToSchemaFieldsCompletedEventArgs> toRemove) {
    _ConvertXsdToSchemaFieldsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs>>
      _GetPublishUrlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs>>();

  public void addGetPublishUrlCompleted(
      EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> toAdd) {
    _GetPublishUrlCompletedListeners.add(toAdd);
  }

  public void removeGetPublishUrlCompleted(
      EventHandlerTEventArgs<GetPublishUrlCompletedEventArgs> toRemove) {
    _GetPublishUrlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs>>
      _GetBusinessProcessTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs>>();

  public void addGetBusinessProcessTypesCompleted(
      EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> toAdd) {
    _GetBusinessProcessTypesCompletedListeners.add(toAdd);
  }

  public void removeGetBusinessProcessTypesCompleted(
      EventHandlerTEventArgs<GetBusinessProcessTypesCompletedEventArgs> toRemove) {
    _GetBusinessProcessTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs>>
      _GetPublishSourceByUrlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs>>();

  public void addGetPublishSourceByUrlCompleted(
      EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> toAdd) {
    _GetPublishSourceByUrlCompletedListeners.add(toAdd);
  }

  public void removeGetPublishSourceByUrlCompleted(
      EventHandlerTEventArgs<GetPublishSourceByUrlCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs>>
      _ResolveContainingPagesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs>>();

  public void addResolveContainingPagesCompleted(
      EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> toAdd) {
    _ResolveContainingPagesCompletedListeners.add(toAdd);
  }

  public void removeResolveContainingPagesCompleted(
      EventHandlerTEventArgs<ResolveContainingPagesCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs>>
      _GetSystemPrivilegesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs>>();

  public void addGetSystemPrivilegesCompleted(
      EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> toAdd) {
    _GetSystemPrivilegesCompletedListeners.add(toAdd);
  }

  public void removeGetSystemPrivilegesCompleted(
      EventHandlerTEventArgs<GetSystemPrivilegesCompletedEventArgs> toRemove) {
    _GetSystemPrivilegesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetApiVersionCompletedEventArgs>>
      _GetApiVersionCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetApiVersionCompletedEventArgs>>();

  public void addGetApiVersionCompleted(
      EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> toAdd) {
    _GetApiVersionCompletedListeners.add(toAdd);
  }

  public void removeGetApiVersionCompleted(
      EventHandlerTEventArgs<GetApiVersionCompletedEventArgs> toRemove) {
    _GetApiVersionCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs>>
      _GetCurrentUserCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs>>();

  public void addGetCurrentUserCompleted(
      EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> toAdd) {
    _GetCurrentUserCompletedListeners.add(toAdd);
  }

  public void removeGetCurrentUserCompleted(
      EventHandlerTEventArgs<GetCurrentUserCompletedEventArgs> toRemove) {
    _GetCurrentUserCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs>>
      _IsExistingObjectCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs>>();

  public void addIsExistingObjectCompleted(
      EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> toAdd) {
    _IsExistingObjectCompletedListeners.add(toAdd);
  }

  public void removeIsExistingObjectCompleted(
      EventHandlerTEventArgs<IsExistingObjectCompletedEventArgs> toRemove) {
    _IsExistingObjectCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetTcmUriCompletedEventArgs>>
      _GetTcmUriCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetTcmUriCompletedEventArgs>>();

  public void addGetTcmUriCompleted(EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> toAdd) {
    _GetTcmUriCompletedListeners.add(toAdd);
  }

  public void removeGetTcmUriCompleted(
      EventHandlerTEventArgs<GetTcmUriCompletedEventArgs> toRemove) {
    _GetTcmUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs>>
      _TryGetTcmUriCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs>>();

  public void addTryGetTcmUriCompleted(
      EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> toAdd) {
    _TryGetTcmUriCompletedListeners.add(toAdd);
  }

  public void removeTryGetTcmUriCompleted(
      EventHandlerTEventArgs<TryGetTcmUriCompletedEventArgs> toRemove) {
    _TryGetTcmUriCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadCompletedEventArgs>>
      _ReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadCompletedEventArgs>>();

  public void addReadCompleted(EventHandlerTEventArgs<ReadCompletedEventArgs> toAdd) {
    _ReadCompletedListeners.add(toAdd);
  }

  public void removeReadCompleted(EventHandlerTEventArgs<ReadCompletedEventArgs> toRemove) {
    _ReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryReadCompletedEventArgs>>
      _TryReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryReadCompletedEventArgs>>();

  public void addTryReadCompleted(EventHandlerTEventArgs<TryReadCompletedEventArgs> toAdd) {
    _TryReadCompletedListeners.add(toAdd);
  }

  public void removeTryReadCompleted(EventHandlerTEventArgs<TryReadCompletedEventArgs> toRemove) {
    _TryReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BulkReadCompletedEventArgs>>
      _BulkReadCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BulkReadCompletedEventArgs>>();

  public void addBulkReadCompleted(EventHandlerTEventArgs<BulkReadCompletedEventArgs> toAdd) {
    _BulkReadCompletedListeners.add(toAdd);
  }

  public void removeBulkReadCompleted(EventHandlerTEventArgs<BulkReadCompletedEventArgs> toRemove) {
    _BulkReadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs>>
      _ReadSchemaFieldsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs>>();

  public void addReadSchemaFieldsCompleted(
      EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> toAdd) {
    _ReadSchemaFieldsCompletedListeners.add(toAdd);
  }

  public void removeReadSchemaFieldsCompleted(
      EventHandlerTEventArgs<ReadSchemaFieldsCompletedEventArgs> toRemove) {
    _ReadSchemaFieldsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs>>
      _ConvertSchemaFieldsToXsdCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs>>();

  public void addConvertSchemaFieldsToXsdCompleted(
      EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> toAdd) {
    _ConvertSchemaFieldsToXsdCompletedListeners.add(toAdd);
  }

  public void removeConvertSchemaFieldsToXsdCompleted(
      EventHandlerTEventArgs<ConvertSchemaFieldsToXsdCompletedEventArgs> toRemove) {
    _ConvertSchemaFieldsToXsdCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SaveCompletedEventArgs>>
      _SaveCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<SaveCompletedEventArgs>>();

  public void addSaveCompleted(EventHandlerTEventArgs<SaveCompletedEventArgs> toAdd) {
    _SaveCompletedListeners.add(toAdd);
  }

  public void removeSaveCompleted(EventHandlerTEventArgs<SaveCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs>>
      _GetDefaultDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs>>();

  public void addGetDefaultDataCompleted(
      EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> toAdd) {
    _GetDefaultDataCompletedListeners.add(toAdd);
  }

  public void removeGetDefaultDataCompleted(
      EventHandlerTEventArgs<GetDefaultDataCompletedEventArgs> toRemove) {
    _GetDefaultDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<MoveCompletedEventArgs>>
      _MoveCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<MoveCompletedEventArgs>>();

  public void addMoveCompleted(EventHandlerTEventArgs<MoveCompletedEventArgs> toAdd) {
    _MoveCompletedListeners.add(toAdd);
  }

  public void removeMoveCompleted(EventHandlerTEventArgs<MoveCompletedEventArgs> toRemove) {
    _MoveCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CopyCompletedEventArgs>>
      _CopyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CopyCompletedEventArgs>>();

  public void addCopyCompleted(EventHandlerTEventArgs<CopyCompletedEventArgs> toAdd) {
    _CopyCompletedListeners.add(toAdd);
  }

  public void removeCopyCompleted(EventHandlerTEventArgs<CopyCompletedEventArgs> toRemove) {
    _CopyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs>>
      _GetInstanceDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs>>();

  public void addGetInstanceDataCompleted(
      EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> toAdd) {
    _GetInstanceDataCompletedListeners.add(toAdd);
  }

  public void removeGetInstanceDataCompleted(
      EventHandlerTEventArgs<GetInstanceDataCompletedEventArgs> toRemove) {
    _GetInstanceDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<TryCheckOutCompletedEventArgs>>
      _TryCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<TryCheckOutCompletedEventArgs>>();

  public void addTryCheckOutCompleted(EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> toAdd) {
    _TryCheckOutCompletedListeners.add(toAdd);
  }

  public void removeTryCheckOutCompleted(
      EventHandlerTEventArgs<TryCheckOutCompletedEventArgs> toRemove) {
    _TryCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CheckOutCompletedEventArgs>>
      _CheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CheckOutCompletedEventArgs>>();

  public void addCheckOutCompleted(EventHandlerTEventArgs<CheckOutCompletedEventArgs> toAdd) {
    _CheckOutCompletedListeners.add(toAdd);
  }

  public void removeCheckOutCompleted(EventHandlerTEventArgs<CheckOutCompletedEventArgs> toRemove) {
    _CheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CheckInCompletedEventArgs>>
      _CheckInCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CheckInCompletedEventArgs>>();

  public void addCheckInCompleted(EventHandlerTEventArgs<CheckInCompletedEventArgs> toAdd) {
    _CheckInCompletedListeners.add(toAdd);
  }

  public void removeCheckInCompleted(EventHandlerTEventArgs<CheckInCompletedEventArgs> toRemove) {
    _CheckInCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UpdateCompletedEventArgs>>
      _UpdateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UpdateCompletedEventArgs>>();

  public void addUpdateCompleted(EventHandlerTEventArgs<UpdateCompletedEventArgs> toAdd) {
    _UpdateCompletedListeners.add(toAdd);
  }

  public void removeUpdateCompleted(EventHandlerTEventArgs<UpdateCompletedEventArgs> toRemove) {
    _UpdateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CreateCompletedEventArgs>>
      _CreateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CreateCompletedEventArgs>>();

  public void addCreateCompleted(EventHandlerTEventArgs<CreateCompletedEventArgs> toAdd) {
    _CreateCompletedListeners.add(toAdd);
  }

  public void removeCreateCompleted(EventHandlerTEventArgs<CreateCompletedEventArgs> toRemove) {
    _CreateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs>>
      _UndoCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs>>();

  public void addUndoCheckOutCompleted(
      EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> toAdd) {
    _UndoCheckOutCompletedListeners.add(toAdd);
  }

  public void removeUndoCheckOutCompleted(
      EventHandlerTEventArgs<UndoCheckOutCompletedEventArgs> toRemove) {
    _UndoCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RollbackCompletedEventArgs>>
      _RollbackCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RollbackCompletedEventArgs>>();

  public void addRollbackCompleted(EventHandlerTEventArgs<RollbackCompletedEventArgs> toAdd) {
    _RollbackCompletedListeners.add(toAdd);
  }

  public void removeRollbackCompleted(EventHandlerTEventArgs<RollbackCompletedEventArgs> toRemove) {
    _RollbackCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<LocalizeCompletedEventArgs>>
      _LocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<LocalizeCompletedEventArgs>>();

  public void addLocalizeCompleted(EventHandlerTEventArgs<LocalizeCompletedEventArgs> toAdd) {
    _LocalizeCompletedListeners.add(toAdd);
  }

  public void removeLocalizeCompleted(EventHandlerTEventArgs<LocalizeCompletedEventArgs> toRemove) {
    _LocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnLocalizeCompletedEventArgs>>
      _UnLocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnLocalizeCompletedEventArgs>>();

  public void addUnLocalizeCompleted(EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> toAdd) {
    _UnLocalizeCompletedListeners.add(toAdd);
  }

  public void removeUnLocalizeCompleted(
      EventHandlerTEventArgs<UnLocalizeCompletedEventArgs> toRemove) {
    _UnLocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PromoteCompletedEventArgs>>
      _PromoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PromoteCompletedEventArgs>>();

  public void addPromoteCompleted(EventHandlerTEventArgs<PromoteCompletedEventArgs> toAdd) {
    _PromoteCompletedListeners.add(toAdd);
  }

  public void removePromoteCompleted(EventHandlerTEventArgs<PromoteCompletedEventArgs> toRemove) {
    _PromoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<DemoteCompletedEventArgs>>
      _DemoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<DemoteCompletedEventArgs>>();

  public void addDemoteCompleted(EventHandlerTEventArgs<DemoteCompletedEventArgs> toAdd) {
    _DemoteCompletedListeners.add(toAdd);
  }

  public void removeDemoteCompleted(EventHandlerTEventArgs<DemoteCompletedEventArgs> toRemove) {
    _DemoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs>>
      _GetListTemplateTypesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs>>();

  public void addGetListTemplateTypesCompleted(
      EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> toAdd) {
    _GetListTemplateTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListTemplateTypesCompleted(
      EventHandlerTEventArgs<GetListTemplateTypesCompletedEventArgs> toRemove) {
    _GetListTemplateTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs>>
      _GetListPublicationTypesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs>>();

  public void addGetListPublicationTypesCompleted(
      EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> toAdd) {
    _GetListPublicationTypesCompletedListeners.add(toAdd);
  }

  public void removeGetListPublicationTypesCompleted(
      EventHandlerTEventArgs<GetListPublicationTypesCompletedEventArgs> toRemove) {
    _GetListPublicationTypesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs>>
      _GetSystemWideListXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs>>();

  public void addGetSystemWideListXmlCompleted(
      EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> toAdd) {
    _GetSystemWideListXmlCompletedListeners.add(toAdd);
  }

  public void removeGetSystemWideListXmlCompleted(
      EventHandlerTEventArgs<GetSystemWideListXmlCompletedEventArgs> toRemove) {
    _GetSystemWideListXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs>>
      _GetSystemWideListCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs>>();

  public void addGetSystemWideListCompleted(
      EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> toAdd) {
    _GetSystemWideListCompletedListeners.add(toAdd);
  }

  public void removeGetSystemWideListCompleted(
      EventHandlerTEventArgs<GetSystemWideListCompletedEventArgs> toRemove) {
    _GetSystemWideListCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListXmlCompletedEventArgs>>
      _GetListXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListXmlCompletedEventArgs>>();

  public void addGetListXmlCompleted(EventHandlerTEventArgs<GetListXmlCompletedEventArgs> toAdd) {
    _GetListXmlCompletedListeners.add(toAdd);
  }

  public void removeGetListXmlCompleted(
      EventHandlerTEventArgs<GetListXmlCompletedEventArgs> toRemove) {
    _GetListXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListCompletedEventArgs>>
      _GetListCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListCompletedEventArgs>>();

  public void addGetListCompleted(EventHandlerTEventArgs<GetListCompletedEventArgs> toAdd) {
    _GetListCompletedListeners.add(toAdd);
  }

  public void removeGetListCompleted(EventHandlerTEventArgs<GetListCompletedEventArgs> toRemove) {
    _GetListCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs>>
      _GetListDirectoryServiceNamesCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs>>();

  public void addGetListDirectoryServiceNamesCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> toAdd) {
    _GetListDirectoryServiceNamesCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceNamesCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceNamesCompletedEventArgs> toRemove) {
    _GetListDirectoryServiceNamesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs>>
      _GetListWindowsDomainUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs>>();

  public void addGetListWindowsDomainUsersCompleted(
      EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> toAdd) {
    _GetListWindowsDomainUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListWindowsDomainUsersCompleted(
      EventHandlerTEventArgs<GetListWindowsDomainUsersCompletedEventArgs> toRemove) {
    _GetListWindowsDomainUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>>
      _GetListDirectoryServiceAllUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs>>();

  public void addGetListDirectoryServiceAllUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs> toAdd) {
    _GetListDirectoryServiceAllUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceAllUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceAllUsersCompletedEventArgs> toRemove) {
    _GetListDirectoryServiceAllUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>>
      _GetListDirectoryServiceGroupMembersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs>>();

  public void addGetListDirectoryServiceGroupMembersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs> toAdd) {
    _GetListDirectoryServiceGroupMembersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceGroupMembersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceGroupMembersCompletedEventArgs> toRemove) {
    _GetListDirectoryServiceGroupMembersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs>>
      _GetListDirectoryServiceUsersCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs>>();

  public void addGetListDirectoryServiceUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> toAdd) {
    _GetListDirectoryServiceUsersCompletedListeners.add(toAdd);
  }

  public void removeGetListDirectoryServiceUsersCompleted(
      EventHandlerTEventArgs<GetListDirectoryServiceUsersCompletedEventArgs> toRemove) {
    _GetListDirectoryServiceUsersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ClassifyCompletedEventArgs>>
      _ClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ClassifyCompletedEventArgs>>();

  public void addClassifyCompleted(EventHandlerTEventArgs<ClassifyCompletedEventArgs> toAdd) {
    _ClassifyCompletedListeners.add(toAdd);
  }

  public void removeClassifyCompleted(EventHandlerTEventArgs<ClassifyCompletedEventArgs> toRemove) {
    _ClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnClassifyCompletedEventArgs>>
      _UnClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnClassifyCompletedEventArgs>>();

  public void addUnClassifyCompleted(EventHandlerTEventArgs<UnClassifyCompletedEventArgs> toAdd) {
    _UnClassifyCompletedListeners.add(toAdd);
  }

  public void removeUnClassifyCompleted(
      EventHandlerTEventArgs<UnClassifyCompletedEventArgs> toRemove) {
    _UnClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReClassifyCompletedEventArgs>>
      _ReClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReClassifyCompletedEventArgs>>();

  public void addReClassifyCompleted(EventHandlerTEventArgs<ReClassifyCompletedEventArgs> toAdd) {
    _ReClassifyCompletedListeners.add(toAdd);
  }

  public void removeReClassifyCompleted(
      EventHandlerTEventArgs<ReClassifyCompletedEventArgs> toRemove) {
    _ReClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<StartActivityCompletedEventArgs>>
      _StartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<StartActivityCompletedEventArgs>>();

  public void addStartActivityCompleted(
      EventHandlerTEventArgs<StartActivityCompletedEventArgs> toAdd) {
    _StartActivityCompletedListeners.add(toAdd);
  }

  public void removeStartActivityCompleted(
      EventHandlerTEventArgs<StartActivityCompletedEventArgs> toRemove) {
    _StartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<SuspendActivityCompletedEventArgs>>
      _SuspendActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<SuspendActivityCompletedEventArgs>>();

  public void addSuspendActivityCompleted(
      EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> toAdd) {
    _SuspendActivityCompletedListeners.add(toAdd);
  }

  public void removeSuspendActivityCompleted(
      EventHandlerTEventArgs<SuspendActivityCompletedEventArgs> toRemove) {
    _SuspendActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RestartActivityCompletedEventArgs>>
      _RestartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RestartActivityCompletedEventArgs>>();

  public void addRestartActivityCompleted(
      EventHandlerTEventArgs<RestartActivityCompletedEventArgs> toAdd) {
    _RestartActivityCompletedListeners.add(toAdd);
  }

  public void removeRestartActivityCompleted(
      EventHandlerTEventArgs<RestartActivityCompletedEventArgs> toRemove) {
    _RestartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs>>
      _ReAssignActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs>>();

  public void addReAssignActivityCompleted(
      EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> toAdd) {
    _ReAssignActivityCompletedListeners.add(toAdd);
  }

  public void removeReAssignActivityCompleted(
      EventHandlerTEventArgs<ReAssignActivityCompletedEventArgs> toRemove) {
    _ReAssignActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<FinishActivityCompletedEventArgs>>
      _FinishActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<FinishActivityCompletedEventArgs>>();

  public void addFinishActivityCompleted(
      EventHandlerTEventArgs<FinishActivityCompletedEventArgs> toAdd) {
    _FinishActivityCompletedListeners.add(toAdd);
  }

  public void removeFinishActivityCompleted(
      EventHandlerTEventArgs<FinishActivityCompletedEventArgs> toRemove) {
    _FinishActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs>>
      _ForceFinishProcessCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs>>();

  public void addForceFinishProcessCompleted(
      EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> toAdd) {
    _ForceFinishProcessCompletedListeners.add(toAdd);
  }

  public void removeForceFinishProcessCompleted(
      EventHandlerTEventArgs<ForceFinishProcessCompletedEventArgs> toRemove) {
    _ForceFinishProcessCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResumeActivityCompletedEventArgs>>
      _ResumeActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResumeActivityCompletedEventArgs>>();

  public void addResumeActivityCompleted(
      EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> toAdd) {
    _ResumeActivityCompletedListeners.add(toAdd);
  }

  public void removeResumeActivityCompleted(
      EventHandlerTEventArgs<ResumeActivityCompletedEventArgs> toRemove) {
    _ResumeActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs>>
      _GetListQueueMessagesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs>>();

  public void addGetListQueueMessagesCompleted(
      EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> toAdd) {
    _GetListQueueMessagesCompletedListeners.add(toAdd);
  }

  public void removeGetListQueueMessagesCompleted(
      EventHandlerTEventArgs<GetListQueueMessagesCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<GetListQueuesCompletedEventArgs>>
      _GetListQueuesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListQueuesCompletedEventArgs>>();

  public void addGetListQueuesCompleted(
      EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> toAdd) {
    _GetListQueuesCompletedListeners.add(toAdd);
  }

  public void removeGetListQueuesCompleted(
      EventHandlerTEventArgs<GetListQueuesCompletedEventArgs> toRemove) {
    _GetListQueuesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs>>
      _ReadApplicationDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs>>();

  public void addReadApplicationDataCompleted(
      EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> toAdd) {
    _ReadApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeReadApplicationDataCompleted(
      EventHandlerTEventArgs<ReadApplicationDataCompletedEventArgs> toRemove) {
    _ReadApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs>>
      _ReadAllApplicationDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs>>();

  public void addReadAllApplicationDataCompleted(
      EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> toAdd) {
    _ReadAllApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeReadAllApplicationDataCompleted(
      EventHandlerTEventArgs<ReadAllApplicationDataCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs>>
      _GetApplicationIdsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs>>();

  public void addGetApplicationIdsCompleted(
      EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> toAdd) {
    _GetApplicationIdsCompletedListeners.add(toAdd);
  }

  public void removeGetApplicationIdsCompleted(
      EventHandlerTEventArgs<GetApplicationIdsCompletedEventArgs> toRemove) {
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
          EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs>>
      _ParsePredefinedBatchOperationCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs>>();

  public void addParsePredefinedBatchOperationCompleted(
      EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> toAdd) {
    _ParsePredefinedBatchOperationCompletedListeners.add(toAdd);
  }

  public void removeParsePredefinedBatchOperationCompleted(
      EventHandlerTEventArgs<ParsePredefinedBatchOperationCompletedEventArgs> toRemove) {
    _ParsePredefinedBatchOperationCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>>
      _GetPredefinedBatchOperationNameCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs>>();

  public void addGetPredefinedBatchOperationNameCompleted(
      EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs> toAdd) {
    _GetPredefinedBatchOperationNameCompletedListeners.add(toAdd);
  }

  public void removeGetPredefinedBatchOperationNameCompleted(
      EventHandlerTEventArgs<GetPredefinedBatchOperationNameCompletedEventArgs> toRemove) {
    _GetPredefinedBatchOperationNameCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ResolveItemsCompletedEventArgs>>
      _ResolveItemsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ResolveItemsCompletedEventArgs>>();

  public void addResolveItemsCompleted(
      EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> toAdd) {
    _ResolveItemsCompletedListeners.add(toAdd);
  }

  public void removeResolveItemsCompleted(
      EventHandlerTEventArgs<ResolveItemsCompletedEventArgs> toRemove) {
    _ResolveItemsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs>>
      _GetSearchResultsXmlCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs>>();

  public void addGetSearchResultsXmlCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> toAdd) {
    _GetSearchResultsXmlCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsXmlCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlCompletedEventArgs> toRemove) {
    _GetSearchResultsXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs>>
      _GetSearchResultsXmlPagedCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs>>();

  public void addGetSearchResultsXmlPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> toAdd) {
    _GetSearchResultsXmlPagedCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsXmlPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsXmlPagedCompletedEventArgs> toRemove) {
    _GetSearchResultsXmlPagedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs>>
      _GetSearchResultsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs>>();

  public void addGetSearchResultsCompleted(
      EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> toAdd) {
    _GetSearchResultsCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsCompleted(
      EventHandlerTEventArgs<GetSearchResultsCompletedEventArgs> toRemove) {
    _GetSearchResultsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs>>
      _GetSearchResultsPagedCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs>>();

  public void addGetSearchResultsPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> toAdd) {
    _GetSearchResultsPagedCompletedListeners.add(toAdd);
  }

  public void removeGetSearchResultsPagedCompleted(
      EventHandlerTEventArgs<GetSearchResultsPagedCompletedEventArgs> toRemove) {
    _GetSearchResultsPagedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RenderItemCompletedEventArgs>>
      _RenderItemCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RenderItemCompletedEventArgs>>();

  public void addRenderItemCompleted(EventHandlerTEventArgs<RenderItemCompletedEventArgs> toAdd) {
    _RenderItemCompletedListeners.add(toAdd);
  }

  public void removeRenderItemCompleted(
      EventHandlerTEventArgs<RenderItemCompletedEventArgs> toRemove) {
    _RenderItemCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PreviewItemCompletedEventArgs>>
      _PreviewItemCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PreviewItemCompletedEventArgs>>();

  public void addPreviewItemCompleted(EventHandlerTEventArgs<PreviewItemCompletedEventArgs> toAdd) {
    _PreviewItemCompletedListeners.add(toAdd);
  }

  public void removePreviewItemCompleted(
      EventHandlerTEventArgs<PreviewItemCompletedEventArgs> toRemove) {
    _PreviewItemCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PublishCompletedEventArgs>>
      _PublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PublishCompletedEventArgs>>();

  public void addPublishCompleted(EventHandlerTEventArgs<PublishCompletedEventArgs> toAdd) {
    _PublishCompletedListeners.add(toAdd);
  }

  public void removePublishCompleted(EventHandlerTEventArgs<PublishCompletedEventArgs> toRemove) {
    _PublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<UnPublishCompletedEventArgs>>
      _UnPublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<UnPublishCompletedEventArgs>>();

  public void addUnPublishCompleted(EventHandlerTEventArgs<UnPublishCompletedEventArgs> toAdd) {
    _UnPublishCompletedListeners.add(toAdd);
  }

  public void removeUnPublishCompleted(
      EventHandlerTEventArgs<UnPublishCompletedEventArgs> toRemove) {
    _UnPublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<IsPublishedCompletedEventArgs>>
      _IsPublishedCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<IsPublishedCompletedEventArgs>>();

  public void addIsPublishedCompleted(EventHandlerTEventArgs<IsPublishedCompletedEventArgs> toAdd) {
    _IsPublishedCompletedListeners.add(toAdd);
  }

  public void removeIsPublishedCompleted(
      EventHandlerTEventArgs<IsPublishedCompletedEventArgs> toRemove) {
    _IsPublishedCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs>>
      _GetWorkItemSnapshotCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs>>();

  public void addGetWorkItemSnapshotCompleted(
      EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> toAdd) {
    _GetWorkItemSnapshotCompletedListeners.add(toAdd);
  }

  public void removeGetWorkItemSnapshotCompleted(
      EventHandlerTEventArgs<GetWorkItemSnapshotCompletedEventArgs> toRemove) {
    _GetWorkItemSnapshotCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs>>
      _GetListPublishInfoCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs>>();

  public void addGetListPublishInfoCompleted(
      EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> toAdd) {
    _GetListPublishInfoCompletedListeners.add(toAdd);
  }

  public void removeGetListPublishInfoCompleted(
      EventHandlerTEventArgs<GetListPublishInfoCompletedEventArgs> toRemove) {
    _GetListPublishInfoCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<CastActionsCompletedEventArgs>>
      _CastActionsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CastActionsCompletedEventArgs>>();

  public void addCastActionsCompleted(EventHandlerTEventArgs<CastActionsCompletedEventArgs> toAdd) {
    _CastActionsCompletedListeners.add(toAdd);
  }

  public void removeCastActionsCompleted(
      EventHandlerTEventArgs<CastActionsCompletedEventArgs> toRemove) {
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

  private java.util.ArrayList<EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs>>
      _IsValidTridionWebSchemaXmlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs>>();

  public void addIsValidTridionWebSchemaXmlCompleted(
      EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> toAdd) {
    _IsValidTridionWebSchemaXmlCompletedListeners.add(toAdd);
  }

  public void removeIsValidTridionWebSchemaXmlCompleted(
      EventHandlerTEventArgs<IsValidTridionWebSchemaXmlCompletedEventArgs> toRemove) {
    _IsValidTridionWebSchemaXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>>
      _GetSubjectIdsWithApplicationDataCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs>>();

  public void addGetSubjectIdsWithApplicationDataCompleted(
      EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs> toAdd) {
    _GetSubjectIdsWithApplicationDataCompletedListeners.add(toAdd);
  }

  public void removeGetSubjectIdsWithApplicationDataCompleted(
      EventHandlerTEventArgs<GetSubjectIdsWithApplicationDataCompletedEventArgs> toRemove) {
    _GetSubjectIdsWithApplicationDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>>
      _ReadApplicationDataForSubjectsIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs>>();

  public void addReadApplicationDataForSubjectsIdsCompleted(
      EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs> toAdd) {
    _ReadApplicationDataForSubjectsIdsCompletedListeners.add(toAdd);
  }

  public void removeReadApplicationDataForSubjectsIdsCompleted(
      EventHandlerTEventArgs<ReadApplicationDataForSubjectsIdsCompletedEventArgs> toRemove) {
    _ReadApplicationDataForSubjectsIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>>
      _GetSecurityDescriptorsForSubjectsIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs>>();

  public void addGetSecurityDescriptorsForSubjectsIdsCompleted(
      EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs> toAdd) {
    _GetSecurityDescriptorsForSubjectsIdsCompletedListeners.add(toAdd);
  }

  public void removeGetSecurityDescriptorsForSubjectsIdsCompleted(
      EventHandlerTEventArgs<GetSecurityDescriptorsForSubjectsIdsCompletedEventArgs> toRemove) {
    _GetSecurityDescriptorsForSubjectsIdsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>>
      _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<
                  GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>>();

  public void addGetContentSecurityDescriptorsForOrgItemIdsCompleted(
      EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs> toAdd) {
    _GetContentSecurityDescriptorsForOrgItemIdsCompletedListeners.add(toAdd);
  }

  public void removeGetContentSecurityDescriptorsForOrgItemIdsCompleted(
      EventHandlerTEventArgs<GetContentSecurityDescriptorsForOrgItemIdsCompletedEventArgs>
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

  private java.util.ArrayList<EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs>>
      _CastPredefinedQueueCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs>>();

  public void addCastPredefinedQueueCompleted(
      EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> toAdd) {
    _CastPredefinedQueueCompletedListeners.add(toAdd);
  }

  public void removeCastPredefinedQueueCompleted(
      EventHandlerTEventArgs<CastPredefinedQueueCompletedEventArgs> toRemove) {
    _CastPredefinedQueueCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs>>
      _PurgeOldVersionsCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs>>();

  public void addPurgeOldVersionsCompleted(
      EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> toAdd) {
    _PurgeOldVersionsCompletedListeners.add(toAdd);
  }

  public void removePurgeOldVersionsCompleted(
      EventHandlerTEventArgs<PurgeOldVersionsCompletedEventArgs> toRemove) {
    _PurgeOldVersionsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs>>
      _GetListExternalLinksCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs>>();

  public void addGetListExternalLinksCompleted(
      EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> toAdd) {
    _GetListExternalLinksCompletedListeners.add(toAdd);
  }

  public void removeGetListExternalLinksCompleted(
      EventHandlerTEventArgs<GetListExternalLinksCompletedEventArgs> toRemove) {
    _GetListExternalLinksCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs>>
      _ConvertXmlToSearchQueryCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs>>();

  public void addConvertXmlToSearchQueryCompleted(
      EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> toAdd) {
    _ConvertXmlToSearchQueryCompletedListeners.add(toAdd);
  }

  public void removeConvertXmlToSearchQueryCompleted(
      EventHandlerTEventArgs<ConvertXmlToSearchQueryCompletedEventArgs> toRemove) {
    _ConvertXmlToSearchQueryCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs>>
      _ConvertSearchQueryToXmlCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs>>();

  public void addConvertSearchQueryToXmlCompleted(
      EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> toAdd) {
    _ConvertSearchQueryToXmlCompletedListeners.add(toAdd);
  }

  public void removeConvertSearchQueryToXmlCompleted(
      EventHandlerTEventArgs<ConvertSearchQueryToXmlCompletedEventArgs> toRemove) {
    _ConvertSearchQueryToXmlCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ImpersonateCompletedEventArgs>>
      _ImpersonateCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ImpersonateCompletedEventArgs>>();

  public void addImpersonateCompleted(EventHandlerTEventArgs<ImpersonateCompletedEventArgs> toAdd) {
    _ImpersonateCompletedListeners.add(toAdd);
  }

  public void removeImpersonateCompleted(
      EventHandlerTEventArgs<ImpersonateCompletedEventArgs> toRemove) {
    _ImpersonateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _ImpersonateWithTokenCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addImpersonateWithTokenCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _ImpersonateWithTokenCompletedListeners.add(toAdd);
  }

  public void removeImpersonateWithTokenCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _ImpersonateWithTokenCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs>>
      _ImpersonateWithClaimsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs>>();

  public void addImpersonateWithClaimsCompleted(
      EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> toAdd) {
    _ImpersonateWithClaimsCompletedListeners.add(toAdd);
  }

  public void removeImpersonateWithClaimsCompleted(
      EventHandlerTEventArgs<ImpersonateWithClaimsCompletedEventArgs> toRemove) {
    _ImpersonateWithClaimsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _TerminateSessionCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addTerminateSessionCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _TerminateSessionCompletedListeners.add(toAdd);
  }

  public void removeTerminateSessionCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _TerminateSessionCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<GetSessionIdCompletedEventArgs>>
      _GetSessionIdCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<GetSessionIdCompletedEventArgs>>();

  public void addGetSessionIdCompleted(
      EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> toAdd) {
    _GetSessionIdCompletedListeners.add(toAdd);
  }

  public void removeGetSessionIdCompleted(
      EventHandlerTEventArgs<GetSessionIdCompletedEventArgs> toRemove) {
    _GetSessionIdCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _SetSessionContextDataCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addSetSessionContextDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _SetSessionContextDataCompletedListeners.add(toAdd);
  }

  public void removeSetSessionContextDataCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _SetSessionContextDataCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _SetSessionTransactionTimeoutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addSetSessionTransactionTimeoutCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _SetSessionTransactionTimeoutCompletedListeners.add(toAdd);
  }

  public void removeSetSessionTransactionTimeoutCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _SetSessionTransactionTimeoutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs>>
      _GetSessionTransactionTimeoutCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs>>();

  public void addGetSessionTransactionTimeoutCompleted(
      EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> toAdd) {
    _GetSessionTransactionTimeoutCompletedListeners.add(toAdd);
  }

  public void removeGetSessionTransactionTimeoutCompleted(
      EventHandlerTEventArgs<GetSessionTransactionTimeoutCompletedEventArgs> toRemove) {
    _GetSessionTransactionTimeoutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<StartCachingCompletedEventArgs>>
      _StartCachingCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<StartCachingCompletedEventArgs>>();

  public void addStartCachingCompleted(
      EventHandlerTEventArgs<StartCachingCompletedEventArgs> toAdd) {
    _StartCachingCompletedListeners.add(toAdd);
  }

  public void removeStartCachingCompleted(
      EventHandlerTEventArgs<StartCachingCompletedEventArgs> toRemove) {
    _StartCachingCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _StopCachingCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addStopCachingCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _StopCachingCompletedListeners.add(toAdd);
  }

  public void removeStopCachingCompleted(EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _StopCachingCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _SetWebDavUrlPrefixCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addSetWebDavUrlPrefixCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _SetWebDavUrlPrefixCompletedListeners.add(toAdd);
  }

  public void removeSetWebDavUrlPrefixCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _SetWebDavUrlPrefixCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _EnlistInTransactionCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addEnlistInTransactionCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _EnlistInTransactionCompletedListeners.add(toAdd);
  }

  public void removeEnlistInTransactionCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _EnlistInTransactionCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs>>
      _ElevatePrivilegesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs>>();

  public void addElevatePrivilegesCompleted(
      EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> toAdd) {
    _ElevatePrivilegesCompletedListeners.add(toAdd);
  }

  public void removeElevatePrivilegesCompleted(
      EventHandlerTEventArgs<ElevatePrivilegesCompletedEventArgs> toRemove) {
    _ElevatePrivilegesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs>>
      _RestorePrivilegesCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs>>();

  public void addRestorePrivilegesCompleted(
      EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> toAdd) {
    _RestorePrivilegesCompletedListeners.add(toAdd);
  }

  public void removeRestorePrivilegesCompleted(
      EventHandlerTEventArgs<RestorePrivilegesCompletedEventArgs> toRemove) {
    _RestorePrivilegesCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
