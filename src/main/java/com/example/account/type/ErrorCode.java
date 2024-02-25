package com.example.account.type;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다"),
    ACCOUNT_NOT_FOUND("게좌가 없습니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌의 소유주가 다릅니다"),
    ACCOUNT_ALREADY_UNREGISTERD(),
    BALANCE_NOT_EMPTY(),
    MAX_ACCOUNT_PER_UESR_10("사용자가 없습니다."),


    ;

    private final String description;
}
