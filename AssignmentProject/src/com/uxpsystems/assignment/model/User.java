package com.uxpsystems.assignment.model;

public class User {
	 
    private long id;
     
    private String userName;
     
    private String status;
 
    public User(){
        id=0;
    }
     
    public User(long id, String userName,String status){
        this.id = id;
        this.userName = userName;
        this.status = status;
    }
     
   
 
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
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
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", status=" + status + "]";
	}
 
  
 
 
}
