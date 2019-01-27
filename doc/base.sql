/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : 127.0.0.1
 Source Database       : DB_TK

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : utf-8

 Date: 03/09/2018 21:58:16 PM
*/
-- 生成DB_TK数据库  
DROP DATABASE IF EXISTS DB_TK ;
CREATE DATABASE DB_TK CHARACTER SET utf8 COLLATE utf8_general_ci;
USE DB_TK;

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_TK_TBOne`  
-- ----------------------------
DROP TABLE IF EXISTS `T_TK_TBOne`;
CREATE TABLE `T_TK_TBOne` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` VARCHAR(80) DEFAULT "" COMMENT '名称',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='T_TK_TBOne';

DROP TABLE IF EXISTS `T_TK_TBTwo`;
CREATE TABLE `T_TK_TBTwo` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` VARCHAR(80) DEFAULT "" COMMENT '名称',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='基础应用信息表';


