package Tridion.ContentManager.CoreService.Client;

public enum TcmAction {
  None(0L),
  CheckOut(1L),
  CheckIn(2L),
  UndoCheckOut(3L),
  HistoryList(4L),
  Rollback(5L),
  Localize(6L),
  Unlocalize(7L),
  Publish(8L),
  UnPublish(9L),
  RePublish(10L),
  Search(11L),
  Edit(12L),
  AssignActivity(13L),
  View(14L),
  Delete(15L),
  Cut(16L),
  Copy(17L),
  Enable(18L),
  Disable(19L),
  PermissionManaged(20L),
  WorkflowManaged(21L),
  BlueprintManaged(22L),
  StartActivity(23L),
  FinishActivity(24L),
  RestartActivity(25L),
  FinishProcess(26L),
  Execute(27L),
  Abort(28L),
  Classification(29L),
  AddItem(30L),
  RemoveItem(31L),
  Promote(32L),
  Demote(33L),
  ;
  private long numVal;

  TcmAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
