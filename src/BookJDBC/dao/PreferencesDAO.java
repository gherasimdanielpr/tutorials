package BookJDBC.dao;

import java.util.List;


public interface PreferencesDAO {
	public boolean addPreference(int bookId, String username);
	public List<Integer> getPreferences(String username);
	public boolean deletePreference(int bookId, String username);
}
