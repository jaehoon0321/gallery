package com.ssg.gallery.member.repository;

import com.ssg.gallery.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> { // ①

    // 아이디와 패스워드로 회원 정보를 조회
    /// 회원이 없을수도 있으니 널처리를 위해 옵셔널 타입으로
    Optional<Member> findByLoginIdAndLoginPw(String loginId, String loginPw); // ②
}
