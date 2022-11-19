create database DuAn1
IF OBJECT_ID('NhanVien') is not null
drop table NhanVien
go 
create table NhanVien(
MaNV varchar(50) primary key not null,
TenNV nvarchar(50),
GioiTinh bit,
NgaySinh Date,
SoDienThoai varchar(20),
Email varchar(50),
MatKhau varchar(100),
VaiTro nvarchar(50),
TrangThai nvarchar(100),
)
if OBJECT_ID('KhachHang') is not null
drop table KhachHang
go
create table KhachHang(
MaKH varchar(100) primary key not null,
TenKh nvarchar(100),
SoDienThoai varchar(20),
DiaChi nvarchar(100),
)
if OBJECT_ID('HoaDon') is not null
drop table HoaDon
go
create table HoaDon(
MaHoaDon varchar(50),
NgayTao Date,
TienShip float,
TongTien float,
HTThanhToan nvarchar(50),
TinhTrang nvarchar(50),
GhiChu nvarchar(1000),
MaNV varchar(50),
MaKH varchar(100),
constraint PK_HoaDon primary key(MaHoaDon),
constraint FK_HoaDon_NhanVien foreign key (MaNV) references NhanVien,
constraint FK_HoaDon_KhachHang foreign key (MaKH) references KhachHang,
)
if OBJECT_ID('MauSac') is not null
drop table MauSac
go
create table MauSac(
MaMauSac varchar(50) not null,
TenMauSac nvarchar(50),
constraint PK_MauSac primary key (MaMauSac),
)
if OBJECT_ID('KichThuoc') is not null
drop table KichThuoc
go
create table KichThuoc(
MaKichThuoc varchar(50) not null,
TenKinhThuoc nvarchar(50),
constraint PK_KichThuoc primary key (MaKichThuoc),
)
if OBJECT_ID('LoaiSanPham') is not null
drop table LoaiSanPham
go
create table LoaiSanPham(
MaLoaiSanPham varchar(50) not null,
TenLoaiSanPham nvarchar(50),
constraint PK_LoaiSanPham primary key (MaLoaiSanPham),
)
if OBJECT_ID('ChatLieu') is not null
drop table ChatLieu
go
create table ChatLieu(
MaChatLieu varchar(50) not null,
TenChatLieu nvarchar(50),
constraint PK_ChatLieu primary key (MaChatLieu),
)
if OBJECT_ID('SanPham') is not null
drop table SanPham
go
create table SanPham(
MaSanPham varchar(100),
TenSanPham nvarchar(1000),
SoLuong int,
GiaBan float,
Mota nvarchar(100),
MaChatLieu varchar(50),
MaLoaiSanPham varchar(50),
MaKichThuoc varchar(50),
MaMauSac varchar(50),
constraint PK_SanPham primary key(MaSanPham),
constraint FK_SanPham_ChatLieu foreign key (MaChatLieu) references ChatLieu,
constraint FK_SanPham_MauSac foreign key (MaMauSac) references MauSac,
constraint FK_SanPham_KichThuoc foreign key (MaKichThuoc) references KichThuoc,
constraint FK_SanPham_LoaiSanPham foreign key (MaLoaiSanPham) references LoaiSanPham,
)
if OBJECT_ID('ChiTietHoaDon') is not null
drop table ChiTietHoaDon
go
create table ChiTietHoaDon(
MaHoaDon varchar(50),
MaSanPham varchar(100),
SoLuong int,
DonGia float,
GiamGia int,
ThanhTien float,
constraint PK_ChiTietHoaDon primary key(MaHoaDon,MaSanPham),
constraint FK_ChiTietHoaDon_HoaDon foreign key(MaHoaDon) references HoaDon,
constraint FK_ChiTietHoaDon_SanPham foreign key(MaSanPham) references SanPham,
)
if OBJECT_ID('KhuyenMai') is not null
drop table KhuyenMai
go
create table KhuyenMai(
MaKhuyenMai varchar(50) not null,
TenKhuyenMai nvarchar(50),
NgayBatDau Date,
NgayKetThuc Date,
GiamGia int,
TrangThai bit,
MaSanPham varchar(100),
constraint PK_KhuyenMai primary key (MaKhuyenMai),
constraint FK_KhuyenMai_SanPham foreign key(MaSanPham) references SanPham,
)

	
