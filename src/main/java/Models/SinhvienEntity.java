package Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "sinhvien", schema = "java_test", catalog = "")
public class SinhvienEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "masv")
    private int masv;
    @Basic
    @Column(name = "hoten")
    private String hoten;
    @Basic
    @Column(name = "ngaysinh")
    private Date ngaysinh;
    @Basic
    @Column(name = "gioitinh")
    private Object gioitinh;
    @Basic
    @Column(name = "diachi")
    private String diachi;
    @Basic
    @Column(name = "lop")
    private String lop;

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Object getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Object gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinhvienEntity that = (SinhvienEntity) o;

        if (masv != that.masv) return false;
        if (hoten != null ? !hoten.equals(that.hoten) : that.hoten != null) return false;
        if (ngaysinh != null ? !ngaysinh.equals(that.ngaysinh) : that.ngaysinh != null) return false;
        if (gioitinh != null ? !gioitinh.equals(that.gioitinh) : that.gioitinh != null) return false;
        if (diachi != null ? !diachi.equals(that.diachi) : that.diachi != null) return false;
        if (lop != null ? !lop.equals(that.lop) : that.lop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masv;
        result = 31 * result + (hoten != null ? hoten.hashCode() : 0);
        result = 31 * result + (ngaysinh != null ? ngaysinh.hashCode() : 0);
        result = 31 * result + (gioitinh != null ? gioitinh.hashCode() : 0);
        result = 31 * result + (diachi != null ? diachi.hashCode() : 0);
        result = 31 * result + (lop != null ? lop.hashCode() : 0);
        return result;
    }
}
