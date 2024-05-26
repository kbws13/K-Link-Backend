# K-Link-Backend
短链接生成项目

## 亮点

1. 使用 Redisson 实现布隆过滤器，判断是否发生 Hash 冲突
2. 使用非加密型哈希算法 MurmurHash3 实现了加密生成短链
3. 使用拼接分布式 ID 的方式来解决 Hash 冲突
4. 使用 Jsoup 来解析长链的 title 以及 icon

## 拓展

1. SDK 开发
2. 批量短链生成
3. 短链卡片分享
4. 引入会员系统
