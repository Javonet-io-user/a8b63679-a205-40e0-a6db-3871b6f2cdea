package Tridion.ContentManager.CoreService.Client;

public enum ResolvePurpose {
  Publish(0L),
  UnPublish(1L),
  RePublish(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ResolvePurpose(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
