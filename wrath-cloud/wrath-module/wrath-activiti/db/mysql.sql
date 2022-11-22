INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000043, 0, '', 0, 'icon-cluster', '', 2, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000044, 1067246875800000043, 'activiti/process', 0, 'icon-detail', 'sys:process:all', 0, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000045, 1067246875800000043, 'activiti/model', 0, 'icon-appstore-fill', 'sys:model:all', 1, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000046, 1067246875800000043, 'activiti/running', 0, 'icon-play-square', 'sys:running:all', 2, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176004047773671425, 1067246875800000043, 'activiti/process-initiation', 0, 'icon-play-square', 'sys:process:all', 0, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176004381581549569, 0, '', 0, 'icon-user', '', 3, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176005336624570370, 1176004381581549569, 'activiti/demo/correction', 0, 'icon-issuesclose', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 0, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176006162176843777, 1176004381581549569, 'activiti/my-todo-task', 0, 'icon-dashboard', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 1, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176009642778075138, 1176004381581549569, 'activiti/my-apply', 0, 'icon-edit-square', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 2, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176010201362898946, 1176004381581549569, 'activiti/my-join-task', 0, 'icon-check-square', 'sys:his:all', 3, 0, 1067246875800000001, now(), 1067246875800000001, now());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176011679628566530, 1176004381581549569, 'activiti/my-todo-task-pool', 0, 'icon-interation', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 4, 0, 1067246875800000001, now(), 1067246875800000001, now());

INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000043, 'name', 'Work Process', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000043, 'name', '工作流程', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000043, 'name', '工作流程', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000044, 'name', 'Process Management', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000044, 'name', '流程管理', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000044, 'name', '流程管理', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000045, 'name', 'Model Management', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000045, 'name', '模型管理', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000045, 'name', '模型管理', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000046, 'name', 'Running Process', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000046, 'name', '运行中的流程', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1067246875800000046, 'name', '運行中的流程', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004047773671425, 'name', 'Initiation Process', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004047773671425, 'name', '发起流程', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004047773671425, 'name', '發起流程', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004381581549569, 'name', 'Personal Office', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004381581549569, 'name', '个人办公', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176004381581549569, 'name', '個人辦公', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176005336624570370, 'name', 'Correction Request', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176005336624570370, 'name', '转正申请', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176005336624570370, 'name', '轉正申請', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176006162176843777, 'name', 'My To-do', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176006162176843777, 'name', '我的待办', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176006162176843777, 'name', '我的待辦', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176009642778075138, 'name', 'My Application', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176009642778075138, 'name', '我的申请', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176009642778075138, 'name', '我的申請', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176010201362898946, 'name', 'Task Already', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176010201362898946, 'name', '已办任务', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176010201362898946, 'name', '已辦任務', 'zh-TW');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176011679628566530, 'name', 'To Be Signed', 'en-US');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176011679628566530, 'name', '待签收任务', 'zh-CN');
INSERT INTO sys_language(table_name, table_id, field_name, field_value, language) VALUES ('sys_menu', 1176011679628566530, 'name', '待簽收任務', 'zh-TW');

CREATE TABLE tb_process_biz_route (
  id bigint(20) NOT NULL COMMENT 'id',
  proc_def_id varchar(64) NOT NULL COMMENT '流程定义ID',
  biz_route varchar(255) NOT NULL COMMENT '业务路由',
  proc_def_key varchar(255) COMMENT '流程定义KEY',
  version int COMMENT '版本号',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 COMMENT='工作流业务路由';

CREATE TABLE tb_correction (
   id bigint(20) NOT NULL COMMENT 'id',
   apply_post varchar(255) COMMENT '申请岗位',
   entry_date datetime COMMENT '入职日期',
   correction_date datetime COMMENT '转正日期',
   work_content varchar(2000) COMMENT '工作内容',
   achievement varchar(2000) COMMENT '工作成绩',
   instance_id varchar(80) COMMENT '实例ID',
   creator bigint COMMENT '创建者',
   create_date datetime COMMENT '创建时间',
   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 COMMENT='转正申请';



create table ACT_GE_PROPERTY (
  NAME_ varchar(64),
  VALUE_ varchar(300),
  REV_ integer,
  primary key (NAME_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

insert into ACT_GE_PROPERTY
values ('schema.version', '5.22.0.0', 1);

insert into ACT_GE_PROPERTY
values ('schema.history', 'create(5.22.0.0)', 1);

insert into ACT_GE_PROPERTY
values ('next.dbid', '1', 1);

create table ACT_GE_BYTEARRAY (
  ID_ varchar(64),
  REV_ integer,
  NAME_ varchar(255),
  DEPLOYMENT_ID_ varchar(64),
  BYTES_ LONGBLOB,
  GENERATED_ TINYINT,
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RE_DEPLOYMENT (
  ID_ varchar(64),
  NAME_ varchar(255),
  CATEGORY_ varchar(255),
  TENANT_ID_ varchar(255) default '',
  DEPLOY_TIME_ timestamp(3) NULL,
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RE_MODEL (
  ID_ varchar(64) not null,
  REV_ integer,
  NAME_ varchar(255),
  KEY_ varchar(255),
  CATEGORY_ varchar(255),
  CREATE_TIME_ timestamp(3) null,
  LAST_UPDATE_TIME_ timestamp(3) null,
  VERSION_ integer,
  META_INFO_ varchar(4000),
  DEPLOYMENT_ID_ varchar(64),
  EDITOR_SOURCE_VALUE_ID_ varchar(64),
  EDITOR_SOURCE_EXTRA_VALUE_ID_ varchar(64),
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_EXECUTION (
  ID_ varchar(64),
  REV_ integer,
  PROC_INST_ID_ varchar(64),
  BUSINESS_KEY_ varchar(255),
  PARENT_ID_ varchar(64),
  PROC_DEF_ID_ varchar(64),
  SUPER_EXEC_ varchar(64),
  ACT_ID_ varchar(255),
  IS_ACTIVE_ TINYINT,
  IS_CONCURRENT_ TINYINT,
  IS_SCOPE_ TINYINT,
  IS_EVENT_SCOPE_ TINYINT,
  SUSPENSION_STATE_ integer,
  CACHED_ENT_STATE_ integer,
  TENANT_ID_ varchar(255) default '',
  NAME_ varchar(255),
  LOCK_TIME_ timestamp(3) NULL,
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_JOB (
  ID_ varchar(64) NOT NULL,
  REV_ integer,
  TYPE_ varchar(255) NOT NULL,
  LOCK_EXP_TIME_ timestamp(3) NULL,
  LOCK_OWNER_ varchar(255),
  EXCLUSIVE_ boolean,
  EXECUTION_ID_ varchar(64),
  PROCESS_INSTANCE_ID_ varchar(64),
  PROC_DEF_ID_ varchar(64),
  RETRIES_ integer,
  EXCEPTION_STACK_ID_ varchar(64),
  EXCEPTION_MSG_ varchar(4000),
  DUEDATE_ timestamp(3) NULL,
  REPEAT_ varchar(255),
  HANDLER_TYPE_ varchar(255),
  HANDLER_CFG_ varchar(4000),
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RE_PROCDEF (
  ID_ varchar(64) not null,
  REV_ integer,
  CATEGORY_ varchar(255),
  NAME_ varchar(255),
  KEY_ varchar(255) not null,
  VERSION_ integer not null,
  DEPLOYMENT_ID_ varchar(64),
  RESOURCE_NAME_ varchar(4000),
  DGRM_RESOURCE_NAME_ varchar(4000),
  DESCRIPTION_ varchar(4000),
  HAS_START_FORM_KEY_ TINYINT,
  HAS_GRAPHICAL_NOTATION_ TINYINT,
  SUSPENSION_STATE_ integer,
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_TASK (
  ID_ varchar(64),
  REV_ integer,
  EXECUTION_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  PROC_DEF_ID_ varchar(64),
  NAME_ varchar(255),
  PARENT_TASK_ID_ varchar(64),
  DESCRIPTION_ varchar(4000),
  TASK_DEF_KEY_ varchar(255),
  OWNER_ varchar(255),
  ASSIGNEE_ varchar(255),
  DELEGATION_ varchar(64),
  PRIORITY_ integer,
  CREATE_TIME_ timestamp(3) NULL,
  DUE_DATE_ datetime(3),
  CATEGORY_ varchar(255),
  SUSPENSION_STATE_ integer,
  TENANT_ID_ varchar(255) default '',
  FORM_KEY_ varchar(255),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_IDENTITYLINK (
  ID_ varchar(64),
  REV_ integer,
  GROUP_ID_ varchar(255),
  TYPE_ varchar(255),
  USER_ID_ varchar(255),
  TASK_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  PROC_DEF_ID_ varchar(64),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_VARIABLE (
  ID_ varchar(64) not null,
  REV_ integer,
  TYPE_ varchar(255) not null,
  NAME_ varchar(255) not null,
  EXECUTION_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  TASK_ID_ varchar(64),
  BYTEARRAY_ID_ varchar(64),
  DOUBLE_ double,
  LONG_ bigint,
  TEXT_ varchar(4000),
  TEXT2_ varchar(4000),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_RU_EVENT_SUBSCR (
  ID_ varchar(64) not null,
  REV_ integer,
  EVENT_TYPE_ varchar(255) not null,
  EVENT_NAME_ varchar(255),
  EXECUTION_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  ACTIVITY_ID_ varchar(64),
  CONFIGURATION_ varchar(255),
  CREATED_ timestamp(3) not null DEFAULT CURRENT_TIMESTAMP(3),
  PROC_DEF_ID_ varchar(64),
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_EVT_LOG (
  LOG_NR_ bigint auto_increment,
  TYPE_ varchar(64),
  PROC_DEF_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  EXECUTION_ID_ varchar(64),
  TASK_ID_ varchar(64),
  TIME_STAMP_ timestamp(3) not null,
  USER_ID_ varchar(255),
  DATA_ LONGBLOB,
  LOCK_OWNER_ varchar(255),
  LOCK_TIME_ timestamp(3) null,
  IS_PROCESSED_ tinyint default 0,
  primary key (LOG_NR_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_PROCDEF_INFO (
  ID_ varchar(64) not null,
  PROC_DEF_ID_ varchar(64) not null,
  REV_ integer,
  INFO_JSON_ID_ varchar(64),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create index ACT_IDX_EXEC_BUSKEY on ACT_RU_EXECUTION(BUSINESS_KEY_);
create index ACT_IDX_TASK_CREATE on ACT_RU_TASK(CREATE_TIME_);
create index ACT_IDX_IDENT_LNK_USER on ACT_RU_IDENTITYLINK(USER_ID_);
create index ACT_IDX_IDENT_LNK_GROUP on ACT_RU_IDENTITYLINK(GROUP_ID_);
create index ACT_IDX_EVENT_SUBSCR_CONFIG_ on ACT_RU_EVENT_SUBSCR(CONFIGURATION_);
create index ACT_IDX_VARIABLE_TASK_ID on ACT_RU_VARIABLE(TASK_ID_);
create index ACT_IDX_ATHRZ_PROCEDEF on ACT_RU_IDENTITYLINK(PROC_DEF_ID_);
create index ACT_IDX_INFO_PROCDEF on ACT_PROCDEF_INFO(PROC_DEF_ID_);

alter table ACT_GE_BYTEARRAY
  add constraint ACT_FK_BYTEARR_DEPL
foreign key (DEPLOYMENT_ID_)
references ACT_RE_DEPLOYMENT (ID_);

alter table ACT_RE_PROCDEF
  add constraint ACT_UNIQ_PROCDEF
unique (KEY_,VERSION_, TENANT_ID_);

alter table ACT_RU_EXECUTION
  add constraint ACT_FK_EXE_PROCINST
foreign key (PROC_INST_ID_)
references ACT_RU_EXECUTION (ID_) on delete cascade on update cascade;

alter table ACT_RU_EXECUTION
  add constraint ACT_FK_EXE_PARENT
foreign key (PARENT_ID_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_EXECUTION
  add constraint ACT_FK_EXE_SUPER
foreign key (SUPER_EXEC_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_EXECUTION
  add constraint ACT_FK_EXE_PROCDEF
foreign key (PROC_DEF_ID_)
references ACT_RE_PROCDEF (ID_);

alter table ACT_RU_IDENTITYLINK
  add constraint ACT_FK_TSKASS_TASK
foreign key (TASK_ID_)
references ACT_RU_TASK (ID_);

alter table ACT_RU_IDENTITYLINK
  add constraint ACT_FK_ATHRZ_PROCEDEF
foreign key (PROC_DEF_ID_)
references ACT_RE_PROCDEF(ID_);

alter table ACT_RU_IDENTITYLINK
  add constraint ACT_FK_IDL_PROCINST
foreign key (PROC_INST_ID_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_TASK
  add constraint ACT_FK_TASK_EXE
foreign key (EXECUTION_ID_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_TASK
  add constraint ACT_FK_TASK_PROCINST
foreign key (PROC_INST_ID_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_TASK
  add constraint ACT_FK_TASK_PROCDEF
foreign key (PROC_DEF_ID_)
references ACT_RE_PROCDEF (ID_);

alter table ACT_RU_VARIABLE
  add constraint ACT_FK_VAR_EXE
foreign key (EXECUTION_ID_)
references ACT_RU_EXECUTION (ID_);

alter table ACT_RU_VARIABLE
  add constraint ACT_FK_VAR_PROCINST
foreign key (PROC_INST_ID_)
references ACT_RU_EXECUTION(ID_);

alter table ACT_RU_VARIABLE
  add constraint ACT_FK_VAR_BYTEARRAY
foreign key (BYTEARRAY_ID_)
references ACT_GE_BYTEARRAY (ID_);

alter table ACT_RU_JOB
  add constraint ACT_FK_JOB_EXCEPTION
foreign key (EXCEPTION_STACK_ID_)
references ACT_GE_BYTEARRAY (ID_);

alter table ACT_RU_EVENT_SUBSCR
  add constraint ACT_FK_EVENT_EXEC
foreign key (EXECUTION_ID_)
references ACT_RU_EXECUTION(ID_);

alter table ACT_RE_MODEL
  add constraint ACT_FK_MODEL_SOURCE
foreign key (EDITOR_SOURCE_VALUE_ID_)
references ACT_GE_BYTEARRAY (ID_);

alter table ACT_RE_MODEL
  add constraint ACT_FK_MODEL_SOURCE_EXTRA
foreign key (EDITOR_SOURCE_EXTRA_VALUE_ID_)
references ACT_GE_BYTEARRAY (ID_);

alter table ACT_RE_MODEL
  add constraint ACT_FK_MODEL_DEPLOYMENT
foreign key (DEPLOYMENT_ID_)
references ACT_RE_DEPLOYMENT (ID_);

alter table ACT_PROCDEF_INFO
  add constraint ACT_FK_INFO_JSON_BA
foreign key (INFO_JSON_ID_)
references ACT_GE_BYTEARRAY (ID_);

alter table ACT_PROCDEF_INFO
  add constraint ACT_FK_INFO_PROCDEF
foreign key (PROC_DEF_ID_)
references ACT_RE_PROCDEF (ID_);

alter table ACT_PROCDEF_INFO
  add constraint ACT_UNIQ_INFO_PROCDEF
unique (PROC_DEF_ID_);

create table ACT_HI_PROCINST (
  ID_ varchar(64) not null,
  PROC_INST_ID_ varchar(64) not null,
  BUSINESS_KEY_ varchar(255),
  PROC_DEF_ID_ varchar(64) not null,
  START_TIME_ datetime(3) not null,
  END_TIME_ datetime(3),
  DURATION_ bigint,
  START_USER_ID_ varchar(255),
  START_ACT_ID_ varchar(255),
  END_ACT_ID_ varchar(255),
  SUPER_PROCESS_INSTANCE_ID_ varchar(64),
  DELETE_REASON_ varchar(4000),
  TENANT_ID_ varchar(255) default '',
  NAME_ varchar(255),
  primary key (ID_),
  unique (PROC_INST_ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_ACTINST (
  ID_ varchar(64) not null,
  PROC_DEF_ID_ varchar(64) not null,
  PROC_INST_ID_ varchar(64) not null,
  EXECUTION_ID_ varchar(64) not null,
  ACT_ID_ varchar(255) not null,
  TASK_ID_ varchar(64),
  CALL_PROC_INST_ID_ varchar(64),
  ACT_NAME_ varchar(255),
  ACT_TYPE_ varchar(255) not null,
  ASSIGNEE_ varchar(255),
  START_TIME_ datetime(3) not null,
  END_TIME_ datetime(3),
  DURATION_ bigint,
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_TASKINST (
  ID_ varchar(64) not null,
  PROC_DEF_ID_ varchar(64),
  TASK_DEF_KEY_ varchar(255),
  PROC_INST_ID_ varchar(64),
  EXECUTION_ID_ varchar(64),
  NAME_ varchar(255),
  PARENT_TASK_ID_ varchar(64),
  DESCRIPTION_ varchar(4000),
  OWNER_ varchar(255),
  ASSIGNEE_ varchar(255),
  START_TIME_ datetime(3) not null,
  CLAIM_TIME_ datetime(3),
  END_TIME_ datetime(3),
  DURATION_ bigint,
  DELETE_REASON_ varchar(4000),
  PRIORITY_ integer,
  DUE_DATE_ datetime(3),
  FORM_KEY_ varchar(255),
  CATEGORY_ varchar(255),
  TENANT_ID_ varchar(255) default '',
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_VARINST (
  ID_ varchar(64) not null,
  PROC_INST_ID_ varchar(64),
  EXECUTION_ID_ varchar(64),
  TASK_ID_ varchar(64),
  NAME_ varchar(255) not null,
  VAR_TYPE_ varchar(100),
  REV_ integer,
  BYTEARRAY_ID_ varchar(64),
  DOUBLE_ double,
  LONG_ bigint,
  TEXT_ varchar(4000),
  TEXT2_ varchar(4000),
  CREATE_TIME_ datetime(3),
  LAST_UPDATED_TIME_ datetime(3),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_DETAIL (
  ID_ varchar(64) not null,
  TYPE_ varchar(255) not null,
  PROC_INST_ID_ varchar(64),
  EXECUTION_ID_ varchar(64),
  TASK_ID_ varchar(64),
  ACT_INST_ID_ varchar(64),
  NAME_ varchar(255) not null,
  VAR_TYPE_ varchar(255),
  REV_ integer,
  TIME_ datetime(3) not null,
  BYTEARRAY_ID_ varchar(64),
  DOUBLE_ double,
  LONG_ bigint,
  TEXT_ varchar(4000),
  TEXT2_ varchar(4000),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_COMMENT (
  ID_ varchar(64) not null,
  TYPE_ varchar(255),
  TIME_ datetime(3) not null,
  USER_ID_ varchar(255),
  TASK_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  ACTION_ varchar(255),
  MESSAGE_ varchar(4000),
  FULL_MSG_ LONGBLOB,
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_ATTACHMENT (
  ID_ varchar(64) not null,
  REV_ integer,
  USER_ID_ varchar(255),
  NAME_ varchar(255),
  DESCRIPTION_ varchar(4000),
  TYPE_ varchar(255),
  TASK_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  URL_ varchar(4000),
  CONTENT_ID_ varchar(64),
  TIME_ datetime(3),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_HI_IDENTITYLINK (
  ID_ varchar(64),
  GROUP_ID_ varchar(255),
  TYPE_ varchar(255),
  USER_ID_ varchar(255),
  TASK_ID_ varchar(64),
  PROC_INST_ID_ varchar(64),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;


create index ACT_IDX_HI_PRO_INST_END on ACT_HI_PROCINST(END_TIME_);
create index ACT_IDX_HI_PRO_I_BUSKEY on ACT_HI_PROCINST(BUSINESS_KEY_);
create index ACT_IDX_HI_ACT_INST_START on ACT_HI_ACTINST(START_TIME_);
create index ACT_IDX_HI_ACT_INST_END on ACT_HI_ACTINST(END_TIME_);
create index ACT_IDX_HI_DETAIL_PROC_INST on ACT_HI_DETAIL(PROC_INST_ID_);
create index ACT_IDX_HI_DETAIL_ACT_INST on ACT_HI_DETAIL(ACT_INST_ID_);
create index ACT_IDX_HI_DETAIL_TIME on ACT_HI_DETAIL(TIME_);
create index ACT_IDX_HI_DETAIL_NAME on ACT_HI_DETAIL(NAME_);
create index ACT_IDX_HI_DETAIL_TASK_ID on ACT_HI_DETAIL(TASK_ID_);
create index ACT_IDX_HI_PROCVAR_PROC_INST on ACT_HI_VARINST(PROC_INST_ID_);
create index ACT_IDX_HI_PROCVAR_NAME_TYPE on ACT_HI_VARINST(NAME_, VAR_TYPE_);
create index ACT_IDX_HI_PROCVAR_TASK_ID on ACT_HI_VARINST(TASK_ID_);
create index ACT_IDX_HI_ACT_INST_PROCINST on ACT_HI_ACTINST(PROC_INST_ID_, ACT_ID_);
create index ACT_IDX_HI_ACT_INST_EXEC on ACT_HI_ACTINST(EXECUTION_ID_, ACT_ID_);
create index ACT_IDX_HI_IDENT_LNK_USER on ACT_HI_IDENTITYLINK(USER_ID_);
create index ACT_IDX_HI_IDENT_LNK_TASK on ACT_HI_IDENTITYLINK(TASK_ID_);
create index ACT_IDX_HI_IDENT_LNK_PROCINST on ACT_HI_IDENTITYLINK(PROC_INST_ID_);
create index ACT_IDX_HI_TASK_INST_PROCINST on ACT_HI_TASKINST(PROC_INST_ID_);


create table ACT_ID_GROUP (
  ID_ varchar(64),
  REV_ integer,
  NAME_ varchar(255),
  TYPE_ varchar(255),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_ID_MEMBERSHIP (
  USER_ID_ varchar(64),
  GROUP_ID_ varchar(64),
  primary key (USER_ID_, GROUP_ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_ID_USER (
  ID_ varchar(64),
  REV_ integer,
  FIRST_ varchar(255),
  LAST_ varchar(255),
  EMAIL_ varchar(255),
  PWD_ varchar(255),
  PICTURE_ID_ varchar(64),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

create table ACT_ID_INFO (
  ID_ varchar(64),
  REV_ integer,
  USER_ID_ varchar(64),
  TYPE_ varchar(64),
  KEY_ varchar(255),
  VALUE_ varchar(255),
  PASSWORD_ LONGBLOB,
  PARENT_ID_ varchar(255),
  primary key (ID_)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;

alter table ACT_ID_MEMBERSHIP
  add constraint ACT_FK_MEMB_GROUP
foreign key (GROUP_ID_)
references ACT_ID_GROUP (ID_);

alter table ACT_ID_MEMBERSHIP
  add constraint ACT_FK_MEMB_USER
foreign key (USER_ID_)
references ACT_ID_USER (ID_);
