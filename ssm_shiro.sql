/*
Navicat MySQL Data Transfer

Source Server         : wyh
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : ssm_shiro

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-09-03 19:17:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(255) DEFAULT NULL COMMENT 'URL',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='菜单';

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '查看用户', 'user:list');
INSERT INTO `sys_permission` VALUES ('2', '查看角色', 'role:list');
INSERT INTO `sys_permission` VALUES ('3', '查看权限', 'permission:list');
INSERT INTO `sys_permission` VALUES ('4', '添加角色', 'role:add');
INSERT INTO `sys_permission` VALUES ('5', '添加权限', 'permission:add');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(225) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'boss');
INSERT INTO `sys_role` VALUES ('2', 'ssm');
INSERT INTO `sys_role` VALUES ('3', 'teacher');
INSERT INTO `sys_role` VALUES ('4', 'classmate');
INSERT INTO `sys_role` VALUES ('5', 'student');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_permission_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色菜单ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `permission_id` int(11) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`role_permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8 COMMENT='角色菜单';

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2');
INSERT INTO `sys_role_permission` VALUES ('3', '1', '3');
INSERT INTO `sys_role_permission` VALUES ('4', '1', '4');
INSERT INTO `sys_role_permission` VALUES ('5', '1', '5');
INSERT INTO `sys_role_permission` VALUES ('6', '2', '1');
INSERT INTO `sys_role_permission` VALUES ('7', '2', '2');
INSERT INTO `sys_role_permission` VALUES ('8', '2', '3');
INSERT INTO `sys_role_permission` VALUES ('9', '2', '4');
INSERT INTO `sys_role_permission` VALUES ('10', '3', '1');
INSERT INTO `sys_role_permission` VALUES ('11', '3', '2');
INSERT INTO `sys_role_permission` VALUES ('12', '3', '3');
INSERT INTO `sys_role_permission` VALUES ('13', '4', '1');
INSERT INTO `sys_role_permission` VALUES ('14', '4', '2');
INSERT INTO `sys_role_permission` VALUES ('15', '5', '1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(12) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(255) DEFAULT NULL COMMENT '登录名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1272 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'wyh', '111');
INSERT INTO `sys_user` VALUES ('2', 'wsq', '111');
INSERT INTO `sys_user` VALUES ('3', 'jjq', '111');
INSERT INTO `sys_user` VALUES ('4', 'lc', '111');
INSERT INTO `sys_user` VALUES ('5', 'yc', '111');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='用户角色';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '3', '3');
INSERT INTO `sys_user_role` VALUES ('4', '4', '4');
INSERT INTO `sys_user_role` VALUES ('5', '5', '5');
