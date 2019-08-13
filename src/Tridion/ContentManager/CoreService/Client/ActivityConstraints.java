package Tridion.ContentManager.CoreService.Client;

public enum ActivityConstraints {
  None(0L),
  DenyBundleMetadataEditing(1L),
  DenySubjectEditing(2L),
  DenyAddRemoveWorkItem(4L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ActivityConstraints(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
