# 二手图书交易系统



## 数据表



### 普通用户

##### 基本信息

###### 表名：user

| 字段名                      | 类型        | 必须                           | 说明         |
| --------------------------- | ----------- | ------------------------------ | ------------ |
| user_id                     | int         |                                | 用户本平台ID |
| user_nickname               | varchar(20) | 仅供用户展示使用               | 昵称         |
| user_login_name             | varchar(20) | 可与密码作为登陆凭证           | 登陆用户名   |
| user_telephone_number       | varchar(15) | 可与密码或者验证码作为登陆凭证 | 手机号码     |
| user_login_password         | varchar(20) | 登陆凭证【使用盐加密存储】     | 登陆密码     |
| user_login_salt             | varchar(8)  | 用于用户密码加密               | 盐           |
| user_name                   | varchar(10) | 无法验证                       | 真实姓名     |
| user_id_card_number         | varchar(18) | 验证有效性                     | 身份证编号   |
| user_alipay_account         | varchar(15) | 选填                           | 支付宝账号   |
| user_wechat_payment_account | varchar(15) | 选填                           | 微信账号     |
| user_registration_time      | varchar(20) | 时间戳                         | 注册时间     |
| user_credit                 | int         | 根据评价系统与活跃度           | 综合信用评估 |

### 图书

##### 图书基本信息

###### 表名：book

| 字段名                | 类型          | 说明                           | 备注               |
| --------------------- | ------------- | ------------------------------ | ------------------ |
| book_id               | int           |                                | 本平台的唯一标识   |
| book_isbn             | varchar(20)   |                                | isbn【书籍识别码】 |
| book_name             | varchar(100)  |                                | 图书名称           |
|book_cover              |varchar(255)|书籍封面|字符串类型数据，存放图片在服务器的地址|
| book_category_id      | int           | 维护一张书籍与类别表           | 图书类别           |
| book_author           | varchar(100)  | 第一作者                       | 作者               |
| boo_press_id          | int           | 维护一张出版社表               | 出版社             |
| book_publication_time | varchar(20)   |                                | 出版日期           |
| book_remarks          | varchar(20)   |                                | 备注               |
| book_original_price   | decimal(10,2) | 背标原价格【保留两位有效小数】 | 价格               |

##### 图书类别信息

###### 表名：book_category

| 字段                  | 类型        | 说明 | 备注     |
| --------------------- | ----------- | ---- | -------- |
| book_category_id      | int         |      | 类别ID   |
| book_category_explain | varchar(50) |      | 类别说明 |

##### 出版社信息表

###### 表名：book_press

| 字段            | 类型         | 说明 | 备注       |
| --------------- | ------------ | ---- | ---------- |
| book_press_id   | int          |      | 出版社ID   |
| book_press_name | varchar(255) |      | 出版社全称 |

##### 城市信息表

###### 表名：city

| 字段         |              |      | 说明          |
| ------------ | ------------ | ---- | ------------- |
| city_id      | int          |      | 省-市-县/区ID |
| city_explain | varchar(256) |      | 地点解释说明  |

##### 图书业务附加信息

###### 表名：book_about

| 字段名                 | 类型         | 说明                                       | 备注           |
| ---------------------- | ------------ | ------------------------------------------ | -------------- |
| book_id                | int          |                                            | 图书ID         |
| book_old_degree        | varchar(256) | 用户描述                                   | 新旧程度       |
| book_purchase_channels | varchar(256) | 自定义                                     | 购入渠道       |
| book_use_age           | float        | 不做要求，用户自定义                       | 使用年限       |
| book_state_id          | int          | 维护一张状态表，实体类中须有枚举类与之对应 | 书籍状态       |
| book_seller_id         | int          |                                            | 卖家ID         |
| book_Buyer_id          | int          |                                            | 买家ID         |
| book_detailed_address  | varchar(256) | 书籍目前所在城市中的详细位置               | 所在详细位置   |
| book_city_id           | int          | 书籍存在的城市位置                         | 书所在城市位置 |
|book_seller_images|varchar(1024)|卖家发布图书的照片|由字符串组成，多个图片之间使用分号隔开|
|book_buyer_images|varchar(1024)|买发布图书的照片|由字符串组成，多个图片之间使用分号隔开|

##### 书籍状态

###### 表名：book_state

| 字段               | 类型         | 说明 | 备注                   |
| ------------------ | ------------ | ---- | ---------------------- |
| book_state_id      | int          |      | 书籍状态ID             |
| book_state_explain | varchar(256) |      | 书籍状态说明           |
| ==1==              |              |      | ==发布闲置中==         |
| ==2==              |              |      | ==买家下单预定中==     |
| ==3==              |              |      | ==交易成功已被购买走== |
| ==4==              |              |      | ==商品已下架==         |
| ==5==              |              |      | ==其他==               |



### 管理员

##### 普通管理员

###### 表名：admin

| 字段                 | 类型        | 说明 | 备注       |
| -------------------- | ----------- | ---- | ---------- |
| admin_id             | int         |      | 管理员ID   |
| admin_name           | varchar(20) |      | 管理员姓名 |
| admin_id_card_number | varchar(18) |      | 身份证编号 |
| admin_login_name     | varchar(20) |      | 登陆用户名 |
| admin_login_password | varchar(20) |      | 登陆密码   |

##### 角色信息表

###### 表名：admin

| 字段        | 类型         | 说明 | 备注     |
| ----------- | ------------ | ---- | -------- |
| role_id     | int          |      | 角色ID   |
| role_name   | varchar(20)  |      | 角色名称 |
| role_detail | varchar(256) |      | 角色说明 |

##### 用户角色对照表

###### 表名：admin_role

| 字段          | 类型 | 说明 | 备注     |
| ------------- | ---- | ---- | -------- |
| admin_role_id | int  |      | 表ID     |
| admin_id      | int  |      | 管理员ID |
| role_id       | int  |      | 角色ID   |

##### 权限信息表

###### permission

| 字段            | 类型         | 说明 | 备注         |
| --------------- | ------------ | ---- | ------------ |
| permission_id   | int          |      | 权限id       |
| permission_name | varchar(255) |      | 权限名称     |
| permission_url  | varchar(255) |      | 权限请求地址 |

##### 角色权限对照表

###### 表名：role_permission

| 字段               | 类型 | 说明 | 备注       |
| ------------------ | ---- | ---- | ---------- |
| role_permission_id | int  |      | 角色权限ID |
| role_id            | int  |      | 角色ID     |
| permission_id      | int  |      | 权限ID     |

##### 管理员操作信息表

###### 表名：admin_operation

| 字段                        | 类型         | 说明 | 备注         |
| --------------------------- | ------------ | ---- | ------------ |
| admin_id                    | int          |      | 管理员ID     |
| admin_operation_time        | varchar(20)  |      | 操作时间     |
| admin_operation_url         | varchar(255) |      | 操作请求接口 |
| admin_operation_result_code | varchar(20)  |      | 操作结果     |
| admin_operation_grade_id    | int          |      | 操作等级     |
| admin_operation_ip          | varchar(20)  |      | 操作IP       |

##### 管理员操作等级对照表

| 字段                    | 类型         | 说明 | 备注         |
| ----------------------- | ------------ | ---- | ------------ |
| operation_grade_id      | int          |      | 操作等级ID   |
| operation_grade_explain | varchar(255) |      | 操作等级说明 |



### 订单

##### 订单信息表

| 字段                  | 类型          | 说明 | 备注       |
| --------------------- | ------------- | ---- | ---------- |
| order_id              | varchar(20)   |      | 订单编号ID |
| order_buyer_id        | int           |      | 买家ID     |
| order_seller_id       | int           |      | 卖家ID     |
| order_book_id         | int           |      | 书籍ID     |
| order_generation_time | varchar(20)   |      | 交易时间   |
| order_amount          | decimal(10,2) |      | 交易金额   |
| order_state_id        | int           |      | 交易状态   |
| order_profit_amount   | decimal(10,2) |      | 盈利金额   |

##### 交易状态对照表

| 字段                | 类型         | 说明 | 备注     |
| ------------------- | ------------ | ---- | -------- |
| order_state_id      | int          |      | 状态ID   |
| order_state_explain | varchar(255) |      | 状态说明 |

## 用例设计

请求遵循规则：

- 前台页面：reception

- 后台页面：backstage
- 请求页面：toPage
- 请求操作：do

请求格式：

> 【前台或者后台标识词】/【请求发起者】/【页面或者数据请求标识符】/【被执行的对象】/【操作】

比如前台页面跳转请求：页面用户请求跳转到发布图书页面

​	recrption/user/toPage/book/addBook

比如前台数据请求：前台页面用户填好图书确认发布图书数据到系统请求

​	recrption/user/do/book/addBook

### 买家与卖家

- ###### 注册

  > 去往注册页面url：recrption/user/toPage/register
  >
  > 去往注册页面携带参数：无【如果有在登陆框填写电话号码可以携带到注册页面】
  >
  > ------
  >
  > 执行注册请求url：recrption/user/do/user/register
  >
  > 执行注册请求携带参数：userName,userPassword,userPhone,user…..
  >
  > 执行注册失败跳转吧url：recrption/user/toPage/user/register
  >
  > 执行注册失败携带参数：userName,userPassword,userPhone,user…..
  >
  > 执行注册成功跳转url：recrption/user/toPage/user/login
  >
  > 执行成功携带参数：登录名或者手机号

- ###### 登陆

  > 去往登陆页面url：recrption/user/toPage/user/login
  >
  > 可以携带参数：userloginName或者手机号
  >
  > 执行登录请求url：recrption/user/do/user/login
  >
  > 携带参数：userPassword和登录名或者密码
  >
  > 执行登陆成功跳转url：reception/user/toPage/book/bookList【reception表示前台页面】
  >
  > 执行成功携带参数：userName,userID….页面图书列表大小参数pageSize，pageStart
  >
  > 执行登陆失败跳转页面url：recrption/user/toPage/user/login
  >
  > 可携带参数：登录名或者手机号

- ###### 查询

  > 需加载获取书籍信息请求url：recrption/user/do/book/getBookInfoById
  >
  > 携带参数：int bookId
  >
  > 去往书籍信息页面url：reception/user/toPage/book/bookInfo
  >
  > 携带书籍参数bean Book

- ###### 浏览【查询某一类书籍】

  > 加载用户搜索条件请求url：recrption/user/do/book/getBookList
  >
  > 携带参数：页面大小，页面起始位置，带条件的bean Book
  >
  > 去往书籍列表页面url：reception/user/toPage/book/bookList
  >
  > 携带参数BookList

- ###### 修改个人信息

  > 跳转到用户信息页面url：recrption/user/do/user/getUserInfoById
  >
  > 传入参数int userId
  >
  > 返回页面url：reception/user/toPage/user/userInfo
  >
  > 携带user原始信息bean user
  >
  > 执行更新请求url：recrption/user/do/user/updateUserInfo
  >
  > 携带参数：bean user 【userId必须】
  >
  > 修改成功返回到url：reception/user/toPage/user/userInfo

- ###### 退出账户

  > 执行退出登陆请求：recrption/user/do/user/logout
  >
  > 弹框确认，确认后返回url：reception/user/toPage/book/bookList【首页未登录状态】

  ##### 卖家

- ###### 发布旧书信息

  > 跳转到发布旧书页面url: reception/user/toPage/book/addBook
  >
  > 执行发布请求url：reception/user/do/book/addBook
  >
  > 携带参数bean Book，userId
  >
  > 发布成功后跳转到图书详情页面url：reception/user/do/book/getBookInfoById
  >
  > 携带参数bookId
  >
  > 发布失败后返回发布页面url：reception/user/toPage/book/addBook
  >
  > 携带参数，之前填写的Book信息，以及发布失败的错误信息

- ###### 查看自己的发布的书籍列表

  > 执行查询请求url：reception/user/do/book/getBookByUserId
  >
  > 获取数据返回页面Booklist
  >
  > 返回页面请求url：reception/user/toPage/book/bookList

- ###### 查看自己发布的书籍信息【某一本】

  > 执行数据加载请求url：reception/user/do/book/getBookById
  >
  > 携带参数bookId
  >
  > 获取数据Book
  >
  > 返回页面请求url：reception/user/toPage/book/bookInfo

- ###### 修改发布书籍信息

  > 执行获取数据请求url：reception/user/do/book/getBookById
  >
  > 携带参数Bookid和操作信息Stirng optation=“update”
  >
  > 携带book信息和操作信息Stirng optation=“update”
  >
  > 跳转到修改书籍信息页面reception/user/toPage/book/bookInfo
  >
  > 执行更新信息请求url：reception/user/do/updateBook
  >
  > 携带信息Book
  >
  > 执行成功后刷新本页面即可

- ###### 下架书籍

  

- ###### 订单查询

- ###### 发布评价

  ###### 买家

- ###### 购买书籍

- ###### 订单生成

- ###### 查询订单

- ###### 退换货

- ###### 发布评价

### 普通管理员

- ###### 登陆

- ###### 退出

- ###### 修改自己信息

- ###### 修改用户信息

- ###### 修改书籍信息

- ###### 修改订单状态

- ###### 修改出版社信息

- ###### 修改城市信息

- ###### 修改图书类别信息

- ###### 添加图书类别

- ###### 添加出版社信息

- ###### 添加城市信息

- ###### 查询用户信息

- ###### 查询图书信息

- ###### 查询订单信息

- ###### 操作日志表数据记录【后台隐式记录】

### 超级管理员

- ###### 登陆

- ###### 退出

- ###### 添加普通管理员账户

- ###### 修改普通管理员账户信息

- ###### 修改普通管理员权限信息

- ###### 修改自身信息

- ###### 修改支付服务信息

- ###### 添加权限信息

- ###### 添加角色信息

- ###### 添加系统菜单信息

- ###### 普通管理员所有操作

- ###### 普通管理员操作日志的查询

- ###### 定价管理

## 标准返回结果集类

```java
/**
 * 统一返回结果集实体类
 * @param <T> 返回数据对象
 */
@Data
public class ErrorMsg<T> {

    //错误码
    private Integer errorCode;

    //错误信息，一般为前端提示信息
    private String errorMsg;

    //返回值，一般为成功后返回的数据
    private T data;

    //错误详情，一般为失败后的详细原因，如空指针之类的
    private String errorDetail;

    public ErrorMsg() {}

    public ErrorMsg(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ErrorMsg(Integer errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 配合静态对象直接设置 data 参数
     * @param data
     * @return
     */
    public ErrorMsg setNewData(T data) {
        ErrorMsg error = new ErrorMsg();
        error.setErrorCode(this.errorCode);
        error.setErrorMsg(this.errorMsg);
        error.setErrorDetail(this.errorDetail);
        error.setData(data);
        return error;
    }

    /**
     * 配合静态对象直接设置 errorMsg 参数
     * @param errorMsg
     * @return
     */
    public ErrorMsg setNewErrorMsg(String errorMsg) {
        ErrorMsg error = new ErrorMsg();
        error.setErrorCode(this.errorCode);
        error.setErrorMsg(errorMsg);
        error.setErrorDetail(this.errorDetail);
        error.setData(this.data);
        return error;
    }

    public static final ErrorMsg SUCCESS = new ErrorMsg(200, "成功");

    public static final ErrorMsg INSERT_SUCCESS = new ErrorMsg(200, "新增成功");

    public static final ErrorMsg UPDATE_SUCCESS = new ErrorMsg(200, "更新成功");

    public static final ErrorMsg DELETE_SUCCESS = new ErrorMsg(200, "删除成功");

    public static final ErrorMsg UPLOAD_SUCCESS = new ErrorMsg(200, "上传成功");

    public static final ErrorMsg DOWNLOAD_SUCCESS = new ErrorMsg(200, "下载成功");

    public static final ErrorMsg LOGIN_SUCCESS = new ErrorMsg(200, "登陆成功");

    public static final ErrorMsg LOGOUT_SUCCESS = new ErrorMsg(200, "登出成功");

    public static final ErrorMsg LOGIN_ERROR = new ErrorMsg(201, "登陆错误");

    public static final ErrorMsg LOGIN_EXPIRE = new ErrorMsg(202, "登陆过期");

    public static final ErrorMsg ACCESS_LIMITED = new ErrorMsg(301, "访问受限");

    public static final ErrorMsg ARGS_ERROR = new ErrorMsg(501, "参数错误");

    public static final ErrorMsg UNKOWN_ERROR = new ErrorMsg(502, "系统异常");

    public static final ErrorMsg INSERT_ERROR = new ErrorMsg(503, "新增错误");

    public static final ErrorMsg UPDATE_ERROR = new ErrorMsg(504, "更新错误");

    public static final ErrorMsg DELETE_ERROR = new ErrorMsg(506, "删除错误");

    public static final ErrorMsg UPLOAD_ERROR = new ErrorMsg(507, "上传错误");

    public static final ErrorMsg DOWNLOAD_ERROR = new ErrorMsg(508, "下载错误");

    public static final ErrorMsg OTHER_SYSTEM_ERROR = new ErrorMsg(509, "调用系统异常");
}

```

