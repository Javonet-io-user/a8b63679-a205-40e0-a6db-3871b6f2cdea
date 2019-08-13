package Tridion.ContentManager.CoreService.Client;

public enum VersionCondition {
  AllVersions(1L),
  OnlyLatestVersions(2L),
  OnlyLatestAndCheckedOutVersions(4L),
  ;
  private long numVal;

  VersionCondition(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
