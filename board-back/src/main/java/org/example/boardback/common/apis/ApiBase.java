package org.example.boardback.common.apis;

public class ApiBase {
    // 생성자를 private으로 막아서 객체를 만들지 못하게 함
    // → 이 클래스는 오직 상수만 쓰기 위한 용도!
    private ApiBase() {}

    // ==================================================
    // 공통 Prefix
    // 모든 API 경로 앞에 공통으로 붙는 부분
    // ==================================================

    // "/api" → 모든 API의 기본 시작 경로
    public static final String API = "/api";

    // "/v1" → 버전 1을 의미 (추후 "/v2" 만들 수 있음)
    public static final String V1 = "/v1";

    // "/api/v1" → 모든 API가 공통으로 사용하는 최종 기본 경로
    public static final String BASE = API + V1;
}