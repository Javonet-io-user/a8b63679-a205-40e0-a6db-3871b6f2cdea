package Tridion.ContentManager.CoreService.Client;

public enum Rights {
  None(0L),
  PublicationAccess(1L),
  PublicationManagement(2L),
  FolderManagement(4L),
  StructureGroupManagement(8L),
  SchemaManagement(16L),
  ComponentManagement(32L),
  ComponentTemplateManagement(64L),
  PageManagement(128L),
  PageTemplateManagement(256L),
  ProfileManagement(512L),
  PublishManagement(1024L),
  PermissionManagement(2048L),
  WorkflowManagement(4096L),
  CategoryManagement(8192L),
  TemplateBuildingBlockManagement(16384L),
  VirtualFolderManagement(32768L),
  BundleManagement(65536L),
  BusinessProcessTypeManagement(131072L),
  PublicationAdministration(262144L),
  All(524287L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  Rights(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
