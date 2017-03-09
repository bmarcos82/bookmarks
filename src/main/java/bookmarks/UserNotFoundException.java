package bookmarks;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3594226605856268802L;

	public UserNotFoundException(String userId) {
		super("could not find user '" + userId + "'.");
	}
}