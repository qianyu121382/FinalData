package test.entity.Mapping;


public class MonitorResult {

  private int taskId;
  private int indicatorId;
  private int deviceId;
  private double result;
  private String abnormalStatus;


  public int getTaskId() {
    return taskId;
  }

  public void setTaskId(int taskId) {
    this.taskId = taskId;
  }


  public int getIndicatorId() {
    return indicatorId;
  }

  public void setIndicatorId(int indicatorId) {
    this.indicatorId = indicatorId;
  }


  public int getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(int deviceId) {
    this.deviceId = deviceId;
  }


  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }


  public String getAbnormalStatus() {
    return abnormalStatus;
  }

  public void setAbnormalStatus(String abnormalStatus) {
    this.abnormalStatus = abnormalStatus;
  }

}
