# 🚗 SmartPark - Hệ thống quản lý bãi đỗ xe

**SmartPark** là dự án quản lý bãi đỗ xe, được xây dựng nhằm mô phỏng quy trình hoạt động của một hệ thống trông giữ phương tiện.

Hệ thống hỗ trợ quản lý khách hàng, phương tiện, khu vực đỗ xe, vị trí đỗ, nhân viên, vé gửi xe, bảng giá và thanh toán. Người dùng có thể đăng ký phương tiện, gửi xe, nhận vé, lấy xe và thanh toán phí gửi xe.

---

## 📌 Mục tiêu dự án

Dự án được xây dựng nhằm:

- Thực hành lập trình **Java**
- Thực hành kết nối và thao tác với **Oracle Database**
- Áp dụng kiến thức **OOP**
- Thực hành thiết kế và quản lý cơ sở dữ liệu
- Xây dựng quy trình quản lý bãi đỗ xe
- Thực hành CRUD dữ liệu
- Áp dụng Git/GitHub trong quản lý source code
- Thực hành SQL, JDBC và xử lý dữ liệu trong Java

---

## 🚀 Chức năng chính

### 👤 Quản lý khách hàng

- Thêm khách hàng
- Cập nhật thông tin khách hàng
- Xóa khách hàng
- Tìm kiếm khách hàng
- Xem danh sách khách hàng
- Xem các phương tiện thuộc khách hàng

### 🚗 Quản lý phương tiện

- Thêm phương tiện
- Cập nhật thông tin phương tiện
- Xóa phương tiện
- Tìm kiếm phương tiện theo biển số
- Quản lý loại phương tiện
- Xem lịch sử gửi xe của phương tiện

### 🅿️ Quản lý khu vực và vị trí đỗ

- Quản lý khu vực bãi đỗ
- Thêm vị trí đỗ
- Cập nhật vị trí đỗ
- Xóa vị trí đỗ
- Kiểm tra vị trí còn trống
- Kiểm tra vị trí đang sử dụng
- Quản lý trạng thái vị trí:
  - Trống
  - Đang đỗ
  - Bảo trì

### 🎫 Quản lý vé gửi xe

- Tạo vé khi xe vào
- Ghi nhận thời gian xe vào
- Ghi nhận vị trí đỗ
- Tìm kiếm vé theo mã vé
- Tìm kiếm vé theo biển số
- Ghi nhận thời gian xe ra
- Cập nhật trạng thái vé
- Hủy vé trong trường hợp cần thiết

### 👨‍💼 Quản lý nhân viên

- Thêm nhân viên
- Cập nhật thông tin nhân viên
- Xóa nhân viên
- Tìm kiếm nhân viên
- Quản lý chức vụ
- Theo dõi nhân viên thực hiện giao dịch

### 💰 Quản lý bảng giá

- Thêm bảng giá
- Cập nhật bảng giá
- Xóa bảng giá
- Quản lý giá theo loại phương tiện
- Quản lý giá theo thời gian gửi
- Tra cứu bảng giá hiện tại

### 💳 Quản lý thanh toán

- Tính phí gửi xe
- Ghi nhận thanh toán
- Quản lý phương thức thanh toán
- Tra cứu giao dịch
- In/thống kê hóa đơn
- Thống kê doanh thu

### 📊 Thống kê và báo cáo

- Thống kê số lượng xe đang gửi
- Thống kê vị trí còn trống
- Thống kê số lượt xe vào/ra
- Thống kê doanh thu
- Thống kê doanh thu theo ngày
- Thống kê doanh thu theo tháng
- Thống kê số lượng phương tiện theo loại

---

## 🛠️ Công nghệ sử dụng

| Công nghệ       | Mục đích                  |
| --------------- | ------------------------- |
| Java            | Ngôn ngữ lập trình chính  |
| Oracle Database | Quản lý cơ sở dữ liệu     |
| JDBC            | Kết nối Java với Oracle   |
| OOP             | Thiết kế chương trình     |
| SQL             | Truy vấn và xử lý dữ liệu |
| Git             | Quản lý phiên bản         |
| GitHub          | Lưu trữ source code       |

---

## 📂 Cấu trúc dự án

```text
SmartPark/
│
├── lib/
│   └── ojdbc.jar
│
├── src/
│   ├── model/
│   ├── dao/
│   ├── service/
│   ├── controller/
│   ├── utils/
│   └── Main.java
│
├── sql/
│   ├── create_tables.sql
│   ├── insert_data.sql
│   └── queries.sql
│
├── README.md
└── ...
```

> Cấu trúc thư mục có thể thay đổi trong quá trình phát triển dự án.

---

## 🗄️ Cơ sở dữ liệu

Hệ thống dự kiến quản lý các nhóm dữ liệu:

```text
KHACH_HANG
LOAI_XE
PHUONG_TIEN
KHU_VUC
VI_TRI_DO
NHAN_VIEN
VE_GUI_XE
BANG_GIA
THANH_TOAN
```

### Mối quan hệ cơ bản

```text
KHACH_HANG
     │
     └── PHUONG_TIEN
             │
             └── VE_GUI_XE
                    │
                    ├── VI_TRI_DO
                    │       │
                    │       └── KHU_VUC
                    │
                    └── THANH_TOAN

LOAI_XE
     │
     ├── PHUONG_TIEN
     │
     └── BANG_GIA

NHAN_VIEN
     │
     ├── VE_GUI_XE
     │
     └── THANH_TOAN
```

---

## 🔄 Quy trình gửi xe

```text
Khách hàng đưa xe vào
        ↓
Nhân viên kiểm tra biển số
        ↓
Kiểm tra vị trí trống
        ↓
Chọn vị trí đỗ
        ↓
Tạo vé gửi xe
        ↓
Ghi nhận thời gian vào
        ↓
Cập nhật vị trí = ĐANG ĐỖ
        ↓
Hoàn tất gửi xe
```

---

## 🚘 Quy trình lấy xe

```text
Khách hàng yêu cầu lấy xe
        ↓
Nhập mã vé / biển số
        ↓
Tìm thông tin vé
        ↓
Kiểm tra thời gian gửi
        ↓
Tính phí gửi xe
        ↓
Khách hàng thanh toán
        ↓
Ghi nhận thời gian ra
        ↓
Cập nhật vé = ĐÃ THANH TOÁN
        ↓
Cập nhật vị trí = TRỐNG
        ↓
Hoàn tất
```

---

## 💰 Quy trình tính phí

```text
Thời gian vào
      ↓
Thời gian ra
      ↓
Tính thời gian gửi
      ↓
Xác định loại phương tiện
      ↓
Tra bảng giá
      ↓
Tính tổng tiền
      ↓
Thanh toán
```

Ví dụ:

```text
Xe máy
1 giờ → 5.000 VNĐ

Ô tô
1 giờ → 30.000 VNĐ
```

> Bảng giá thực tế có thể được thay đổi tùy theo yêu cầu của đề tài.

---

## 📋 Một số nghiệp vụ chính

### Xe vào bãi

Hệ thống phải kiểm tra:

- Phương tiện có tồn tại hay không
- Biển số xe có hợp lệ hay không
- Bãi còn vị trí trống hay không
- Vị trí có phù hợp với loại xe hay không

Sau khi tạo vé thành công:

```text
VI_TRI_DO.TRANG_THAI = 'DANG_DO'
```

### Xe ra khỏi bãi

Hệ thống:

- Tìm vé gửi xe
- Kiểm tra vé còn hiệu lực
- Ghi nhận thời gian ra
- Tính tiền
- Ghi nhận thanh toán
- Cập nhật trạng thái vé
- Giải phóng vị trí đỗ

Sau khi xe ra:

```text
VI_TRI_DO.TRANG_THAI = 'TRONG'
```

---

## 🗃️ Một số truy vấn báo cáo

### Danh sách xe đang gửi

```sql
SELECT *
FROM VE_GUI_XE
WHERE TRANG_THAI = 'DANG_GUI';
```

### Danh sách vị trí còn trống

```sql
SELECT *
FROM VI_TRI_DO
WHERE TRANG_THAI = 'TRONG';
```

### Tìm xe theo biển số

```sql
SELECT *
FROM PHUONG_TIEN
WHERE BIEN_SO = '29A-12345';
```

### Tổng doanh thu

```sql
SELECT SUM(SO_TIEN) AS TONG_DOANH_THU
FROM THANH_TOAN;
```

### Doanh thu theo ngày

```sql
SELECT TRUNC(THOI_GIAN_THANH_TOAN) AS NGAY,
       SUM(SO_TIEN) AS DOANH_THU
FROM THANH_TOAN
GROUP BY TRUNC(THOI_GIAN_THANH_TOAN)
ORDER BY NGAY;
```

---

## 💻 Yêu cầu môi trường

Để chạy dự án, cần cài đặt:

- JDK 21 hoặc phiên bản tương thích
- Oracle Database
- Oracle JDBC Driver
- Oracle SQL Developer
- IDE hỗ trợ Java
- Git

---

## ⚙️ Cài đặt

### 1. Clone project

```bash
git clone https://github.com/khaidinhh1234/SmartPark.git
```

### 2. Di chuyển vào project

```bash
cd SmartPark
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

Có thể sử dụng biến môi trường:

```java
String username = System.getenv("DB_USERNAME");
String password = System.getenv("DB_PASSWORD");
```

Các thông tin như:

- Username database
- Password database
- API key
- Secret key

không nên commit trực tiếp lên GitHub.

---

## 📈 Hướng phát triển

Trong tương lai dự án có thể mở rộng thêm:

- Giao diện Java Swing/JavaFX
- Đăng nhập và phân quyền Admin/Nhân viên
- In vé gửi xe
- Mã QR cho vé
- Quét QR khi xe ra
- Thanh toán online
- Quản lý nhiều bãi đỗ
- Quản lý vé tháng
- Quản lý khách hàng thân thiết
- Quản lý xe gửi theo tháng
- Thống kê doanh thu bằng biểu đồ
- Cảnh báo bãi xe đầy
- Camera nhận diện biển số
- Nhận diện biển số bằng AI
- API Backend
- Web/Mobile App

---

## 👨‍💻 Thành viên nhóm

```text
1. Đào Trọng Được
2. Nguyễn Đình Khải
3. Trần Quang Hiệp
4. Thành viên 4
5. Thành viên 5
```

### Phân công dự kiến

```text
TV1 → Phân tích nghiệp vụ + thiết kế CSDL + ERD

TV2 → Khách hàng + phương tiện

TV3 → Khu vực + vị trí đỗ

TV4 → Nhân viên + vé gửi xe

TV5 → Bảng giá + thanh toán + báo cáo
```

---

## 📄 License

Dự án được xây dựng cho mục đích **học tập và thực hành lập trình**.

---

## 📌 Thông tin dự án

**Project:** SmartPark
**Topic:** Hệ thống quản lý bãi đỗ xe
**Language:** Java
**Database:** Oracle Database
**Architecture:** Java OOP + DAO + Service + JDBC
**Version:** 1.0.0
