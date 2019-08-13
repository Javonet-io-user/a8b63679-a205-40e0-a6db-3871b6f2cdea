package Tridion.ContentManager.CoreService.Client;

public enum UserNameSearchMode {
  UserNameOnly(0L),
  FullNameOnly(1L),
  ;
  private long numVal;

  UserNameSearchMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
