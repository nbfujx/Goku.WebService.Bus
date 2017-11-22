/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : 192.168.1.107:3306
Source Database       : goku_db

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-11-03 09:10:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_info`;
CREATE TABLE `sys_user_info` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `address` varchar(300) COLLATE utf8_bin DEFAULT NULL COMMENT '家庭住址',
  `post_code` varchar(6) COLLATE utf8_bin DEFAULT NULL COMMENT '邮编',
  `height` varchar(5) COLLATE utf8_bin DEFAULT NULL COMMENT '身高',
  `weight` varchar(5) COLLATE utf8_bin DEFAULT NULL COMMENT '体重',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `blood` varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '血型',
  `culture` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '文化程度',
  `finish_school_date` date DEFAULT NULL,
  `folk` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '民族',
  `government` varchar(25) COLLATE utf8_bin DEFAULT NULL COMMENT '党员关系',
  `homepage` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '个人主页',
  `householder` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '户主',
  `marriage` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '婚否',
  `msn` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT 'MSN',
  `nativity_address` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '出生地',
  `qq` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT 'QQ',
  `speciality` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '特长',
  `description` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '描述信息',
  `version` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bloodgroupindex` (`blood`) USING BTREE,
  KEY `msnindex` (`msn`) USING BTREE,
  KEY `nativityaddressindex` (`nativity_address`) USING BTREE,
  KEY `postboyindex` (`post_code`) USING BTREE,
  KEY `specialityindex` (`speciality`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
