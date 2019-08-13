package Tridion.ContentManager.CoreService.Client;

public enum DeployerAction {
  Commit(0L),
  Wait(1L),
  Abort(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  DeployerAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
