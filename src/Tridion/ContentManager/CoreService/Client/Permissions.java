package Tridion.ContentManager.CoreService.Client;

public enum Permissions {
  None(0L),
  Read(1L),
  Write(2L),
  Delete(4L),
  Localize(8L),
  All(15L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  Permissions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
