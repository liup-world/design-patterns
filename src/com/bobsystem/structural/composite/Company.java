package com.bobsystem.structural.composite;

import org.apache.commons.lang.StringUtils;

/**
 * 组合模式 Composite
 * 将对象组合成树形结构以表示‘部分-整体’的层次结构。
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 * 理解：
 * 对于逻辑中树形结构关系的数据，可以构造为树形结构的对象，进而分散处理其中的数据；
 * 将具有树形结构的对象组织成一棵树，分散处理，简化调用
 */
public class Company
    extends ADepartment {

    public Company(String name){
        super(name);
    }


    @Override
    public void doWork() {

        System.out.printf("\n%s 职责描述：\n", super.name);

        for (ADepartment department : this.departments) {

            department.doWork();
        }
    }
}
