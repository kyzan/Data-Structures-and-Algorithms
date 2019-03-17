package labs;

public class BST {

	public boolean searchBST (NodeBT root, int target) {
		NodeBT current = root;
		while (current != null) {
		if (current.data == target)
		return true;
		else if (current.data > target)
		return searchBST (current.left, target);
		else

		return searchBST (current.right, target);

		}
		return false;
		}
	
	public NodeBT search (NodeBT root, int target) {
		NodeBT current = root;
		while (current != null) {
		if (current.data == target)
		return current;
		else if (current.data > target)
		return search (current.left, target);
		else

		return search (current.right, target);

		}
		return null;
		}
	public NodeBT insert (NodeBT root, int value) {

		if (root == null)
		root = new NodeBT (value);

		else {
		if (value < root.data)
		root.left = insert (root.left, value);
		else
		root.right = insert (root.right, value);
		}
		return root;
		}
	public static boolean verify (NodeBT root, int min, int max) {
		if (root == null)
		return true;
		return (root.data > min && root.data < max &&
		verify (root.left, min, root.data) &&
		verify (root.right, root.data, max));
		}
	
}
