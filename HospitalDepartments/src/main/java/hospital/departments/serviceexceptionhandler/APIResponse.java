package hospital.departments.serviceexceptionhandler;



public class APIResponse
	{
		private String response_status;
		private String response_code;
		private String response_message ;
		
		
		public String getResponse_status() {
			return response_status;
		}
		public void setResponse_status(String response_status) {
			this.response_status = response_status;
		}
		public String getResponse_code() {
			return response_code;
		}
		public void setResponse_code(String response_code) {
			this.response_code = response_code;
		}
		public String getResponse_message() {
			return response_message;
		}
		public void setResponse_message(String response_message) {
			this.response_message = response_message;
		}
		@Override
		public String toString() {
			return "APIRepsonse [response_status=" + response_status + ", response_code=" + response_code
					+ ", response_message=" + response_message + "]";
		}
		public APIResponse(String response_status, String response_code, String response_message) {
			super();
			this.response_status = response_status;
			this.response_code = response_code;
			this.response_message = response_message;
		}

		
		public APIResponse() {
			super();
		
		
	}



}
