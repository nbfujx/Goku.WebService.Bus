/*
Navicat MySQL Data Transfer

Source Server         : mysql107
Source Server Version : 50720
Source Host           : 47.97.198.227:3306
Source Database       : springbootdb

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-16 13:47:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_
-- ----------------------------
DROP TABLE IF EXISTS `user_`;
CREATE TABLE `user_` (
  `id` varchar(100) NOT NULL,
  `emailAddress` varchar(100) NOT NULL,
  `company_id` varchar(100) NOT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyName` varchar(100) DEFAULT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `middleName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `nickName` varchar(100) NOT NULL,
  `password_` varchar(50) NOT NULL DEFAULT '',
  `birthday_` datetime DEFAULT NULL,
  `favoriteActivity` varchar(200) DEFAULT NULL,
  `favoriteFood` varchar(200) DEFAULT NULL,
  `favoriteMovie` varchar(200) DEFAULT NULL,
  `favoriteMusic` varchar(200) DEFAULT NULL,
  `greeting_` varchar(100) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `recycled_` char(1) DEFAULT 'N',
  `loginDate` datetime DEFAULT NULL,
  `lastLoginDate` datetime DEFAULT NULL,
  `loginIP` varchar(75) DEFAULT NULL,
  `lastLoginIP` varchar(75) DEFAULT NULL,
  `defaultTagId` varchar(100) DEFAULT NULL,
  `description_` text,
  `country_` varchar(50) DEFAULT NULL,
  `area_` varchar(30) DEFAULT NULL,
  `male_` varchar(2) DEFAULT NULL,
  `type_` varchar(50) DEFAULT NULL,
  `active_` int(11) DEFAULT NULL,
  `valid_` char(1) DEFAULT 'N',
  `mobilePhone` varchar(100) DEFAULT NULL,
  `Phone_` varchar(100) DEFAULT NULL,
  `leftmenu` text,
  `extuserid` int(11) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `default_tag_id` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `favorite_activity` varchar(255) DEFAULT NULL,
  `favorite_food` varchar(255) DEFAULT NULL,
  `favorite_movie` varchar(255) DEFAULT NULL,
  `favorite_music` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `last_loginip` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `login_date` datetime DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ind_user_groupId` (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_
-- ----------------------------
INSERT INTO `user_` VALUES ('1111', '2222', '3333', null, null, null, null, null, '44444', '55555', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user_` VALUES ('test2', 'test2@nbfujx.com', '2222', null, null, null, null, null, '测试2', '123', null, null, null, null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'N', null, null, null, null, null, null, null, '2222', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user_` VALUES ('test3', 'test3@nbfujx.com', 'company1', null, null, null, null, null, '测试3', '123', null, null, null, null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
