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
insert into t_user  (email, password, nick_name, profile, point, login_type, user_status, role, created_at, updated_at, login_at)
values ('test1@test.com', '1111', '안뇽', 'profile1', 100, 'KAKAO', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into t_user  (email, password, nick_name, profile, point, login_type, user_status, role, created_at, updated_at, login_at)
values ('test2@test.com', '2222', '화요일', 'profile1', 100, 'NAVER', 'NOT_ACTIVE', 'USER', '2023-09-18 10:00:00', '2023-08-22 10:00:00', '2023-08-22 10:00:00');
insert into t_user  (email, password, nick_name, profile, point, login_type, user_status, role, created_at, updated_at, login_at)
values ('test3@test.com', '3333', '3번', 'profile3', 300, 'DEFAULT', 'SUSPENSION', 'USER', '2023-09-20 10:00:00', '2023-08-22 12:00:00', '2023-08-22 12:00:00');