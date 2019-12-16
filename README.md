# common-beancopier

[![Jdk Version](https://img.shields.io/badge/JDK-1.8-green.svg)](https://img.shields.io/badge/JDK-1.8-green.svg)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/link.thingscloud/common-beancopier/badge.svg)](https://maven-badges.herokuapp.com/maven-central/link.thingscloud/common-beancopier/)

## 特性说明
    
    1、深度复制
    2、大数据复制时，采用JAVA 8并行复制
    
## 使用说明

    @Data
    public class Bean1 {
        private String str1;
        private String str2;
    }
    @Data
    public class Bean2 {
        private String str1;
        private String str2;
        private String str3;
    }
    
    Bean1 bean1 = new Bean1();
    Bean2 bean2 = new Bean2().setStr3("c");
    BeanCopier<Bean1, Bean2> beanCopier = BeanCopiers.newCopier();
    beanCopier.copy(bean1);
    beanCopier.copy(bean1, bean2);
    beanCopier.copy(bean1, bean2, (BeanCopierResolver<Integer, String>) sourcePair ->
            new NameValuePair<String>().setName("str1").setValue(sourcePair.getValue() + ""));
    beanCopier.register((BeanCopierResolver<Integer, String>) sourcePair ->
            new NameValuePair<String>().setName("str1").setValue(sourcePair.getValue() + ""));

## License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) Apache Software Foundation
