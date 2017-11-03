/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : 192.168.1.107:3306
Source Database       : goku_db

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-11-03 09:09:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `version` bigint(20) DEFAULT NULL,
  `level` bigint(20) DEFAULT NULL,
  `type` char(1) COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `image` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `isparent` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `sort` bigint(20) DEFAULT '0',
  `url` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `parent_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `operate` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
