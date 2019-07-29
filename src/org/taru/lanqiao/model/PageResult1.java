package org.taru.lanqiao.model;

import java.util.List;

public class PageResult1 {
	private int pageNum;
	private int pageSize;
	private int pages;
	private int total;
	private List<Product> list;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int i) {
		this.pages = i;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int size) {
		this.total = size;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	public List getList() {
		return list;
	}
	
}
