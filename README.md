# Goku.WebService.Bus
基于 Spring +  Apache CXF +Mybatis 开发SOAP的 WebService 服务

# 原理
Mybatis基于动态代理实现Mapper接口，实现快速开发SOAP的WebService接口服务

# 功能
支持下列操作

| 操作类型        | 交易方法         | 
| ------------- |:-------------:| 
|新增      |insert|
| 修改     |update      |  
| 新增或者修改 |insertOrUpdate    |  
|删除 |delete    |  
| 查询单个|SelectOne     |  
| 查询列表 |SelectList      |  
| 存储过程查询 |SelectProc     |  

# xml格式
```xml
<goku> 
  <header> 
    <!--用户名-->
    <user_id>22</user_id>  
    <!--密码-->
    <password>22</password>  
    <!--操作类型-->
    <tran_no>insertOrupdate</tran_no>  
    <!--交易名称-->
    <bs_code>sysUserMapper</bs_code> 
  </header>  
  <body> 
    <!--操作数据 parameter数据-->
    <data> 
      <id>113</id>  
      <name>mnbhkl</name> 
    </data>  
    <!--操作数据 parameter数据-->
    <data> 
      <id>666</id>  
      <name>3344</name> 
    </data> 
  </body> 
</goku>

```

