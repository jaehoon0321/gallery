package com.ssg.gallery.order.entity;   // 변경

import com.ssg.gallery.order.dto.OrderRead;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter///  모든 필드에 대한 Getter 메서드를 자동으로 생성
@Entity///  JPA 엔터티임을 선언. 데이터 베이스 테이블과 매핑
@Table(name = "orders") ///  JPA 이 엔터티가 'orders'라는 이름의 데이터 베이스 테이블과 매핑
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer memberId;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String address;

    @Column(length = 10, nullable = false)
    private String payment;

    @Column(length = 20)
    private String cardNumber;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime created;

    /// Constructor역활 JPA에서 필수 -> 데이터베이스에서 데이터를 읽어와 Order의 객체를 생성할 때 사용
    /// JPA는  먼저 이 기본 생성자로 객체를 만든 다음 리플렉션을 이용해 필드에 값을 채워 넣음 .
    ///
    public Order() {
    }

    /// 주문과 관련된 모든 속성을 하나의 Order 객체 안에서 묶어서 관리
    /// JPA는 Order 객체 하나를 데이터베이스의 하나의 주문으로 인식하고 처리.
    ///
    public Order(Integer memberId, String name, String address, String payment, String cardNumber, Long amount) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.payment = payment;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    // 주문 조회 DTO로 변환
    public OrderRead toRead() { // ②
        return OrderRead.builder()
                .id(id)
                .name(name)
                .address(address)
                .payment(payment)
                .amount(amount)
                .created(created)
                .build();
    }
}