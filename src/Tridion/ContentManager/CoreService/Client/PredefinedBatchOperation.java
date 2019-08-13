package Tridion.ContentManager.CoreService.Client;

public enum PredefinedBatchOperation {
  CheckIn(0L),
  CheckOut(1L),
  Classify(2L),
  Copy(3L),
  Delete(4L),
  FinishActivity(5L),
  ForceFinishProcess(6L),
  Localize(7L),
  Move(8L),
  Publish(9L),
  ReClassify(10L),
  StartActivity(11L),
  UnClassify(12L),
  UnLocalize(13L),
  UnPublish(14L),
  UndoCheckOut(15L),
  DeleteTaxonomyNode(16L),
  SwitchUserEnabledState(17L),
  CopyToKeyword(18L),
  MoveToKeyword(19L),
  ReAssignActivity(20L),
  RestartActivity(21L),
  SuspendActivity(22L),
  ResumeActivity(23L),
  SynchronizeWithSchemaAndUpdate(24L),
  Promote(25L),
  Demote(26L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  PredefinedBatchOperation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
