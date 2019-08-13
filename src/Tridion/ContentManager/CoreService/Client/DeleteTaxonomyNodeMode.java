package Tridion.ContentManager.CoreService.Client;

public enum DeleteTaxonomyNodeMode {
  DeleteBranch(0L),
  DeleteBranchIncludeChildPublications(1L),
  RemoveParentFromChildren(2L),
  AssignChildrenToGrandparents(3L),
  ;
  private long numVal;

  DeleteTaxonomyNodeMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
