package hospital.departments.serviceexceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import hospital.departments.Exception.NoDepartmentFoundException;

@RestControllerAdvice
@RestController
public class GlobalExceptionHandling 
{
  
	@ExceptionHandler(value=NoDepartmentFoundException.class)
	public ResponseEntity<APIResponse> handleException()
	{
		APIResponse response = new APIResponse("NOT FOUND","404","No Department Found");
		return ResponseEntity.ok(response);
	}
}
