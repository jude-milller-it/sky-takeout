**中文版介绍：**[跳转](#在线外卖订购系统)

**English intro:** [GOTO](#Online-Food-Ordering-System)



# Online Food Ordering System

This project is an online food ordering system developed with the Spring Boot + Vue framework. This repository contains the backend component.

## 🛠️ Tech Stack:

Backend Frameworks

- SpringBoot (2.7.3)
- MyBatis（ORM）

Databases

- MySQL
- Redis

Frontend Frameworks

- Vue
- Uniapp(a Vue framework for wechat mini app)
- ElementUI(an Vue UI framework)

Frontend-Backend Communication

- RESTful API

## 🚀 Windows Development Environment Setup

1. Prerequisites: Install JDK 17 and configure environment variables; install IntelliJ IDEA and set up plugins like Lombok; install MySQL, Redis, Maven, etc.
2. Run `mysql.sql` to create the database and tables. Create a local employee account before signing in to the admin portal.
3. Clone the project locally: `git clone https://github.com/jude-milller-it/sky-takeout.git`
4. Remove the ".template" suffix from `application-dev.yml.template`, then modify the sections marked with "#" in the configuration file to fill in your own configurations.
5. Set `SKY_JWT_ADMIN_SECRET_KEY` and `SKY_JWT_USER_SECRET_KEY` to separate JWT signing secrets.
6. Run the backend project and launch the frontend project in conjunction.

## 📋 Overall Project Logic

Covers dual-end business for takeout [Admin Portal + User Portal], implementing a closed-loop process from dish management to order completion:

1. **Admin Portal**: Employee/Category/Dish/Set Meal Management → Order Processing → Data Statistics & Report Export. Supports merchant operations;
2. **User Portal (WeChat Mini Program)**: WeChat authorized login → Product browsing (dishes/set meals) → Shopping cart operations → Address management → Order placement & payment → Order inquiry/cancellation. Meets users' food ordering needs;
3. **Core Workflow (Order Processing)**: Merchants list dishes/set meals → Users place and pay for orders → The system pushes orders to merchants in real time → Merchants accept/fulfill orders → Order completion (automatic cancellation on timeout).

## ✨ Core Technical Highlights

In addition to standard multi-table CRUD operations, the project includes:

1. **Tech Stack Selection**: Backend architecture built with Spring Boot + Spring MVC + MyBatis, MySQL for business data storage, and Redis for cache performance optimization, covering mainstream full-stack development technologies;

2. **Efficiency & Reusability Optimization:** AOP + Reflection to automatically populate common fields (e.g., createTime/updateTime), reducing redundant code;

   Custom Redis caching + Spring Cache annotation-based caching to reduce database query pressure;

3. **Security & Authentication:** WeChat Mini Program login verifies code to obtain openId, enabling registration-free login;

   JWT token generation + Interceptor-based authentication, with ThreadLocal for user context storage to ensure API security;

4. **Real-Time Communication & Scheduled Tasks**: WebSocket for new order notifications and customer order reminders to improve merchant response efficiency; Spring Task for scheduled processing of timed-out orders with automatic status updates, eliminating manual intervention;

5. **Data Visualization & File Processing:** Integration with ECharts for multi-dimensional data statistics (e.g., turnover, top 10 sales items);

   Apache POI for exporting operational Excel reports based on templates, adapting to office scenarios;

6. **Robust Service Layer Design**: Associated data linkage (e.g., dish deactivation syncs to set meal deactivation), rational table relationship design (many-to-many between set meals and dishes), ensuring closed-loop business processes and data consistency.

## 📝 Project Development Notes

A total of 10 commits were made during the learning process. To prevent sensitive information leakage during commits and streamline repository files, only the final polished version has been pushed.

Details of the 10 commit logs can be found in `commit_logs.md`.







# 在线外卖订购系统

本项目是使用 Spring Boot + vue 框架开发的一个在线外卖订购系统，是一个在黑马程序员的“苍穹外卖”基础上复现和改进的项目。这个仓库是后端部分。

push到这里，方便记录学习训练的过程，交流问题

## 🛠️ 技术栈：

后端框架

- SpringBoot (2.7.3)

- mybatis

数据库

- MySql
- Redis

前端框架

- Vue
- Uniapp
- ElementUI

前后端通信

- RESTful API

## 🚀 windows开发环境搭建过程

1、前置：安装jdk17并配置环境变量，安装idea并配置lombok等插件，安装mysql、redis、maven等

2、运行 `mysql.sql` 创建数据库和表。登录管理端前，先在本地创建员工账号。

3.克隆项目到本地 `git clone https://github.com/jude-milller-it/sky-takeout.git `

4、去除`application-dev.yml.template`末尾的“.template”，然后修改配置文件“#”处，填写自己的配置

5、为 `SKY_JWT_ADMIN_SECRET_KEY` 和 `SKY_JWT_USER_SECRET_KEY` 分别配置 JWT 签名密钥。

6、运行项目，并配合运行前端项目。

## 📋 项目总体逻辑 

覆盖外卖「管理端+用户端」双端业务，实现从菜品管理到订单完成的闭环流程： 

1. **管理端**：员工/分类/菜品/套餐管理 → 订单处理 → 数据统计与报表导出。支撑商家运营； 
2. **用户端（微信小程序）**：微信授权登录 → 商品浏览（菜品/套餐）→ 购物车操作 → 地址管理 → 下单支付 → 订单查询/取消。满足用户点餐需求； 
3. **核心流转（订单处理部分）**：商家上架菜品/套餐 → 用户下单支付 → 系统实时推送订单给商家 → 商家接单/派送 → 订单完成（超时自动取消）。 

## ✨ 核心技术亮点 

除了常规的多表CRUD，还包含：

1. **技术栈选型**：Spring Boot + Spring MVC + MyBatis 构建后端架构，MySQL 存储业务数据，Redis 优化缓存性能，全栈覆盖主流开发技术； 

2. **效率与复用优化**：AOP + 反射实现 createTime/updateTime 等公共字段自动填充，减少重复代码；

   Redis 自定义缓存 + Spring Cache 注解式缓存，降低数据库查询压力； 

3. **安全与身份认证**：微信小程序登录通过 code 验证获取 openId，实现免注册登录；

   JWT 生成令牌 + 拦截器鉴权，ThreadLocal 存储用户上下文，保障接口安全； 

4. **实时通信与定时任务**：WebSocket 实现来单提醒、客户催单功能，提升商家响应效率；Spring Task 定时处理超时订单，自动更新状态，无需人工干预； 

5. **数据可视化与文件处理**：集成 ECharts 实现营业额、销量 Top10 等多维度数据统计；

   Apache POI 基于模板导出运营 Excel 报表，适配办公场景； 

6. **严谨Service逻辑设计**：关联数据联动（菜品停售同步套餐停售）、合理表关系设计（套餐-菜品多对多），确保业务流程闭环与数据一致性。

## 📝 项目开发过程说明

学习过程中累计10次commit，为了防止commit过程中敏感信息泄露，并精简仓库文件，仅push了最后成果版本。

具体十次commit日志详见 `commit_logs.md`





