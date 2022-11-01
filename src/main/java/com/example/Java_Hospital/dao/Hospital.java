package com.example.Java_Hospital.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

//  lombok 어노테이션
// Getter, Setter 어노테이션이 있으면 해당 클래스에서 Getter&Setter를 만들어줄 필요가 없어집니다.
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Hospital {
    private int id;
    private String openServiceName;  // 개방 서비스명
    private int openLocalGovernmentCode; // 개방 자치단체 코드
    private String managementNumber; // 관리번호
    private LocalDateTime licenseDate; // 인/허가 일자
    private int businessStatus; // 영업상태(1:영업, 2:휴업, 3:폐업, 4:취소/말소)
    private int businessStatusCode; // 상세 영업 상태 코드(1:영업중, 2:휴업, 3:폐업)
    private String phone; // 소재지 전화번호
    private String fullAddress; // 소재지 전체 주소
    private String roadNameAddress; // 도로명  전체 주소
    private String hospitalName; // 사업장 이름
    private String businessTypeName; // 업채 구분명
    private int healthcareProviderCount; // 의료인
    private int patientRoomCount; // 입원실 수
    private int totalNumberOfBeds; // 병상 수
    private float totalAreaSize; // 총 면적
}
