package week3.day2;

public class APIClient {

//	Method 1 sendrequest with one argument
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint" +endpoint);
		}
//Method 2 sendRequest with different arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending request to endpoint" +endpoint);
		System.out.println("Sending request status" +requestBody);
	}
	
	public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("https://api.com/getData");
		client.sendRequest("https://api.com/postData", "{ \"name\": \"John\", \"age\": 30 }", false);
	}
	
}
