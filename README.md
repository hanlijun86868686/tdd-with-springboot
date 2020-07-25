-----------------
## 示例:停车场管理系统
    作 为: 一个停⻋场小弟 
    我希望:能实现停⻋、取⻋功能 
    以便于:更好的服务⻋主
    
##### 存车
- Given 一个停车场，一辆汽车，When 泊车，Then 得到泊车凭证
- Given 停车场已满，When 泊车，Then '无法停车'

##### 取车
- Given 一个有效的停车Token，When 取车，Then 取到存放的车 
- Given 一个有效的Token，When 取车，Then 可以进行泊车
- Given 一个使用过的Token，When 取车，Then '车辆不存在'
- Given 一个停车场，一个无效的Token，When 取车，Then '车辆不存在'

---------------------
## 练习一：企业注册
    作 为: 企业的法人
    我希望: 能够能够注册成为E章通系统用户
    以便于: 使用印章系统的相关功能
    
    AC-1：法人类型：企业、农专社、个体工商户 （必选）
    AC-2：企业全称：字符 50字（必填）
    AC-3：企业统一社会信用代码：字符 18位（必填）
        3.1 如果社会信用代码已注册，提示："当前企业已注册"
        3.2 如果统一社会信用代码与企业名称不匹配（工商系统验证），提示:“统一社会信用代码与企业名称不匹配”
    AC-4：法人姓名：字符 20位（必填）
    AC-5：证件类型：身份证、护照（必填）
    AC-6：证件号码：身份证 18位，护照 14位（必填）
    AC-7：同步成为中国政务服务平台用户 必须


#### 任务拆分
- Given 合法的注册信息 When 注册 Then 注册成功
- Given 法人信息已注册 When 注册 Then 注册失败 - 提示已注册
- Given 工商代码和企业信息不匹配 When 注册 Then 注册失败 - 统一社会信用代码与企业名称不匹配
- Given 用已注册统一社会信用代码 When 注册 Then 注册失败 - 当前企业已注册
- Given 统一社会信用代码 ！= 18 位 When 注册 Then 注册失败 - 统一社会信用代码不合法
- Given 企业名称大于50个字或者为空  When 注册 Then 注册失败 - 企业名称不合法
- Given 法人姓名为空或者大于20位 When 注册 Then 注册失败 - 法人名称不合法
- Given 证照（身份证不等于18位，护照不等于14位） When 注册 Then 注册失败 - 证件号码不合法
- Given 不同意成为中国政务服务平台用户 When 注册 Then 注册失败 - 无法注册
- Given 法人类型，证件类型不选择 When 注册 Then 注册失败 - 无法注册