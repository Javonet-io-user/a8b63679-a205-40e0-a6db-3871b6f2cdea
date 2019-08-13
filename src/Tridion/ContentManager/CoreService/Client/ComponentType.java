package Tridion.ContentManager.CoreService.Client;

public enum ComponentType {
  Normal(0L),
  Multimedia(1L),
  Widget(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ComponentType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
