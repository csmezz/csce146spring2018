public class IntAVLNode {
		private int data;
		private IntAVLNode left;
		private IntAVLNode right;
		private IntAVLNode parent;
		
		public IntAVLNode(int d, IntAVLNode p) {
			this.data = d;
			this.left = null;
			this.right = null;
			this.parent = p;
		}
		
		public int getData() {
			return this.data;
		}
		
		public boolean setData(int dat) {
			try {
				this.data = dat;
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
		
		public IntAVLNode getLeft() {
			return this.left;
		}
		
		public boolean setLeft(IntAVLNode left_node) {
			try {
				this.left = left_node;
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
		
		public IntAVLNode getRight() {
			return this.right;
		}
		
		public boolean setRight(IntAVLNode right_node) {
			try {
				this.right = right_node;
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
		
		public IntAVLNode getParent() {
			return this.parent;
		}
		
		public boolean setParent(IntAVLNode parent_node) {
			try {
				this.parent = parent_node;
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
}