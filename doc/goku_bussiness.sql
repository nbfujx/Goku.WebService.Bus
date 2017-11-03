/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : 192.168.1.107:3306
Source Database       : goku_db_tran

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-11-03 20:31:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goku_bussiness
-- ----------------------------
DROP TABLE IF EXISTS `goku_bussiness`;
CREATE TABLE `goku_bussiness` (
  `bscode` varchar(255) NOT NULL,
  `tranno` varchar(255) NOT NULL,
  `sqltemplate` varchar(255) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `issqlmapper` varchar(2) DEFAULT NULL,
  `useflag` varchar(2) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bscode`,`tranno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goku_bussiness
-- ----------------------------
