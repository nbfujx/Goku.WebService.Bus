/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : goku_db_tran

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-03 11:22:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goku_iplist
-- ----------------------------
DROP TABLE IF EXISTS `goku_iplist`;
CREATE TABLE `goku_iplist` (
  `ipaddress` varchar(255) NOT NULL,
  `limitflag` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ipaddress`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goku_iplist
-- ----------------------------
INSERT INTO `goku_iplist` VALUES ('127.0.0.1', 'Y', 'N');
