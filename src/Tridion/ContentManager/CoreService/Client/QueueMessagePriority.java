package Tridion.ContentManager.CoreService.Client;

public enum QueueMessagePriority {
  Low(2L),
  Normal(4L),
  High(6L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  QueueMessagePriority(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
