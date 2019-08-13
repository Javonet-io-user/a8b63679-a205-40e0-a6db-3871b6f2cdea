package Tridion.ContentManager.CoreService.Client;

public enum Privileges {
  None(0L),
  SysAdmin(1L),
  ReadOnly(2L),
  IsElevated(65536L),
  ;
  private long numVal;

  Privileges(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
