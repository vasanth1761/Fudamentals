package com.student;

public class Studentverification 

 {
		// TODO Auto-generated method stub
		int id;
		String name;
		String location;
		String bloodgroup;
		String Degree;
		public Studentverification() {
			
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public String getDegree() {
			return Degree;
		}
		public void setDegree(String degree) {
			Degree = degree;
		}
		public Studentverification(int id, String name, String location, String bloodgroup, String degree) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.bloodgroup = bloodgroup;
			Degree = degree;
		}
		

	}


