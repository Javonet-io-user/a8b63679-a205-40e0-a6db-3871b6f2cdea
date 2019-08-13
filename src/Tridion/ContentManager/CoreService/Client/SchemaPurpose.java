package Tridion.ContentManager.CoreService.Client;

public enum SchemaPurpose {
  Component(0L),
  Multimedia(1L),
  Embedded(2L),
  Metadata(3L),
  Protocol(4L),
  VirtualFolderType(5L),
  TemplateParameters(6L),
  Bundle(7L),
  Region(8L),
  Widget(9L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  SchemaPurpose(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
