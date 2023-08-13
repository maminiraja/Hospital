package hospital.departments.Exception;

public class NoDepartmentFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDepartmentFoundException(String msg)
	{
		super(msg);
	}
}
