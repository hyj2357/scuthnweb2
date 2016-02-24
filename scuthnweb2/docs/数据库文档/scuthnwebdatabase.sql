/*
Navicat MySQL Data Transfer

Source Server         : l1
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : scuthnwebdatabase

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-02-24 20:46:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(32) NOT NULL,
  `register_time` datetime NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('3', '', '0000-00-00 00:00:00', '');
INSERT INTO `account` VALUES ('7', '黄奕君1996', '2016-02-23 16:04:19', '18976445506');
INSERT INTO `account` VALUES ('8', '黄奕君1997', '2016-02-23 16:27:27', '18976445506');

-- ----------------------------
-- Table structure for action
-- ----------------------------
DROP TABLE IF EXISTS `action`;
CREATE TABLE `action` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_name` varchar(32) NOT NULL,
  `introduction` text NOT NULL,
  `Position` text NOT NULL,
  `obj_status` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `action_name` (`action_name`),
  KEY `uid` (`uid`),
  CONSTRAINT `action_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of action
-- ----------------------------

-- ----------------------------
-- Table structure for action_join_info
-- ----------------------------
DROP TABLE IF EXISTS `action_join_info`;
CREATE TABLE `action_join_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_id` int(11) NOT NULL,
  `join_time` datetime NOT NULL,
  `end_join_time` datetime NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `action_id` (`action_id`),
  CONSTRAINT `action_join_info_ibfk_1` FOREIGN KEY (`action_id`) REFERENCES `action` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of action_join_info
-- ----------------------------

-- ----------------------------
-- Table structure for action_pic
-- ----------------------------
DROP TABLE IF EXISTS `action_pic`;
CREATE TABLE `action_pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_id` int(11) NOT NULL,
  `url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `action_id` (`action_id`),
  CONSTRAINT `action_pic_ibfk_1` FOREIGN KEY (`action_id`) REFERENCES `action` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of action_pic
-- ----------------------------

-- ----------------------------
-- Table structure for action_summary
-- ----------------------------
DROP TABLE IF EXISTS `action_summary`;
CREATE TABLE `action_summary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_id` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `join_user_account` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `action_id` (`action_id`),
  KEY `uid` (`uid`),
  KEY `FK1F17369D80990A2D` (`join_user_account`),
  CONSTRAINT `action_summary_ibfk_1` FOREIGN KEY (`action_id`) REFERENCES `action` (`id`),
  CONSTRAINT `action_summary_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `account` (`id`),
  CONSTRAINT `FK1F17369D80990A2D` FOREIGN KEY (`join_user_account`) REFERENCES `account` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of action_summary
-- ----------------------------

-- ----------------------------
-- Table structure for album
-- ----------------------------
DROP TABLE IF EXISTS `album`;
CREATE TABLE `album` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album_name` varchar(32) NOT NULL,
  `introduction` text NOT NULL,
  `add_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `album_name` (`album_name`),
  KEY `uid` (`uid`),
  CONSTRAINT `album_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of album
-- ----------------------------

-- ----------------------------
-- Table structure for album_pic
-- ----------------------------
DROP TABLE IF EXISTS `album_pic`;
CREATE TABLE `album_pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album_id` int(11) NOT NULL,
  `url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `album_id` (`album_id`),
  CONSTRAINT `album_pic_ibfk_1` FOREIGN KEY (`album_id`) REFERENCES `album` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of album_pic
-- ----------------------------

-- ----------------------------
-- Table structure for invite_code
-- ----------------------------
DROP TABLE IF EXISTS `invite_code`;
CREATE TABLE `invite_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `aid` int(11) NOT NULL,
  `code` varchar(32) NOT NULL,
  `valid_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `aid` (`aid`),
  CONSTRAINT `invite_code_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`),
  CONSTRAINT `invite_code_ibfk_2` FOREIGN KEY (`aid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of invite_code
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `suid` int(11) NOT NULL,
  `ruid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) NOT NULL,
  `content` text NOT NULL,
  `_read` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `suid` (`suid`),
  KEY `ruid` (`ruid`),
  CONSTRAINT `message_ibfk_1` FOREIGN KEY (`suid`) REFERENCES `account` (`id`),
  CONSTRAINT `message_ibfk_2` FOREIGN KEY (`ruid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for new
-- ----------------------------
DROP TABLE IF EXISTS `new`;
CREATE TABLE `new` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) NOT NULL,
  `content` text NOT NULL,
  `obj_status` bit(1) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`),
  KEY `uid` (`uid`),
  CONSTRAINT `new_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of new
-- ----------------------------

-- ----------------------------
-- Table structure for new_pic
-- ----------------------------
DROP TABLE IF EXISTS `new_pic`;
CREATE TABLE `new_pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `new_id` int(11) NOT NULL,
  `url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `new_id` (`new_id`),
  CONSTRAINT `new_pic_ibfk_1` FOREIGN KEY (`new_id`) REFERENCES `new` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of new_pic
-- ----------------------------

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `add_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  CONSTRAINT `note_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of note
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `role_name` enum('normal_user','admin','super_admin') NOT NULL,
  `authority` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid` (`uid`),
  CONSTRAINT `role_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '8', 'normal_user', '\0');

-- ----------------------------
-- Table structure for share_link
-- ----------------------------
DROP TABLE IF EXISTS `share_link`;
CREATE TABLE `share_link` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link_name` varchar(32) NOT NULL,
  `link` text NOT NULL,
  `category` enum('prl','common','undergraduate','pr','other') NOT NULL,
  `add_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `link_name` (`link_name`),
  KEY `FK956A2C5ACC8CED4F` (`uid`),
  CONSTRAINT `FK956A2C5ACC8CED4F` FOREIGN KEY (`uid`) REFERENCES `account` (`id`),
  CONSTRAINT `share_link_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of share_link
-- ----------------------------

-- ----------------------------
-- Table structure for share_link_comment
-- ----------------------------
DROP TABLE IF EXISTS `share_link_comment`;
CREATE TABLE `share_link_comment` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link_id` int(32) NOT NULL,
  `content` text NOT NULL,
  `add_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `link_id` (`link_id`),
  CONSTRAINT `share_link_comment_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`),
  CONSTRAINT `share_link_comment_ibfk_2` FOREIGN KEY (`link_id`) REFERENCES `share_link` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of share_link_comment
-- ----------------------------

-- ----------------------------
-- Table structure for sy_user
-- ----------------------------
DROP TABLE IF EXISTS `sy_user`;
CREATE TABLE `sy_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `user_name` varchar(32) NOT NULL,
  `gender` enum('boy','girl') NOT NULL,
  `major` varchar(32) DEFAULT NULL,
  `grade` varchar(32) DEFAULT NULL,
  `phone_number` varchar(64) DEFAULT NULL,
  `qq_number` varchar(255) DEFAULT NULL,
  `wechar_number` varchar(255) DEFAULT NULL,
  `mail` varchar(255) NOT NULL,
  `wechat_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid` (`uid`),
  UNIQUE KEY `mail` (`mail`),
  CONSTRAINT `sy_user_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sy_user
-- ----------------------------
INSERT INTO `sy_user` VALUES ('3', '7', '闪魔', 'boy', '软件工程', '2013', null, null, null, '1337197784@qq.com', null);
INSERT INTO `sy_user` VALUES ('4', '8', '黄奕君', 'boy', '软件工程', '2013', null, null, null, '976350901@qq.com', null);

-- ----------------------------
-- Table structure for sy_user_pic
-- ----------------------------
DROP TABLE IF EXISTS `sy_user_pic`;
CREATE TABLE `sy_user_pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  CONSTRAINT `sy_user_pic_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sy_user_pic
-- ----------------------------

-- ----------------------------
-- Table structure for user_req
-- ----------------------------
DROP TABLE IF EXISTS `user_req`;
CREATE TABLE `user_req` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `grade_major` varchar(32) NOT NULL,
  `other_info` text,
  `valid_time` datetime NOT NULL,
  `content` text,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  CONSTRAINT `user_req_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_req
-- ----------------------------

-- ----------------------------
-- Table structure for user_req_deal
-- ----------------------------
DROP TABLE IF EXISTS `user_req_deal`;
CREATE TABLE `user_req_deal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `req_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `req_id` (`req_id`),
  CONSTRAINT `user_req_deal_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`),
  CONSTRAINT `user_req_deal_ibfk_2` FOREIGN KEY (`req_id`) REFERENCES `user_req` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_req_deal
-- ----------------------------

-- ----------------------------
-- Table structure for valid_code
-- ----------------------------
DROP TABLE IF EXISTS `valid_code`;
CREATE TABLE `valid_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `code` varchar(32) NOT NULL,
  `valid_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  CONSTRAINT `valid_code_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `account` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of valid_code
-- ----------------------------
INSERT INTO `valid_code` VALUES ('5', '7', 'B3D6B4B820EE21585652A780A049A864', '2016-02-24 16:04:19');
