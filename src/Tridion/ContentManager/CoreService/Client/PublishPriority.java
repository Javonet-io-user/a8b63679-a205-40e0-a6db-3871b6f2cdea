package Tridion.ContentManager.CoreService.Client;

public enum PublishPriority {
  Low(2L),
  Normal(4L),
  High(6L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  PublishPriority(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
