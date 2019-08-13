package Tridion.ContentManager.CoreService.Client;

public enum StringSearchMode {
  Contains(0L),
  StartsWith(1L),
  EndsWith(2L),
  ExactMatch(3L),
  ;
  private long numVal;

  StringSearchMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
