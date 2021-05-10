package IT20281564;



	public class Administrator {
		
		private int id;
		private String nameString;
		private String userNameString;
		private String passwordString;
		
		
		public Administrator(int id, String nameString, String userNameString, String passwordString) {
			
			this.id = id;
			this.nameString = nameString;
			this.userNameString = userNameString;
			this.passwordString = passwordString;
		}


		public int getId() {
			return id;
		}


		public String getNameString() {
			return nameString;
		}


		public String getUserNameString() {
			return userNameString;
		}


		public String getPasswordString() {
			return passwordString;
		}

		
	}



