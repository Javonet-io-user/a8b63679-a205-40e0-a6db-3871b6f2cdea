package Tridion.ContentManager.CoreService.Client;

public enum ItemType {
  None(0L),
  Publication(1L),
  Folder(2L),
  StructureGroup(4L),
  Schema(8L),
  Component(16L),
  ComponentTemplate(32L),
  Page(64L),
  PageTemplate(128L),
  TargetGroup(256L),
  Category(512L),
  Keyword(1024L),
  TemplateBuildingBlock(2048L),
  BusinessProcessType(4096L),
  VirtualFolder(8192L),
  PublicationTarget(65537L),
  TargetType(65538L),
  TargetDestination(65540L),
  MultimediaType(65544L),
  User(65552L),
  Group(65568L),
  DirectoryService(65664L),
  DirectoryGroupMapping(65792L),
  Batch(66048L),
  PublishTransaction(66560L),
  WorkflowType(67584L),
  ApprovalStatus(131073L),
  ProcessDefinition(131074L),
  ProcessInstance(131076L),
  ProcessHistory(131080L),
  ActivityDefinition(131088L),
  ActivityInstance(131104L),
  ActivityHistory(131136L),
  WorkItem(131200L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
