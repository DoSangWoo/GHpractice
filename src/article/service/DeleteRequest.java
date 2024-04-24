package article.service;

public class DeleteRequest {
// 삭제할 게시글 번호를 담기 위한 로직
	private int articleNumber;
	
	public int getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

}
