package test.entity.JavaBean;


import java.util.Date;

public class Pest {

  private int pestId;
  private int adminId;
  private Date createTime;
  private Date updateTime;
  private String name;
  private String description;


  public long getPestId() {
    return pestId;
  }

  public void setPestId(int pestId) {
    this.pestId = pestId;
  }


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(int adminId) {
    this.adminId = adminId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
