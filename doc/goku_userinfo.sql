/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : jawavesys

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-02 15:41:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goku_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `goku_userinfo`;
CREATE TABLE `goku_userinfo` (
  `userid` varchar(32) NOT NULL,
  `usercode` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `createdate` datetime DEFAULT NULL,
  `useflag` varchar(2) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goku_userinfo
-- ----------------------------
INSERT INTO `goku_userinfo` VALUES ('E1C879F8C493D26A699D604DE42A2BE6', 'fjx', '1', 'fjx', '2017-11-01 09:55:33', 'Y', '测试');
