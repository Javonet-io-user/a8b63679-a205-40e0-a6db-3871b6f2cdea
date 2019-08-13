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
import jio.System.Xml.Linq.*;

public interface ICoreService {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetApplicationIds(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] EndGetApplicationIds(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PurgeApplicationData(java.lang.String applicationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeApplicationData(
      java.lang.String applicationId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeApplicationData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedBatchOperation> ParsePredefinedBatchOperation(
      java.lang.String operation);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginParsePredefinedBatchOperation(
      java.lang.String operation, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedBatchOperation> EndParsePredefinedBatchOperation(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPredefinedBatchOperationName(PredefinedBatchOperation operation);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPredefinedBatchOperationName(
      PredefinedBatchOperation operation, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetPredefinedBatchOperationName(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishContextData[] ResolveItems(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveItems(
      java.lang.String[] ids,
      ResolveInstructionData resolveInstruction,
      java.lang.String[] targetIdsOrPurposes,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishContextData[] EndResolveItems(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement GetSearchResultsXml(SearchQueryData filter);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsXml(
      SearchQueryData filter, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSearchResultsXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement GetSearchResultsXmlPaged(
      SearchQueryData filter, java.lang.Integer startRowIndex, java.lang.Integer maxRows);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsXmlPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSearchResultsXmlPaged(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSearchResults(
      SearchQueryData filter, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResults(
      SearchQueryData filter, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSearchResults(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSearchResultsPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSearchResultsPaged(
      SearchQueryData filter,
      java.lang.Integer startRowIndex,
      java.lang.Integer maxRows,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSearchResultsPaged(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData RenderItem(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRenderItem(
      java.lang.String itemId,
      java.lang.String templateId,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetIdOrPurpose,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndRenderItem(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData PreviewItem(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPreviewItem(
      RepositoryLocalObjectData itemData,
      TemplateData templateData,
      PublishInstructionData publishInstruction,
      java.lang.String publicationTargetId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndPreviewItem(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] Publish(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPublish(
      java.lang.String[] ids,
      PublishInstructionData publishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] EndPublish(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] UnPublish(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnPublish(
      java.lang.String[] ids,
      UnPublishInstructionData unPublishInstruction,
      java.lang.String[] targetIdsOrPurposes,
      Nullable<PublishPriority> priority,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishTransactionData[] EndUnPublish(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsPublished(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsPublished(
      java.lang.String itemId,
      java.lang.String publishingTargetIdOrPurpose,
      java.lang.Boolean isPublishedInContext,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsPublished(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData GetWorkItemSnapshot(java.lang.String workItemId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetWorkItemSnapshot(
      java.lang.String workItemId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RenderedItemData EndGetWorkItemSnapshot(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishInfoData[] GetListPublishInfo(java.lang.String itemId, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListPublishInfo(
      java.lang.String itemId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishInfoData[] EndGetListPublishInfo(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActionFlags CastActions(java.lang.Integer numericActions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCastActions(
      java.lang.Integer numericActions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActionFlags EndCastActions(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ValidateXml(IdentifiableObjectData data);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginValidateXml(
      IdentifiableObjectData data, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndValidateXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsValidTridionWebSchemaXml(SchemaData data);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsValidTridionWebSchemaXml(
      SchemaData data, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsValidTridionWebSchemaXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ArrayOfTcmUri GetSubjectIdsWithApplicationData(java.lang.String applicationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSubjectIdsWithApplicationData(
      java.lang.String applicationId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ArrayOfTcmUri EndGetSubjectIdsWithApplicationData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationDataDictionary ReadApplicationDataForSubjectsIds(
      java.lang.String[] subjectIds, java.lang.String[] applicationIds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadApplicationDataForSubjectsIds(
      java.lang.String[] subjectIds,
      java.lang.String[] applicationIds,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationDataDictionary EndReadApplicationDataForSubjectsIds(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary GetSecurityDescriptorsForSubjectsIds(
      java.lang.String[] subjectIds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSecurityDescriptorsForSubjectsIds(
      java.lang.String[] subjectIds, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary EndGetSecurityDescriptorsForSubjectsIds(
      IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary GetContentSecurityDescriptorsForOrgItemIds(
      java.lang.String[] organizationalItemIds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetContentSecurityDescriptorsForOrgItemIds(
      java.lang.String[] organizationalItemIds, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SecurityDescriptorDataDictionary EndGetContentSecurityDescriptorsForOrgItemIds(
      IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ReIndex(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReIndex(java.lang.String id, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndReIndex(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedQueue> CastPredefinedQueue(java.lang.Integer queueId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCastPredefinedQueue(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Nullable<PredefinedQueue> EndCastPredefinedQueue(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer PurgeOldVersions(PurgeOldVersionsInstructionData instruction);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeOldVersions(
      PurgeOldVersionsInstructionData instruction, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer EndPurgeOldVersions(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement GetListExternalLinks(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListExternalLinks(
      java.lang.String id, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetListExternalLinks(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SearchQueryData ConvertXmlToSearchQuery(XElement searchQueryXml);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertXmlToSearchQuery(
      XElement searchQueryXml, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SearchQueryData EndConvertXmlToSearchQuery(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement ConvertSearchQueryToXml(SearchQueryData searchQueryData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertSearchQueryToXml(
      SearchQueryData searchQueryData, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndConvertSearchQueryToXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndGetDefaultData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Move(
      java.lang.String id, java.lang.String destinationId, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginMove(
      java.lang.String id,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndMove(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Copy(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCopy(
      java.lang.String id,
      java.lang.String destinationId,
      java.lang.Boolean makeUnique,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndCopy(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public InstanceData GetInstanceData(
      java.lang.String schemaId, java.lang.String containerItemId, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetInstanceData(
      java.lang.String schemaId,
      java.lang.String containerItemId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public InstanceData EndGetInstanceData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData TryCheckOut(java.lang.String id, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryCheckOut(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndTryCheckOut(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData CheckOut(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCheckOut(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndCheckOut(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData CheckIn(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCheckIn(
      java.lang.String id,
      java.lang.Boolean removePermanentLock,
      java.lang.String userComment,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndCheckIn(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Update(
      IdentifiableObjectData deltaData, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUpdate(
      IdentifiableObjectData deltaData,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndUpdate(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Create(IdentifiableObjectData data, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCreate(
      IdentifiableObjectData data,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndCreate(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData UndoCheckOut(
      java.lang.String id, java.lang.Boolean permanentLock, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUndoCheckOut(
      java.lang.String id,
      java.lang.Boolean permanentLock,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndUndoCheckOut(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData Rollback(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRollback(
      java.lang.String id,
      java.lang.Boolean deleteVersions,
      java.lang.String comment,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public VersionedItemData EndRollback(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData Localize(java.lang.String id, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginLocalize(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndLocalize(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData UnLocalize(java.lang.String id, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnLocalize(
      java.lang.String id, ReadOptions readBackOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RepositoryLocalObjectData EndUnLocalize(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData Promote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPromote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData EndPromote(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData Demote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDemote(
      java.lang.String id,
      java.lang.String destinationRepositoryId,
      OperationInstruction instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OperationResultDataOfRepositoryLocalObjectData EndDemote(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TemplateType[] GetListTemplateTypes(Nullable<ItemType> itemType, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListTemplateTypes(
      Nullable<ItemType> itemType, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TemplateType[] EndGetListTemplateTypes(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublicationType[] GetListPublicationTypes(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListPublicationTypes(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublicationType[] EndGetListPublicationTypes(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement GetSystemWideListXml(SystemWideListFilterData filter);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemWideListXml(
      SystemWideListFilterData filter, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetSystemWideListXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetSystemWideList(
      SystemWideListFilterData filter, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemWideList(
      SystemWideListFilterData filter, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetSystemWideList(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement GetListXml(java.lang.String id, SubjectRelatedListFilterData filter);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListXml(
      java.lang.String id,
      SubjectRelatedListFilterData filter,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndGetListXml(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] GetList(
      java.lang.String id, SubjectRelatedListFilterData filter, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetList(
      java.lang.String id,
      SubjectRelatedListFilterData filter,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData[] EndGetList(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetListDirectoryServiceNames(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceNames(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] EndGetListDirectoryServiceNames(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WindowsUser[] GetListWindowsDomainUsers(
      java.lang.String domainName, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListWindowsDomainUsers(
      java.lang.String domainName, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WindowsUser[] EndGetListWindowsDomainUsers(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceAllUsers(
      java.lang.String directoryServiceName, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceAllUsers(
      java.lang.String directoryServiceName, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceAllUsers(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceGroupMembers(
      java.lang.String directoryServiceName, java.lang.String groupDN, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceGroupMembers(
      java.lang.String directoryServiceName,
      java.lang.String groupDN,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceGroupMembers(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] GetListDirectoryServiceUsers(
      java.lang.String directoryServiceName, DirectoryUsersFilter filter, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListDirectoryServiceUsers(
      java.lang.String directoryServiceName,
      DirectoryUsersFilter filter,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DirectoryServiceUser[] EndGetListDirectoryServiceUsers(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData Classify(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginClassify(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData UnClassify(
      java.lang.String id, java.lang.String[] keywordIds, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnClassify(
      java.lang.String id,
      java.lang.String[] keywordIds,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndUnClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData ReClassify(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReClassify(
      java.lang.String id,
      java.lang.String[] keywordIdsToRemove,
      java.lang.String[] keywordIdsToAdd,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ClassificationInfoData EndReClassify(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData StartActivity(
      java.lang.String activityInstanceId, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStartActivity(
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndStartActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData SuspendActivity(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSuspendActivity(
      java.lang.String activityInstanceId,
      java.lang.String reason,
      Nullable<DateTime> resumeAt,
      java.lang.String resumeBookmark,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndSuspendActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData RestartActivity(
      java.lang.String activityInstanceId, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRestartActivity(
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndRestartActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData ReAssignActivity(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReAssignActivity(
      java.lang.String activityInstanceId,
      java.lang.String newAssigneeId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndReAssignActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData FinishActivity(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginFinishActivity(
      java.lang.String activityInstanceId,
      ActivityFinishData activityFinishData,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndFinishActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessHistoryData ForceFinishProcess(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginForceFinishProcess(
      java.lang.String processInstanceId,
      java.lang.String approvalStatusId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessHistoryData EndForceFinishProcess(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData ResumeActivity(
      java.lang.String activityInstanceId, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResumeActivity(
      java.lang.String activityInstanceId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ActivityInstanceData EndResumeActivity(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public QueueMessageData[] GetListQueueMessages(
      java.lang.Integer queueId, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListQueueMessages(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public QueueMessageData[] EndGetListQueueMessages(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PurgeQueue(java.lang.Integer queueId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeQueue(
      java.lang.Integer queueId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeQueue(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public QueueData[] GetListQueues(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListQueues(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public QueueData[] EndGetListQueues(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationData ReadApplicationData(
      java.lang.String subjectId, java.lang.String applicationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadApplicationData(
      java.lang.String subjectId,
      java.lang.String applicationId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationData EndReadApplicationData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationData[] ReadAllApplicationData(
      java.lang.String subjectId, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadAllApplicationData(
      java.lang.String subjectId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ApplicationData[] EndReadAllApplicationData(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void SaveApplicationData(java.lang.String subjectId, ApplicationData[] applicationData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSaveApplicationData(
      java.lang.String subjectId,
      ApplicationData[] applicationData,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndSaveApplicationData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DeleteApplicationData(java.lang.String subjectId, java.lang.String applicationId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDeleteApplicationData(
      java.lang.String subjectId,
      java.lang.String applicationId,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndDeleteApplicationData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetApplicationIds(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaData GetVirtualFolderTypeSchema(java.lang.String namespaceUri);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetVirtualFolderTypeSchema(
      java.lang.String namespaceUri, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaData EndGetVirtualFolderTypeSchema(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TridionEnumValue[] GetEnumValues(java.lang.String type, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetEnumValues(
      java.lang.String type, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TridionEnumValue[] EndGetEnumValues(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public BundleTypeData[] ResolveBundleTypes(
      java.lang.String[] itemIds, java.lang.Boolean pruneTree, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveBundleTypes(
      java.lang.String[] itemIds,
      java.lang.Boolean pruneTree,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public BundleTypeData[] EndResolveBundleTypes(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeywordData CopyToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginCopyToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeywordData EndCopyToKeyword(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeywordData MoveToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginMoveToKeyword(
      java.lang.String sourceKeywordId,
      java.lang.String destinationId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public KeywordData EndMoveToKeyword(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TridionLanguageInfo[] GetTridionLanguages(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetTridionLanguages(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TridionLanguageInfo[] EndGetTridionLanguages(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkflowScriptType[] GetListWorkflowScriptTypes(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetListWorkflowScriptTypes(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkflowScriptType[] EndGetListWorkflowScriptTypes(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] AddToWorkflow(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginAddToWorkflow(
      java.lang.String[] subjectIds,
      java.lang.String activityInstanceId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] EndAddToWorkflow(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] RemoveFromWorkflow(
      java.lang.String[] subjectIds, ReadOptions readBackOptions, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRemoveFromWorkflow(
      java.lang.String[] subjectIds,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public WorkItemData[] EndRemoveFromWorkflow(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData Lock(
      java.lang.String organizationalItemId, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginLock(
      java.lang.String organizationalItemId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData EndLock(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData Unlock(
      java.lang.String organizationalItemId, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginUnlock(
      java.lang.String organizationalItemId,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public OrganizationalItemData EndUnlock(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessInstanceData StartWorkflow(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginStartWorkflow(
      java.lang.String repositoryId,
      StartWorkflowInstructionData instruction,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessInstanceData EndStartWorkflow(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessDefinitionAssociationDictionary GetProcessDefinitionsForItems(
      java.lang.String[] itemIds, ProcessDefinitionType processDefinitionType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetProcessDefinitionsForItems(
      java.lang.String[] itemIds,
      ProcessDefinitionType processDefinitionType,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ProcessDefinitionAssociationDictionary EndGetProcessDefinitionsForItems(
      IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSystemXsd(java.lang.String filename);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemXsd(
      java.lang.String filename, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetSystemXsd(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinkToSchemaData[] GetSchemasByNamespaceUri(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName,
      Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSchemasByNamespaceUri(
      java.lang.String repositoryId,
      java.lang.String namespaceUri,
      java.lang.String rootElementName,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinkToSchemaData[] EndGetSchemasByNamespaceUri(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ValidationErrorData[] Validate(IdentifiableObjectData deltaData, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginValidate(
      IdentifiableObjectData deltaData, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ValidationErrorData[] EndValidate(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public BinaryContentData GetExternalBinaryContentData(java.lang.String uri);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetExternalBinaryContentData(
      java.lang.String uri, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public BinaryContentData EndGetExternalBinaryContentData(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult SynchronizeWithSchema(
      IdentifiableObjectData dataObject, SynchronizeOptions synchronizeOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSynchronizeWithSchema(
      IdentifiableObjectData dataObject,
      SynchronizeOptions synchronizeOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult EndSynchronizeWithSchema(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult SynchronizeWithSchemaAndUpdate(
      java.lang.String itemId, SynchronizeOptions synchronizeOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSynchronizeWithSchemaAndUpdate(
      java.lang.String itemId,
      SynchronizeOptions synchronizeOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SynchronizationResult EndSynchronizeWithSchemaAndUpdate(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DecommissionPublicationTarget(java.lang.String publicationTargetId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDecommissionPublicationTarget(
      java.lang.String publicationTargetId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndDecommissionPublicationTarget(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData ConvertXsdToSchemaFields(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertXsdToSchemaFields(
      XElement xsd,
      SchemaPurpose purpose,
      java.lang.String rootElementName,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData EndConvertXsdToSchemaFields(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPublishUrl(
      java.lang.String id, java.lang.String targetTypeIdOrPurpose);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPublishUrl(
      java.lang.String id,
      java.lang.String targetTypeIdOrPurpose,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetPublishUrl(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinkToBusinessProcessTypeData[] GetBusinessProcessTypes(
      java.lang.String cdTopologyTypeId, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetBusinessProcessTypes(
      java.lang.String cdTopologyTypeId, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public LinkToBusinessProcessTypeData[] EndGetBusinessProcessTypes(
      IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishSourceData GetPublishSourceByUrl(java.lang.String url);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetPublishSourceByUrl(
      java.lang.String url, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public PublishSourceData EndGetPublishSourceByUrl(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void RemovePublishStates(
      java.lang.String publicationId, java.lang.String targetTypeIdOrPurpose);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRemovePublishStates(
      java.lang.String publicationId,
      java.lang.String targetTypeIdOrPurpose,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndRemovePublishStates(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ContainingPagesDictionary ResolveContainingPages(
      java.lang.String componentId, ResolveContainingPagesInstructionData instruction);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginResolveContainingPages(
      java.lang.String componentId,
      ResolveContainingPagesInstructionData instruction,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ContainingPagesDictionary EndResolveContainingPages(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PurgeWorkflowHistory(PurgeWorkflowHistoryInstructionData instruction);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginPurgeWorkflowHistory(
      PurgeWorkflowHistoryInstructionData instruction, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndPurgeWorkflowHistory(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void BroadcastNotification(NotificationMessage notification);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBroadcastNotification(
      NotificationMessage notification, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndBroadcastNotification(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SystemPrivilege[] GetSystemPrivileges(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetSystemPrivileges(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SystemPrivilege[] EndGetSystemPrivileges(IAsyncResult result, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetApiVersion();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetApiVersion(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetApiVersion(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData GetCurrentUser();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetCurrentUser(AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public AccessTokenData EndGetCurrentUser(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsExistingObject(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginIsExistingObject(
      java.lang.String id, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndIsExistingObject(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndGetTcmUri(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String TryGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryGetTcmUri(
      java.lang.String baseUri,
      java.lang.String contextRepositoryUri,
      Nullable<java.lang.Long> version,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String EndTryGetTcmUri(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Read(java.lang.String id, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginRead(
      java.lang.String id, ReadOptions readOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndRead(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData TryRead(java.lang.String id, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginTryRead(
      java.lang.String id, ReadOptions readOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndTryRead(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ItemReadResultDictionary BulkRead(java.lang.String[] ids, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginBulkRead(
      java.lang.String[] ids, ReadOptions readOptions, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ItemReadResultDictionary EndBulkRead(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData ReadSchemaFields(
      java.lang.String schemaId, java.lang.Boolean expandEmbeddedFields, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginReadSchemaFields(
      java.lang.String schemaId,
      java.lang.Boolean expandEmbeddedFields,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SchemaFieldsData EndReadSchemaFields(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement ConvertSchemaFieldsToXsd(SchemaFieldsData schemaFieldsData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginConvertSchemaFieldsToXsd(
      SchemaFieldsData schemaFieldsData, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public XElement EndConvertSchemaFieldsToXsd(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData Save(IdentifiableObjectData deltaData, ReadOptions readBackOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSave(
      IdentifiableObjectData deltaData,
      ReadOptions readBackOptions,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData EndSave(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Delete(java.lang.String id);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDelete(java.lang.String id, AsyncCallback callback, Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndDelete(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DeleteTaxonomyNode(
      java.lang.String id, DeleteTaxonomyNodeMode deleteTaxonomyNodeMode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDeleteTaxonomyNode(
      java.lang.String id,
      DeleteTaxonomyNodeMode deleteTaxonomyNodeMode,
      AsyncCallback callback,
      Object asyncState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndDeleteTaxonomyNode(IAsyncResult result);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IdentifiableObjectData GetDefaultData(
      ItemType itemType, java.lang.String containerId, ReadOptions readOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetDefaultData(
      ItemType itemType,
      java.lang.String containerId,
      ReadOptions readOptions,
      AsyncCallback callback,
      Object asyncState);
}
