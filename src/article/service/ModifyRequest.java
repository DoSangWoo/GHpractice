package article.service;

import java.util.Map;

public class ModifyRequest {

	private String userId;
	private int articleNumber;
	private String title;
	private String content;

	public ModifyRequest(String userId, int articleNumber, String title, String content) {
		this.userId = userId;
		this.articleNumber = articleNumber;
		this.title = title;
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	// 요청된 정보의 유효성을 검증하는 메서드
	public void validate(Map<String, Boolean> errors) {
		// 제목이 비어 있는지  검사 
		if (title == null || title.trim().isEmpty()) {
			errors.put("title", Boolean.TRUE); 
			// 비어 있으면 errors 맵에 "title" 키에 대한 값을 true로 설정
		}
	}

}