package labs;

public class BinaryTree {
	NodeBT root = null;

}

class NodeBT{
	int data;
	NodeBT left;
	NodeBT right;
	NodeBT(int d){
		data = d;
		left=null;
		right=null;
	}
}
