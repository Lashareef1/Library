package com.infinite.LibraryProject;

public class Books {
	
		private int id;
		private String  name;
		private String author;
		private String editon;
		private String dept;
		private int noOfbooks;
		@Override
		public String toString() {
			return "Books [id=" + id + ", name=" + name + ", author=" + author + ", editon=" + editon + ", dept=" + dept
					+ ", noOfbooks=" + noOfbooks + "]";
	
	
		}
		public Books(int id, String name, String author, String editon, String dept, int noOfbooks) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.editon = editon;
			this.dept = dept;
			this.noOfbooks = noOfbooks;
		
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getEditon() {
			return editon;
		}
		public void setEditon(String editon) {
			this.editon = editon;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getNoOfbooks() {
			return noOfbooks;
		}
		public void setNoOfbooks(int noOfbooks) {
			this.noOfbooks = noOfbooks;
		}
		
		public Books() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
}
