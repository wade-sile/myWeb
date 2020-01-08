DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '数码产品'),('2', '服装'),('3', '鞋靴箱包'),('4', '食品零食'),('5', '珠宝配饰'),('6', '护肤彩妆'),('7', '图书书籍'),('8', '家居饰品');


CREATE TABLE `categorysecond` (
  `csid` int(11) NOT NULL AUTO_INCREMENT,
  `csname` varchar(255) DEFAULT NULL,
  `fk_cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`csid`),
  KEY `FK936FCAF2418BCBAF` (`fk_cid`),
  CONSTRAINT `FK936FCAF2418BCBAF` FOREIGN KEY (`fk_cid`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

INSERT INTO `categorysecond` VALUES ('1', '电脑', '1'),
('2', '手机', '1'),('3', '家电', '1'),('4', '数码配件', '1'),('5', '外套', '2'),('6', '毛呢大衣', '2'),('7', '风衣', '2'),('8', '裤子', '2'),
('9', '男鞋', '3'),('10', '女鞋', '3'),('11', '男包', '3'),('13', '女包', '3'),('14', '休闲食品', '4'),('15', '生鲜食品', '4'),('16', '粮油调味', '4'),('17', '地方特产', '4'),
('18', '时尚饰品', '5'),('19', '眼镜配饰', '5'),('20', '首饰', '5'),('21', '手链', '5'),('22', '手套', '6'),('23', '暖手宝', '6'),('24', '化妆品', '6'),('25', '护肤品', '6'),
('26', '教育系列', '7'),('27', '考试系列', '7'),('28', '计算机系列', '7'),('29', '小说系列', '7'),('30', '四件套', '8'),('31', '八件套', '8'),('32', '窗帘', '8'),('33', '沙发', '8');


#查询
select category.* , categorysecond.* from category , categorysecond where category.cid=categorysecond.fk_cid;

#创建商品表
CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) DEFAULT NULL,
  `market_price` double DEFAULT NULL,
  `shop_price` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `pdesc` varchar(5000) DEFAULT NULL,
  `is_hot` int(11) DEFAULT NULL,
  `pdate` timestamp NULL DEFAULT NULL,
  `csid` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `FKED8DCCEF5F778050` (`csid`),
  CONSTRAINT `FKED8DCCEF5F778050` FOREIGN KEY (`csid`) REFERENCES `categorysecond` (`csid`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

#插入商品表数据
INSERT INTO `product` VALUES ('34', '毛妮上衣', '899', '699', 'products/5d992132-af7e-4b3c-9b85-2390ccb10170cs10001.jpg', '毛妮上衣', '1', '2018-01-27 21:27:48', '5', null),
('35', '格子呢大衣', '1299', '999', 'products/a2af9384-ea87-406c-bc60-d6f496e282ddcs10002.jpg', '格子呢大衣，精品', '1', '2018-01-27 21:29:41', '6', null),
('36', '妮子连衣裙', '799', '699', 'products/226d27a1-6170-4e5e-9dd0-293829ef7d91cs10004.jpg', '妮子连衣裙', '0', '2018-01-27 21:30:46', '5', null),
('37', '粉色连衣裙', '688', '588', 'products/09a2aa49-e7e8-4c91-99d8-15b02f5eb03ccs10006.jpg', '粉色连衣裙', '0', '2018-01-27 21:31:21', '5', null),
('38', '皮衣', '1288', '1099', 'products/fc34a578-6198-4ba4-bb4c-644fa2cab8f1cs20007.jpg', '女皮上衣', '0', '2018-01-27 21:32:01', '5', null),
('39', '精品裤', '399', '298', 'products/d6c6cfce-663d-46ad-92ef-5cd232a2fa79cs40010.png', '精品裤', '1', '2018-01-27 21:33:10', '8', null),
('40', '绿大衣', '800', '699', 'products/03e6eda2-5064-4930-ac15-d312524e42ffcs30003.png', '绿大衣', '1', '2018-01-27 21:55:03', '7', null),
('41', '罗蒙衬衫', '398', '298', 'products/a36472e0-ae79-4a3b-8eae-39aefdb97095cs50006.png', '罗蒙衬衫，精品免烫。', '1', '2018-01-27 22:11:17', '4', null),
('42', '女西装', '899', '699', 'products/dbf99071-b2f5-479a-b567-2797d5522dcccs30002.png', '女西装，橙色', '0', '2018-01-27 22:15:37', '6', null),
('43', '女皮鞋', '499', '399', 'products/d6577bb8-8561-4ac2-938c-fd153f2f4ffanvxie.jpg', '精选头层牛皮，精心打造', '0', '2018-01-27 22:21:58', '10', null),
('44', '休闲凉鞋', '11', '10', 'products/543d14c6-daa9-47c8-a664-64d710636a17liangxie.jpg', '休闲凉鞋', '1', '2018-02-04 16:29:23', '10', null),
('45', '费列罗巧克力', '55', '45', 'products/61e7a560-b44e-49dc-a36a-8a44e43b0f84021.jpg', '费列罗巧克力', '1', '2018-02-04 16:29:59', '14', null),
('46', '喜之郎果冻', '11', '9', 'products/7354dcbc-550e-4dfb-9452-a8e216f3577a020.jpg', '喜之郎果冻', '1', '2018-02-04 16:31:26', '14', null),
('47', '九阳豆浆机', '299', '289', 'products/74dfc4c4-1a76-4a80-9aa6-4ab34db66d011375609045552.jpg', '九阳豆浆机', '1', '2018-02-04 16:32:19', '3', null),
('48', '珀莱雅爽肤水', '22', '19', 'products/5574dece-8cb7-42bf-a67f-2705bf3d3750zxc.jpg', '珀莱雅爽肤水', '0', '2018-02-04 16:34:10', '25', null),
('49', '华为手机', '1299', '1199', 'products/6d9eb609-f29e-486f-85a1-c8a65403ba5ehuawei.jpg', '华为手机', '0', '2018-02-04 16:36:13', '2', null),
('50', '小象密码箱', '199', '189', 'products/e5cba2c2-60d5-4212-aaa9-f58fea171efasmall_0122.jpg', '小象密码箱', '0', '2018-02-04 16:37:02', '1', null),
('51', '护肤品组套', '119', '99', 'products/7cd5b45f-efe0-4277-9ba9-5b4c7b5fb8a7sd0.jpg', '护肤品组套', '0', '2018-02-04 16:39:19', '25', null),
('52', '彩妆组套', '199', '179', 'products/36ce16bd-2d66-4fbc-8c8e-117dc4acd01attt.jpg', '彩妆组套', '0', '2018-02-04 16:41:46', '24', null),
('53', '舌尖上的中国', '29', '19', 'products/f5fca230-0214-486e-a033-cda9c2789245big_03.jpg', '舌尖上的中国', '0', '2018-02-04 16:46:58', '29', null),
('54', '夏普彩电', '4999', '4899', 'products/5cb1e8cd-9a5f-4f11-9e2f-6886a66a3f67small_03.jpg', '夏普彩电', '0', '2018-02-04 16:48:09', '3', null),
('55', 'iPhone X', '8000', '7999', 'products/22c84e5b-62dd-427f-8dbd-77d46bb83df7iphone8.jpg', 'Apple iPhone X (A1865) 64GB 深空灰色 移动联通电信4G手机', '0', '2018-02-04 17:25:17', '2', null);


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `state` varchar(255) NOT NULL DEFAULT '1',
  `code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'hikitty', '123456', '张三', 'hikitty@qq.com', '13555512345', '上海市', '1', null),
('2', 'jack', '123456', '马云', 'jack@qq.com', '13812312312', '中国', '1', null),
('3', 'hellokitty', '123456', '张三', 'aodamao@qq.com', '13555512345', '上海市', '0', 'ca0f6f5a-36da-402d-8c0f-22587423de20');



DROP TABLE IF EXISTS `shopcartitem`;
CREATE TABLE `shopcartitem` (
  `cartitemid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `pcount` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `ptotal` double DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cartitemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `receiveInfo` varchar(255) DEFAULT NULL,
  `phoNum` varchar(255) DEFAULT NULL,
  `order_time` timestamp,
  `uid` int(11) DEFAULT NULL,
  `accepter` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `FKC3DF62E5FC32F8E` (`uid`),
  CONSTRAINT `FKC3DF62E5FC32F8E` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `oiid` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `oid` int(11) DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `pimgpath` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`oiid`),
  KEY `FKE8B2AB61E818A405` (`oid`),
  KEY `FKE8B2AB6173B4E627` (`pid`),
  CONSTRAINT `FKE8B2AB6173B4E627` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`),
  CONSTRAINT `FKE8B2AB61E818A405` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------



























