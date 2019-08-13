package Tridion.ContentManager.CoreService.Client;

public enum SynchronizeFlags {
  Basic(0L),
  FixNamespace(1L),
  RemoveUnknownFields(2L),
  RemoveAdditionalValues(4L),
  ApplyDefaultValuesForMissingMandatoryFields(8L),
  ApplyDefaultValuesForMissingNonMandatoryFields(16L),
  ApplyFilterXsltToXhtmlFields(32L),
  ConvertFieldType(64L),
  All(2147483647L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  SynchronizeFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
