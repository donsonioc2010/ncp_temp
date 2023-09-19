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
insert into picture(increment_amount, starting_price, date_time, picture_id, details, img_url, painter_name, picture_name, picture_status, size)
values (10,1000,now(), 1L, 'test1', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '안유진', '안유진', 'BIDDING', '800x600')
