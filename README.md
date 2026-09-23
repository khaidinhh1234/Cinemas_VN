# 🎬 Cinemas_VN - Hệ thống đặt vé xem phim

**Cinemas_VN** là dự án quản lý và đặt vé xem phim, được xây dựng nhằm mô phỏng quy trình hoạt động của một hệ thống rạp chiếu phim.

Người dùng có thể xem danh sách phim, suất chiếu, lựa chọn ghế và thực hiện đặt vé. Hệ thống đồng thời hỗ trợ quản lý dữ liệu phim, rạp, phòng chiếu, ghế, suất chiếu và vé.

---

## 📌 Mục tiêu dự án

Dự án được xây dựng nhằm:

- Thực hành lập trình **Java**
- Thực hành kết nối và thao tác với **Oracle Database**
- Áp dụng kiến thức **OOP**
- Thực hành thiết kế và quản lý cơ sở dữ liệu
- Xây dựng quy trình đặt vé xem phim
- Thực hành CRUD dữ liệu
- Áp dụng Git/GitHub trong quản lý source code

---

## 🚀 Chức năng chính

### 👤 Người dùng

- Đăng ký tài khoản
- Đăng nhập
- Xem danh sách phim
- Xem thông tin chi tiết phim
- Xem lịch chiếu
- Chọn suất chiếu
- Chọn ghế
- Đặt vé
- Xem thông tin vé đã đặt

### 🎞️ Quản lý phim

- Thêm phim
- Cập nhật thông tin phim
- Xóa phim
- Tìm kiếm phim
- Xem danh sách phim

### 🏢 Quản lý rạp và phòng chiếu

- Quản lý rạp
- Quản lý phòng chiếu
- Quản lý số lượng ghế
- Quản lý trạng thái ghế

### 🕐 Quản lý suất chiếu

- Tạo suất chiếu
- Cập nhật suất chiếu
- Xóa suất chiếu
- Kiểm tra lịch chiếu
- Liên kết phim với phòng chiếu

### 🎟️ Quản lý vé

- Đặt vé
- Kiểm tra ghế đã đặt
- Hủy vé
- Tra cứu thông tin vé
- Tính tổng tiền vé

---

## 🛠️ Công nghệ sử dụng

| Công nghệ       | Mục đích                 |
| --------------- | ------------------------ |
| Java            | Ngôn ngữ lập trình chính |
| Oracle Database | Quản lý cơ sở dữ liệu    |
| JDBC            | Kết nối Java với Oracle  |
| OOP             | Thiết kế chương trình    |
| Git             | Quản lý phiên bản        |
| GitHub          | Lưu trữ source code      |

---

## 📂 Cấu trúc dự án

```text
Cinemas_VN/
│
├── lib/
│   └── Các thư viện cần thiết
│
├── src/
│   ├── model/
│   ├── dao/
│   ├── service/
│   ├── controller/
│   ├── utils/
│   └── Main.java
│
├── README.md
└── ...
```

> Cấu trúc thư mục có thể thay đổi trong quá trình phát triển dự án.

---

## 🗄️ Cơ sở dữ liệu

Hệ thống dự kiến quản lý các nhóm dữ liệu:

```text
USER
MOVIE
CINEMA
ROOM
SEAT
SHOWTIME
TICKET
BOOKING
```

Mối quan hệ cơ bản:

```text
MOVIE
   │
   └── SHOWTIME
          │
          └── ROOM
                │
                └── SEAT

USER
   │
   └── BOOKING
          │
          └── TICKET
                │
                └── SHOWTIME
```

---

## 🔄 Quy trình đặt vé

```text
Đăng nhập
   ↓
Xem danh sách phim
   ↓
Chọn phim
   ↓
Chọn suất chiếu
   ↓
Chọn ghế
   ↓
Kiểm tra ghế
   ↓
Xác nhận đặt vé
   ↓
Tính tiền
   ↓
Lưu thông tin vé
   ↓
Hoàn tất
```

---

## 💻 Yêu cầu môi trường

Để chạy dự án, cần cài đặt:

- JDK 21 hoặc phiên bản tương thích
- Oracle Database
- Oracle JDBC Driver
- IDE hỗ trợ Java
- Git

---

## ⚙️ Cài đặt

### 1. Clone project

```bash
git clone https://github.com/khaidinhh1234/Cinemas_VN.git
```

### 2. Di chuyển vào project

```bash
cd Cinemas_VN
```

### 3. Cấu hình Oracle Database

Tạo database/schema và các bảng cần thiết.

Cấu hình thông tin kết nối trong project:

```java
String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
String username = "YOUR_USERNAME";
String password = "YOUR_PASSWORD";
```

> Không nên commit username/password thật lên GitHub.

### 4. Chạy chương trình

Mở project bằng IDE và chạy:

```text
Main.java
```

---

## 🔐 Bảo mật

Thông tin nhạy cảm không nên được đưa trực tiếp vào source code.

Ví dụ:

```java
String username = System.getenv("DB_USERNAME");
String password = System.getenv("DB_PASSWORD");
```

Có thể sử dụng biến môi trường để lưu thông tin đăng nhập database.

---

## 📈 Hướng phát triển

Trong tương lai dự án có thể mở rộng thêm:

- [ ] Giao diện Java Swing/JavaFX
- [ ] Thanh toán online
- [ ] Mã QR vé
- [ ] Email xác nhận đặt vé
- [ ] Đăng nhập và phân quyền Admin/User
- [ ] Thống kê doanh thu
- [ ] Quản lý khuyến mãi
- [ ] Đánh giá phim
- [ ] Tìm kiếm và lọc phim
- [ ] API Backend
- [ ] Web/Mobile App

---

## 👨‍💻 Tác giả

**Nguyễn Đình Khải**

GitHub:
https://github.com/khaidinhh1234

Repository:
https://github.com/khaidinhh1234/Cinemas_VN

---

## 📄 License

Dự án được xây dựng cho mục đích **học tập và thực hành lập trình**.
