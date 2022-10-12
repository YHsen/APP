package com.QiMi.config;

public class PageUtil {

	//已知条件
	private String cpage;
	private int pageSize;
	private int count;
	//未知条件
	private int currentPage;//��ǰҳ
	private int prevPage;//��һҳ
	private int nextPage;//��һҳ
	private int lastPage;//ĩҳ
	private int startIndex;//起始位置
	private int endIndex;//��������
	//limit (0,3)
	public PageUtil(String cpage, int pageSize, int count){
		this.cpage = cpage;
		this.pageSize = pageSize;
		this.count = count;
		initCurrentPage();
		initPrevPage();
		initLastPage();
		initNextPage();
		initStartIndex();
		initEndIndex();
	}
	
	//��ʼ����ǰҳ
	private void initCurrentPage(){
		cpage = cpage == null ? "1" : cpage;
		currentPage = Integer.parseInt(cpage);
	}
	
	//��ʼ����һҳ
	private void initPrevPage(){
		if(currentPage == 1){
			prevPage = 1;
		}else{
			prevPage = currentPage - 1;
		}
	}
	
	//��ʼ��ĩҳ
	private void initLastPage(){
		lastPage = count / pageSize;
		if(count % pageSize != 0){
			lastPage += 1;
		}
	}
	
	//��ʼ����һҳ
	private void initNextPage(){
		if(currentPage == lastPage){
			nextPage = currentPage;
		}else{
			nextPage = currentPage + 1;
		}
	}
	
	private void initStartIndex() {
		startIndex = (currentPage - 1) * pageSize;
	}
	private void initEndIndex() {
		endIndex = currentPage*pageSize;
	}
	public int getEndIndex() {
		return endIndex;
	}

	public String getCpage() {
		return cpage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getCount() {
		return count;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public int getLastPage() {
		return lastPage;
	}
	
	public int getStartIndex() {
		return startIndex;
	}
	
}
