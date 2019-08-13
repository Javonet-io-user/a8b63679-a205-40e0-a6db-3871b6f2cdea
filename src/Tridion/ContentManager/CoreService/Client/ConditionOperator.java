package Tridion.ContentManager.CoreService.Client;

public enum ConditionOperator {
  Equals(0L),
  GreaterThan(1L),
  LessThan(2L),
  NotEqual(3L),
  StringEquals(4L),
  Contains(5L),
  StartsWith(6L),
  EndsWith(7L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  ConditionOperator(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
