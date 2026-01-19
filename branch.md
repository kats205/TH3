## 2. Quản lý Branch

### 2.1. Chiến lược Branch (Git Flow đơn giản)

**Branch chính:**
- `main`: Code production, luôn ổn định
- `develop`: Code đang phát triển, merge từ các feature branch

**Branch phụ:**
- `feature/ten-tinh-nang`: Phát triển tính năng mới
- `bugfix/ten-loi`: Sửa lỗi
- `hotfix/ten-loi-khan`: Sửa lỗi khẩn cấp trên production

### 2.2. Quy tắc đặt tên Branch
```bash
# Tốt
feature/user-authentication
bugfix/login-error
hotfix/security-patch

# Tránh
new-feature
fix
update
```

### 2.3. Hướng dẫn Tạo Branch Protection Rules

#### Bước 1: Truy cập Repository Settings
1. Mở trình duyệt và vào repository: `https://github.com/kats205/NextGenLMS`
2. Click vào tab **Settings** (góc trên bên phải)
   - *Lưu ý: Cần có quyền Owner hoặc Admin để thấy tab này*

#### Bước 2: Vào mục Branches
1. Trong menu bên trái, tìm phần **Code and automation**
2. Click vào **Branches**
3. Tại phần **Branch protection rules**, click nút **Add rule** (hoặc **Add branch protection rule**)

#### Bước 3: Cấu hình Rule cho branch `main`

**A. Branch name pattern:**
```
main
```
*Nhập chính xác tên branch cần bảo vệ*

**B. Bật các tùy chọn sau (tích checkbox):**

**✅ Require a pull request before merging**
- Bắt buộc mọi thay đổi phải qua Pull Request
- **Không** cho phép push trực tiếp vào `main`

Trong phần này, bật thêm:
- ✅ **Require approvals**: Chọn số lượng = **1**
  - *Nghĩa là: PR phải có ít nhất 1 người approve trước khi merge*
  
- ✅ **Dismiss stale pull request approvals when new commits are pushed**
  - *Nghĩa là: Nếu có commit mới sau khi approve, approval cũ sẽ bị hủy*
  - *Đảm bảo reviewer xem lại code mới nhất*

- ✅ **Require review from Code Owners** (Tùy chọn)
  - *Chỉ bật nếu đã tạo file `.github/CODEOWNERS`*

**✅ Require conversation resolution before merging**
- Bắt buộc giải quyết hết comment/discussion trước khi merge
- Tránh bỏ sót feedback

**✅ Require status checks to pass before merging** (Nếu có CI/CD)
- Bật nếu đã setup GitHub Actions
- Đảm bảo code pass test trước khi merge
- *Có thể bỏ qua nếu chưa có CI/CD*

**✅ Require branches to be up to date before merging**
- Đảm bảo branch đã cập nhật code mới nhất từ `main`
- Tránh conflict khi merge

**✅ Include administrators**
- **QUAN TRỌNG!** Bắt buộc cả Owner/Admin cũng phải tuân thủ quy tắc
- Không ai được đặc quyền push trực tiếp vào `main`

**C. Các tùy chọn KHÔNG nên bật (cho người mới):**

❌ **Require linear history**
- Bắt buộc lịch sử commit phải tuyến tính (không có merge commit)
- Có thể gây khó khăn khi làm việc nhóm

❌ **Require deployments to succeed before merging**
- Chỉ dùng khi đã setup deployment pipeline

❌ **Lock branch**
- Khóa branch, chỉ đọc (read-only)
- Chỉ dùng cho branch archive

❌ **Do not allow bypassing the above settings**
- Không cho phép ai bypass rule (kể cả Owner)
- Chỉ bật khi team đã quen với quy trình

#### Bước 4: Lưu lại
1. Kéo xuống cuối trang
2. Click nút **Create** (nếu tạo mới) hoặc **Save changes** (nếu chỉnh sửa)
3. Xác nhận rule đã được tạo thành công

#### Bước 5: Kiểm tra
1. Thử push trực tiếp vào `main`:
   ```bash
   git checkout main
   git commit --allow-empty -m "test"
   git push origin main
   ```
   → Sẽ bị **từ chối** (đúng như mong đợi)

2. Tạo PR để kiểm tra:
   ```bash
   git checkout -b test-branch
   git commit --allow-empty -m "test PR"
   git push origin test-branch
   ```
   → Tạo PR trên GitHub → Kiểm tra có yêu cầu approval không

---

### 2.4. Kết quả sau khi thiết lập

✅ **Không ai** (kể cả Owner) có thể push trực tiếp vào `main`  
✅ Mọi thay đổi **phải qua Pull Request**  
✅ PR phải có **ít nhất 1 approval** từ người khác  
✅ Tất cả **comment phải được giải quyết** trước khi merge  
✅ Chỉ người có quyền **Write trở lên** mới thấy nút **Merge**  

---

### 2.5. Quy trình làm việc sau khi có Branch Protection

---
