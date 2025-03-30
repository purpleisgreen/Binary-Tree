
public class MyBinaryTree {
	public StudentInfo root;
	public int numberOfStudents;
	
	public MyBinaryTree(){
		// constructor 
		root = null;
		numberOfStudents = 0;
	}
	
	public void addToTree(StudentInfo currentNode, StudentInfo toAdd) {
		// adds new students to the tree 
		if(numberOfStudents == 0) {
			root = toAdd;
			numberOfStudents++;
			root.left = null;
			root.right = null;
			return;
		}
		else {
			if(toAdd.studentNumber < currentNode.studentNumber) {
				if(currentNode.left == null) {
					currentNode.left = toAdd;
					numberOfStudents++;
					return;
				}
				else {
					addToTree(currentNode.left, toAdd);
				}
			}
			else {
				if(currentNode.right == null) {
					currentNode.right = toAdd;
					numberOfStudents++;
					return;
				}
				else {
					addToTree(currentNode.right, toAdd);
				}
			}
		}
	}
	public void preorder(StudentInfo currentNode) {
		//preorder traversal
		//process, preorder left, preorder right
		if(numberOfStudents == 0) {
			return;
		}
		else {
			System.out.println(currentNode.studentNumber);
			if (currentNode.left != null) {
				preorder(currentNode.left);
			}
			if (currentNode.right != null) {
				preorder(currentNode.right);
			}
		}
	}
	
	public void postorder(StudentInfo currentNode) {
		//postorder traversal
		//postorder left, postorder right, process
		if(numberOfStudents == 0) {
			return;
		}
		else {
			if (currentNode.left != null) {
				postorder(currentNode.left);
			}
			if (currentNode.right != null) {
				postorder(currentNode.right);
			}
			System.out.println(currentNode.studentNumber);
		}
	}
	
	public void inorder(StudentInfo currentNode) {
		//inorder traversal
		//inorder left, process, inorder right 
		if(numberOfStudents == 0) {
			return;
		}
		else {
			if (currentNode.left != null) {
				inorder(currentNode.left);
			}
			System.out.println(currentNode.studentNumber);
			if (currentNode.right != null) {
			inorder(currentNode.right);
		}
	}
	
}
}
