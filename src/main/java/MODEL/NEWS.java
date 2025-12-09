package MODEL;

import java.util.Date;

public class NEWS {
	private String ID;
	private String Title;
	private String Content;
	private String Image;
	private Date PostedDate;
	private int ViewCount;
	private String Author;
	private String CategoryID;
	private boolean Home;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public Date getPostedDate() {
		return PostedDate;
	}
	public void setPostedDate(Date postedDate) {
		PostedDate = postedDate;
	}
	public int getViewCount() {
		return ViewCount;
	}
	public void setViewCount(int viewCount) {
		ViewCount = viewCount;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}
	public boolean isHome() {
		return Home;
	}
	public void setHome(boolean home) {
		Home = home;
	}
}
