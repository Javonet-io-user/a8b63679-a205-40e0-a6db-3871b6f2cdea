package Tridion.ContentManager.CoreService.Client;

public enum DynamicVersionResolvingConditions {
  Never(0L),
  CheckedOutByUser(1L),
  ReservedAndRevisedByUser(2L),
  AssignedToUser(4L),
  ReadableByUser(15L),
  ;
  private long numVal;

  DynamicVersionResolvingConditions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
