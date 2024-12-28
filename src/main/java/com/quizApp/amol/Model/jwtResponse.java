package com.quizApp.amol.Model;

public class jwtResponse {

    private String token;
    private String username;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public jwtResponse(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}
	public jwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    public static class Builder {
        private String token;
        private String username;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public jwtResponse build() {
            return new jwtResponse(token, username);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
    
}
