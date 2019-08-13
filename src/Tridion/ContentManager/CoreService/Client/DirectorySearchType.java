package Tridion.ContentManager.CoreService.Client;

public enum DirectorySearchType {
  Subtree(1L),
  Group(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  DirectorySearchType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
