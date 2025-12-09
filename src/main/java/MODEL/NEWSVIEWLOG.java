	package MODEL;
	
	import java.util.Date;
	
	public class NEWSVIEWLOG {
		private int ID;
		private String USERID;
		private String NEWSID;
		private Date VIEWTIME;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getUSERID() {
			return USERID;
		}
		public void setUSERID(String uSERID) {
			USERID = uSERID;
		}
		public String getNEWSID() {
			return NEWSID;
		}
		public void setNEWSID(String nEWSID) {
			NEWSID = nEWSID;
		}
		public Date getVIEWTIME() {
			return VIEWTIME;
		}
		public void setVIEWTIME(Date vIEWTIME) {
			VIEWTIME = vIEWTIME;
		}
		
	}
