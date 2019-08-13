package Tridion.ContentManager.CoreService.Client;

public enum LockType {
  None(0L),
  CheckedOut(1L),
  Permanent(2L),
  NewItem(4L),
  InWorkflow(8L),
  Reserved(16L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  LockType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
