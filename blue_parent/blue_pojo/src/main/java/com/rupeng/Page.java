package com.rupeng;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 11:16
 * @description: Page
 * @modified By：
 **/
public class Page {
    private int currentPage; //当前页
    private int totalPages;  //总页数

    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
