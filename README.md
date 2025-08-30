# 🚀 Spring Boot User Management API

一个完整的、生产就绪（Production-Ready）的 RESTful API，用于用户管理。项目使用 Spring Boot 3 和 PostgreSQL 构建，并通过 Docker 容器化，实现了一键部署。

## ✨ 功能特性

- **完整的 CRUD 操作**: 创建、读取、更新、删除用户信息。
- **数据验证**: 使用 Spring Validation 确保输入数据的正确性。
- **全局异常处理**: 统一的 RESTful 响应格式，提供良好的客户端体验。
- **容器化部署**: 使用 Docker 和 Docker Compose，实现环境隔离和一键启动。
- **数据库持久化**: 使用 PostgreSQL 可靠地存储数据。

## 🛠 技术栈

- **后端框架**: Spring Boot 3, Spring Data JPA
- **数据库**: PostgreSQL
- **容器化**: Docker, Docker Compose
- **构建工具**: Maven
- **API 测试**: Postman

## 📁 项目结构
## 📁 项目结构
springboot-postgresql-demo/
├── src/main/java/com/example/springbootdemo
│ ├── controller/ # REST 控制器
│ ├── service/ # 业务逻辑层
│ ├── repository/ # 数据持久层
│ ├── pojo/ # 实体类
│ └── dto/ # 数据传输对象
├── src/main/resources
│ └── application.properties # 应用配置
├── Dockerfile # 应用容器化配置
├── docker-compose.yml # 多服务编排配置
└── pom.xml # Maven 依赖配置


## 📚 API 文档

### 用户管理

| 方法 | 端点 | 描述 | 示例请求体 |
|:-----|:-----|:-----|:-----------|
| `POST` | `/users` | 创建新用户 | `{"userName": "john", "password": "123456789", "email": "john@example.com"}` |
| `GET` | `/users` | 获取所有用户列表 | - |
| `GET` | `/users/{id}` | 根据ID获取用户详情 | - |
| `PUT` | `/users` | 更新用户信息 | `{"userId": 1, "userName": "john_doe", "email": "john.doe@example.com"}` |
| `DELETE` | `/users/{id}` | 删除用户 | - |

**成功响应示例 (200 OK):**
```json
{
    "code": 200,
    "message": "success",
    "data": {
        "userId": 1,
        "userName": "john",
        "password": "123456789",
        "email": "john@example.com"
    }
}
快速开始 (通过 Docker Compose)
最快的方式运行本项目，只需两步：

前提条件: 确保系统已安装 Docker 和 Docker Compose。

克隆并启动:

bash
# 1. 克隆项目
git clone https://github.com/[你的用户名]/springboot-postgresql-demo.git
cd springboot-postgresql-demo

# 2. 一键启动所有服务 (Spring Boot App + PostgreSQL Database)
docker-compose up
访问应用: 应用启动后，API 服务将在 http://localhost:8080 上运行。使用 Postman 或任何 HTTP 客户端测试上述 API 接口。

📝 本地开发
（可选部分，如果你希望他人参与开发）
如需在本地开发环境中运行，请确保配置好 Java 17 和 PostgreSQL...
（这里可以补充如何修改配置连接本地数据库的步骤）

text

#### 2. 提交并推送到 GitHub

更新好 README 后，将其推送到远程仓库。

```bash
# 添加并提交README的更改
git add README.md
git commit -m "docs: complete project README with features, tech stack, API docs, and setup instructions"

# 推送到GitHub
git push origin master
