package Tridion.ContentManager.CoreService.Client;

public enum ProcessFinishReason {
  CompletedNormally(0L),
  ForceFinished(1L),
  Terminated(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ProcessFinishReason(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
