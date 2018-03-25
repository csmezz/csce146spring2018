public class IntAVLTree {

	private IntAVLNode root;
	
	public IntAVLTree() {
		this.root = null;
	}
	
	public IntAVLTree(IntAVLNode root_node) {
		this.root = root_node;
	}
	
	public IntAVLNode getRoot() {
		return this.root;
	}
	
	public boolean setRoot(IntAVLNode new_root) {
		try {
			this.root = new_root;
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean validateSection(IntAVLNode subtree) {
		if (subtree != null) {
			if ((subtree.getLeft() != null) && (subtree.getRight() != null)) {
				if ((subtree.getLeft().getData() < subtree.getData()) ) {
					
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public IntAVLNode Rotate(IntAVLNode subtree) {
		
	}
}
