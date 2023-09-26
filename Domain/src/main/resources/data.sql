insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (1, 10, 1000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (2, 20, 2000, '2023-09-21', '2023-09-28', 'test2', 'local/paint/6b075c7b-7149-4ecd-8b0a-ac71bb316e4d.jpeg', '은채', '은채', 'SUCCESS_BID','800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (3, 30, 3000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/28d5faf0-f59e-4a46-ae37-0ee6c7297cf0.jpeg', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (4, 40, 4000, '2023-09-19', '2023-09-26', 'test4', 'local/paint/bf50117d-e28a-4393-8bc4-2fefa7220718.jpeg', '한소희', '한소희','SUCCESS_BID' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (5, 50, 5000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/bf50117d-e28a-4393-8bc4-2fefa7220718.jpeg', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (6, 60, 6000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/a459f188-89d5-4922-9aff-bd216e63790d.JPG', '고양이', '고양이','BIDDING' ,'800x600');

insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('admin@test.com', '1111', '꽌리자', 300, 'DEFAULT', 'SUSPENSION', 'ADMIN', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');

insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test1@test.com', '1111', '안뇽', 100, 'KAKAO', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test2@test.com', '2222', '화요일', 100, 'NAVER', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test3@test.com', '3333', '3번', 300, 'DEFAULT', 'SUSPENSION', 'USER', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');
