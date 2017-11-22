/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : jawavesys

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-02 15:41:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goku_tranlog
-- ----------------------------
DROP TABLE IF EXISTS `goku_tranlog`;
CREATE TABLE `goku_tranlog` (
  `uuid` varchar(32) DEFAULT NULL,
  `userid` varchar(32) DEFAULT NULL,
  `bscode` varchar(255) DEFAULT NULL,
  `tranno` varchar(255) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `requestxml` blob,
  `responsexml` blob,
  `successflag` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goku_tranlog
-- ----------------------------
INSERT INTO `goku_tranlog` VALUES ('4d39ed0abfa011e780561168d7fd6c26', 'fjx', 'sysUserMapper', 'insert', '2017-11-02 15:36:22', 0x3C676F6B753E0A3C6865616465723E0A3C757365725F69643E666A783C2F757365725F69643E0A3C70617373776F72643E313C2F70617373776F72643E0A3C7472616E5F6E6F3E696E736572743C2F7472616E5F6E6F3E0A3C62735F636F64653E737973557365724D61707065723C2F62735F636F64653E0A3C2F6865616465723E0A3C626F64793E0A3C646174613E0A3C69643E313233343C2F69643E0A3C6E616D653E666A783C2F6E616D653E0A3C2F646174613E0A3C2F626F64793E0A3C2F676F6B753E, 0x3C676F6B753E3C626F64793E3C7265745F696E666F3EB3C9B9A6213C2F7265745F696E666F3E3C7265745F636F64653E303C2F7265745F636F64653E3C2F626F64793E3C2F676F6B753E, '1');
INSERT INTO `goku_tranlog` VALUES ('63d6e400bfa011e780561168d7fd6c26', 'fjx11', 'sysUserMapper', 'insert', '2017-11-02 15:37:06', 0x3C676F6B753E0A3C6865616465723E0A3C757365725F69643E666A7831313C2F757365725F69643E0A3C70617373776F72643E313C2F70617373776F72643E0A3C7472616E5F6E6F3E696E736572743C2F7472616E5F6E6F3E0A3C62735F636F64653E737973557365724D61707065723C2F62735F636F64653E0A3C2F6865616465723E0A3C626F64793E0A3C646174613E0A3C69643E313233343C2F69643E0A3C6E616D653E666A783C2F6E616D653E0A3C2F646174613E0A3C2F626F64793E0A3C2F676F6B753E, 0x3C676F6B753E3C626F64793E3C7265745F696E666F3E666A783131D3C3BBA7B2BBB4E6D4DA213C2F7265745F696E666F3E3C7265745F636F64653E313C2F7265745F636F64653E3C2F626F64793E3C2F676F6B753E, '1');
