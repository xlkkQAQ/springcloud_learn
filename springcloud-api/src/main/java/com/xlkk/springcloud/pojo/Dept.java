package com.xlkk.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
/*
1.实现序列化
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class Dept implements Serializable {
    //Dept 实体类，  orm    类表映射关系
    private Long deptno;
    private String dname;
    //看一下这个数据是存在哪个数据库的字段~
    //微服务架构--一个服务对应一个数据库，同一个信息可能存在不同的数据库中
    private String db_source;
    public Dept(String dname){
        this.dname = dname;
    }
    /*
    链式写法：
        Detp dept = new Dept();
        dept.setdname().setxxx()...
        就是可以一直点就完事
     */

}
