/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : 192.168.1.107:3306
Source Database       : goku_db

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-11-03 09:10:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(25) COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `sex` varchar(1) COLLATE utf8_bin DEFAULT '1' COMMENT '0:女',
  `status` char(1) COLLATE utf8_bin DEFAULT '1' COMMENT '0:禁用',
  `org_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '部门ID',
  `stationid` text COLLATE utf8_bin COMMENT '岗位ID',
  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `idcard` varchar(25) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证号',
  `is_admin` varchar(1) COLLATE utf8_bin DEFAULT '0' COMMENT '是否是管理员',
  `sort` bigint(99) DEFAULT NULL,
  `mobile` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `usernameindex` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
