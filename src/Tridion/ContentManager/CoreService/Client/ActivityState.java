package Tridion.ContentManager.CoreService.Client;

public enum ActivityState {
  Assigned(1L),
  Started(2L),
  Failed(4L),
  Finished(8L),
  Suspended(16L),
  WaitingForWorkflowAgent(32L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ActivityState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
