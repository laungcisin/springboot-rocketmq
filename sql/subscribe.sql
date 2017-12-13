/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : rocketmq

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-12-13 10:46:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for subscribe
-- ----------------------------
DROP TABLE IF EXISTS `subscribe`;
CREATE TABLE `subscribe` (
  `id` int(11) NOT NULL,
  `proname` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `topic` varchar(255) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `gro` varchar(255) DEFAULT NULL,
  `consumefromwhere` varchar(255) DEFAULT NULL,
  `consumethreadmin` varchar(12) DEFAULT NULL,
  `consumethreadmax` varchar(12) DEFAULT NULL,
  `pullthresholdforqueue` varchar(12) DEFAULT NULL,
  `consumemessagebatchmaxsize` varchar(12) DEFAULT NULL,
  `pullbatchsize` varchar(12) DEFAULT NULL,
  `pullinterval` varchar(12) DEFAULT NULL,
  `businesskey` varchar(255) DEFAULT NULL,
  `status` int(12) DEFAULT '0' COMMENT '状态: 0 - 禁用， 1 - 启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subscribe
-- ----------------------------
INSERT INTO `subscribe` VALUES ('1', '1', null, 'TopicTest', 'TagA', 'RocketGroupName', 'CONSUME_FROM_FIRST_OFFSET', '10', '20', '100', '1', '32', '0', null, '1', '2017-11-21 16:41:26', '2017-11-21 16:41:29');
