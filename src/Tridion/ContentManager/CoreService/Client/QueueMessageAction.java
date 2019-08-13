package Tridion.ContentManager.CoreService.Client;

public enum QueueMessageAction {
  None(0L),
  Insert(1L),
  Update(2L),
  Delete(3L),
  Reset(4L),
  ExpirationActivity(5L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  QueueMessageAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
