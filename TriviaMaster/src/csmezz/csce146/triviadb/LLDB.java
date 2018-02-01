package csmezz.csce146.triviadb;

import java.util.List;

// This class is a Linked List implementation of the DB interface. All functions need to be implemented.
// You may want to add a few extra helper functions.

public class LLDB implements DB<Question, Query> {
	
	private class ListNode {
		private Question data;
		private ListNode link;
		
		public ListNode() {
			data = new TriviaQuestion();
			link = null;
		}
		
		public ListNode(ListNode next_link) {
			data = new TriviaQuestion();
			link = next_link;
		}
		
		public ListNode(ListNode next_link, Question new_question) {
			data = new_question;
			link = next_link;
		}
		
		// Might need accessors and mutators.
	}
	
	private ListNode head;
	private ListNode current;
	
	
	public LLDB() {
		// LLDB needs a constructor.
	}
	
	public LLDB(LLDB old_db) {
		// LLDB probably also needs a copy constructor.
	}

	@Override
	public boolean create(Question new_question) {
		// TODO Auto-generated method stub
		// Create makes a new file and inserts it into the database.
		return false;
	}

	@Override
	public List<Question> retrieve(Query query) {
		// TODO Auto-generated method stub
		// Retrieve finds all records that match the criteria in query.
		return null;
	}

	@Override
	public boolean update(Query query, Question new_version) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Question new_question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serialize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deserialize() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
