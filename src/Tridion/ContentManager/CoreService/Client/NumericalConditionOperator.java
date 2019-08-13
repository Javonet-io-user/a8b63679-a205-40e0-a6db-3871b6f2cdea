package Tridion.ContentManager.CoreService.Client;

public enum NumericalConditionOperator {
  Equals(0L),
  GreaterThan(1L),
  LessThan(2L),
  NotEqual(3L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  NumericalConditionOperator(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
