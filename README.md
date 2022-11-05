# Spring Data JDBC 集成 ClickHouse

简单使用Spring Data JDBC 集成 ClickHouse，跑通基本流程，未充分测试

### 实现

直接使用ClickHouse JDBC

自定义ClickHouseDialect和ClickHouseDialectProvider，
需要在META-INF目录下创建spring.factories文件，指定引入ClickHouseDialectProvider

自定义DataSource和PlatformTransactionManager，使用空事务的方式

其它则使用spring data repository操作

### 类型对应

ClickHouse字段类型，与Java类型的对应，在com.clickhouse.jdbc.JdbcTypeMapping有定义
