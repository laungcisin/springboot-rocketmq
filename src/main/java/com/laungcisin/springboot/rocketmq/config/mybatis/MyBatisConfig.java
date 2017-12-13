//package com.laungcisin.springboot.rocketmq.config.mybatis;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
//@PropertySource(value = {"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
//public class MyBatisConfig {
//    @Value("${jdbc.url}")
//    private String jdbcUrl;
//
//    @Value("${jdbc.driverClassName}")
//    private String jdbcDriverClassName;
//
//    @Value("${jdbc.username}")
//    private String jdbcUsername;
//
//    @Value("${jdbc.password}")
//    private String jdbcPassword;
//
//    //destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(jdbcUrl);
//        dataSource.setUsername(jdbcUsername);//用户名
//        dataSource.setPassword(jdbcPassword);//密码
//        dataSource.setDriverClassName(jdbcDriverClassName);
//        dataSource.setInitialSize(2);//初始化时建立物理连接的个数
//        dataSource.setMaxActive(20);//最大连接池数量
//        dataSource.setMinIdle(0);//最小连接池数量
//        dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
//        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
//        dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
//        dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
//        dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
//        return dataSource;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean //当容器里没有指定的 Bean 的情况下创建该对象
//    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        // 设置数据源
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        // 设置 mybatis 的主配置文件
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
//        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
//
//        // 设置别名包
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.laungcisin.springboot.rocketmq.entity");
//        return sqlSessionFactoryBean;
//    }
//}
