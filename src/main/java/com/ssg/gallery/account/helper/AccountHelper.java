package com.ssg.gallery.account.helper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.ssg.gallery.account.dto.AccountJoinRequest;
import com.ssg.gallery.account.dto.AccountLoginRequest;

public interface AccountHelper {

    // 회원가입
    void join(AccountJoinRequest joinReq); // ①

    // 로그인
    String login(AccountLoginRequest loginReq, HttpServletRequest req, HttpServletResponse res); // ②

    // 회원 아이디 조회
    Integer getMemberId(HttpServletRequest req); // ③

    // 로그인 여부 확인
    boolean isLoggedIn(HttpServletRequest req); // ④

    // 로그아웃
    void logout(HttpServletRequest req, HttpServletResponse res); // ⑤
}