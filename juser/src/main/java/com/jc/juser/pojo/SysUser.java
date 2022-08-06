package com.jc.juser.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
public class SysUser {
    @Id
    @Column(name = "pk_user")
    private String pkUser;

    @Column(name = "CUSERID")
    private String cuserid;

    /**
     * 用户编码
     */
    @Column(name = "USER_CODE")
    private String userCode;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "OPERAT_TIME")
    private String operatTime;

    @Column(name = "OPERAT_DATE")
    private String operatDate;

    @Column(name = "PK_ROLE")
    private String pkRole;

    @Column(name = "PK_DEPT")
    private String pkDept;

    /**
     * @return pk_user
     */
    public String getPkUser() {
        return pkUser;
    }

    /**
     * @param pkUser
     */
    public void setPkUser(String pkUser) {
        this.pkUser = pkUser;
    }

    /**
     * @return CUSERID
     */
    public String getCuserid() {
        return cuserid;
    }

    /**
     * @param cuserid
     */
    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    /**
     * 获取用户编码
     *
     * @return USER_CODE - 用户编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户编码
     *
     * @param userCode 用户编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return OPERAT_TIME
     */
    public String getOperatTime() {
        return operatTime;
    }

    /**
     * @param operatTime
     */
    public void setOperatTime(String operatTime) {
        this.operatTime = operatTime;
    }

    /**
     * @return OPERAT_DATE
     */
    public String getOperatDate() {
        return operatDate;
    }

    /**
     * @param operatDate
     */
    public void setOperatDate(String operatDate) {
        this.operatDate = operatDate;
    }

    /**
     * @return PK_ROLE
     */
    public String getPkRole() {
        return pkRole;
    }

    /**
     * @param pkRole
     */
    public void setPkRole(String pkRole) {
        this.pkRole = pkRole;
    }

    /**
     * @return PK_DEPT
     */
    public String getPkDept() {
        return pkDept;
    }

    /**
     * @param pkDept
     */
    public void setPkDept(String pkDept) {
        this.pkDept = pkDept;
    }
}