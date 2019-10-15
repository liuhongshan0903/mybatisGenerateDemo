package liu.demo.model;

import java.util.Date;

public class FxUser {
    private String id;

    private String fxAllCode;

    private String parentId;

    private String fxCode;

    private String loginPhone;

    private String userName;

    private String userCert;

    private String userBankNo;

    private String privinceCode;

    private String cityCode;

    private String rigionCode;

    private String fxLeve;

    private String fxRanke;

    private Long fxPoints;

    private String fxType;

    private String creater;

    private String isUntie;

    private String isDelete;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFxAllCode() {
        return fxAllCode;
    }

    public void setFxAllCode(String fxAllCode) {
        this.fxAllCode = fxAllCode == null ? null : fxAllCode.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getFxCode() {
        return fxCode;
    }

    public void setFxCode(String fxCode) {
        this.fxCode = fxCode == null ? null : fxCode.trim();
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone == null ? null : loginPhone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCert() {
        return userCert;
    }

    public void setUserCert(String userCert) {
        this.userCert = userCert == null ? null : userCert.trim();
    }

    public String getUserBankNo() {
        return userBankNo;
    }

    public void setUserBankNo(String userBankNo) {
        this.userBankNo = userBankNo == null ? null : userBankNo.trim();
    }

    public String getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(String privinceCode) {
        this.privinceCode = privinceCode == null ? null : privinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getRigionCode() {
        return rigionCode;
    }

    public void setRigionCode(String rigionCode) {
        this.rigionCode = rigionCode == null ? null : rigionCode.trim();
    }

    public String getFxLeve() {
        return fxLeve;
    }

    public void setFxLeve(String fxLeve) {
        this.fxLeve = fxLeve == null ? null : fxLeve.trim();
    }

    public String getFxRanke() {
        return fxRanke;
    }

    public void setFxRanke(String fxRanke) {
        this.fxRanke = fxRanke == null ? null : fxRanke.trim();
    }

    public Long getFxPoints() {
        return fxPoints;
    }

    public void setFxPoints(Long fxPoints) {
        this.fxPoints = fxPoints;
    }

    public String getFxType() {
        return fxType;
    }

    public void setFxType(String fxType) {
        this.fxType = fxType == null ? null : fxType.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getIsUntie() {
        return isUntie;
    }

    public void setIsUntie(String isUntie) {
        this.isUntie = isUntie == null ? null : isUntie.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
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
}