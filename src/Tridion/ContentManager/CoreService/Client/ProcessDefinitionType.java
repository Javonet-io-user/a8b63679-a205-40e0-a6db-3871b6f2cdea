package Tridion.ContentManager.CoreService.Client;

public enum ProcessDefinitionType {
  Editing(0L),
  Bundle(1L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ProcessDefinitionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
