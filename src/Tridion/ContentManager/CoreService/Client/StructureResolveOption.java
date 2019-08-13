package Tridion.ContentManager.CoreService.Client;

public enum StructureResolveOption {
  OnlyItems(0L),
  OnlyStructure(1L),
  ItemsAndStructure(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  StructureResolveOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
