package com.moon.tradedemo.domain.user;

import com.moon.tradedemo.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    private Long userId;

    private String userName;

    private String phone;

}
