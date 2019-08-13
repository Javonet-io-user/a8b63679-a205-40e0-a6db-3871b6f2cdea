package Tridion.ContentManager.CoreService.Client;

public enum Actions {
  None(0L),
  CheckOut(1L),
  CheckIn(2L),
  UndoCheckOut(4L),
  HistoryList(8L),
  Rollback(16L),
  Localize(32L),
  Unlocalize(64L),
  Publish(128L),
  UnPublish(256L),
  RePublish(512L),
  Search(1024L),
  Edit(2048L),
  AssignActivity(4096L),
  View(8192L),
  Delete(16384L),
  Cut(32768L),
  Copy(65536L),
  Enable(131072L),
  Disable(262144L),
  PermissionManaged(524288L),
  WorkflowManaged(1048576L),
  BlueprintManaged(2097152L),
  StartActivity(4194304L),
  FinishActivity(8388608L),
  RestartActivity(16777216L),
  FinishProcess(33554432L),
  Execute(67108864L),
  Abort(134217728L),
  Classification(268435456L),
  AddItem(536870912L),
  RemoveItem(1073741824L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  Actions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
