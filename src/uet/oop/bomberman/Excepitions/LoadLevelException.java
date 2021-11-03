package uet.oop.bomberman.Excepitions;

public class LoadLevelException extends GameException {

	public LoadLevelException() {
	}
	
	public LoadLevelException(String str) {
		super(str);
		
	}
	
	public LoadLevelException(String str, Throwable cause) {
		super(str, cause);
		
	}
	
	public LoadLevelException(Throwable cause) {
		super(cause);
		
	}
	
}