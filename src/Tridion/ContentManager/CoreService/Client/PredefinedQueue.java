package Tridion.ContentManager.CoreService.Client;

public enum PredefinedQueue {
  PublishQueue(1L),
  DeployQueue(2L),
  SearchQueue(3L),
  WorkflowAgentQueue(4L),
  BatchQueue(5L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  PredefinedQueue(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
