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
  `createTime` DATETIME NOT NULL COMMENT '生成时间',
  `lastUpdateTime` TIMESTAMP COMMENT '最后修改时间',
  `description` VARCHAR(200) DEFAULT "" COMMENT '描述',
  `creatorId` VARCHAR(40) DEFAULT "" COMMENT ' 创建者,developerId或者managerId',
  `lastUpdateUserId` VARCHAR(40) DEFAULT "" COMMENT '最后修改者',
  `secret` VARCHAR(40)  DEFAULT "" COMMENT 'secret',
  `hidden`TINYINT(1)   DEFAULT 0  COMMENT '是否隐藏',
  `fullName` VARCHAR(40)  DEFAULT "" COMMENT '应用全称',
  `shortName` VARCHAR(40)  DEFAULT "" COMMENT '应用简称',
  `type` INT(3) DEFAULT 0  COMMENT '应用类型',
  `state` INT(3) DEFAULT 0  COMMENT '应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除',
  `showUrl` VARCHAR(80)  DEFAULT "" COMMENT '展示地址',
  `callbackAddrUrl` VARCHAR(80)  DEFAULT "" COMMENT '回调地址',
  `publishDate` DATETIME NOT NULL COMMENT '发布时间',
  `origin` VARCHAR(40)  DEFAULT "" COMMENT '应用图标',
  `icon` VARCHAR(40)  DEFAULT "" COMMENT '应用图标',
  `version` VARCHAR(40)  DEFAULT "" COMMENT '版本',
  `recommend`TINYINT(1)   DEFAULT 0  COMMENT '是否推荐',
  `free`TINYINT(1)   DEFAULT 0  COMMENT '是否免费',
  `appCategoryId`  VARCHAR(40) DEFAULT ""  COMMENT '关联应用类型',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='T_TK_TBOne';

DROP TABLE IF EXISTS `T_TK_TBTwo`;
CREATE TABLE `T_TK_TBTwo` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` VARCHAR(80) DEFAULT "" COMMENT '名称',
  `createTime` DATETIME NOT NULL COMMENT '生成时间',
  `lastUpdateTime` TIMESTAMP COMMENT '最后修改时间',
  `description` VARCHAR(200) DEFAULT "" COMMENT '描述',
  `creatorId` VARCHAR(40) DEFAULT "" COMMENT ' 创建者,developerId或者managerId',
  `lastUpdateUserId` VARCHAR(40) DEFAULT "" COMMENT '最后修改者',
  `secret` VARCHAR(40)  DEFAULT "" COMMENT 'secret',
  `hidden`TINYINT(1)   DEFAULT 0  COMMENT '是否隐藏',
  `fullName` VARCHAR(40)  DEFAULT "" COMMENT '应用全称',
  `shortName` VARCHAR(40)  DEFAULT "" COMMENT '应用简称',
  `type` INT(3) DEFAULT 0  COMMENT '应用类型',
  `state` INT(3) DEFAULT 0  COMMENT '应用状态，10-初始化；0-待审核；1-审核通过；2-审核未通过；3-申请上架；4-已上架；5-申请下架；6-已下架；7-应用维护中；8-黑名单应用;9-已删除',
  `showUrl` VARCHAR(80)  DEFAULT "" COMMENT '展示地址',
  `callbackAddrUrl` VARCHAR(80)  DEFAULT "" COMMENT '回调地址',
  `publishDate` DATETIME NOT NULL COMMENT '发布时间',
  `origin` VARCHAR(40)  DEFAULT "" COMMENT '应用图标',
  `icon` VARCHAR(40)  DEFAULT "" COMMENT '应用图标',
  `version` VARCHAR(40)  DEFAULT "" COMMENT '版本',
  `recommend`TINYINT(1)   DEFAULT 0  COMMENT '是否推荐',
  `free`TINYINT(1)   DEFAULT 0  COMMENT '是否免费',
  `appCategoryId`  VARCHAR(40) DEFAULT ""  COMMENT '关联应用类型',
   PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='基础应用信息表';




SELECT id,NAME,createTime,lastUpdateTime,description,creatorId,lastUpdateUserId,
secret,hidden,fullName,shortName,TYPE,state,showUrl,callbackAddrUrl,publishDate,origin,
icon,VERSION,recommend,free,appCategoryId 
 FROM T_TK_TBOne


