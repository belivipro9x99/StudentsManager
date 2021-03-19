package com.github.belivipro9x99.studentsmanager.Objects;

import java.io.Serializable;

public class PhongHoc implements Serializable {
    private static final long serialVersionUID = -2736920632304171816L;
    
    String soPhong;
    LopHoc[] lopHoc;

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    @Override
    public String toString(){
        return String.format("SoPhong[soPhong=%s]", soPhong);
    }
}