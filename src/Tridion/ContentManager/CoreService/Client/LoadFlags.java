package Tridion.ContentManager.CoreService.Client;

public enum LoadFlags {
  None(0L),
  WebDavUrls(1L),
  KeywordXlinks(2L),
  Expanded(4L),
  IncludeAllowedActions(8L),
  IncludeDynamicVersionInfo(16L),
  ExpandLinks(32L),
  ;
  private long numVal;

  LoadFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
