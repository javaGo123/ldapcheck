# ldapcheck

#### 项目介绍
AD域的测试程序，ldap协议。
同时使用了swagger，可以通过http://127.0.0.1:8080/swagger-ui.html和http://127.0.0.1:8080/v2/api-docs查看api接口。
通过http://127.0.0.1:8080/swagger-ui.html也可以测试AD域的接口，这个接口就是读取AD域中创建的用户名和密码，然后做校验。详情参考doc中的使用手册。
最后还实现了swagger2markup生成离线api文档。

#### 使用说明

1. 在LdapcheckApplication启动程序
2. 在DemoApplicationTests启动测试程序，可以看到在 ldapcheck\src\main\asciidoc 目录下生成了definitions.adoc,overview.adoc,paths.adoc,security.adoc,swagger.json五个文件。
3. 在 ldapcheck\src\main\asciidoc 目录下手工写index.adoc，内容如下

include::overview.adoc[]
include::paths.adoc[]
include::security.adoc[]
include::definitions.adoc[]

4. 在cmd命令执行C:\wangxinxin\ldapcheck>mvn clean install -DskipTests, 
可以发现 ldapcheck\target\asciidoc\html 目录下生成了 index.html 和 swagger.json
ldapcheck\target\asciidoc\pdf 目录下生成了 index.pdf 和 swagger.json

5. 用UE打开index.html, 全局删除&lt;div id=&quot;toc&quot; class=&quot;toc&quot;&gt;
&lt;div id=&quot;toctitle&quot;&gt;Table of Contents&lt;/div&gt;

6. 大功告成！

#### 参与贡献

1. 王欣鑫
2. 张江平
