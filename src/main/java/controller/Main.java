package controller;

import java.util.List;

import dao.MemoDAO;
import vo.MemoVO;

public class Main {

	public static void main(String[] args) {
		List<MemoVO> list = new MemoDAO().searchlist("test");
		for(MemoVO m: list) {
			System.out.println(m);
		}
	}

}
