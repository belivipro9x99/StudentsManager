package com.github.belivipro9x99.studentsmanager;

import java.io.File;

import com.github.belivipro9x99.studentsmanager.Objects.GiangVien;
import com.github.belivipro9x99.studentsmanager.Objects.KhoaController;
import com.github.belivipro9x99.studentsmanager.Objects.SinhVien;

public class ConsoleApp {
	public static KhoaController khoaController;

	public static void main(String[] args) throws Exception {
		File saveFile = new File("data.dat");
		khoaController = new KhoaController(saveFile);

		//khoaController.addSinhVien(new SinhVien("Vu Tuan Dat", "20A234524141"));
		khoaController.addGiangVien(new GiangVien("Nguyễn Đắc Phương Thảo", "A212412353225"));

		for (SinhVien sinhVien: khoaController.getSinhVienList())
			System.out.println(sinhVien);

		for (GiangVien giangVien: khoaController.getGiangVienList())
			System.out.println(giangVien);

		khoaController.save(saveFile);
	}
}
