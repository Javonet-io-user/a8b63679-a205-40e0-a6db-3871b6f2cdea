package Tridion.ContentManager.CoreService.Client;

public enum RenderMode {
  Publish(0L),
  PreviewStatic(1L),
  PreviewDynamic(2L),
  UnknownByClient(-2147483648L),
  ;
  private long numVal;

  RenderMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
