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
import jio.System.ServiceModel.Channels.*;
import jio.System.ComponentModel.*;

public class CoreServiceBatchClient extends ClientBase<ICoreServiceBatch>
    implements ICommunicationObject, IDisposable, ICoreServiceBatch {
  protected NObject javonetHandle;

  public CoreServiceBatchClient() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.CoreServiceBatchClient");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ImpersonateBatchCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> handler :
                  _ImpersonateBatchCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateBatchWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> handler :
                  _ImpersonateBatchWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> handler :
                  _BatchLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> handler :
                  _BatchUnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> handler :
                  _BatchPromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> handler :
                  _BatchDemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyCompletedEventArgs> handler :
                  _BatchCopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveCompletedEventArgs> handler :
                  _BatchMoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> handler :
                  _BatchCheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> handler :
                  _BatchCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> handler :
                  _BatchDeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPublishCompletedEventArgs> handler :
                  _BatchPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> handler :
                  _BatchUnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> handler :
                  _BatchUndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchStartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> handler :
                  _BatchStartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchStartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchFinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> handler :
                  _BatchFinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchFinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> handler :
                  _BatchForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> handler :
                  _BatchClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> handler :
                  _BatchUnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> handler :
                  _BatchReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> handler :
                  _BatchDeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteTaxonomyNodeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSwitchUserEnabledStateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> handler :
                  _BatchSwitchUserEnabledStateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSwitchUserEnabledStateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> handler :
                  _BatchCopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> handler :
                  _BatchMoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> handler :
                  _BatchReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchRestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> handler :
                  _BatchRestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchRestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> handler :
                  _BatchSuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> handler :
                  _BatchResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _BatchSynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceBatchClient(java.lang.String endpointConfigurationName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceBatchClient",
              endpointConfigurationName);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ImpersonateBatchCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> handler :
                  _ImpersonateBatchCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateBatchWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> handler :
                  _ImpersonateBatchWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> handler :
                  _BatchLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> handler :
                  _BatchUnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> handler :
                  _BatchPromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> handler :
                  _BatchDemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyCompletedEventArgs> handler :
                  _BatchCopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveCompletedEventArgs> handler :
                  _BatchMoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> handler :
                  _BatchCheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> handler :
                  _BatchCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> handler :
                  _BatchDeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPublishCompletedEventArgs> handler :
                  _BatchPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> handler :
                  _BatchUnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> handler :
                  _BatchUndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchStartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> handler :
                  _BatchStartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchStartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchFinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> handler :
                  _BatchFinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchFinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> handler :
                  _BatchForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> handler :
                  _BatchClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> handler :
                  _BatchUnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> handler :
                  _BatchReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> handler :
                  _BatchDeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteTaxonomyNodeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSwitchUserEnabledStateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> handler :
                  _BatchSwitchUserEnabledStateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSwitchUserEnabledStateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> handler :
                  _BatchCopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> handler :
                  _BatchMoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> handler :
                  _BatchReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchRestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> handler :
                  _BatchRestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchRestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> handler :
                  _BatchSuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> handler :
                  _BatchResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _BatchSynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceBatchClient(
      java.lang.String endpointConfigurationName, java.lang.String remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceBatchClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ImpersonateBatchCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> handler :
                  _ImpersonateBatchCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateBatchWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> handler :
                  _ImpersonateBatchWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> handler :
                  _BatchLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> handler :
                  _BatchUnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> handler :
                  _BatchPromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> handler :
                  _BatchDemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyCompletedEventArgs> handler :
                  _BatchCopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveCompletedEventArgs> handler :
                  _BatchMoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> handler :
                  _BatchCheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> handler :
                  _BatchCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> handler :
                  _BatchDeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPublishCompletedEventArgs> handler :
                  _BatchPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> handler :
                  _BatchUnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> handler :
                  _BatchUndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchStartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> handler :
                  _BatchStartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchStartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchFinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> handler :
                  _BatchFinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchFinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> handler :
                  _BatchForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> handler :
                  _BatchClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> handler :
                  _BatchUnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> handler :
                  _BatchReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> handler :
                  _BatchDeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteTaxonomyNodeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSwitchUserEnabledStateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> handler :
                  _BatchSwitchUserEnabledStateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSwitchUserEnabledStateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> handler :
                  _BatchCopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> handler :
                  _BatchMoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> handler :
                  _BatchReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchRestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> handler :
                  _BatchRestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchRestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> handler :
                  _BatchSuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> handler :
                  _BatchResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _BatchSynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceBatchClient(
      java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceBatchClient",
              endpointConfigurationName,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ImpersonateBatchCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> handler :
                  _ImpersonateBatchCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateBatchWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> handler :
                  _ImpersonateBatchWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> handler :
                  _BatchLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> handler :
                  _BatchUnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> handler :
                  _BatchPromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> handler :
                  _BatchDemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyCompletedEventArgs> handler :
                  _BatchCopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveCompletedEventArgs> handler :
                  _BatchMoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> handler :
                  _BatchCheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> handler :
                  _BatchCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> handler :
                  _BatchDeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPublishCompletedEventArgs> handler :
                  _BatchPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> handler :
                  _BatchUnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> handler :
                  _BatchUndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchStartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> handler :
                  _BatchStartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchStartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchFinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> handler :
                  _BatchFinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchFinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> handler :
                  _BatchForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> handler :
                  _BatchClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> handler :
                  _BatchUnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> handler :
                  _BatchReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> handler :
                  _BatchDeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteTaxonomyNodeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSwitchUserEnabledStateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> handler :
                  _BatchSwitchUserEnabledStateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSwitchUserEnabledStateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> handler :
                  _BatchCopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> handler :
                  _BatchMoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> handler :
                  _BatchReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchRestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> handler :
                  _BatchRestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchRestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> handler :
                  _BatchSuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> handler :
                  _BatchResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _BatchSynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceBatchClient(Binding binding, EndpointAddress remoteAddress) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Tridion.ContentManager.CoreService.Client.CoreServiceBatchClient",
              binding,
              remoteAddress);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ImpersonateBatchCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> handler :
                  _ImpersonateBatchCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithTokenCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<AsyncCompletedEventArgs> handler :
                  _ImpersonateBatchWithTokenCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImpersonateBatchWithClaimsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> handler :
                  _ImpersonateBatchWithClaimsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ImpersonateBatchWithClaimsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> handler :
                  _BatchLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnLocalizeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> handler :
                  _BatchUnLocalizeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnLocalizeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPromoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> handler :
                  _BatchPromoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPromoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> handler :
                  _BatchDemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyCompletedEventArgs> handler :
                  _BatchCopyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveCompletedEventArgs> handler :
                  _BatchMoveCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckInCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> handler :
                  _BatchCheckInCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckInCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> handler :
                  _BatchCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> handler :
                  _BatchDeleteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchPublishCompletedEventArgs> handler :
                  _BatchPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnPublishCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> handler :
                  _BatchUnPublishCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnPublishCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUndoCheckOutCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> handler :
                  _BatchUndoCheckOutCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUndoCheckOutCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchStartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> handler :
                  _BatchStartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchStartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchFinishActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> handler :
                  _BatchFinishActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchFinishActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchForceFinishProcessCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> handler :
                  _BatchForceFinishProcessCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchForceFinishProcessCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> handler :
                  _BatchClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchUnClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> handler :
                  _BatchUnClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchUnClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReClassifyCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> handler :
                  _BatchReClassifyCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReClassifyCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchDeleteTaxonomyNodeCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> handler :
                  _BatchDeleteTaxonomyNodeCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchDeleteTaxonomyNodeCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSwitchUserEnabledStateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> handler :
                  _BatchSwitchUserEnabledStateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSwitchUserEnabledStateCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchCopyToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> handler :
                  _BatchCopyToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchCopyToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchMoveToKeywordCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> handler :
                  _BatchMoveToKeywordCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchMoveToKeywordCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchReAssignActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> handler :
                  _BatchReAssignActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchReAssignActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchRestartActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> handler :
                  _BatchRestartActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchRestartActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSuspendActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> handler :
                  _BatchSuspendActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchSuspendActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchResumeActivityCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> handler :
                  _BatchResumeActivityCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], BatchResumeActivityCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BatchSynchronizeWithSchemaAndUpdateCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>
                  handler : _BatchSynchronizeWithSchemaAndUpdateCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(
                        objects[1], BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoreServiceBatchClient(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public AccessTokenData ImpersonateBatch(java.lang.String userName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("ImpersonateBatch", userName);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatch(
      java.lang.String userName, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BeginImpersonateBatch", userName, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonateBatch(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndImpersonateBatch", result);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithToken(AccessTokenData accessTokenData) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
          .invoke("ImpersonateBatchWithToken", accessTokenData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatchWithToken(
      AccessTokenData accessTokenData, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BeginImpersonateBatchWithToken", accessTokenData, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndImpersonateBatchWithToken(IAsyncResult result) {
    try {
      javonetHandle
          .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
          .invoke("EndImpersonateBatchWithToken", result);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData ImpersonateBatchWithClaims(ClaimData[] claims) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("ImpersonateBatchWithClaims", new Object[] {claims});
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatchWithClaims(
      ClaimData[] claims, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginImpersonateBatchWithClaims", new Object[] {claims}, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonateBatchWithClaims(IAsyncResult result) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndImpersonateBatchWithClaims", result);
      if (res == null) return null;
      return new AccessTokenData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchLocalize(WeakLink[] subjectLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchLocalize", new Object[] {subjectLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchLocalize(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BeginBatchLocalize", new Object[] {subjectLinks}, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchLocalize(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchLocalize", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnLocalize(WeakLink[] subjectLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchUnLocalize", new Object[] {subjectLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnLocalize(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BeginBatchUnLocalize", new Object[] {subjectLinks}, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchUnLocalize(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchUnLocalize", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchPromote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchPromote",
                  new Object[] {subjectLinks},
                  destinationRepositoryId,
                  instruction);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchPromote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchPromote",
                  new Object[] {subjectLinks},
                  destinationRepositoryId,
                  instruction,
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
  public java.lang.String EndBatchPromote(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchPromote", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDemote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchDemote", new Object[] {subjectLinks}, destinationRepositoryId, instruction);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDemote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchDemote",
                  new Object[] {subjectLinks},
                  destinationRepositoryId,
                  instruction,
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
  public java.lang.String EndBatchDemote(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchDemote", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCopy(
      WeakLink[] subjectLinks, java.lang.String destinationId, java.lang.Boolean makeUnique) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchCopy", new Object[] {subjectLinks}, destinationId, makeUnique);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCopy(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchCopy",
                  new Object[] {subjectLinks},
                  destinationId,
                  makeUnique,
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
  public java.lang.String EndBatchCopy(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchCopy", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchMove(WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchMove", new Object[] {subjectLinks}, destinationId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchMove(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchMove",
                  new Object[] {subjectLinks},
                  destinationId,
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
  public java.lang.String EndBatchMove(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchMove", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCheckIn(
      WeakLink[] subjectLinks,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchCheckIn", new Object[] {subjectLinks}, removePermanentLock, userComment);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCheckIn(
      WeakLink[] subjectLinks,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchCheckIn",
                  new Object[] {subjectLinks},
                  removePermanentLock,
                  userComment,
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
  public java.lang.String EndBatchCheckIn(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchCheckIn", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCheckOut(WeakLink[] subjectLinks, java.lang.Boolean permanentLock) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchCheckOut", new Object[] {subjectLinks}, permanentLock);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCheckOut(
      WeakLink[] subjectLinks,
      java.lang.Boolean permanentLock,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchCheckOut",
                  new Object[] {subjectLinks},
                  permanentLock,
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
  public java.lang.String EndBatchCheckOut(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchCheckOut", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDelete(WeakLink[] subjectLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchDelete", new Object[] {subjectLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDelete(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BeginBatchDelete", new Object[] {subjectLinks}, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchDelete(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchDelete", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchPublish(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchPublish",
                  new Object[] {subjectLinks},
                  publishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchPublish(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchPublish",
                  new Object[] {subjectLinks},
                  publishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
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
  public java.lang.String EndBatchPublish(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchPublish", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnPublish(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchUnPublish",
                  new Object[] {subjectLinks},
                  unPublishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnPublish(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchUnPublish",
                  new Object[] {subjectLinks},
                  unPublishInstruction,
                  new Object[] {targetIdsOrPurposes},
                  priority,
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
  public java.lang.String EndBatchUnPublish(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchUnPublish", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUndoCheckOut(
      WeakLink[] subjectLinks, java.lang.Boolean permanentLock) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchUndoCheckOut", new Object[] {subjectLinks}, permanentLock);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUndoCheckOut(
      WeakLink[] subjectLinks,
      java.lang.Boolean permanentLock,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchUndoCheckOut",
                  new Object[] {subjectLinks},
                  permanentLock,
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
  public java.lang.String EndBatchUndoCheckOut(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchUndoCheckOut", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchStartActivity(WeakLink[] activityInstanceLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchStartActivity", new Object[] {activityInstanceLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchStartActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchStartActivity",
                  new Object[] {activityInstanceLinks},
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
  public java.lang.String EndBatchStartActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchStartActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchFinishActivity(
      WeakLink[] activityInstanceLinks, ActivityFinishData activityFinishData) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchFinishActivity", new Object[] {activityInstanceLinks}, activityFinishData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchFinishActivity(
      WeakLink[] activityInstanceLinks,
      ActivityFinishData activityFinishData,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchFinishActivity",
                  new Object[] {activityInstanceLinks},
                  activityFinishData,
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
  public java.lang.String EndBatchFinishActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchFinishActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchForceFinishProcess(
      WeakLink[] processInstanceLinks, java.lang.String approvalStatusId) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchForceFinishProcess", new Object[] {processInstanceLinks}, approvalStatusId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchForceFinishProcess(
      WeakLink[] processInstanceLinks,
      java.lang.String approvalStatusId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchForceFinishProcess",
                  new Object[] {processInstanceLinks},
                  approvalStatusId,
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
  public java.lang.String EndBatchForceFinishProcess(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchForceFinishProcess", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchClassify(WeakLink[] subjectLinks, java.lang.String[] keywordIds) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchClassify", new Object[] {subjectLinks}, new Object[] {keywordIds});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIds,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchClassify",
                  new Object[] {subjectLinks},
                  new Object[] {keywordIds},
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
  public java.lang.String EndBatchClassify(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchClassify", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnClassify(WeakLink[] subjectLinks, java.lang.String[] keywordIds) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchUnClassify", new Object[] {subjectLinks}, new Object[] {keywordIds});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIds,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchUnClassify",
                  new Object[] {subjectLinks},
                  new Object[] {keywordIds},
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
  public java.lang.String EndBatchUnClassify(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchUnClassify", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchReClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchReClassify",
                  new Object[] {subjectLinks},
                  new Object[] {keywordIdsToRemove},
                  new Object[] {keywordIdsToAdd});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchReClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchReClassify",
                  new Object[] {subjectLinks},
                  new Object[] {keywordIdsToRemove},
                  new Object[] {keywordIdsToAdd},
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
  public java.lang.String EndBatchReClassify(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchReClassify", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDeleteTaxonomyNode(
      WeakLink[] subjectLinks, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchDeleteTaxonomyNode",
                  new Object[] {subjectLinks},
                  NEnum.fromJavaEnum(deleteTaxonomyNodeMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDeleteTaxonomyNode(
      WeakLink[] subjectLinks,
      DeleteTaxonomyNodeMode deleteTaxonomyNodeMode,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchDeleteTaxonomyNode",
                  new Object[] {subjectLinks},
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
  public java.lang.String EndBatchDeleteTaxonomyNode(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchDeleteTaxonomyNode", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSwitchUserEnabledState(
      WeakLink[] subjectLinks, java.lang.Boolean isEnabled) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchSwitchUserEnabledState", new Object[] {subjectLinks}, isEnabled);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSwitchUserEnabledState(
      WeakLink[] subjectLinks,
      java.lang.Boolean isEnabled,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchSwitchUserEnabledState",
                  new Object[] {subjectLinks},
                  isEnabled,
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
  public java.lang.String EndBatchSwitchUserEnabledState(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchSwitchUserEnabledState", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCopyToKeyword(
      WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchCopyToKeyword", new Object[] {subjectLinks}, destinationId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCopyToKeyword(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchCopyToKeyword",
                  new Object[] {subjectLinks},
                  destinationId,
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
  public java.lang.String EndBatchCopyToKeyword(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchCopyToKeyword", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchMoveToKeyword(
      WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchMoveToKeyword", new Object[] {subjectLinks}, destinationId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchMoveToKeyword(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchMoveToKeyword",
                  new Object[] {subjectLinks},
                  destinationId,
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
  public java.lang.String EndBatchMoveToKeyword(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchMoveToKeyword", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchReAssignActivity(
      WeakLink[] activityInstanceLinks, java.lang.String newAssigneeId) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchReAssignActivity", new Object[] {activityInstanceLinks}, newAssigneeId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchReAssignActivity(
      WeakLink[] activityInstanceLinks,
      java.lang.String newAssigneeId,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchReAssignActivity",
                  new Object[] {activityInstanceLinks},
                  newAssigneeId,
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
  public java.lang.String EndBatchReAssignActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchReAssignActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchRestartActivity(WeakLink[] activityInstanceLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchRestartActivity", new Object[] {activityInstanceLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchRestartActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchRestartActivity",
                  new Object[] {activityInstanceLinks},
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
  public java.lang.String EndBatchRestartActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchRestartActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSuspendActivity(
      WeakLink[] activityInstanceLinks, java.lang.String reason) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchSuspendActivity", new Object[] {activityInstanceLinks}, reason);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSuspendActivity(
      WeakLink[] activityInstanceLinks,
      java.lang.String reason,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchSuspendActivity",
                  new Object[] {activityInstanceLinks},
                  reason,
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
  public java.lang.String EndBatchSuspendActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchSuspendActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchResumeActivity(WeakLink[] activityInstanceLinks) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("BatchResumeActivity", new Object[] {activityInstanceLinks});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchResumeActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchResumeActivity",
                  new Object[] {activityInstanceLinks},
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
  public java.lang.String EndBatchResumeActivity(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchResumeActivity", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSynchronizeWithSchemaAndUpdate(
      WeakLink[] subjectLinks, SynchronizeOptions synchOptions) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BatchSynchronizeWithSchemaAndUpdate", new Object[] {subjectLinks}, synchOptions);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSynchronizeWithSchemaAndUpdate(
      WeakLink[] subjectLinks,
      SynchronizeOptions synchOptions,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke(
                  "BeginBatchSynchronizeWithSchemaAndUpdate",
                  new Object[] {subjectLinks},
                  synchOptions,
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
  public java.lang.String EndBatchSynchronizeWithSchemaAndUpdate(IAsyncResult result) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Tridion.ContentManager.CoreService.Client.ICoreServiceBatch")
              .invoke("EndBatchSynchronizeWithSchemaAndUpdate", result);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSynchronizeWithSchemaAndUpdateAsync(
      WeakLink[] subjectLinks, SynchronizeOptions synchOptions) {
    try {
      javonetHandle.invoke(
          "BatchSynchronizeWithSchemaAndUpdateAsync", new Object[] {subjectLinks}, synchOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSynchronizeWithSchemaAndUpdateAsync(
      WeakLink[] subjectLinks, SynchronizeOptions synchOptions, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchSynchronizeWithSchemaAndUpdateAsync",
          new Object[] {subjectLinks},
          synchOptions,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCheckInAsync(
      WeakLink[] subjectLinks,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment) {
    try {
      javonetHandle.invoke(
          "BatchCheckInAsync", new Object[] {subjectLinks}, removePermanentLock, userComment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCheckInAsync(
      WeakLink[] subjectLinks,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchCheckInAsync",
          new Object[] {subjectLinks},
          removePermanentLock,
          userComment,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCheckOutAsync(WeakLink[] subjectLinks, java.lang.Boolean permanentLock) {
    try {
      javonetHandle.invoke("BatchCheckOutAsync", new Object[] {subjectLinks}, permanentLock);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCheckOutAsync(
      WeakLink[] subjectLinks, java.lang.Boolean permanentLock, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchCheckOutAsync", new Object[] {subjectLinks}, permanentLock, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDeleteAsync(WeakLink[] subjectLinks) {
    try {
      javonetHandle.invoke("BatchDeleteAsync", new Object[] {subjectLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDeleteAsync(WeakLink[] subjectLinks, Object userState) {
    try {
      javonetHandle.invoke("BatchDeleteAsync", new Object[] {subjectLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchPublishAsync(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority) {
    try {
      javonetHandle.invoke(
          "BatchPublishAsync",
          new Object[] {subjectLinks},
          publishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchPublishAsync(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchPublishAsync",
          new Object[] {subjectLinks},
          publishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnPublishAsync(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority) {
    try {
      javonetHandle.invoke(
          "BatchUnPublishAsync",
          new Object[] {subjectLinks},
          unPublishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnPublishAsync(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchUnPublishAsync",
          new Object[] {subjectLinks},
          unPublishInstruction,
          new Object[] {targetIdsOrPurposes},
          priority,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUndoCheckOutAsync(WeakLink[] subjectLinks, java.lang.Boolean permanentLock) {
    try {
      javonetHandle.invoke("BatchUndoCheckOutAsync", new Object[] {subjectLinks}, permanentLock);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUndoCheckOutAsync(
      WeakLink[] subjectLinks, java.lang.Boolean permanentLock, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchUndoCheckOutAsync", new Object[] {subjectLinks}, permanentLock, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchStartActivityAsync(WeakLink[] activityInstanceLinks) {
    try {
      javonetHandle.invoke("BatchStartActivityAsync", new Object[] {activityInstanceLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchStartActivityAsync(WeakLink[] activityInstanceLinks, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchStartActivityAsync", new Object[] {activityInstanceLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchFinishActivityAsync(
      WeakLink[] activityInstanceLinks, ActivityFinishData activityFinishData) {
    try {
      javonetHandle.invoke(
          "BatchFinishActivityAsync", new Object[] {activityInstanceLinks}, activityFinishData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchFinishActivityAsync(
      WeakLink[] activityInstanceLinks, ActivityFinishData activityFinishData, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchFinishActivityAsync",
          new Object[] {activityInstanceLinks},
          activityFinishData,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchForceFinishProcessAsync(
      WeakLink[] processInstanceLinks, java.lang.String approvalStatusId) {
    try {
      javonetHandle.invoke(
          "BatchForceFinishProcessAsync", new Object[] {processInstanceLinks}, approvalStatusId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchForceFinishProcessAsync(
      WeakLink[] processInstanceLinks, java.lang.String approvalStatusId, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchForceFinishProcessAsync",
          new Object[] {processInstanceLinks},
          approvalStatusId,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchClassifyAsync(WeakLink[] subjectLinks, java.lang.String[] keywordIds) {
    try {
      javonetHandle.invoke(
          "BatchClassifyAsync", new Object[] {subjectLinks}, new Object[] {keywordIds});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchClassifyAsync(
      WeakLink[] subjectLinks, java.lang.String[] keywordIds, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchClassifyAsync", new Object[] {subjectLinks}, new Object[] {keywordIds}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnClassifyAsync(WeakLink[] subjectLinks, java.lang.String[] keywordIds) {
    try {
      javonetHandle.invoke(
          "BatchUnClassifyAsync", new Object[] {subjectLinks}, new Object[] {keywordIds});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnClassifyAsync(
      WeakLink[] subjectLinks, java.lang.String[] keywordIds, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchUnClassifyAsync",
          new Object[] {subjectLinks},
          new Object[] {keywordIds},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchReClassifyAsync(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd) {
    try {
      javonetHandle.invoke(
          "BatchReClassifyAsync",
          new Object[] {subjectLinks},
          new Object[] {keywordIdsToRemove},
          new Object[] {keywordIdsToAdd});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchReClassifyAsync(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchReClassifyAsync",
          new Object[] {subjectLinks},
          new Object[] {keywordIdsToRemove},
          new Object[] {keywordIdsToAdd},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDeleteTaxonomyNodeAsync(
      WeakLink[] subjectLinks, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode) {
    try {
      javonetHandle.invoke(
          "BatchDeleteTaxonomyNodeAsync",
          new Object[] {subjectLinks},
          NEnum.fromJavaEnum(deleteTaxonomyNodeMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDeleteTaxonomyNodeAsync(
      WeakLink[] subjectLinks, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchDeleteTaxonomyNodeAsync",
          new Object[] {subjectLinks},
          NEnum.fromJavaEnum(deleteTaxonomyNodeMode),
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSwitchUserEnabledStateAsync(
      WeakLink[] subjectLinks, java.lang.Boolean isEnabled) {
    try {
      javonetHandle.invoke(
          "BatchSwitchUserEnabledStateAsync", new Object[] {subjectLinks}, isEnabled);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSwitchUserEnabledStateAsync(
      WeakLink[] subjectLinks, java.lang.Boolean isEnabled, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchSwitchUserEnabledStateAsync", new Object[] {subjectLinks}, isEnabled, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCopyToKeywordAsync(WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      javonetHandle.invoke("BatchCopyToKeywordAsync", new Object[] {subjectLinks}, destinationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCopyToKeywordAsync(
      WeakLink[] subjectLinks, java.lang.String destinationId, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchCopyToKeywordAsync", new Object[] {subjectLinks}, destinationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchMoveToKeywordAsync(WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      javonetHandle.invoke("BatchMoveToKeywordAsync", new Object[] {subjectLinks}, destinationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchMoveToKeywordAsync(
      WeakLink[] subjectLinks, java.lang.String destinationId, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchMoveToKeywordAsync", new Object[] {subjectLinks}, destinationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchReAssignActivityAsync(
      WeakLink[] activityInstanceLinks, java.lang.String newAssigneeId) {
    try {
      javonetHandle.invoke(
          "BatchReAssignActivityAsync", new Object[] {activityInstanceLinks}, newAssigneeId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchReAssignActivityAsync(
      WeakLink[] activityInstanceLinks, java.lang.String newAssigneeId, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchReAssignActivityAsync",
          new Object[] {activityInstanceLinks},
          newAssigneeId,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchRestartActivityAsync(WeakLink[] activityInstanceLinks) {
    try {
      javonetHandle.invoke("BatchRestartActivityAsync", new Object[] {activityInstanceLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchRestartActivityAsync(WeakLink[] activityInstanceLinks, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchRestartActivityAsync", new Object[] {activityInstanceLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSuspendActivityAsync(WeakLink[] activityInstanceLinks, java.lang.String reason) {
    try {
      javonetHandle.invoke(
          "BatchSuspendActivityAsync", new Object[] {activityInstanceLinks}, reason);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchSuspendActivityAsync(
      WeakLink[] activityInstanceLinks, java.lang.String reason, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchSuspendActivityAsync", new Object[] {activityInstanceLinks}, reason, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchResumeActivityAsync(WeakLink[] activityInstanceLinks) {
    try {
      javonetHandle.invoke("BatchResumeActivityAsync", new Object[] {activityInstanceLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchResumeActivityAsync(WeakLink[] activityInstanceLinks, Object userState) {
    try {
      javonetHandle.invoke(
          "BatchResumeActivityAsync", new Object[] {activityInstanceLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchAsync(java.lang.String userName) {
    try {
      javonetHandle.invoke("ImpersonateBatchAsync", userName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchAsync(java.lang.String userName, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateBatchAsync", userName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithTokenAsync(AccessTokenData accessTokenData) {
    try {
      javonetHandle.invoke("ImpersonateBatchWithTokenAsync", accessTokenData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithTokenAsync(AccessTokenData accessTokenData, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateBatchWithTokenAsync", accessTokenData, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithClaimsAsync(ClaimData[] claims) {
    try {
      javonetHandle.invoke("ImpersonateBatchWithClaimsAsync", new Object[] {claims});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithClaimsAsync(ClaimData[] claims, Object userState) {
    try {
      javonetHandle.invoke("ImpersonateBatchWithClaimsAsync", new Object[] {claims}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchLocalizeAsync(WeakLink[] subjectLinks) {
    try {
      javonetHandle.invoke("BatchLocalizeAsync", new Object[] {subjectLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchLocalizeAsync(WeakLink[] subjectLinks, Object userState) {
    try {
      javonetHandle.invoke("BatchLocalizeAsync", new Object[] {subjectLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnLocalizeAsync(WeakLink[] subjectLinks) {
    try {
      javonetHandle.invoke("BatchUnLocalizeAsync", new Object[] {subjectLinks});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchUnLocalizeAsync(WeakLink[] subjectLinks, Object userState) {
    try {
      javonetHandle.invoke("BatchUnLocalizeAsync", new Object[] {subjectLinks}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchPromoteAsync(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction) {
    try {
      javonetHandle.invoke(
          "BatchPromoteAsync", new Object[] {subjectLinks}, destinationRepositoryId, instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchPromoteAsync(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchPromoteAsync",
          new Object[] {subjectLinks},
          destinationRepositoryId,
          instruction,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDemoteAsync(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction) {
    try {
      javonetHandle.invoke(
          "BatchDemoteAsync", new Object[] {subjectLinks}, destinationRepositoryId, instruction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchDemoteAsync(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchDemoteAsync",
          new Object[] {subjectLinks},
          destinationRepositoryId,
          instruction,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCopyAsync(
      WeakLink[] subjectLinks, java.lang.String destinationId, java.lang.Boolean makeUnique) {
    try {
      javonetHandle.invoke(
          "BatchCopyAsync", new Object[] {subjectLinks}, destinationId, makeUnique);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchCopyAsync(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      Object userState) {
    try {
      javonetHandle.invoke(
          "BatchCopyAsync", new Object[] {subjectLinks}, destinationId, makeUnique, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchMoveAsync(WeakLink[] subjectLinks, java.lang.String destinationId) {
    try {
      javonetHandle.invoke("BatchMoveAsync", new Object[] {subjectLinks}, destinationId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BatchMoveAsync(
      WeakLink[] subjectLinks, java.lang.String destinationId, Object userState) {
    try {
      javonetHandle.invoke("BatchMoveAsync", new Object[] {subjectLinks}, destinationId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs>>
      _ImpersonateBatchCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs>>();

  public void addImpersonateBatchCompleted(
      EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> toAdd) {
    _ImpersonateBatchCompletedListeners.add(toAdd);
  }

  public void removeImpersonateBatchCompleted(
      EventHandlerTEventArgs<ImpersonateBatchCompletedEventArgs> toRemove) {
    _ImpersonateBatchCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>
      _ImpersonateBatchWithTokenCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<AsyncCompletedEventArgs>>();

  public void addImpersonateBatchWithTokenCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toAdd) {
    _ImpersonateBatchWithTokenCompletedListeners.add(toAdd);
  }

  public void removeImpersonateBatchWithTokenCompleted(
      EventHandlerTEventArgs<AsyncCompletedEventArgs> toRemove) {
    _ImpersonateBatchWithTokenCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs>>
      _ImpersonateBatchWithClaimsCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs>>();

  public void addImpersonateBatchWithClaimsCompleted(
      EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> toAdd) {
    _ImpersonateBatchWithClaimsCompletedListeners.add(toAdd);
  }

  public void removeImpersonateBatchWithClaimsCompleted(
      EventHandlerTEventArgs<ImpersonateBatchWithClaimsCompletedEventArgs> toRemove) {
    _ImpersonateBatchWithClaimsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs>>
      _BatchLocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs>>();

  public void addBatchLocalizeCompleted(
      EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> toAdd) {
    _BatchLocalizeCompletedListeners.add(toAdd);
  }

  public void removeBatchLocalizeCompleted(
      EventHandlerTEventArgs<BatchLocalizeCompletedEventArgs> toRemove) {
    _BatchLocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs>>
      _BatchUnLocalizeCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs>>();

  public void addBatchUnLocalizeCompleted(
      EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> toAdd) {
    _BatchUnLocalizeCompletedListeners.add(toAdd);
  }

  public void removeBatchUnLocalizeCompleted(
      EventHandlerTEventArgs<BatchUnLocalizeCompletedEventArgs> toRemove) {
    _BatchUnLocalizeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchPromoteCompletedEventArgs>>
      _BatchPromoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchPromoteCompletedEventArgs>>();

  public void addBatchPromoteCompleted(
      EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> toAdd) {
    _BatchPromoteCompletedListeners.add(toAdd);
  }

  public void removeBatchPromoteCompleted(
      EventHandlerTEventArgs<BatchPromoteCompletedEventArgs> toRemove) {
    _BatchPromoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchDemoteCompletedEventArgs>>
      _BatchDemoteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchDemoteCompletedEventArgs>>();

  public void addBatchDemoteCompleted(EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> toAdd) {
    _BatchDemoteCompletedListeners.add(toAdd);
  }

  public void removeBatchDemoteCompleted(
      EventHandlerTEventArgs<BatchDemoteCompletedEventArgs> toRemove) {
    _BatchDemoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchCopyCompletedEventArgs>>
      _BatchCopyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchCopyCompletedEventArgs>>();

  public void addBatchCopyCompleted(EventHandlerTEventArgs<BatchCopyCompletedEventArgs> toAdd) {
    _BatchCopyCompletedListeners.add(toAdd);
  }

  public void removeBatchCopyCompleted(
      EventHandlerTEventArgs<BatchCopyCompletedEventArgs> toRemove) {
    _BatchCopyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchMoveCompletedEventArgs>>
      _BatchMoveCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchMoveCompletedEventArgs>>();

  public void addBatchMoveCompleted(EventHandlerTEventArgs<BatchMoveCompletedEventArgs> toAdd) {
    _BatchMoveCompletedListeners.add(toAdd);
  }

  public void removeBatchMoveCompleted(
      EventHandlerTEventArgs<BatchMoveCompletedEventArgs> toRemove) {
    _BatchMoveCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchCheckInCompletedEventArgs>>
      _BatchCheckInCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchCheckInCompletedEventArgs>>();

  public void addBatchCheckInCompleted(
      EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> toAdd) {
    _BatchCheckInCompletedListeners.add(toAdd);
  }

  public void removeBatchCheckInCompleted(
      EventHandlerTEventArgs<BatchCheckInCompletedEventArgs> toRemove) {
    _BatchCheckInCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs>>
      _BatchCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs>>();

  public void addBatchCheckOutCompleted(
      EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> toAdd) {
    _BatchCheckOutCompletedListeners.add(toAdd);
  }

  public void removeBatchCheckOutCompleted(
      EventHandlerTEventArgs<BatchCheckOutCompletedEventArgs> toRemove) {
    _BatchCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchDeleteCompletedEventArgs>>
      _BatchDeleteCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchDeleteCompletedEventArgs>>();

  public void addBatchDeleteCompleted(EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> toAdd) {
    _BatchDeleteCompletedListeners.add(toAdd);
  }

  public void removeBatchDeleteCompleted(
      EventHandlerTEventArgs<BatchDeleteCompletedEventArgs> toRemove) {
    _BatchDeleteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchPublishCompletedEventArgs>>
      _BatchPublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchPublishCompletedEventArgs>>();

  public void addBatchPublishCompleted(
      EventHandlerTEventArgs<BatchPublishCompletedEventArgs> toAdd) {
    _BatchPublishCompletedListeners.add(toAdd);
  }

  public void removeBatchPublishCompleted(
      EventHandlerTEventArgs<BatchPublishCompletedEventArgs> toRemove) {
    _BatchPublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs>>
      _BatchUnPublishCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs>>();

  public void addBatchUnPublishCompleted(
      EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> toAdd) {
    _BatchUnPublishCompletedListeners.add(toAdd);
  }

  public void removeBatchUnPublishCompleted(
      EventHandlerTEventArgs<BatchUnPublishCompletedEventArgs> toRemove) {
    _BatchUnPublishCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs>>
      _BatchUndoCheckOutCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs>>();

  public void addBatchUndoCheckOutCompleted(
      EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> toAdd) {
    _BatchUndoCheckOutCompletedListeners.add(toAdd);
  }

  public void removeBatchUndoCheckOutCompleted(
      EventHandlerTEventArgs<BatchUndoCheckOutCompletedEventArgs> toRemove) {
    _BatchUndoCheckOutCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs>>
      _BatchStartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs>>();

  public void addBatchStartActivityCompleted(
      EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> toAdd) {
    _BatchStartActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchStartActivityCompleted(
      EventHandlerTEventArgs<BatchStartActivityCompletedEventArgs> toRemove) {
    _BatchStartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs>>
      _BatchFinishActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs>>();

  public void addBatchFinishActivityCompleted(
      EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> toAdd) {
    _BatchFinishActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchFinishActivityCompleted(
      EventHandlerTEventArgs<BatchFinishActivityCompletedEventArgs> toRemove) {
    _BatchFinishActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs>>
      _BatchForceFinishProcessCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs>>();

  public void addBatchForceFinishProcessCompleted(
      EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> toAdd) {
    _BatchForceFinishProcessCompletedListeners.add(toAdd);
  }

  public void removeBatchForceFinishProcessCompleted(
      EventHandlerTEventArgs<BatchForceFinishProcessCompletedEventArgs> toRemove) {
    _BatchForceFinishProcessCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchClassifyCompletedEventArgs>>
      _BatchClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchClassifyCompletedEventArgs>>();

  public void addBatchClassifyCompleted(
      EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> toAdd) {
    _BatchClassifyCompletedListeners.add(toAdd);
  }

  public void removeBatchClassifyCompleted(
      EventHandlerTEventArgs<BatchClassifyCompletedEventArgs> toRemove) {
    _BatchClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs>>
      _BatchUnClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs>>();

  public void addBatchUnClassifyCompleted(
      EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> toAdd) {
    _BatchUnClassifyCompletedListeners.add(toAdd);
  }

  public void removeBatchUnClassifyCompleted(
      EventHandlerTEventArgs<BatchUnClassifyCompletedEventArgs> toRemove) {
    _BatchUnClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs>>
      _BatchReClassifyCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs>>();

  public void addBatchReClassifyCompleted(
      EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> toAdd) {
    _BatchReClassifyCompletedListeners.add(toAdd);
  }

  public void removeBatchReClassifyCompleted(
      EventHandlerTEventArgs<BatchReClassifyCompletedEventArgs> toRemove) {
    _BatchReClassifyCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs>>
      _BatchDeleteTaxonomyNodeCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs>>();

  public void addBatchDeleteTaxonomyNodeCompleted(
      EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> toAdd) {
    _BatchDeleteTaxonomyNodeCompletedListeners.add(toAdd);
  }

  public void removeBatchDeleteTaxonomyNodeCompleted(
      EventHandlerTEventArgs<BatchDeleteTaxonomyNodeCompletedEventArgs> toRemove) {
    _BatchDeleteTaxonomyNodeCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs>>
      _BatchSwitchUserEnabledStateCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs>>();

  public void addBatchSwitchUserEnabledStateCompleted(
      EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> toAdd) {
    _BatchSwitchUserEnabledStateCompletedListeners.add(toAdd);
  }

  public void removeBatchSwitchUserEnabledStateCompleted(
      EventHandlerTEventArgs<BatchSwitchUserEnabledStateCompletedEventArgs> toRemove) {
    _BatchSwitchUserEnabledStateCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs>>
      _BatchCopyToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs>>();

  public void addBatchCopyToKeywordCompleted(
      EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> toAdd) {
    _BatchCopyToKeywordCompletedListeners.add(toAdd);
  }

  public void removeBatchCopyToKeywordCompleted(
      EventHandlerTEventArgs<BatchCopyToKeywordCompletedEventArgs> toRemove) {
    _BatchCopyToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs>>
      _BatchMoveToKeywordCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs>>();

  public void addBatchMoveToKeywordCompleted(
      EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> toAdd) {
    _BatchMoveToKeywordCompletedListeners.add(toAdd);
  }

  public void removeBatchMoveToKeywordCompleted(
      EventHandlerTEventArgs<BatchMoveToKeywordCompletedEventArgs> toRemove) {
    _BatchMoveToKeywordCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs>>
      _BatchReAssignActivityCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs>>();

  public void addBatchReAssignActivityCompleted(
      EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> toAdd) {
    _BatchReAssignActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchReAssignActivityCompleted(
      EventHandlerTEventArgs<BatchReAssignActivityCompletedEventArgs> toRemove) {
    _BatchReAssignActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs>>
      _BatchRestartActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs>>();

  public void addBatchRestartActivityCompleted(
      EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> toAdd) {
    _BatchRestartActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchRestartActivityCompleted(
      EventHandlerTEventArgs<BatchRestartActivityCompletedEventArgs> toRemove) {
    _BatchRestartActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs>>
      _BatchSuspendActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs>>();

  public void addBatchSuspendActivityCompleted(
      EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> toAdd) {
    _BatchSuspendActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchSuspendActivityCompleted(
      EventHandlerTEventArgs<BatchSuspendActivityCompletedEventArgs> toRemove) {
    _BatchSuspendActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs>>
      _BatchResumeActivityCompletedListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs>>();

  public void addBatchResumeActivityCompleted(
      EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> toAdd) {
    _BatchResumeActivityCompletedListeners.add(toAdd);
  }

  public void removeBatchResumeActivityCompleted(
      EventHandlerTEventArgs<BatchResumeActivityCompletedEventArgs> toRemove) {
    _BatchResumeActivityCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<
          EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>>
      _BatchSynchronizeWithSchemaAndUpdateCompletedListeners =
          new java.util.ArrayList<
              EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs>>();

  public void addBatchSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs> toAdd) {
    _BatchSynchronizeWithSchemaAndUpdateCompletedListeners.add(toAdd);
  }

  public void removeBatchSynchronizeWithSchemaAndUpdateCompleted(
      EventHandlerTEventArgs<BatchSynchronizeWithSchemaAndUpdateCompletedEventArgs> toRemove) {
    _BatchSynchronizeWithSchemaAndUpdateCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
