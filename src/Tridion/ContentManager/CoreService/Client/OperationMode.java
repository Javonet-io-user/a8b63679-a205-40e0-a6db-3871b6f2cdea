package Tridion.ContentManager.CoreService.Client;

public enum OperationMode {
  FailOnError(1L),
  FailOnWarning(2L),
  ;
  private long numVal;

  OperationMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
