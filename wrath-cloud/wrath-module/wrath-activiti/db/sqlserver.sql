INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000043, 0, '', 0, 'icon-cluster', '', 2, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000044, 1067246875800000043, 'activiti/process', 0, 'icon-detail', 'sys:process:all', 0, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000045, 1067246875800000043, 'activiti/model', 0, 'icon-appstore-fill', 'sys:model:all', 1, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1067246875800000046, 1067246875800000043, 'activiti/running', 0, 'icon-play-square', 'sys:running:all', 2, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176004047773671425, 1067246875800000043, 'activiti/process-initiation', 0, 'icon-play-square', 'sys:process:all', 0, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176004381581549569, 0, '', 0, 'icon-user', '', 3, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176005336624570370, 1176004381581549569, 'activiti/demo/correction', 0, 'icon-issuesclose', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 0, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176006162176843777, 1176004381581549569, 'activiti/my-todo-task', 0, 'icon-dashboard', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 1, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176009642778075138, 1176004381581549569, 'activiti/my-apply', 0, 'icon-edit-square', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 2, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176010201362898946, 1176004381581549569, 'activiti/my-join-task', 0, 'icon-check-square', 'sys:his:all', 3, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());
INSERT INTO sys_menu(id, pid, url, type, icon, permissions, sort, del_flag, creator, create_date, updater, update_date) VALUES (1176011679628566530, 1176004381581549569, 'activiti/my-todo-task-pool', 0, 'icon-interation', 'sys:correction:all,sys:process:all,sys:running:all,sys:task:all', 4, 0, 1067246875800000001, getdate(), 1067246875800000001, getdate());


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
  id bigint NOT NULL,
  proc_def_id varchar(64),
  biz_route varchar(255),
  proc_def_key varchar(255),
  version int,
  PRIMARY KEY (id)
);

CREATE TABLE tb_correction (
   id bigint NOT NULL,
   apply_post varchar(255),
   entry_date datetime,
   correction_date datetime,
   work_content varchar(2000),
   achievement varchar(2000),
   instance_id varchar(80),
   creator bigint,
   create_date datetime,
   PRIMARY KEY (id)
);

create table ACT_GE_PROPERTY (
  NAME_ nvarchar(64),
  VALUE_ nvarchar(300),
  REV_ int,
  primary key (NAME_)
);

insert into ACT_GE_PROPERTY
values ('schema.version', '5.22.0.0', 1);

insert into ACT_GE_PROPERTY
values ('schema.history', 'create(5.22.0.0)', 1);

insert into ACT_GE_PROPERTY
values ('next.dbid', '1', 1);

create table ACT_GE_BYTEARRAY (
  ID_ nvarchar(64),
  REV_ int,
  NAME_ nvarchar(255),
  DEPLOYMENT_ID_ nvarchar(64),
  BYTES_  varbinary(max),
  GENERATED_ tinyint,
primary key (ID_)
);

create table ACT_RE_DEPLOYMENT (
  ID_ nvarchar(64),
  NAME_ nvarchar(255),
  CATEGORY_ nvarchar(255),
  TENANT_ID_ nvarchar(255) default '',
  DEPLOY_TIME_ datetime,
  primary key (ID_)
);

create table ACT_RE_MODEL (
  ID_ nvarchar(64) not null,
  REV_ int,
  NAME_ nvarchar(255),
  KEY_ nvarchar(255),
  CATEGORY_ nvarchar(255),
  CREATE_TIME_ datetime,
  LAST_UPDATE_TIME_ datetime,
  VERSION_ int,
  META_INFO_ nvarchar(4000),
  DEPLOYMENT_ID_ nvarchar(64),
  EDITOR_SOURCE_VALUE_ID_ nvarchar(64),
  EDITOR_SOURCE_EXTRA_VALUE_ID_ nvarchar(64),
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_RU_EXECUTION (
  ID_ nvarchar(64),
  REV_ int,
  PROC_INST_ID_ nvarchar(64),
  BUSINESS_KEY_ nvarchar(255),
  PARENT_ID_ nvarchar(64),
  PROC_DEF_ID_ nvarchar(64),
  SUPER_EXEC_ nvarchar(64),
  ACT_ID_ nvarchar(255),
  IS_ACTIVE_ tinyint,
  IS_CONCURRENT_ tinyint,
  IS_SCOPE_ tinyint,
  IS_EVENT_SCOPE_ tinyint,
  SUSPENSION_STATE_ tinyint,
  CACHED_ENT_STATE_ int,
  TENANT_ID_ nvarchar(255) default '',
  NAME_ nvarchar(255),
  LOCK_TIME_ datetime,
  primary key (ID_)
);

create table ACT_RU_JOB (
  ID_ nvarchar(64) NOT NULL,
  REV_ int,
  TYPE_ nvarchar(255) NOT NULL,
  LOCK_EXP_TIME_ datetime,
  LOCK_OWNER_ nvarchar(255),
  EXCLUSIVE_ bit,
  EXECUTION_ID_ nvarchar(64),
  PROCESS_INSTANCE_ID_ nvarchar(64),
  PROC_DEF_ID_ nvarchar(64),
  RETRIES_ int,
  EXCEPTION_STACK_ID_ nvarchar(64),
  EXCEPTION_MSG_ nvarchar(4000),
  DUEDATE_ datetime NULL,
  REPEAT_ nvarchar(255),
  HANDLER_TYPE_ nvarchar(255),
  HANDLER_CFG_ nvarchar(4000),
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_RE_PROCDEF (
  ID_ nvarchar(64) not null,
  REV_ int,
  CATEGORY_ nvarchar(255),
  NAME_ nvarchar(255),
  KEY_ nvarchar(255) not null,
  VERSION_ int not null,
  DEPLOYMENT_ID_ nvarchar(64),
  RESOURCE_NAME_ nvarchar(4000),
  DGRM_RESOURCE_NAME_ nvarchar(4000),
  DESCRIPTION_ nvarchar(4000),
  HAS_START_FORM_KEY_ tinyint,
  HAS_GRAPHICAL_NOTATION_ tinyint,
  SUSPENSION_STATE_ tinyint,
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_RU_TASK (
  ID_ nvarchar(64),
  REV_ int,
  EXECUTION_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  PROC_DEF_ID_ nvarchar(64),
  NAME_ nvarchar(255),
  PARENT_TASK_ID_ nvarchar(64),
  DESCRIPTION_ nvarchar(4000),
  TASK_DEF_KEY_ nvarchar(255),
  OWNER_ nvarchar(255),
  ASSIGNEE_ nvarchar(255),
  DELEGATION_ nvarchar(64),
  PRIORITY_ int,
  CREATE_TIME_ datetime,
  DUE_DATE_ datetime,
  CATEGORY_ nvarchar(255),
  SUSPENSION_STATE_ int,
  TENANT_ID_ nvarchar(255) default '',
  FORM_KEY_ nvarchar(255),
  primary key (ID_)
);

create table ACT_RU_IDENTITYLINK (
  ID_ nvarchar(64),
  REV_ int,
  GROUP_ID_ nvarchar(255),
  TYPE_ nvarchar(255),
  USER_ID_ nvarchar(255),
  TASK_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  PROC_DEF_ID_ nvarchar(64),
  primary key (ID_)
);

create table ACT_RU_VARIABLE (
  ID_ nvarchar(64) not null,
  REV_ int,
  TYPE_ nvarchar(255) not null,
  NAME_ nvarchar(255) not null,
  EXECUTION_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  TASK_ID_ nvarchar(64),
  BYTEARRAY_ID_ nvarchar(64),
  DOUBLE_ double precision,
  LONG_ numeric(19,0),
  TEXT_ nvarchar(4000),
  TEXT2_ nvarchar(4000),
  primary key (ID_)
);

create table ACT_RU_EVENT_SUBSCR (
  ID_ nvarchar(64) not null,
  REV_ int,
  EVENT_TYPE_ nvarchar(255) not null,
  EVENT_NAME_ nvarchar(255),
  EXECUTION_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  ACTIVITY_ID_ nvarchar(64),
  CONFIGURATION_ nvarchar(255),
  CREATED_ datetime not null,
  PROC_DEF_ID_ nvarchar(64),
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_EVT_LOG (
  LOG_NR_ numeric(19,0) IDENTITY(1,1),
  TYPE_ nvarchar(64),
  PROC_DEF_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  EXECUTION_ID_ nvarchar(64),
  TASK_ID_ nvarchar(64),
  TIME_STAMP_ datetime not null,
  USER_ID_ nvarchar(255),
  DATA_ varbinary(max),
  LOCK_OWNER_ nvarchar(255),
  LOCK_TIME_ datetime null,
  IS_PROCESSED_ tinyint default 0,
primary key (LOG_NR_)
);

create table ACT_PROCDEF_INFO (
  ID_ nvarchar(64) not null,
  PROC_DEF_ID_ nvarchar(64) not null,
  REV_ int,
  INFO_JSON_ID_ nvarchar(64),
  primary key (ID_)
);

create index ACT_IDX_EXEC_BUSKEY on ACT_RU_EXECUTION(BUSINESS_KEY_);
create index ACT_IDX_TASK_CREATE on ACT_RU_TASK(CREATE_TIME_);
create index ACT_IDX_IDENT_LNK_USER on ACT_RU_IDENTITYLINK(USER_ID_);
create index ACT_IDX_IDENT_LNK_GROUP on ACT_RU_IDENTITYLINK(GROUP_ID_);
create index ACT_IDX_EVENT_SUBSCR_CONFIG_ on ACT_RU_EVENT_SUBSCR(CONFIGURATION_);
create index ACT_IDX_VARIABLE_TASK_ID on ACT_RU_VARIABLE(TASK_ID_);
create index ACT_IDX_ATHRZ_PROCEDEF on ACT_RU_IDENTITYLINK(PROC_DEF_ID_);
create index ACT_IDX_EXECUTION_PROC on ACT_RU_EXECUTION(PROC_DEF_ID_);
create index ACT_IDX_EXECUTION_PARENT on ACT_RU_EXECUTION(PARENT_ID_);
create index ACT_IDX_EXECUTION_SUPER on ACT_RU_EXECUTION(SUPER_EXEC_);
create index ACT_IDX_EXECUTION_IDANDREV on ACT_RU_EXECUTION(ID_, REV_);
create index ACT_IDX_VARIABLE_BA on ACT_RU_VARIABLE(BYTEARRAY_ID_);
create index ACT_IDX_VARIABLE_EXEC on ACT_RU_VARIABLE(EXECUTION_ID_);
create index ACT_IDX_VARIABLE_PROCINST on ACT_RU_VARIABLE(PROC_INST_ID_);
create index ACT_IDX_IDENT_LNK_TASK on ACT_RU_IDENTITYLINK(TASK_ID_);
create index ACT_IDX_IDENT_LNK_PROCINST on ACT_RU_IDENTITYLINK(PROC_INST_ID_);
create index ACT_IDX_TASK_EXEC on ACT_RU_TASK(EXECUTION_ID_);
create index ACT_IDX_TASK_PROCINST on ACT_RU_TASK(PROC_INST_ID_);
create index ACT_IDX_EXEC_PROC_INST_ID on ACT_RU_EXECUTION(PROC_INST_ID_);
create index ACT_IDX_TASK_PROC_DEF_ID on ACT_RU_TASK(PROC_DEF_ID_);
create index ACT_IDX_EVENT_SUBSCR_EXEC_ID on ACT_RU_EVENT_SUBSCR(EXECUTION_ID_);
create index ACT_IDX_JOB_EXCEPTION_STACK_ID on ACT_RU_JOB(EXCEPTION_STACK_ID_);
create index ACT_IDX_INFO_PROCDEF on ACT_PROCDEF_INFO(PROC_DEF_ID_);

alter table ACT_GE_BYTEARRAY
  add constraint ACT_FK_BYTEARR_DEPL
foreign key (DEPLOYMENT_ID_)
references ACT_RE_DEPLOYMENT (ID_);

alter table ACT_RE_PROCDEF
  add constraint ACT_UNIQ_PROCDEF
unique (KEY_,VERSION_, TENANT_ID_);

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
references ACT_RE_PROCDEF (ID_);

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
  ID_ nvarchar(64) not null,
  PROC_INST_ID_ nvarchar(64) not null,
  BUSINESS_KEY_ nvarchar(255),
  PROC_DEF_ID_ nvarchar(64) not null,
  START_TIME_ datetime not null,
  END_TIME_ datetime,
  DURATION_ numeric(19,0),
  START_USER_ID_ nvarchar(255),
  START_ACT_ID_ nvarchar(255),
  END_ACT_ID_ nvarchar(255),
  SUPER_PROCESS_INSTANCE_ID_ nvarchar(64),
  DELETE_REASON_ nvarchar(4000),
  TENANT_ID_ nvarchar(255) default '',
  NAME_ nvarchar(255),
  primary key (ID_),
  unique (PROC_INST_ID_)
);

create table ACT_HI_ACTINST (
  ID_ nvarchar(64) not null,
  PROC_DEF_ID_ nvarchar(64) not null,
  PROC_INST_ID_ nvarchar(64) not null,
  EXECUTION_ID_ nvarchar(64) not null,
  ACT_ID_ nvarchar(255) not null,
  TASK_ID_ nvarchar(64),
  CALL_PROC_INST_ID_ nvarchar(64),
  ACT_NAME_ nvarchar(255),
  ACT_TYPE_ nvarchar(255) not null,
  ASSIGNEE_ nvarchar(255),
  START_TIME_ datetime not null,
  END_TIME_ datetime,
  DURATION_ numeric(19,0),
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_HI_TASKINST (
  ID_ nvarchar(64) not null,
  PROC_DEF_ID_ nvarchar(64),
  TASK_DEF_KEY_ nvarchar(255),
  PROC_INST_ID_ nvarchar(64),
  EXECUTION_ID_ nvarchar(64),
  NAME_ nvarchar(255),
  PARENT_TASK_ID_ nvarchar(64),
  DESCRIPTION_ nvarchar(4000),
  OWNER_ nvarchar(255),
  ASSIGNEE_ nvarchar(255),
  START_TIME_ datetime not null,
  CLAIM_TIME_ datetime,
  END_TIME_ datetime,
  DURATION_ numeric(19,0),
  DELETE_REASON_ nvarchar(4000),
  PRIORITY_ int,
  DUE_DATE_ datetime,
  FORM_KEY_ nvarchar(255),
  CATEGORY_ nvarchar(255),
  TENANT_ID_ nvarchar(255) default '',
  primary key (ID_)
);

create table ACT_HI_VARINST (
  ID_ nvarchar(64) not null,
  PROC_INST_ID_ nvarchar(64),
  EXECUTION_ID_ nvarchar(64),
  TASK_ID_ nvarchar(64),
  NAME_ nvarchar(255) not null,
  VAR_TYPE_ nvarchar(100),
  REV_ int,
  BYTEARRAY_ID_ nvarchar(64),
  DOUBLE_ double precision,
  LONG_ numeric(19,0),
  TEXT_ nvarchar(4000),
  TEXT2_ nvarchar(4000),
  CREATE_TIME_ datetime,
  LAST_UPDATED_TIME_ datetime,
  primary key (ID_)
);

create table ACT_HI_DETAIL (
  ID_ nvarchar(64) not null,
  TYPE_ nvarchar(255) not null,
  PROC_INST_ID_ nvarchar(64),
  EXECUTION_ID_ nvarchar(64),
  TASK_ID_ nvarchar(64),
  ACT_INST_ID_ nvarchar(64),
  NAME_ nvarchar(255) not null,
  VAR_TYPE_ nvarchar(255),
  REV_ int,
  TIME_ datetime not null,
  BYTEARRAY_ID_ nvarchar(64),
  DOUBLE_ double precision,
  LONG_ numeric(19,0),
  TEXT_ nvarchar(4000),
  TEXT2_ nvarchar(4000),
  primary key (ID_)
);

create table ACT_HI_COMMENT (
  ID_ nvarchar(64) not null,
  TYPE_ nvarchar(255),
  TIME_ datetime not null,
  USER_ID_ nvarchar(255),
  TASK_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  ACTION_ nvarchar(255),
  MESSAGE_ nvarchar(4000),
  FULL_MSG_ varbinary(max),
primary key (ID_)
);

create table ACT_HI_ATTACHMENT (
  ID_ nvarchar(64) not null,
  REV_ integer,
  USER_ID_ nvarchar(255),
  NAME_ nvarchar(255),
  DESCRIPTION_ nvarchar(4000),
  TYPE_ nvarchar(255),
  TASK_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  URL_ nvarchar(4000),
  CONTENT_ID_ nvarchar(64),
  TIME_ datetime,
  primary key (ID_)
);

create table ACT_HI_IDENTITYLINK (
  ID_ nvarchar(64),
  GROUP_ID_ nvarchar(255),
  TYPE_ nvarchar(255),
  USER_ID_ nvarchar(255),
  TASK_ID_ nvarchar(64),
  PROC_INST_ID_ nvarchar(64),
  primary key (ID_)
);


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
  ID_ nvarchar(64),
  REV_ int,
  NAME_ nvarchar(255),
  TYPE_ nvarchar(255),
  primary key (ID_)
);

create table ACT_ID_MEMBERSHIP (
  USER_ID_ nvarchar(64),
  GROUP_ID_ nvarchar(64),
  primary key (USER_ID_, GROUP_ID_)
);

create table ACT_ID_USER (
  ID_ nvarchar(64),
  REV_ int,
  FIRST_ nvarchar(255),
  LAST_ nvarchar(255),
  EMAIL_ nvarchar(255),
  PWD_ nvarchar(255),
  PICTURE_ID_ nvarchar(64),
  primary key (ID_)
);

create table ACT_ID_INFO (
  ID_ nvarchar(64),
  REV_ int,
  USER_ID_ nvarchar(64),
  TYPE_ nvarchar(64),
  KEY_ nvarchar(255),
  VALUE_ nvarchar(255),
  PASSWORD_ varbinary(max),
  PARENT_ID_ nvarchar(255),
primary key (ID_)
);

alter table ACT_ID_MEMBERSHIP
  add constraint ACT_FK_MEMB_GROUP
foreign key (GROUP_ID_)
references ACT_ID_GROUP (ID_);

alter table ACT_ID_MEMBERSHIP
  add constraint ACT_FK_MEMB_USER
foreign key (USER_ID_)
references ACT_ID_USER (ID_);