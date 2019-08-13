package Tridion.ContentManager.CoreService.Client;

public enum SearchBlueprintStatus {
  Unspecified(0L),
  Local(1L),
  Localized(2L),
  Shared(3L),
  ;
  private long numVal;

  SearchBlueprintStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
