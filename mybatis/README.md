《MyBatis应用分析与最佳实践》课后作业
作业内容
1、resultType（属性）和resultMap（标签引用）的区别？
2、collection和association的区别？
3、Statement和PreparedStatement的区别？

1. resultType 指定后去结果映射到Pojo。ResultMap 可以指定数据库字段映射到具体的属性上。
2. collection用于1 对多。
        Association 用于1对1 。在嵌套查询情况下可以延迟加载。
3.     PreparedStatement预编译，占位符可以防止sql 注入，支持批量sql。Statement 一次性执行sql语句




《MyBatis体系结构与工作原理》课后作业
作业内容
【作业1】
1、跟踪update()流程，绘制每一步的时序图（4个）
【作业2】
2、总结：MyBatis里面用到了哪些设计模式？
 装饰器模式、代理模式、模板模式






