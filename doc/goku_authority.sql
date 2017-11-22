/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : jawavesys

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-02 15:40:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goku_authority
-- ----------------------------
DROP TABLE IF EXISTS `goku_authority`;
CREATE TABLE `goku_authority` (
  `userid` varchar(32) NOT NULL,
  `bscode` varchar(255) NOT NULL,
  `tranno` varchar(255) NOT NULL,
  `auth` varchar(2) NOT NULL,
  PRIMARY KEY (`userid`,`bscode`,`tranno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goku_authority
-- ----------------------------
INSERT INTO `goku_authority` VALUES ('E1C879F8C493D26A699D604DE42A2BE6', 'sysUserMapper', 'insert', 'Y');
INSERT INTO `goku_authority` VALUES ('E1C879F8C493D26A699D604DE42A2BE6', 'sysUserMapper', 'SelectList', 'Y');
INSERT INTO `goku_authority` VALUES ('E1C879F8C493D26A699D604DE42A2BE6', 'sysUserMapper', 'SelectOne', 'Y');
