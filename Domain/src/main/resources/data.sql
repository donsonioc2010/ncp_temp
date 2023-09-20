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

insert into picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (1, 10, 1000, '2023-09-22', '2023-09-29', 'test1', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '안유진', '안유진', 'BIDDING' ,'800x600');
insert into picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (2, 20, 2000, '2023-09-21', '2023-09-28', 'test2', 'local/paint/6b075c7b-7149-4ecd-8b0a-ac71bb316e4d.jpeg', '은채', '은채', 'SUCCESS_BID','800x600');
insert into picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (3, 30, 3000, '2023-09-20', '2023-09-27', 'test3', 'local/paint/b6025492-6291-4ae2-916d-00981db26ed2.jpeg', '카리나', '카리나','BIDDING' ,'800x600');
insert into picture(picture_id, increment_amount, starting_price, bid_start_date, bid_end_date, details, img_url, painter_name, picture_name, picture_status, size)
 values (4, 40, 4000, '2023-09-19', '2023-09-26', 'test4', 'local/paint/bf50117d-e28a-4393-8bc4-2fefa7220718.jpeg', '한소희', '한소희','SUCCESS_BID' ,'800x600');

insert into picture(increment_amount, starting_price, date_time, picture_id, details, img_url, painter_name, picture_name, picture_status,size)
values (10,1000,now(), 2L, 'test2', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '가리나', '가리나', 'BEFORE_APPROVE', '800x600');

insert into picture(increment_amount, starting_price, date_time, picture_id, details, img_url, painter_name, picture_name, picture_status,size)
values (10,1000,now(), 3L, 'test3', 'local/paint/d5fdd501-8251-4082-9cc6-f1a65e5ad0a9.jpg', '에수파', '에수파', 'AFTER_APPROVE', '800x600');
