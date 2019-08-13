package Tridion.ContentManager.CoreService.Client;

public enum PublishTransactionState {
  ScheduledForPublish(0L),
  WaitingForPublish(1L),
  InProgress(2L),
  ScheduledForDeployment(3L),
  WaitingForDeployment(4L),
  Failed(5L),
  Success(6L),
  Warning(7L),
  Resolving(8L),
  Rendering(9L),
  Throttled(10L),
  ReadyForTransport(11L),
  Transporting(12L),
  Deploying(13L),
  PreparingDeployment(14L),
  PreCommittingDeployment(15L),
  CommittingDeployment(16L),
  WaitingForUndo(17L),
  Undoing(18L),
  Undone(19L),
  UndoFailed(20L),
  WaitingForCdEnvironment(21L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  PublishTransactionState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
