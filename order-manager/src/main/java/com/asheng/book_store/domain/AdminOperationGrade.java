package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (AdminOperationGrade)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class AdminOperationGrade implements Serializable {
    private static final long serialVersionUID = 615182145829431989L;
    
    private Integer adminOperationGradeId;
    
    private String adminOperationGradeExplain;


    public Integer getAdminOperationGradeId() {
        return adminOperationGradeId;
    }

    public void setAdminOperationGradeId(Integer adminOperationGradeId) {
        this.adminOperationGradeId = adminOperationGradeId;
    }

    public String getAdminOperationGradeExplain() {
        return adminOperationGradeExplain;
    }

    public void setAdminOperationGradeExplain(String adminOperationGradeExplain) {
        this.adminOperationGradeExplain = adminOperationGradeExplain;
    }

}