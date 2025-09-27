# 阳哥小助手前端

一个基于 Vue3 的 AI 编程学习和求职面试助手前端应用，模仿 ChatGPT 的界面设计。

## 功能特性

- 🎨 现代化的 ChatGPT 风格界面
- 💬 实时流式对话（SSE）
- 📱 响应式设计，支持移动端
- 💾 本地存储聊天历史
- 🔄 多会话管理
- ⚡ Vue3 + Vite 快速开发

## 技术栈

- **Vue 3** - 渐进式 JavaScript 框架
- **Vite** - 快速构建工具
- **Axios** - HTTP 请求库
- **Server-Sent Events (SSE)** - 实时数据流

## 快速开始

### 1. 安装依赖

```bash
npm install
```

### 2. 启动开发服务器

```bash
npm run dev
```

应用将在 `http://localhost:3000` 启动

### 3. 构建生产版本

```bash
npm run build
```

## 项目结构

```
src/
├── App.vue          # 主应用组件
├── main.js          # 应用入口
└── style.css        # 全局样式
```

## 后端接口

应用通过以下接口与后端通信：

- **GET** `/api/myai/chat?memoryId={id}&message={message}` - 流式聊天接口

## 功能说明

### 聊天界面
- 左侧边栏显示聊天历史记录
- 主区域显示当前对话内容
- 底部输入框支持多行文本和快捷键发送

### 会话管理
- 自动生成唯一的会话 ID
- 支持创建新对话
- 本地存储聊天历史

### 实时通信
- 使用 Server-Sent Events (SSE) 实现实时流式响应
- 支持打字指示器显示
- 自动滚动到最新消息

## 开发说明

### 环境要求
- Node.js >= 16
- npm >= 8

### 代理配置
开发环境下，Vite 已配置代理，将 `/api` 请求转发到 `http://localhost:8081`

### 样式定制
所有样式都在 `src/style.css` 中定义，采用现代 CSS 设计，支持暗色主题适配。

## 部署

构建后的文件在 `dist/` 目录中，可以部署到任何静态文件服务器。

## 许可证

MIT License
