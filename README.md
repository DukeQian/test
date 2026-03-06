# 指标数据获取接口文档

## 概述

`IndicatorController` 是用于获取指标数据的控制器，提供指标数据的查询功能。

## 接口信息

### 基本信息

- **控制器类**: `org.duke.controller.IndicatorController`
- **基础路径**: `/indicator`
- **请求方式**: POST
- **接口路径**: `/indicator/getIndicatorData`

## 请求参数

### 请求体 (Request Body)

**类型**: `application/json`

**数据结构**: `IndicatorRequest`

| 字段名 | 类型 | 必填 | 说明 |
|--------|------|------|------|
| inputParams | `Map<String, Object>` | 否 | 输入参数 |
| indicators | `Set<String>` | 是 | 指标集合 |
| businessId | `Long` | 否 | 业务ID |
| riskControlId | `Long` | 否 | 风控ID |

### 请求示例

```json
{
  "inputParams": {
    "userId": "12345",
    "amount": 1000
  },
  "indicators": [
    "risk_score",
    "credit_rating",
    "transaction_amount"
  ],
  "businessId": 1001,
  "riskControlId": 2001
}
```

## 响应数据

### 响应结构

**类型**: `application/json`

**数据结构**: `Map<String, String>`

| 字段名 | 类型 | 说明 |
|--------|------|------|
| key | `String` | 指标名称 |
| value | `String` | 指标值 |

### 响应示例

```json
{
  "risk_score": "",
  "credit_rating": "",
  "transaction_amount": ""
}
```

## 功能说明

1. **指标数据获取**: 根据请求中的指标集合，返回对应的指标数据映射
2. **空值处理**: 如果 indicators 为空或 null，返回空的 Map
3. **数据转换**: 将 Set 类型的指标集合转换为 Map 类型的键值对结构

## 使用场景

- 风控系统指标数据查询
- 业务数据指标获取
- 实时指标数据监控

## 注意事项

- 请求必须包含 indicators 字段
- 返回的 Map 中，key 为指标名称，value 当前为空字符串（可根据实际业务需求填充）
- 建议在业务层实现具体的指标数据获取逻辑
