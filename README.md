# spider-flow

#### 介绍
新一代爬虫平台，以图形化方式定义爬虫流程，不写代码即可完成爬虫。

#### 项目部署启动
- SpiderApplication.java 右键main
- 访问路径：http://localhost:8088/

#### 特性
- [x] 支持css选择器、正则提取
- [x] 支持JSON/XML格式
- [x] 支持Xpath/JsonPath提取
- [x] 支持多数据源、SQL select/insert/update/delete
- [ ] 支持爬取JS动态渲染的页面
- [ ] 支持代理
- [x] 支持二进制格式
- [ ] 支持保存/读取文件(csv、xls、jpg等)
- [ ] 支持插件扩展
#### 变量匹配说明

|  方法名称   |   参数1  |  参数2   |  参数3   |  参数4   | 方法说明  |   
| --- | --- | --- | --- | --- | --- |
|  selector   |   resp.html  |  css选择器   |  获取类型：text、attr、outerhtml   |  获取的标签名：如<a href=“”/> 则写：href   |获取页面单个变量值|
|  selectors   |  resp.html   | css选择器    | 获取类型：text、attr、outerhtml   | 获取的标签名：如<a href=“”/> 则写：href   |获取页面多个变量值|
### 项目部分截图
![gif1](https://images.gitee.com/uploads/images/2019/0716/184746_b4b350c7_297689.gif "animate.gif")
![png1](https://images.gitee.com/uploads/images/2019/0716/184606_0aca457c_297689.png "demo-1.png")
![png2](https://images.gitee.com/uploads/images/2019/0716/184618_21bce697_297689.png "demo-2.png")
![png3](https://images.gitee.com/uploads/images/2019/0722/104134_03c7c8a9_1324601.png "demo-3.png")