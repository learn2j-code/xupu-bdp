CREATE DATABASE  IF NOT EXISTS `bdp`  DEFAULT CHARACTER SET utf8 ;

USE `bdp`;

/*家族信息表*/
DROP TABLE IF EXISTS `family_info`;
CREATE TABLE `family_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '家族id',
  `family_name` varchar(100) DEFAULT NULL COMMENT '家族名称',
  `family_title` varchar(100) DEFAULT NULL COMMENT '家族堂号',
  `surname_id` int(11) DEFAULT NULL COMMENT '姓氏ID',
  `surname` varchar(50) DEFAULT NULL COMMENT '姓氏',
  `ancestor_name` varchar(50) DEFAULT NULL COMMENT '始迁祖',
  `settlement_roughly` varchar(255) DEFAULT NULL COMMENT '定居地-省市县',
  `settlement_exact` varchar(1024) DEFAULT NULL COMMENT '定居地-详细',
  `settlement_time` varchar(255) DEFAULT NULL COMMENT '定居时间',
  `emigration_roughly` varchar(255) DEFAULT NULL COMMENT '迁出地-省市县',
  `emigration_exact` varchar(1024) DEFAULT NULL COMMENT '迁出地-详细',
  `emigration_time` varchar(255) DEFAULT NULL COMMENT '迁出时间',
  `totem_address` varchar(1024) DEFAULT NULL COMMENT '图腾图片地址',
  `totem_story` varchar(2048) DEFAULT NULL COMMENT '图腾解说',
  `seniority_content` varchar(1024) DEFAULT NULL COMMENT '派语',
  `family_intro` text COMMENT '家族简介',
  `ancestor_story` text COMMENT '姓氏来源-得姓始祖',
  `other_info` text COMMENT '其他信息',
  `contactor` varchar(255) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `location` varchar(255) DEFAULT NULL COMMENT '位置',
  `location_code` varchar(255) DEFAULT NULL COMMENT '位置编码',
  `frozen_flag` int(4) DEFAULT '0' COMMENT '冻结标志，默认为0：不冻结，1：冻结',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族信息表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族叙谱设置表*/
DROP TABLE IF EXISTS `family_setting`;
CREATE TABLE `family_setting` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设置id',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `xupu_flag` int(2) DEFAULT '0' COMMENT '开始叙谱标志，默认为0：正在续谱，1：停止续谱',
  `seniority_content` varchar(1024) DEFAULT NULL COMMENT '派语',
  `soninlaw_flag` int(2) DEFAULT '1' COMMENT '女婿是否入谱标志，默认为1：入谱，0：不入',
  `unpay_flag` int(2) DEFAULT '1' COMMENT '不交钱是否入谱标志，默认为1：入谱，0：不入',
  `xupu_charge` int(2) DEFAULT '1' COMMENT '续谱是否收费标志，默认为1：收费，0：不收费',
  `each_cost` varchar(50) DEFAULT '40' COMMENT '鸿丁费',
  `council_cost` varchar(50) DEFAULT NULL COMMENT '理事会价格',
  `discounts` varchar(50) DEFAULT NULL COMMENT '优惠价格',
  `payee` int(2) DEFAULT '1' COMMENT '收款方，1：平台收费，2：客户自己收费',
  `payment_way` int(2) DEFAULT '1' COMMENT '缴费方式，1：接口，2：二维码',
  `qr_code` varchar(50) DEFAULT NULL COMMENT '二维码路径',
  `change_payment` int(2) DEFAULT '1' COMMENT '改费方式，1：系统，2：手动',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族叙谱设置表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族理事会表*/
DROP TABLE IF EXISTS `family_council`;
CREATE TABLE `family_council` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `generation_num` int(2) DEFAULT NULL COMMENT '世代',
  `generation_word` varchar(100) DEFAULT NULL COMMENT '派语',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `identity_card` varchar(100) DEFAULT NULL COMMENT '身份证',
  `discounts` varchar(100) DEFAULT NULL COMMENT '优惠',
  `duty` varchar(100) DEFAULT NULL COMMENT '职务',
  `period` varchar(100) DEFAULT NULL COMMENT '第几届',
  `retired` int(2) DEFAULT '0' COMMENT '退休标志，默认为0：未退休，1：已退休',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族理事会表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*编委会表*/
DROP TABLE IF EXISTS `editorial_staff`;
CREATE TABLE `editorial_staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `setting_id` int(11) DEFAULT NULL COMMENT '叙谱设置id',
  `generation_num` int(2) DEFAULT NULL COMMENT '世代',
  `generation_word` varchar(100) DEFAULT NULL COMMENT '派语',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `identity_card` varchar(100) DEFAULT NULL COMMENT '身份证',
  `duty` varchar(100) DEFAULT NULL COMMENT '职务',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '编委会表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*优惠列表*/
DROP TABLE IF EXISTS `discounts_staff`;
CREATE TABLE `discounts_staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `setting_id` int(11) DEFAULT NULL COMMENT '叙谱设置id',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `identity_card` varchar(100) DEFAULT NULL COMMENT '身份证',
  `discounts` varchar(100) DEFAULT NULL COMMENT '优惠',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '优惠列表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族分支信息表*/
DROP TABLE IF EXISTS `sub_family_info`;
CREATE TABLE `sub_family_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `sub_family_no` varchar(100) DEFAULT NULL COMMENT '分支代号',
  `sub_family_code` varchar(255) DEFAULT NULL COMMENT '分支编码',
  `sub_ancestor_name` varchar(255) DEFAULT NULL COMMENT '分支始祖名称',
  `immigrate_address` varchar(1024) DEFAULT NULL COMMENT '定居地-详细',
  `immigrate_time` varchar(255) DEFAULT NULL COMMENT '迁入时间',
  `sub_manager` varchar(255) DEFAULT NULL COMMENT '分支负责人',
  `sub_manager_id` int(11) DEFAULT NULL COMMENT '分支负责人id',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `migrate_flag` int(4) DEFAULT '1' COMMENT '是否外迁标志，默认：1，外迁；0：不外迁',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `family_memeber_id` int(11) DEFAULT NULL COMMENT '家族成员id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族分支信息表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*姓氏信息表*/
DROP TABLE IF EXISTS `surname_info`;
CREATE TABLE `surname_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '姓氏ID',
  `surname` varchar(50) DEFAULT NULL COMMENT '姓氏名称',
  `surname_pinyin` varchar(100) DEFAULT NULL COMMENT '姓氏拼音',
  `word_num` int(4) DEFAULT NULL COMMENT '姓氏字数',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '姓氏信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*服务中心*/
DROP TABLE IF EXISTS `service_center`;
CREATE TABLE `service_center` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '服务ID',
  `icon_address` varchar(1024) DEFAULT NULL COMMENT '图标 地址',
  `service_no` varchar(45) DEFAULT NULL COMMENT '代号',
  `service_code` varchar(100) DEFAULT NULL COMMENT '服务编码',
  `service_name` varchar(100) DEFAULT NULL COMMENT '服务名称',
  `service_pay_type` int(2) DEFAULT '0' DEFAULT NULL COMMENT '服务付费类型，默认为0：常规服务（正常按规格一次付费），1：使用中按数量付费，2：使用后付费',
  `service_intro` varchar(1024) DEFAULT NULL COMMENT '服务简介',
  `price_unit` varchar(45) DEFAULT '0' COMMENT '计价单位，0：无，1：元，2：美元',
  `time_unit` varchar(45) DEFAULT '0' COMMENT '计时单位，0：不限；1：时；2：日；3：周；4：月；5季；6年',
  `measure_unit` varchar(45) DEFAULT '0' COMMENT '计量单位，0：无限；1：次，2：人，3：人/次，4：字',
  `discount` varchar(10) DEFAULT '1' COMMENT '折扣,默认100%',
  `price` varchar(100) DEFAULT NULL COMMENT '价格',
  `conf_type` varchar(100) DEFAULT NULL COMMENT '服务配置类型',
  `conf_framework` varchar(1024) DEFAULT NULL COMMENT '服务配置内容框架地址',
  `internal_flag` int(2) DEFAULT '1' COMMENT '服务内置标志，默认为0：内置，1：外置',
  `use_flag` int(2) DEFAULT '1' COMMENT '上下架，默认为1：上架，0：下架',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '服务中心' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族服务*/
DROP TABLE IF EXISTS `family_service`;
CREATE TABLE `family_service` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '家族服务ID',
  `service_id` int(11) DEFAULT NULL COMMENT '家族服务id',
  `service_no` varchar(45) DEFAULT NULL COMMENT '代号',
  `service_code` varchar(100) DEFAULT NULL COMMENT '服务编码',
  `service_name` varchar(100) DEFAULT NULL COMMENT '服务名称',
  `service_intro` varchar(1024) DEFAULT NULL COMMENT '服务简介',
  `conf_type` varchar(100) DEFAULT NULL COMMENT '服务配置类型',
  `conf_framework` varchar(1024) DEFAULT NULL COMMENT '服务配置内容框架地址',
  `conf_content` varchar(1024) DEFAULT NULL COMMENT '服务配置具体内容',
  `price` varchar(100) DEFAULT NULL COMMENT '价格',
  `bought_time` timestamp NULL COMMENT '购买日期',
  `end_time` timestamp NULL COMMENT '到期日期',
  `end_type` int(4) DEFAULT NULL COMMENT '期限类型：默认为1：按月',
  `bought_num` int(4) DEFAULT NULL COMMENT '购买数量',
  `discount` varchar(10) DEFAULT NULL COMMENT '折扣',
  `service_fee` varchar(100) DEFAULT NULL COMMENT '该项服务总费用',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `enable_flag` int(2) DEFAULT '1' COMMENT '启用标识，默认为1：启用，0：不启用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族服务' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*族谱管理*/
/*谱书管理信息*/
DROP TABLE IF EXISTS `clan_book`;
CREATE TABLE `clan_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '谱书ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `surname` varchar(50) DEFAULT NULL COMMENT '姓氏',
  `book_name` varchar(100) DEFAULT NULL COMMENT '谱书名',
  `volume_num` int(4) DEFAULT NULL COMMENT '卷数',
  `generation_poem` varchar(2048) DEFAULT NULL COMMENT '派语',
  `book_ancestor_word` varchar(50) DEFAULT NULL COMMENT '谱始祖字派',
  `cover_image` varchar(1024) DEFAULT NULL COMMENT '封面地址',
  `deal_flag` int(4) DEFAULT NULL COMMENT '是否老谱世系化标识，默认为0：未处理，1：为已处理',
  `status` int(4) DEFAULT '0' COMMENT '谱书状态,查看全部是：原图，0：初始状态，未检测状态，1：已检测状态，2：审核被退回，3：审核中，4：审核通过-电子化进行中，5：已电子化，6：已定稿',
  `relation_modify_flag` int(4) DEFAULT NULL COMMENT '关系修订标识，默认为0：未修订，1：为已修订',
  `content_modify_flag` int(4) DEFAULT NULL COMMENT '内容修订标识，默认为0：未修订，1：为已修订',
  `open_flag` int(4) DEFAULT NULL COMMENT '老谱开放程度，默认为1：只对内开放；2只对本家族开放；3密码访问；4公开',
  `ancestor_id` int(11) DEFAULT NULL COMMENT '始迁祖id',
  `ancestor_name` varchar(100) DEFAULT NULL COMMENT '始迁祖名',
  `book_ancestor_id` int(11) DEFAULT NULL COMMENT '谱始祖id',
  `book_ancestor_name` varchar(100) DEFAULT NULL COMMENT '谱始祖名',
  `sub_clan_setting` varchar(30) DEFAULT NULL COMMENT '老谱分支配置设置，4;5;6;4 前3个数字分别是系房裔对应的世代，最后是支的间隔',
  `generation_word` varchar(30) DEFAULT NULL COMMENT '世代替代汉字',
  `watermark_flag` int(2) DEFAULT '0' COMMENT '是否有水印，默认为0：有水印,1:无',
  `branch_type` int(2) DEFAULT '1' COMMENT '分支类型（1直接分房2系房支裔，暂时只有这两个值，默认为1）',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '谱书管理信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*卷管理信息*/
DROP TABLE IF EXISTS `clan_volume`;
CREATE TABLE `clan_volume` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '谱书ID',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_name` varchar(100) DEFAULT NULL COMMENT '卷名',
  `volume_no` int(4) DEFAULT NULL COMMENT '卷号',
  `cover_image` varchar(1024) DEFAULT NULL COMMENT '封面地址',
  `status` int(4) DEFAULT '0' COMMENT '卷状态,0:未检测，1：已检测',
  `upload_flag` int(4) DEFAULT '0' COMMENT '卷上传内容标识,0:未上传，1：已上传excel，2：已上传zip',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '卷管理信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*图管理信息*/
DROP TABLE IF EXISTS `clan_picture`;
CREATE TABLE `clan_picture` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '谱书ID',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `picture_name` varchar(100) DEFAULT NULL COMMENT '图名',
  `picture_address` varchar(1024) DEFAULT NULL COMMENT '图的相对地址',
  `picture_no` int(4) DEFAULT NULL COMMENT '图号',
  `status` int(4) DEFAULT '0' COMMENT '图状态，0:未检测，1：已检测',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '图管理信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*老谱分支信息表*/
DROP TABLE IF EXISTS `sub_clan_info`;
CREATE TABLE `sub_clan_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `sub_clan_name` varchar(255) DEFAULT NULL COMMENT '分支名称',
  `parent_id` int(11) DEFAULT '-2' COMMENT '上一级的id，如果是系那么上一级的id为0',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `cm_id` int(11) DEFAULT NULL COMMENT '该分支头结点的老谱成员id',
  `level_type` int(4) DEFAULT NULL COMMENT '分级，系为1，房为2，裔为3，支为4',
  `level_name` varchar(10) DEFAULT NULL COMMENT 'xx系下，xx房，xx裔，xx支',
  `generation_num` int(4) DEFAULT NULL COMMENT '该成员的世代',
  `sub_clan_type` int(4) DEFAULT NULL COMMENT '分支类型，0，原分支，1，新分支',
  `migrate_flag` int(4) DEFAULT '1' COMMENT '是否外迁标志，默认：1，外迁；0：不外迁',
  `immigrate_address` varchar(1024) DEFAULT NULL COMMENT '迁入地',
  `immigrate_time` varchar(255) DEFAULT NULL COMMENT '迁入时间',
  `sub_manager` varchar(255) DEFAULT NULL COMMENT '分支负责人',
  `manager_phone` varchar(50) DEFAULT NULL COMMENT '负责人联系电话',
  `sub_contactor` varchar(255) DEFAULT NULL COMMENT '分支联络人',
  `contactor_phone` varchar(50) DEFAULT NULL COMMENT '联络人联系电话',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '老谱分支信息表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*老谱成员原始信息表*/
DROP TABLE IF EXISTS `cm_content`;
CREATE TABLE `cm_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `print_error` varchar(1024) DEFAULT NULL COMMENT '刊误',
  `husband` varchar(100) DEFAULT NULL COMMENT '丈夫',
  `member_rel` varchar(100) DEFAULT NULL COMMENT '成员关系',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员姓名',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '成员内容详情',
  `generation_num` int(11) DEFAULT NULL COMMENT '世代编号',
  `order_no` int(11) DEFAULT NULL COMMENT '词条序号',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `copy_flag` int(4) DEFAULT '0' COMMENT '是否复制标志，默认为0：未复制，1：为已复制到final表',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '老谱成员原始信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*老谱成员信息修订表*/
DROP TABLE IF EXISTS `cm_content_final`;
CREATE TABLE `cm_content_final` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `cm_content_id` int(11) DEFAULT NULL  COMMENT '老谱ID',
  `print_error` varchar(1024) DEFAULT NULL COMMENT '刊误',
  `member_rel` varchar(100) DEFAULT NULL COMMENT '成员关系',
  `father_name` varchar(100) DEFAULT NULL COMMENT '父亲名称',
  `spouse_name` varchar(100) DEFAULT NULL COMMENT '配偶名称',
  `father_name_pinyin` varchar(100) DEFAULT NULL COMMENT '父亲名称拼音',
  `spouse_name_pinyin` varchar(100) DEFAULT NULL COMMENT '配偶名称拼音',
  `rel_keyword` varchar(100) DEFAULT NULL COMMENT '关系关键字',
  `member_surname` varchar(100) DEFAULT NULL COMMENT '成员姓',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `member_name_pinyin` varchar(100) DEFAULT NULL COMMENT '成员名称拼音',
  `member_gender` int(2) DEFAULT NULL COMMENT '成员性别，1：男，2：女',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '成员内容详情',
  `member_rel_original` varchar(100) DEFAULT NULL COMMENT '成员关系(原始)',
  `member_name_original` varchar(100) DEFAULT NULL COMMENT '成员名(原始)',
  `member_detail_original` varchar(2048) DEFAULT NULL COMMENT '成员内容详情(原始)',
  `member_rel_new` varchar(100) DEFAULT NULL COMMENT '成员关系(系统转译)',
  `member_name_new` varchar(100) DEFAULT NULL COMMENT '成员名(系统转译)',
  `member_detail_new` varchar(2048) DEFAULT NULL COMMENT '成员内容详情(系统转译)',
  `content_type` int(4) DEFAULT '1' COMMENT '内容类型，1：成员词条，2：世代，3：其他',
  `generation_num` int(11) DEFAULT NULL COMMENT '世代编号',
  `order_no` int(11) DEFAULT NULL COMMENT '词条序号',
  `sub_clan_id` int(11) DEFAULT NULL COMMENT '老谱分支id--新',
  `sub_clan_id_origin` int(11) DEFAULT NULL COMMENT '老谱分支id--旧',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `sec_personal_name` varchar(100) DEFAULT NULL COMMENT '字',
  `mark` varchar(100) DEFAULT NULL COMMENT '号',
  `generation_word` varchar(100) DEFAULT NULL COMMENT '派语',
  `birthday_time` varchar(100) DEFAULT NULL COMMENT '出生日期',
  `deathday_time` varchar(100) DEFAULT NULL COMMENT '死亡日期',
  `buried_location` varchar(1024) DEFAULT NULL COMMENT '葬地',
  `son` varchar(100) DEFAULT NULL COMMENT '子',
  `daughter` varchar(100) DEFAULT NULL COMMENT '女',
  `ranking` int(4) DEFAULT '0' COMMENT '排行，默认为0',
  `to_locate` int(4) DEFAULT '0' COMMENT '出继标志 默认为0：非出继；1、兼祧；2、出继/过继/出繼/过繼；3、出抚/出撫',
  `son_num` int(4) DEFAULT '0' COMMENT '子的数量--根据词条识别',
  `daughter_num` int(4) DEFAULT '0' COMMENT '女的数量--根据词条识别',
  `son_num_real` int(4) DEFAULT '0' COMMENT '子的数量--关系挂载的实际数量',
  `son_num_diff` int(4) DEFAULT '0' COMMENT '谱中儿子数量与实际挂载的儿子数量的差值，默认为0,相差几便是几',
  `daughter_num_real` int(4) DEFAULT '0' COMMENT '女的数量--关系挂载的实际数量',
  `extend_flag` int(4) DEFAULT '0' COMMENT '是否需要扩展标记，默认为0：不需要，1：需要',
  `rel_flag` int(4) DEFAULT '0' COMMENT '关系标识，默认为0：未找到关系，1为子与父关系，2为配与主关系',
  `rel_error_flag` int(4) DEFAULT '0' COMMENT '关系挂载异常标识，默认为0：关系正确，1为关系异常',
  `parse_flag` int(4) DEFAULT '0' COMMENT '解析通过标记，默认为0：未通过，1：已通过',
  `status` int(4) DEFAULT '0' COMMENT '状态，默认为0：未定稿，1为已定稿',
  `already_exist` int(4) DEFAULT '0' COMMENT '已经存在标志，默认0，如果为1说明该节点已存在',
  `brother_num` int(4) DEFAULT '0' COMMENT '兄弟的数量--根据父亲的儿子数量得到',
  `wife_list` varchar(255) DEFAULT NULL COMMENT '妻子列表，以逗号隔开',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '老谱成员信息修订表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*老谱成员关系表*/
DROP TABLE IF EXISTS `cm_relation`;
CREATE TABLE `cm_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `rel_type` int(4) DEFAULT NULL COMMENT '关系类型；1：子与父；2：配与主；3：',
  `ma_id` int(11) DEFAULT NULL COMMENT '成员A的id',
  `mb_id` int(11) DEFAULT NULL COMMENT '成员B的id',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '老谱成员关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*谱文修订记录表*/
DROP TABLE IF EXISTS `cm_modification_record`;
CREATE TABLE `cm_modification_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `cm_id` int(4) DEFAULT NULL COMMENT '老谱成员id',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员姓名',
  `member_rel` varchar(100) DEFAULT NULL COMMENT '成员关系',
  `content` varchar(1024) DEFAULT NULL COMMENT '修订内容',
  `book_id` int(11) DEFAULT NULL COMMENT '谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '卷id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '谱文修订记录表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族成员表*/
DROP TABLE IF EXISTS `family_member`;
CREATE TABLE `family_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `book_id` int(11) DEFAULT NULL COMMENT '来自哪个老谱的id',
  `volume_id` int(11) DEFAULT NULL COMMENT '来自哪个卷的id',
  `sub_clan_id` int(11) DEFAULT NULL COMMENT '老谱分支id',
  `family_member_code` varchar(100) DEFAULT NULL COMMENT '家族成员唯一编码: 家族id+成员名+世代号+父亲名或配偶名',
  `father_name` varchar(100) DEFAULT NULL COMMENT '父亲名称',
  `spouse_name` varchar(100) DEFAULT NULL COMMENT '配偶名称',
  `father_name_pinyin` varchar(100) DEFAULT NULL COMMENT '父亲名称拼音',
  `spouse_name_pinyin` varchar(100) DEFAULT NULL COMMENT '配偶名称拼音',
  `rel_keyword` varchar(100) DEFAULT NULL COMMENT '关系关键字',
  `member_surname` varchar(100) DEFAULT NULL COMMENT '成员姓',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `member_name_pinyin` varchar(100) DEFAULT NULL COMMENT '成员名称拼音',
  `member_gender` int(2) DEFAULT NULL COMMENT '成员性别，1：男，2：女',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '成员内容详情',
  `native_place` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `member_story` varchar(2048) DEFAULT NULL COMMENT '成员小传，不多于500字',
  `generation_num` int(11) DEFAULT NULL COMMENT '世代编号',
  `order_no` int(11) DEFAULT NULL COMMENT '成员顺序号',
  `sec_personal_name` varchar(100) DEFAULT NULL COMMENT '字',
  `mark` varchar(100) DEFAULT NULL COMMENT '号',
  `generation_word` varchar(100) DEFAULT NULL COMMENT '派语',
  `birthday_time` varchar(100) DEFAULT NULL COMMENT '出生日期',
  `deathday_time` varchar(100) DEFAULT NULL COMMENT '死亡日期',
  `buried_location` varchar(1024) DEFAULT NULL COMMENT '葬地',
  `son` varchar(100) DEFAULT NULL COMMENT '子',
  `daughter` varchar(100) DEFAULT NULL COMMENT '女',
  `ranking` int(4) DEFAULT NULL COMMENT '排行',
  `pre_relation_list` varchar(100) DEFAULT NULL COMMENT '前向关系链',
  `post_relation_list` varchar(100) DEFAULT NULL COMMENT '后向关系链',
  `rel_flag` int(4) DEFAULT '0' COMMENT '关系标识，默认为0：未找到关系，1为子与父关系，2为配与主关系',
  `pay_flag` int(4) DEFAULT '0' COMMENT '有手机端数据接入付费标志，默认为0：未接入，1：接入未付费，2：接入已付费',
  `audit_flag` int(4) DEFAULT '0' COMMENT '有手机端数据接入审核标识，默认为0：未接入，1：已接入，未审核，2：已接入，审核不通过，3：已接入，审核通过',
  `sub_family_flag` int(4) DEFAULT '0' COMMENT '分支始祖标识，默认为0：普通成员，1：分支始祖',
  `sub_family_code` varchar(512) DEFAULT NULL COMMENT '分支编码，初始是家族id；之后随着设置分支始祖分支编码会往后加，家族id+（“_”+分支id）+... ',
  `household_in_flag` int(4) DEFAULT '0' COMMENT '是否接入手机端家庭头结点的标识，默认为0：未接入家庭，1：已接入家庭',
  `household_in_time` varchar(100) DEFAULT NULL COMMENT '接入手机端家庭的时间',
  `source` int(4) DEFAULT '0' COMMENT '该成员最开始来源，默认为0：来自老谱，1:家族管理添加；2：来自手机端',
  `version_source` int(4) DEFAULT '0' COMMENT '该成员当前的版本来源，默认为0：来自老谱，1:来自手机端，2：都不是',
  `version_id` int(11) DEFAULT NULL COMMENT '如果是版本是老谱，那么id是谱书的id,如果版本是手机端，那么id是家庭id',
  `version_member_id` int(11) DEFAULT NULL COMMENT '如果是版本是老谱，那么id是老谱成员的id,如果版本是手机端，那么id是家庭成员id',
  `birthdate_type` int(2) DEFAULT '1' COMMENT '生辰类型 1：公历，2：农历',
  `relative_flag` int(2) DEFAULT '1' COMMENT '姻亲标志，1为亲，2为姻',
  `address_detail` varchar(512) DEFAULT NULL COMMENT '详细住址',
  `adoptout` int(2) DEFAULT '0' COMMENT '出继标志，默认为0',
  `adoptout_detail` varchar(512) DEFAULT NULL COMMENT '出继备注',
  `uxorilocal` int(2) DEFAULT '0' COMMENT '出赘标志，默认为0',
  `uxorilocal_detail` varchar(512) DEFAULT NULL COMMENT '出赘备注',
  `soninlaw` int(2) DEFAULT '0' COMMENT '招婿标志，默认为0',
  `soninlaw_detail` varchar(512) DEFAULT NULL COMMENT '招婿备注',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族成员表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族成员与老谱成员的关系表*/
DROP TABLE IF EXISTS `fm_cm_relation`;
CREATE TABLE `fm_cm_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_member_id` int(11) DEFAULT NULL COMMENT '家族成员的id',
  `family_member_code` varchar(255) DEFAULT NULL COMMENT '家族成员唯一标识',
  `cm_content_final_id` int(11) DEFAULT NULL COMMENT '老谱成员的id',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `book_id` int(11) DEFAULT NULL COMMENT '老谱的谱书id',
  `volume_id` int(11) DEFAULT NULL COMMENT '老谱的卷id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族成员与老谱成员的关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族成员关系表*/
DROP TABLE IF EXISTS `fm_relation`;
CREATE TABLE `fm_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `rel_type` int(4) DEFAULT NULL COMMENT '关系类型；1：子与父；2：配与主；3：',
  `ma_id` int(11) DEFAULT NULL COMMENT '成员A的id',
  `mb_id` int(11) DEFAULT NULL COMMENT '成员B的id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族成员关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家族成员与家庭成员的关系映射表*/
DROP TABLE IF EXISTS `fm_hm_relation`;
CREATE TABLE `fm_hm_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `family_member_id` int(11) DEFAULT NULL COMMENT '家族成员的id',
  `family_member_code` varchar(255) DEFAULT NULL COMMENT '家族成员唯一标识',
  `household_member_id` int(11) DEFAULT NULL COMMENT '家庭成员的id',
  `household_member_code` varchar(255) DEFAULT NULL COMMENT '家庭成员唯一标识',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `household_code` varchar(255) DEFAULT NULL COMMENT '家庭编码，hc+时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家族成员与家庭成员的关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*入家族的家庭待审核关系表*/
DROP TABLE IF EXISTS `household_in_audition`;
CREATE TABLE `household_in_audition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `sub_family_name` varchar(255) DEFAULT NULL COMMENT '分支名称',
  `sub_family_code` varchar(512) DEFAULT NULL COMMENT '分支编码',
  `family_member_id` int(11) DEFAULT NULL COMMENT '家庭接入家族的接入点人员在家族表中的id',
  `family_member_name` varchar(255) DEFAULT NULL COMMENT '家庭接入家族的接入点人员名称',
  `family_member_gm` int(4) DEFAULT '0' COMMENT '家庭接入家族的接入点人员的世代', 
  `family_name` varchar(255) DEFAULT NULL COMMENT '家族名称',
  `totem_address` varchar(1024) DEFAULT NULL COMMENT '图腾地址',
  `proposer` varchar(255) DEFAULT NULL COMMENT '提交人',
  `phone` varchar(255) DEFAULT NULL COMMENT '提交人联系方式',
  `pay_flag` int(4) DEFAULT '0' COMMENT '家庭是否付费，默认为0：未付费，1：已付费',
  `audit_flag` int(4) DEFAULT '0' COMMENT '审核状态，默认为0：提交审核中；1：审核不通过；2：审核通过',
  `conform_flag` int(4) DEFAULT '-1' COMMENT '查收状态，默认为-1：未支付；0：查收中；1：查收不通过；2：查收通过',
  `fail_reason` varchar(1024) DEFAULT NULL COMMENT '不通过原因',
  `total_money` varchar(100) DEFAULT 0 COMMENT '家庭入家族总费用，元',
  `receive_money` varchar(100) DEFAULT 0 COMMENT '实际收到总费用，元',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭入家族的待审核关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*入家族的成员审核表*/
DROP TABLE IF EXISTS `hm_in_audition`;
CREATE TABLE `hm_in_audition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `household_member_id` int(11) DEFAULT NULL COMMENT '家庭成员的id',
  `identity_no` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `household_in_flag` int(4) DEFAULT '0' COMMENT '接入点标识，默认为0：非接入点，1：此人为接入点',
  `main_flag` int(4) DEFAULT '0' COMMENT '户主标识，默认为0：非户主，1：此人为家庭的户主',
  `pay_flag` int(4) DEFAULT '0' COMMENT '缴费标识，默认为0：未缴费，1：已缴费',
  `in_money` varchar(100) DEFAULT 0 COMMENT '入家族收费钱数，元',
  `discounts` varchar(100) DEFAULT 0 COMMENT '优惠的钱数，元',
  `story_money` varchar(100) DEFAULT 0 COMMENT '小传缴费钱数，元',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭入家族的成员审核表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*微信用户相关信息表*/
DROP TABLE IF EXISTS `weixin_user_info`;
CREATE TABLE `weixin_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `openid` varchar(255) DEFAULT NULL COMMENT '百通谱微信公众号下用户的唯一标识',
  `subscribe` int(2) DEFAULT NULL COMMENT '关注状态（1是关注，0是未关注），未关注时获取不到其余信息',
  `subscribe_time` varchar(255) DEFAULT NULL COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
  `nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `surname` varchar(50) DEFAULT NULL COMMENT '姓',
  `sec_name` varchar(50) DEFAULT NULL COMMENT '名',
  `birthday` varchar(50) DEFAULT NULL COMMENT '生辰',
  `native_place` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `location` varchar(1024) DEFAULT NULL COMMENT '详细地址',
  `sex` int(2) DEFAULT NULL COMMENT '性别 （1是男性，2是女性，0是未知）',
  `country` varchar(100) DEFAULT NULL COMMENT '国家',
  `province` varchar(100) DEFAULT NULL COMMENT '省份',
  `city` varchar(100) DEFAULT NULL COMMENT '城市',
  `phone` varchar(100) DEFAULT NULL COMMENT '用户手机号',
  `identity_no` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `language` varchar(100) DEFAULT NULL COMMENT '用户的语言，简体中文为zh_CN',
  `headimgurl` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '微信用户相关信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭信息表*/
DROP TABLE IF EXISTS `household_info`;
CREATE TABLE `household_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `household_name` varchar(100) DEFAULT NULL COMMENT '家庭的名称',
  `household_code` varchar(100) DEFAULT NULL COMMENT '家庭编码，hc+时间',
  `open_id` varchar(255) DEFAULT NULL COMMENT '百通谱微信公众号下用户的唯一标识',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭支付信息表*/
DROP TABLE IF EXISTS `household_payment`;
CREATE TABLE `household_payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `family_id` int(11) DEFAULT NULL COMMENT '家族的id',
  `out_trade_no` varchar(255) DEFAULT NULL COMMENT '订单号',
  `money` varchar(255) DEFAULT NULL COMMENT '订单总价',
  `pay_done` int(2) DEFAULT '0' COMMENT '支付完成标识，默认为0：未支付，1：已支付',
  `invalid_flag` int(2) DEFAULT '1' COMMENT '有效标识，默认为1：有效，0：失效',
  `payment_way` int(2) DEFAULT NULL COMMENT '支付方式（1是支付接口，2是二维码）',
  `audition_id` int(11) DEFAULT NULL COMMENT '家庭审核的id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `application_id` int(11) DEFAULT NULL COMMENT '家庭申请的id',
  `ap_flag` int(2) DEFAULT '0' COMMENT '审核或申请，默认为0：审核，1：申请',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭支付信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭缴费图片记录信息表*/
DROP TABLE IF EXISTS `household_pay_evidence`;
CREATE TABLE `household_pay_evidence` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `evidence_address` varchar(1024) DEFAULT NULL COMMENT '支付凭证地址',
  `order_no` varchar(100) DEFAULT NULL COMMENT '订单编号',
  `payment_id` int(11) DEFAULT NULL COMMENT '家庭支付id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭缴费记录信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员信息表*/
DROP TABLE IF EXISTS `household_member`;
CREATE TABLE `household_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `household_member_code` varchar(255) DEFAULT NULL COMMENT '家庭成员唯一编码',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `household_code` varchar(255) DEFAULT NULL COMMENT '家庭编码，hc+时间',
  `father_name` varchar(100) DEFAULT NULL COMMENT '父亲名称',
  `mother_name` varchar(100) DEFAULT NULL COMMENT '母亲名称',
  `spouse_name` varchar(100) DEFAULT NULL COMMENT '配偶名称',
  `spouse_father_name` varchar(100) DEFAULT NULL COMMENT '姻父的名称',
  `spouse_detail` varchar(512) DEFAULT NULL COMMENT '姻方备注',
  `relation_name` varchar(100) DEFAULT NULL COMMENT '关系,家庭成员与户主的关系称呼',
  `relation_code` varchar(100) DEFAULT NULL COMMENT '关系编码,家庭成员与户主的关系称呼:myself：户主本人；spouse：配偶；bigbrother：兄；brother：弟；bigsister：姐；sister：妹；son：子；daughter：女；father：父；mother：母；grandfather：祖父；grandmother：祖母',
  `relation_del` varchar(100) DEFAULT NULL COMMENT '关系附属，配偶：原配、继配、再配；其他：亲生、收养、过继、认义',
  `member_surname` varchar(100) DEFAULT NULL COMMENT '成员姓',
  `member_name` varchar(100) DEFAULT NULL COMMENT '成员名',
  `other_name` varchar(50) DEFAULT NULL COMMENT '又名',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '别名',
  `sec_personal_name` varchar(50) DEFAULT NULL COMMENT '字',
  `other_personal_name` varchar(50) DEFAULT NULL COMMENT '又字',
  `nick_personal_name` varchar(50) DEFAULT NULL COMMENT '别字',
  `mark` varchar(50) DEFAULT NULL COMMENT '号',
  `other_mark` varchar(50) DEFAULT NULL COMMENT '又号',
  `nick_mark` varchar(50) DEFAULT NULL COMMENT '别号',
  `marriage` varchar(100) DEFAULT NULL COMMENT '婚姻关系',
  `live_place` varchar(512) DEFAULT NULL COMMENT '住址',
  `marry_time` varchar(100) DEFAULT NULL COMMENT '结婚日期',
  `marry_flag` int(2) DEFAULT '0' COMMENT '是否婚配，默认为0：否',
  `pregnent_flag` int(2) DEFAULT '0' COMMENT '是否怀孕，默认为0：否',
  `moveout_flag` int(2) DEFAULT '0' COMMENT '是否外迁，默认为0：否',
  `moveout_place` varchar(512) DEFAULT NULL COMMENT '外迁地址',
  `comment` varchar(512) DEFAULT NULL COMMENT '线引备注',
  `other_comment` varchar(512) DEFAULT NULL COMMENT '其他',
  `woman_sec_marry_flag` int(2) DEFAULT '0' COMMENT '女方是否二婚，默认为0：否',
  `sec_marry_flag` int(2) DEFAULT '0' COMMENT '男方是否二婚，默认为0：否',
  `divorce_flag` int(2) DEFAULT '0' COMMENT '是否离异，默认为0：否',
  `relative_flag` int(2) DEFAULT '1' COMMENT '姻亲标志，1为亲，2为姻',
  `educate_experience` varchar(512) DEFAULT NULL COMMENT '教育经历，格式：前端自定义，能够正常显示即可，是否在读 学历  学校名称     ',
  `career` varchar(512) DEFAULT NULL COMMENT '职业经历，格式：前端自定义，能够正常显示即可，行业 单位  职务     ',
  `native_place` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '成员内容详情',
  `member_story` varchar(2048) DEFAULT NULL COMMENT '成员小传，不多于20字',
  `member_story_level` int(4) DEFAULT '1' COMMENT '成员小传档位，默认为1挡：20字以内；',
  `member_gender` int(2) DEFAULT NULL COMMENT '成员性别，1：男，2：女',
  `head_image` varchar(2048) DEFAULT NULL COMMENT '头像地址',
  `generation_num` int(11) DEFAULT NULL COMMENT '世代编号',
  `generation_level` varchar(100) DEFAULT NULL COMMENT '代际',
  `generation_level_code` int(2) DEFAULT NULL COMMENT '代际编码，1：高祖，2：曾祖，3：祖父，4：父亲，5：自己，6：子辈',
  `generation_word` varchar(100) DEFAULT NULL COMMENT '派语',
  `identity_no` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `birthday_time` varchar(100) DEFAULT NULL COMMENT '出生日期--完整字符串 1990-01-02 15',
  `lunar_birthday_time` varchar(100) DEFAULT NULL COMMENT '农历出生日期--完整字符串 1990-01-02 15',
  `birthday_time_tra` varchar(255) DEFAULT NULL COMMENT '出生日期--翻译年月日 时',
  `birthday_year` varchar(100) DEFAULT NULL COMMENT '出生日期-年-数字，如1990',
  `birthday_year_tra` varchar(255) DEFAULT NULL COMMENT '出生日期-年-翻译，如民国xx年，乾隆二十年',
  `deathday_time` varchar(100) DEFAULT NULL COMMENT '死亡日期--完整字符串 1990-01-02 15',
  `lunar_deathday_time` varchar(100) DEFAULT NULL COMMENT '农历死亡日期--完整字符串 1990-01-02 15',
  `deathday_time_tra` varchar(255) DEFAULT NULL COMMENT '死亡日期--翻译年月日 时',
  `deathday_year` varchar(100) DEFAULT NULL COMMENT '死亡日期-年-数字，如1990',
  `deathday_year_tra` varchar(255) DEFAULT NULL COMMENT '死亡日期-年-翻译，如民国xx年，乾隆二十年',
  `buried_location` varchar(1024) DEFAULT NULL COMMENT '葬地',
  `pre_relation_list` varchar(100) DEFAULT NULL COMMENT '前向关系链',
  `post_relation_list` varchar(100) DEFAULT NULL COMMENT '后向关系链',
  `birthdate_type` int(2) DEFAULT '1' COMMENT '生辰类型 1：公历，2：农历',
  `birthdate_monthtype` int(2) DEFAULT '0' COMMENT '生辰是否闰月，默认为0,不是闰月，1：为闰月',
  `deathdate_monthtype` int(2) DEFAULT '0' COMMENT '卒辰是否闰月，默认为0,不是闰月，1：为闰月',
  `address_detail` varchar(512) DEFAULT NULL COMMENT '详细住址',
  `adoptout` int(2) DEFAULT '0' COMMENT '出继标志，默认为0',
  `adoptout_detail` varchar(512) DEFAULT NULL COMMENT '出继备注',
  `uxorilocal` int(2) DEFAULT '0' COMMENT '出赘标志，默认为0',
  `uxorilocal_detail` varchar(512) DEFAULT NULL COMMENT '出赘备注',
  `soninlaw` int(2) DEFAULT '0' COMMENT '招婿标志，默认为0',
  `soninlaw_detail` varchar(512) DEFAULT NULL COMMENT '招婿备注',
  `ranking` int(4) DEFAULT NULL COMMENT '排行',
  `rel_flag` int(4) DEFAULT '0' COMMENT '关系标识，默认为0：未找到关系，1:子与父关系，2:配与主关系',
  `alive_status` int(4) DEFAULT '1' COMMENT '成员状态，默认为1：健在，0：已故',
  `center_member_id` int(11) DEFAULT NULL COMMENT '存储id',
  `center_relation_code` varchar(100) DEFAULT NULL COMMENT '存储关系代码用比如F/G',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员关系表*/
DROP TABLE IF EXISTS `hm_relation`;
CREATE TABLE `hm_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `rel_type` int(4) DEFAULT NULL COMMENT '关系类型；1：子与父；2：配与主；',
  `ma_id` int(11) DEFAULT NULL COMMENT '成员A的id',
  `mb_id` int(11) DEFAULT NULL COMMENT '成员B的id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*错误信息*/
DROP TABLE IF EXISTS `error_info`;
CREATE TABLE `error_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `openid` varchar(50) DEFAULT NULL COMMENT '微信的openid',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `error_content` varchar(512) DEFAULT NULL COMMENT '错误描述',
  `error_type` int(4) DEFAULT NULL COMMENT '错误类型，1）系统功能，2）老谱词条内容，3）家庭词条内容，4）家庭关系错误',
  `error_status` int(4) DEFAULT '0' COMMENT '错误状态，默认为0：未处理，1：已处理，2：忽略',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '错误信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*错误信息的图地址*/
DROP TABLE IF EXISTS `error_picture_list`;
CREATE TABLE `error_picture_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `error_id` int(11) DEFAULT NULL COMMENT '错误id',
  `picture_address` varchar(512) DEFAULT NULL COMMENT '图的相对地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '图管理信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*谱书开放名单表*/
DROP TABLE IF EXISTS `open_list`;
CREATE TABLE `open_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设置id',
  `book_id` int(11) DEFAULT NULL COMMENT '老谱id',
  `phone` varchar(50) DEFAULT '40' COMMENT '电话号码',
  `name` varchar(50) DEFAULT NULL COMMENT '成员名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '谱书开放名单表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (1,'胡','HU',1,NULL,'2019-01-24 13:14:02','2019-01-24 13:14:02');
INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (2,'余','YU',1,NULL,'2019-01-24 13:59:53','2019-01-24 13:59:53');

INSERT INTO `service_center` (`id`,`icon_address`,`service_no`,`service_code`,`service_name`,`service_pay_type`,`service_intro`,`price_unit`,`time_unit`,`measure_unit`,`discount`,`price`,`conf_type`,`conf_framework`,`internal_flag`,`use_flag`,`create_time`,`update_time`) VALUES (1,'imp\\uploadBDPImage\\servicecenter\\微信图片_20190122120527-20190124171311.png','FS20190124171435','collectioncharge','代收费服务',NULL,'为家族提供代收费服务，即每个家庭每个人需要交纳一定费用到家族理事会','1','6','1','1','11','1','',1,1,'2019-01-24 17:14:35','2019-01-28 20:39:57');
INSERT INTO `service_center` (`id`,`icon_address`,`service_no`,`service_code`,`service_name`,`service_pay_type`,`service_intro`,`price_unit`,`time_unit`,`measure_unit`,`discount`,`price`,`conf_type`,`conf_framework`,`internal_flag`,`use_flag`,`create_time`,`update_time`) VALUES (2,'imp\\uploadBDPImage\\servicecenter\\微信图片_20190122120538-20190124181536.png','FS20190124181702','multiplecharge','小传字数收费',NULL,'每个家庭成员的小传字数收费，由家族理事会制定收费规则','1','6','1','1','0','2','',1,0,'2019-01-24 18:17:02','2019-01-28 20:40:19');

/*制谱系统表*/
/*图文类型表*/
DROP TABLE IF EXISTS `teletext_type`;
CREATE TABLE `teletext_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `type_name` varchar(100) DEFAULT NULL COMMENT '类型名称',
  `pin_yin` varchar(100) DEFAULT NULL COMMENT '拼音',
  `introduction` varchar(1024) DEFAULT NULL COMMENT '说明',
  `order_no` int(4) DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '图文类型表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*图文中心表*/
DROP TABLE IF EXISTS `teletext_center`;
CREATE TABLE `teletext_center` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `type_id` int(11) DEFAULT NULL COMMENT '图文类型id',
  `inscribe` varchar(512) DEFAULT NULL COMMENT '落款',
  `author` varchar(1024) DEFAULT NULL COMMENT '作者',
  `order_no` int(4) DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '图文中心表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*图文信息表*/
DROP TABLE IF EXISTS `teletext_info`;
CREATE TABLE `teletext_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `center_id` int(11) DEFAULT NULL COMMENT '图文中心id',
  `pic_type` int(4) DEFAULT '0' COMMENT '图片展示类型，默认为0，1:通栏；2：留白；3：半宽；4：全屏',
  `pic_addr` varchar(1024) DEFAULT NULL COMMENT '图片地址',
  `pic_content` varchar(1024) DEFAULT NULL COMMENT '图片内容',
  `order_no` int(4) DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '图文信息表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*关键字配置表*/
DROP TABLE IF EXISTS `keywords_config`;
CREATE TABLE `keywords_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `keywords_name` varchar(100) DEFAULT NULL COMMENT '关键字名称',
  `keywords_code` varchar(100) DEFAULT NULL COMMENT '关键字编码',
  `keywords_value` varchar(2048) DEFAULT NULL COMMENT '关键字内容',
  `book_id` int(11) DEFAULT NULL COMMENT '族谱书id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '关键字配置表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `bdp`.`keywords_config` (`keywords_name`, `keywords_code`, `keywords_value`, `book_id`) VALUES ('儿子关键字', 'SON_KEYWORD', '無子,之子,從子,长子,長子,次子,十一子,十二子,一子,二子,三子,四子,五子,六子,七子,八子,九子,十子,繼子,撫子,養子,祧子,祧孫', '0');
INSERT INTO `bdp`.`keywords_config` (`keywords_name`, `keywords_code`, `keywords_value`, `book_id`) VALUES ('女儿关键字', 'DAUGHTER_KEYWORD', '之女,长女,長女,次女,一女,二女,三女,四女,五女,六女,七女,八女,九女,繼女,養女', '0');
INSERT INTO `bdp`.`keywords_config` (`keywords_name`, `keywords_code`, `keywords_value`, `book_id`) VALUES ('丈夫关键字', 'HUSBAND_KEYWORD', '赘夫,赘娶,赘男,赘婿', '0');
INSERT INTO `bdp`.`keywords_config` (`keywords_name`, `keywords_code`, `keywords_value`, `book_id`) VALUES ('妻子关键字', 'WIFE_KEYWORD', '原配,元配,二配,次配,繼配,继配,续配,續配,續娶,再配,三配,四配,配,聘,副室,继室,再继,继,繼娶,再娶,元娶,娶,贅,庶', '0');

/*家庭信息采集汇总表*/
DROP TABLE IF EXISTS `household_gathering_card`;
CREATE TABLE `household_gathering_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `sub_family_id` int(11) DEFAULT NULL COMMENT '家族分支id',
  `family_member_id` int(11) DEFAULT NULL COMMENT '家族成员id',
  `household_code` varchar(100) DEFAULT NULL COMMENT '家庭编号',
  `householder` varchar(50) DEFAULT NULL COMMENT '户主名',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `clanbook_name` varchar(100) DEFAULT NULL COMMENT '谱名',
  `subclan_name` varchar(100) DEFAULT NULL COMMENT '所属分支',
  `relation` varchar(100) DEFAULT NULL COMMENT '关系',
  `gathering_number_main` varchar(100) DEFAULT NULL COMMENT '采集人数，--亲',
  `gathering_number_minor` varchar(100) DEFAULT NULL COMMENT '采集人数，--姻',
  `gathering_date` varchar(100) DEFAULT NULL COMMENT '采集日期-年月日',
  `area` varchar(255) DEFAULT NULL COMMENT '区域：省市县区',
  `address_detail` varchar(1024) DEFAULT NULL COMMENT '详细地址',
  `householder_signature` varchar(100) DEFAULT NULL COMMENT '签名：户主',
  `gathering_signature` varchar(100) DEFAULT NULL COMMENT '签名：采集',
  `area_leader_signature` varchar(100) DEFAULT NULL COMMENT '签名：区域负责人',
  `contenter_signature` varchar(100) DEFAULT NULL COMMENT '签名：齿录',
  `checkup_signature` varchar(100) DEFAULT NULL COMMENT '签名：校对',
  `final_editer_signature` varchar(100) DEFAULT NULL COMMENT '签名：终审编委',
  `status` int(2) DEFAULT '1' COMMENT '状态（1待补充2待确定3定稿）,默认为1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭信息采集汇总表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭个人信息采集表*/
DROP TABLE IF EXISTS `hm_gathering_card`;
CREATE TABLE `hm_gathering_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `hgc_id` int(11) DEFAULT NULL COMMENT '家庭信息采集汇总id',
  `bloody_flag` int(2) DEFAULT NULL COMMENT '血缘标志，1：亲；2：姻',
  `household_code` varchar(100) DEFAULT NULL COMMENT '家庭编号',
  `member_name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `gender` int(2) DEFAULT NULL COMMENT '性别，1：男；2：女',
  `ranking` int(4) DEFAULT '1' COMMENT '排行--亲,默认为1',
  `pregnant` int(2) DEFAULT NULL COMMENT '怀孕--亲姻，0：未怀孕，1：已怀孕',
  `sec_name` varchar(50) DEFAULT NULL COMMENT '字--亲',
  `mark_name` varchar(50) DEFAULT NULL COMMENT '号--亲',
  `father_name` varchar(50) DEFAULT NULL COMMENT '父亲名--亲姻',
  `mother_name` varchar(50) DEFAULT NULL COMMENT '母亲名--亲',
  `spouse_name` varchar(50) DEFAULT NULL COMMENT '配偶名--姻',
  `married_date` varchar(50) DEFAULT NULL COMMENT '结婚日期--姻',
  `birth_type` int(2) DEFAULT NULL COMMENT '生辰类型；1：阳历；2：农历',
  `birth_date` varchar(50) DEFAULT NULL COMMENT '出生时间，详细',
  `be_birth_leap_month` int(2) DEFAULT NULL COMMENT '生辰，是否闰月，0：否，1：是',
  `inherit` int(2) DEFAULT NULL COMMENT '继承--亲，1：血缘，2：过继，3：抚养，4：认义，5：其它',
  `marriage` int(2) DEFAULT NULL COMMENT '婚姻--姻，1：嫁娶，2：入赘，3：霜赘，',
  `inherit_comment` varchar(50) DEFAULT NULL COMMENT '继承的备注--亲',
  `education` varchar(1024) DEFAULT NULL COMMENT '教育--亲',
  `career` varchar(1024) DEFAULT NULL COMMENT '从业--亲',
  `chu_ji` varchar(50) DEFAULT NULL COMMENT '出继--亲',
  `chu_zhui` varchar(50) DEFAULT NULL COMMENT '出赘--亲',
  `recruit_admitted` int(2) DEFAULT NULL COMMENT '招婿，1：招婿，0：未招婿--亲',
  `external_migration` varchar(100) DEFAULT NULL COMMENT '外迁--亲',
  `line_guide_note` varchar(100) DEFAULT NULL COMMENT '线引备注--亲',
  `ma_area` varchar(255) DEFAULT NULL COMMENT '母家地址：省市县区--姻',
  `ma_address_detail` varchar(1024) DEFAULT NULL COMMENT '母家地址：详细地址--姻',
  `be_devoice` int(2) DEFAULT NULL COMMENT '是否离异--姻；0：否；1：是',
  `death_type` int(2) DEFAULT NULL COMMENT '卒辰类型；1：阳历；2：农历',
  `death_date` varchar(50) DEFAULT NULL COMMENT '死亡时间，详细',
  `be_death_leap_month` int(2) DEFAULT NULL COMMENT '卒辰，是否闰月，0：否，1：是',
  `buried_place` varchar(500) DEFAULT NULL COMMENT '葬地山向',
  `story` varchar(1024) DEFAULT NULL COMMENT '小传',
  `other_content` varchar(1024) DEFAULT NULL COMMENT '其他',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭个人信息采集表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*关系称呼表*/
DROP TABLE IF EXISTS `relationship_call`;
CREATE TABLE `relationship_call` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `code` varchar(100) DEFAULT NULL COMMENT '称呼代号',
  `post_codes` varchar(100) DEFAULT NULL COMMENT '反向称呼代号，多个用逗号隔开，逗号两边的字符串用单引号包裹',
  `relation_code` varchar(2048) DEFAULT NULL COMMENT '英文称呼',
  `relation_codeCN` varchar(100) DEFAULT NULL COMMENT '中文称呼',
  `generation_level_code` int(4) DEFAULT '1' COMMENT '世代级别，数字',
  `generation_level` varchar(100) DEFAULT NULL COMMENT '世代说明',
  `relation_type` int(4) DEFAULT '1' COMMENT '类型，1亲2姻，默认为1',
  `gender_type` int(4) DEFAULT '1' COMMENT '性别类型，1男男2男女3男女4女男，默认为1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '关系称呼表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*文章节点*/
DROP TABLE IF EXISTS `node`;
CREATE TABLE `node` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `title_type` int(2) DEFAULT '1' COMMENT '标题类型,1文字2图片3图文，默认为1',
  `sub_title` varchar(300) DEFAULT NULL COMMENT '副标题',
  `cover` varchar(1024) DEFAULT NULL COMMENT '封面图',
  `node_type_id` int(11) DEFAULT '1' COMMENT '类型id,1杂2序言/谱序3个人传记4后记5谱跋6像赞7祭文，默认为1',
  `keyword` varchar(300) DEFAULT NULL COMMENT '关键词',
  `summary` varchar(2048) DEFAULT NULL COMMENT '摘要',
  `section_id` int(11) DEFAULT NULL COMMENT '章节id',
  `catalogue_id` int(11) DEFAULT NULL COMMENT '目录id',
  `book_id` int(11) DEFAULT NULL COMMENT '书id',
  `author` varchar(300) DEFAULT NULL COMMENT '作者',
  `img_title` varchar(300) DEFAULT NULL COMMENT '图片标题',
  `inscribe` varchar(300) DEFAULT NULL COMMENT '落款',
  `inscribe_time` varchar(100) DEFAULT NULL COMMENT '撰写时间',
  `inscribe_style` varchar(512) DEFAULT NULL COMMENT '排列样式',
  `online_time` varchar(100) DEFAULT NULL COMMENT '上线时间，为空表示下线，默认为空',
  `view_count` int(11) DEFAULT NULL COMMENT '浏览量',
  `comment_count` int(11) DEFAULT NULL COMMENT '评论量',
  `creater_id` int(11) DEFAULT NULL COMMENT '记录创建者id',
  `audit_result` int(11) DEFAULT '1' COMMENT '审核结果,1待审核2审核不通过3审核通过，默认为1',
  `style_name` varchar(512) DEFAULT NULL COMMENT '样式名',
  `tpl_name` varchar(512) DEFAULT NULL COMMENT '模板名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '文章节点表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*节点内容*/
DROP TABLE IF EXISTS `node_content`;
CREATE TABLE `node_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `content_type` int(11) DEFAULT '1' COMMENT '类型， 1杂2文字3图片，默认为1',
  `show_type` int(11) DEFAULT '1' COMMENT '展示类型，1杂2通栏3留白4原始大小，默认为1',
  `content_title` varchar(512) DEFAULT NULL COMMENT '内容标题',
  `img_url` text COMMENT '图片路径',
  `content` text COMMENT '文字内容',
  `order_number` int(11) DEFAULT NULL COMMENT '排序',
  `node_id` int(11) DEFAULT NULL COMMENT '所属文章id',
  `creater_id` int(11) DEFAULT NULL COMMENT '记录创建者id',
  `audit_result` int(11) DEFAULT '1' COMMENT '审核结果,1待审核2审核不通过3审核通过，默认为1',
  `style_name` varchar(512) DEFAULT NULL COMMENT '样式名',
  `tpl_name` varchar(512) DEFAULT NULL COMMENT '模板名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '文章节点表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*汉字字典表*/
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `img_url` varchar(2048) COMMENT '图片路径',
  `unicode` varchar(100) DEFAULT NULL COMMENT '万国码',
  `spell` varchar(100) DEFAULT NULL COMMENT '拼音',
  `pronounce` varchar(100) DEFAULT NULL COMMENT '注音',
  `stroke` varchar(100) DEFAULT NULL COMMENT '笔画',
  `stroke_order` varchar(100) DEFAULT NULL COMMENT '笔顺',
  `radical_stroke` varchar(100) DEFAULT NULL COMMENT '偏旁',
  `radical` varchar(100) DEFAULT NULL COMMENT '偏旁笔画',
  `construct` varchar(100) DEFAULT NULL COMMENT '统一分解',
  `construct_spell` varchar(100) DEFAULT NULL COMMENT '统一分解注音',
  `unnormal_construct` varchar(100) DEFAULT NULL COMMENT '个性化分解',
  `explanation` varchar(100) DEFAULT NULL COMMENT '说文解字',
  `font_type` varchar(100) DEFAULT NULL COMMENT '字体类型',
  `mapping` varchar(100) DEFAULT NULL COMMENT '繁简转换字',
  `mapping_stroke` varchar(100) DEFAULT NULL COMMENT '转换字笔画',
  `mapping_radical_stroke` varchar(100) DEFAULT NULL COMMENT '转换字偏旁',
  `mapping_radical` varchar(100) DEFAULT NULL COMMENT '转换字偏旁笔画',
  `normal` int(2) DEFAULT '0' COMMENT '是否为常用字，0:否，1：是，默认0',
  `name_subject` int(2) DEFAULT '0' COMMENT '姓名学，0:否，1：是，默认0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '汉字字典表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*加入家族申请表*/
DROP TABLE IF EXISTS `joinfm_application`;
CREATE TABLE `joinfm_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `application_type` int(4) DEFAULT '1' COMMENT '申请类型， 1直接申请，2委托寻根，默认为1',
  `clan_member__id` int(11) DEFAULT NULL COMMENT '谱成员id',
  `hm_id_list` varchar(1024) DEFAULT NULL COMMENT '家庭入谱成员ID列表字符串，用","分割',
  `surname_id` int(11) DEFAULT NULL COMMENT '姓氏id，',
  `surname` varchar(512) DEFAULT NULL COMMENT '姓氏名称',
  `family_id` int(11) DEFAULT NULL COMMENT '家族id',
  `family_name` varchar(512) DEFAULT NULL COMMENT '家族名称',
  `hm_id` int(11) DEFAULT NULL COMMENT '家庭成员id，',
  `hm_name` varchar(512) DEFAULT NULL COMMENT '家庭成员名称',
  `household_id` int(11) DEFAULT NULL COMMENT '申请的家庭id，',
  `paid_flag` int(4) DEFAULT '1' COMMENT '是否完成付款， 0未付款，1已付款，默认为0',
  `audit_result` int(4) DEFAULT '0' COMMENT '审核结果， 0未通过，1通过，默认为0',
  `reason` varchar(512) DEFAULT NULL COMMENT '原因',
  `auditor` varchar(512) DEFAULT NULL COMMENT '审核人',
  `comments` varchar(512) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '加入家族申请表'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
