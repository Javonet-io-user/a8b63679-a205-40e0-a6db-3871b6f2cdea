package Tridion.ContentManager.CoreService.Client;

public enum WhereUsedCommentToken {
  ParentItem(0L),
  LocalCopy(1L),
  OnlyOldVersions(2L),
  OnlyCheckedOutVersion(3L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  WhereUsedCommentToken(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
