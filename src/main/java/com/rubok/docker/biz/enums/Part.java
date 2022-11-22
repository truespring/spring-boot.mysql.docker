package com.rubok.docker.biz.enums;

public enum Part {
    SETTLEMENT("결제/정산"),
    INTERFACE("인터페이스"),
    FMS("고도화"),
    NEWFMS("뉴에프엠에스"),
    FRONTEND("프론트앤드"),
    DEVOPS("데브옵스"),
    DBA("데이터베이스관리");

    private final String partName;

    public String getPartName() {
        return partName;
    }

    Part(String partName) {
        this.partName = partName;
    }
}
