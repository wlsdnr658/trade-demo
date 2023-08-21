/*
 id varchar(20)
 status, event varchar(10) - enum
 그 외 varchar(50)
 */

CREATE TABLE `user`
(
    `user_id`     varchar(20) NOT NULL COMMENT '사용자 ID',
    `user_name`   varchar(50) NOT NULL COMMENT '사용자 이름',
    `phone`       varchar(50)          DEFAULT NULL COMMENT '연락처',
    `created_at`  timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성 일시',
    `modified_at` timestamp            DEFAULT NULL COMMENT '수정 일시',
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='사용자';

