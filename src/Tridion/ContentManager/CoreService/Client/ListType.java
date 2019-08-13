package Tridion.ContentManager.CoreService.Client;

public enum ListType {
  None(0L),
  Select(1L),
  Edit(2L),
  Radio(3L),
  Checkbox(4L),
  Tree(5L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ListType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
