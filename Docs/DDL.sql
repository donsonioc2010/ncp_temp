-- 테이블 생성 사용 쿼리
-- 기존 테이블 삭제
DROP TABLE IF EXISTS tbl_payment_history, tbl_picture, tbl_picture_bid_history, tbl_token, tbl_user;

-- tbl_user 테이블 생성
CREATE TABLE tbl_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    created_at TIMESTAMP(6) NOT NULL,
    login_at TIMESTAMP(6) NOT NULL,
    point BIGINT,
    updated_at TIMESTAMP(6) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    login_type VARCHAR(255) NOT NULL,
    nick_name VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    profile VARCHAR(255),
    user_role VARCHAR(255) NOT NULL,
    user_status VARCHAR(255) NOT NULL
);

-- tbl_token 테이블 생성
CREATE TABLE tbl_token (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    created_at TIMESTAMP(6) NOT NULL,
    user_id BIGINT UNIQUE,
    access_token VARCHAR(255) NOT NULL,
    refresh_token VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES tbl_user (id)
);

-- tbl_payment_history 테이블 생성
CREATE TABLE tbl_payment_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    amount BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    merchant_uid VARCHAR(255) NOT NULL,
    pg_name VARCHAR(255) NOT NULL,
    product_name VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES tbl_user (id)
);

-- tbl_picture 테이블 생성
CREATE TABLE tbl_picture (
    picture_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bid_end_date DATE NOT NULL,
    bid_start_date DATE NOT NULL,
    increment_amount INT NOT NULL,
    starting_price INT NOT NULL,
    user_id BIGINT,
    img_url VARCHAR(255) NOT NULL,
    painter_name VARCHAR(255) NOT NULL,
    picture_name VARCHAR(255) NOT NULL,
    picture_status VARCHAR(255) NOT NULL,
    size VARCHAR(255),
    details TEXT,
    FOREIGN KEY (user_id) REFERENCES tbl_user (id)
);

-- tbl_picture_bid_history 테이블 생성
CREATE TABLE tbl_picture_bid_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bid_amount BIGINT NOT NULL,
    created_at TIMESTAMP(6) NOT NULL,
    picture_id BIGINT,
    user_id BIGINT,
    FOREIGN KEY (picture_id) REFERENCES tbl_picture (picture_id),
    FOREIGN KEY (user_id) REFERENCES tbl_user (id)
);
