/*
Navicat MySQL Data Transfer

Source Server         : ITpro
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : recipesassignments

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2022-09-15 20:04:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hibernate_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('14');

-- ----------------------------
-- Table structure for `recipes_list`
-- ----------------------------
DROP TABLE IF EXISTS `recipes_list`;
CREATE TABLE `recipes_list` (
  `id` int(11) NOT NULL,
  `recipes_name` varchar(255) DEFAULT NULL,
  `type_ofrecipes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of recipes_list
-- ----------------------------
INSERT INTO `recipes_list` VALUES ('2', 'burgur', 'veg');
INSERT INTO `recipes_list` VALUES ('3', 'chicken', 'Nonveg');
INSERT INTO `recipes_list` VALUES ('4', 'momoes', 'veg');
INSERT INTO `recipes_list` VALUES ('5', 'Tea', 'veg');
INSERT INTO `recipes_list` VALUES ('6', 'coffee', 'veg');
INSERT INTO `recipes_list` VALUES ('7', 'meet', 'nonveg');
INSERT INTO `recipes_list` VALUES ('8', 'Pratha', 'veg');
INSERT INTO `recipes_list` VALUES ('9', 'Dhosa', 'veg');
INSERT INTO `recipes_list` VALUES ('10', 'Motton', 'nonveg');
INSERT INTO `recipes_list` VALUES ('11', 'Ladu', 'veg');
INSERT INTO `recipes_list` VALUES ('12', 'Dhakla', 'veg');
INSERT INTO `recipes_list` VALUES ('13', 'checken', 'Nonveg');
