# ldapcheck

#### ��Ŀ����
AD��Ĳ��Գ���ldapЭ�顣
ͬʱʹ����swagger������ͨ��http://127.0.0.1:8080/swagger-ui.html��http://127.0.0.1:8080/v2/api-docs�鿴api�ӿڡ�
ͨ��http://127.0.0.1:8080/swagger-ui.htmlҲ���Բ���AD��Ľӿڣ�����ӿھ��Ƕ�ȡAD���д������û��������룬Ȼ����У�顣����ο�doc�е�ʹ���ֲᡣ
���ʵ����swagger2markup��������api�ĵ���

#### ʹ��˵��

1. ��LdapcheckApplication��������
2. ��DemoApplicationTests�������Գ��򣬿��Կ����� ldapcheck\src\main\asciidoc Ŀ¼��������definitions.adoc,overview.adoc,paths.adoc,security.adoc,swagger.json����ļ���
3. �� ldapcheck\src\main\asciidoc Ŀ¼���ֹ�дindex.adoc����������

include::overview.adoc[]
include::paths.adoc[]
include::security.adoc[]
include::definitions.adoc[]

4. ��cmd����ִ��C:\wangxinxin\ldapcheck>mvn clean install -DskipTests, 
���Է��� ldapcheck\target\asciidoc\html Ŀ¼�������� index.html �� swagger.json
ldapcheck\target\asciidoc\pdf Ŀ¼�������� index.pdf �� swagger.json

5. ��UE��index.html, ȫ��ɾ��&lt;div id=&quot;toc&quot; class=&quot;toc&quot;&gt;
&lt;div id=&quot;toctitle&quot;&gt;Table of Contents&lt;/div&gt;

6. �󹦸�ɣ�

#### ���빱��

1. ������
2. �Ž�ƽ
