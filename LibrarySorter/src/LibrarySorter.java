import java.util.Scanner;
import java.io.File;

public class LibrarySorter {
	public class Node {
		public Book data;
		public Node left;
		public Node right;
	}
	
	public Node root;
	
	public LibrarySorter() {
		root = null;
	}
	
	public LibrarySorter(Node new_root) {
		this.root = new_root;
	}
	
	// This builds a Book object from a raw text string.
	private Book bookFactory(String text_string) {
		Book temp = new Book();
		String[] split = text_string.split("\t");
		try {
			temp.title = split[0];
			temp.genre = split[1];
			temp.checkout = Integer.parseInt(split[2]);
		}
		catch (Exception e) {
			System.out.println("Error: Book Could Not Be Parsed!");
			e.printStackTrace();
		}
		return temp;
	}
	
	// This builds a Node object from a Book object.
	private Node nodeFactory(Book new_book) {
		Node temp = new Node();
		temp.data = new_book;
		temp.left = null;
		temp.right = null;
		return temp;
	}
	
	// This will parse a text file in "title \t genre \t num_checkouts \n" form.
	// An example file called booklist is provided.
	private void parseFile(String rawfile) {
		try {
			File file = new File(rawfile);
			Scanner readln = new Scanner(file);
			while (readln.hasNextLine()) {
				String line = readln.nextLine();
				this.insert(nodeFactory(bookFactory(line)));
			}
			readln.close();
		}
		catch (Exception e) {
			System.out.println("Error: There was a problem reading the file!");
			e.printStackTrace();
		}
	}

	// This should insert a new node onto the tree starting at root.
	public boolean insert(Node new_book) {
		// Use the recursive implementation of an insert function to
		// insert new_book onto the binary search tree.
		return true;
	}
	
	public boolean delete(Node new_book) {
		// Use a recursive delete function to delete new_book from the
		// binary search tree. If you check to see if the 
		// current node's book is the same as the book you're looking for,
		// you can simply call delete for every member of the tree.
		// Remember: (true || false) = true
		return true;
	}
	
	
	// Remember to call on the Book's getFormatString() method to format
	// the output correctly. This function returns a string that you can
	// use like normal.
	public void preOrderTraversal() {
		// Preorder traversal prints the current info before it descends
		// the tree.
	}
	
	public void inOrderTraversal() {
		// Inorder traversal prints the current info after it traverses the
		// left tree, but before it traverses the right.
	}
	
	public void postOrderTraversal() {
		// Postorder traversal prints the current info after it traverses both
		// the left and right trees.
	}
	
	public static void main(String[] args) {
		// Your program's execution logic should go here.
	}
}
