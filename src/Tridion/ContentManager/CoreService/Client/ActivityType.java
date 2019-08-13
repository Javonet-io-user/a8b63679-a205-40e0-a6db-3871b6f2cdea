package Tridion.ContentManager.CoreService.Client;

public enum ActivityType {
  Normal(0L),
  Decision(1L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ActivityType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
