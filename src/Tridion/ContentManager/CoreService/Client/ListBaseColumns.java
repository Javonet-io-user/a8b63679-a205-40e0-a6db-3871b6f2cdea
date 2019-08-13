package Tridion.ContentManager.CoreService.Client;

public enum ListBaseColumns {
  Id(0L),
  IdAndTitle(1L),
  Default(2L),
  Extended(3L),
  ;
  private long numVal;

  ListBaseColumns(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
