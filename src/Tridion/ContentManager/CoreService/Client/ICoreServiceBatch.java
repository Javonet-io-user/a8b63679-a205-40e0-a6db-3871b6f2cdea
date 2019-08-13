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

public interface ICoreServiceBatch {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData ImpersonateBatch(java.lang.String userName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatch(
      java.lang.String userName, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonateBatch(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ImpersonateBatchWithToken(AccessTokenData accessTokenData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatchWithToken(
      AccessTokenData accessTokenData, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndImpersonateBatchWithToken(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData ImpersonateBatchWithClaims(ClaimData[] claims);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginImpersonateBatchWithClaims(
      ClaimData[] claims, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndImpersonateBatchWithClaims(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchLocalize(WeakLink[] subjectLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchLocalize(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchLocalize(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnLocalize(WeakLink[] subjectLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnLocalize(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchUnLocalize(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchPromote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchPromote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchPromote(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDemote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDemote(
      WeakLink[] subjectLinks,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchDemote(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCopy(
      WeakLink[] subjectLinks, java.lang.String destinationId, java.lang.Boolean makeUnique);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCopy(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchCopy(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchMove(WeakLink[] subjectLinks, java.lang.String destinationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchMove(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchMove(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCheckIn(
      WeakLink[] subjectLinks, java.lang.Boolean removePermanentLock, java.lang.String userComment);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCheckIn(
      WeakLink[] subjectLinks,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchCheckIn(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCheckOut(WeakLink[] subjectLinks, java.lang.Boolean permanentLock);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCheckOut(
      WeakLink[] subjectLinks,
      java.lang.Boolean permanentLock,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchCheckOut(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDelete(WeakLink[] subjectLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDelete(
      WeakLink[] subjectLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchDelete(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchPublish(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchPublish(
      WeakLink[] subjectLinks,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchPublish(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnPublish(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnPublish(
      WeakLink[] subjectLinks,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchUnPublish(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUndoCheckOut(
      WeakLink[] subjectLinks, java.lang.Boolean permanentLock);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUndoCheckOut(
      WeakLink[] subjectLinks,
      java.lang.Boolean permanentLock,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchUndoCheckOut(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchStartActivity(WeakLink[] activityInstanceLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchStartActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchStartActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchFinishActivity(
      WeakLink[] activityInstanceLinks, ActivityFinishData activityFinishData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchFinishActivity(
      WeakLink[] activityInstanceLinks,
      ActivityFinishData activityFinishData,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchFinishActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchForceFinishProcess(
      WeakLink[] processInstanceLinks, java.lang.String approvalStatusId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchForceFinishProcess(
      WeakLink[] processInstanceLinks,
      java.lang.String approvalStatusId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchForceFinishProcess(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchClassify(WeakLink[] subjectLinks, java.lang.String[] keywordIds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIds,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchUnClassify(WeakLink[] subjectLinks, java.lang.String[] keywordIds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchUnClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIds,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchUnClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchReClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchReClassify(
      WeakLink[] subjectLinks,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchReClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchDeleteTaxonomyNode(
      WeakLink[] subjectLinks, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchDeleteTaxonomyNode(
      WeakLink[] subjectLinks,
      DeleteTaxonomyNodeMode deleteTaxonomyNodeMode,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchDeleteTaxonomyNode(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSwitchUserEnabledState(
      WeakLink[] subjectLinks, java.lang.Boolean isEnabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSwitchUserEnabledState(
      WeakLink[] subjectLinks,
      java.lang.Boolean isEnabled,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchSwitchUserEnabledState(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchCopyToKeyword(
      WeakLink[] subjectLinks, java.lang.String destinationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchCopyToKeyword(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchCopyToKeyword(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchMoveToKeyword(
      WeakLink[] subjectLinks, java.lang.String destinationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchMoveToKeyword(
      WeakLink[] subjectLinks,
      java.lang.String destinationId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchMoveToKeyword(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchReAssignActivity(
      WeakLink[] activityInstanceLinks, java.lang.String newAssigneeId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchReAssignActivity(
      WeakLink[] activityInstanceLinks,
      java.lang.String newAssigneeId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchReAssignActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchRestartActivity(WeakLink[] activityInstanceLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchRestartActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchRestartActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSuspendActivity(
      WeakLink[] activityInstanceLinks, java.lang.String reason);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSuspendActivity(
      WeakLink[] activityInstanceLinks,
      java.lang.String reason,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchSuspendActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchResumeActivity(WeakLink[] activityInstanceLinks);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchResumeActivity(
      WeakLink[] activityInstanceLinks, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchResumeActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BatchSynchronizeWithSchemaAndUpdate(
      WeakLink[] subjectLinks, SynchronizeOptions synchOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBatchSynchronizeWithSchemaAndUpdate(
      WeakLink[] subjectLinks,
      SynchronizeOptions synchOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndBatchSynchronizeWithSchemaAndUpdate(IAsyncResult result);
}
