package com.java8.streamsExample.concepts;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmpClass {

    private final int empId;
    private final String empName;
    private final String dept;
    private final List<String> mobNum;


    public ImmutableEmpClass(int empId, String empName, String dept, List<String> mobNum) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        List<String> tempList = new ArrayList<>();
        for (String num : mobNum) {
            tempList.add(num);
        }
        this.mobNum = tempList;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public List<String> getMobNum() {
        List<String> tempList = new ArrayList<>();
        for (String num : this.mobNum) {
            tempList.add(num);
        }
        return tempList;
    }

    @Override
    public String toString() {
        return "ImmutableEmpClass{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", mobNum=" + mobNum +
                '}';
    }
}
