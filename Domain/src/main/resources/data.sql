
insert into t_test(name, param1,param2,param3,param4)
values ('aaaa', 'a','b','c','d');
insert into t_test(name, param1,param2,param3,param4)
values ('dddd', 'a','b','c','d');
insert into t_test(name, param1,param2,param3,param4)
values ('cccc', 'a','b','c','d');
insert into t_test(name, param1,param2,param3,param4)
values ('dddd', 'a','b','c','d');
insert into t_test(name, param1,param2,param3,param4)
values ('ffff', 'a','b','c','d');

-- 테스트용 데이터
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('admin@test.com', '1111', '꽌리자', 300, 'DEFAULT', 'SUSPENSION', 'ADMIN', '2023-09-20 10:00:00', '2023-08-21 12:00:00', '2023-08-22 12:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('admin1@test.com', '1111', '광리자', 300, 'DEFAULT', 'NOT_ACTIVE', 'ADMIN', '2023-09-20 10:00:00', '2023-08-13 12:00:00', '2023-08-22 12:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('admin2@test.com', '1111', '퐝리자', 300, 'DEFAULT', 'ACTIVE', 'ADMIN', '2023-09-20 10:00:00', '2023-08-16 12:00:00', '2023-08-22 12:00:00');


insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('test1@test.com', '1111', '안뇽', 100, 'KAKAO', 'ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('test2@test.com', '2222', '화요일', 100, 'NAVER', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
values ('test3@test.com', '3333', '3번', 300, 'DEFAULT', 'SUSPENSION', 'USER', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');








insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (1, 10, 1000, '2023-09-22', '2023-09-29', 'I love America', 'local/paint/1.png', 'MAGA', 'Make America Great Again', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (2, 20, 2000, '2023-09-21', '2023-09-28', 'Nooooooooooooooo', 'local/paint/2.png', 'Abdo Musa', '절규하는 몽환', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (3, 30, 3000, '2023-09-20', '2023-09-27', '내 눈썹 살려내라', 'local/paint/3.png', 'Jan pierro', '모나리자의 마음','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (4, 40, 4000, '2023-09-19', '2023-09-26', '9회말 주자 만루 풀카운트', 'local/paint/4.png', '아 이대호', '좌 중간 안타','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (5, 50, 5000, '2023-09-28', '2023-10-03', 'Dont', 'local/paint/5.png', 'Louis Vui', '이 그림은 1982년 영국에서 시작되어','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (6, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/6.png', '좋은사람 좋은자리', '그대 눈의 cheers', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (7, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/7.png', '베인', '여전히 내 맘속에', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (8, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/8.png', '과학', '죽음은 바람과 같지','BIDDING' ,'444X444');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (9, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/9.png', '원숭이', '원피스는 존재한다','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (10, 50000, 100000, '2023-09-28', '2023-10-03', 'test5 ', 'local/paint/10.png', '겐지', '한조 대기중','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (11, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (12, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (13, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (14, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (15, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (16, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (17, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (18, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (19, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (20, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (21, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (22, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (23, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (24, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (25, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (26, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (27, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (28, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (29, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (30, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (31, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (32, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (33, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (34, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (35, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (36, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (37, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (38, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (39, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (40, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (41, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (42, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (43, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (44, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (45, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (46, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (47, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (48, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (49, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (50, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (51, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (52, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (53, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (54, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (55, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (56, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (57, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (58, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (59, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (60, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (61, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (62, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (63, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (64, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (65, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (66, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (67, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (68, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (69, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (70, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (71, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (72, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (73, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (74, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (75, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (76, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (77, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (78, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (79, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (80, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (81, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (82, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (83, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (84, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (85, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (86, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (87, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (88, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (89, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (90, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (91, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (92, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (93, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (94, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (95, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (96, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (97, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (98, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (99, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (100, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (101, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (102, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (103, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (104, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (105, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (106, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (107, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (108, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (109, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (110, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (111, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (112, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (113, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (114, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (115, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (116, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (117, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (118, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (119, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (120, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (121, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (122, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (123, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (124, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (125, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (126, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (127, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (128, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (129, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (130, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (131, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (132, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (133, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (134, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (135, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (136, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (137, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (138, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (139, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (140, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (141, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (142, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (143, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (144, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (145, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (146, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (147, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (148, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (149, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (150, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (151, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (152, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (153, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (154, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (155, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (156, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (157, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (158, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (159, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (160, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (161, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (162, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (163, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (164, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (165, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (166, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (167, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (168, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (169, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (170, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (171, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (172, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (173, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (174, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (175, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (176, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (177, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (178, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (179, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (180, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (181, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (182, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (183, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (184, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (185, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (186, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (187, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (188, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (189, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (190, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (191, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (192, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (193, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (194, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (195, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (196, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (197, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (198, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (199, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (200, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (201, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (202, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (203, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (204, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (205, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (206, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (207, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (208, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (209, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (210, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (211, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (212, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (213, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (214, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (215, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (216, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (217, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (218, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (219, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (220, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (221, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (222, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (223, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (224, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (225, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (226, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (227, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (228, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (229, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (230, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (231, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (232, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (233, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (234, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (235, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (236, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (237, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (238, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (239, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (240, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (241, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (242, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (243, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (244, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (245, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (246, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (247, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (248, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (249, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (250, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (251, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (252, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (253, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (254, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (255, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (256, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (257, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (258, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (259, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (260, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (261, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (262, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (263, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (264, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (265, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (266, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (267, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (268, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (269, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (270, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (271, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (272, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (273, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (274, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (275, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (276, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (277, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (278, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (279, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (280, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (281, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (282, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (283, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (284, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (285, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (286, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (287, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (288, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (289, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (290, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (291, 10, 1000, '2023-09-22', '2023-09-29', '안유진 이쁘다', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (292, 20, 2000, '2023-09-21', '2023-09-28', '은채 귀엽다', 'local/paint/2.png', '은채', '은채', 'SUCCESS_BID','1000x800');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (293, 30, 3000, '2023-09-20', '2023-09-27', '사랑해요 카리나', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (294, 40, 4000, '2023-09-19', '2023-09-26', '별이 빛나는 한소희', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1200x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (295, 50, 5000, '2023-09-28', '2023-10-03', '한소이', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');

insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (296, 15000, 21000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/1.png', '안유진', '안유진', 'BIDDING' ,'400x400');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (297, 2000, 14000, '2023-09-20', '2023-09-27', 'test2', 'local/paint/2.png', '은채', '은채', 'AFTER_APPROVE','1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (298, 30000, 6000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/3.png', '카리나', '카리나','BIDDING' ,'800x1200');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (299, 4000, 9000, '2023-09-15', '2023-09-22', 'test4', 'local/paint/4.png', '별이빛나는', '한소희','SUCCESS_BID' ,'1000x600');
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
values (300, 50000, 100000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/5.png', '한소희', '한소희','BEFORE_APPROVE' ,'800x600');



insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('admin@test.com', '1111', '꽌리자', 300000000, 'DEFAULT', 'SUSPENSION', 'ADMIN', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');

insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test1@test.com', '1111', '안뇽', 10000, 'KAKAO', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test2@test.com', '2222', '화요일', 10000, 'NAVER', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into tbl_user  (email, password, nick_name, point, login_type, user_status, user_role, created_at, updated_at, login_at)
 values ('test3@test.com', '3333', '3번', 30030000, 'DEFAULT', 'SUSPENSION', 'USER', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');


insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (1, 10, 1000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '안유진', '안유진', 'BIDDING' ,'800x600', 4);
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (2, 20, 2000, '2023-09-21', '2023-09-28', 'test2', 'local/paint/6b075c7b-7149-4ecd-8b0a-ac71bb316e4d.jpeg', '은채', '은채', 'SUCCESS_BID','800x600', 4);
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (3, 30, 3000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/28d5faf0-f59e-4a46-ae37-0ee6c7297cf0.jpeg', '카리나', '카리나','BIDDING' ,'800x600', 4);
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (4, 40, 4000, '2023-09-19', '2023-09-26', 'test4', 'local/paint/bf50117d-e28a-4393-8bc4-2fefa7220718.jpeg', '한소희', '한소희','SUCCESS_BID' ,'800x600',4 );
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (5, 50, 5000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/bf50117d-e28a-4393-8bc4-2fefa7220718.jpeg', '한소희', '한소희','BEFORE_APPROVE' ,'800x600',4);
insert into tbl_picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size, user_id)
 values (6, 60, 6000, '2023-09-28', '2023-10-03', 'test5', 'local/paint/a459f188-89d5-4922-9aff-bd216e63790d.JPG', '고양이', '고양이','BIDDING' ,'800x600', 4);


insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 3, 2000, '2023-09-22 11:12:13');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 2, 3000, '2023-09-23 14:15:16');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 3, 4000, '2023-09-24 17:18:18');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 2, 5000, '2023-09-25 04:18:18');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 3, 6000, '2023-09-25 05:16:17');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 2, 7000, '2023-09-25 06:00:09');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 3, 8000, '2023-09-26 08:07:06');
insert into tbl_picture_bid_history(picture_id, user_id, bid_amount, created_at)
 values(1, 2, 10000, '2023-09-27 23:11:11');

