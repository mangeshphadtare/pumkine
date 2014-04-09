package com.mangesh.pumkine.entities;



public class UserRechargeInfo {

	private String username;
	private String number;
	private String amount;
	
	
	public UserRechargeInfo(String username, String number, String amount) {
		// TODO Auto-generated constructor stub
		
		this.username = username;
		this.number = number;
		this.amount = amount;		
		
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRechargeInfo other = (UserRechargeInfo) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	public String getNumber() {
		return number;
	}

//	public String getAuthor() {
//		return author;
//	}

}
	
	


