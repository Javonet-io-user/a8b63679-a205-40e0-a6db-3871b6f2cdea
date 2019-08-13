package Tridion.ContentManager.CoreService.Client;

public enum BatchOperationState {
  NotStarted(1L),
  Success(2L),
  Warning(3L),
  Error(4L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  BatchOperationState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
