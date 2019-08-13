package Tridion.ContentManager.CoreService.Client;

public enum ProcessType {
  Any(0L),
  Active(1L),
  Historical(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ProcessType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
