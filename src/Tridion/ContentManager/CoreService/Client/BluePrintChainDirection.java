package Tridion.ContentManager.CoreService.Client;

public enum BluePrintChainDirection {
  Up(0L),
  Down(1L),
  ;
  private long numVal;

  BluePrintChainDirection(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
