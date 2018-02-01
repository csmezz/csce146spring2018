package csmezz.csce146.triviadb;

import java.util.List;

public interface DB<T, Q>{
	public boolean create(T new_question);
	public List<T> retrieve(Q query);
	public boolean update(Q query, T new_version);
	public boolean delete(T new_question);
	public boolean serialize();
	public boolean deserialize();
}
