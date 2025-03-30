
public class Main {
	public static void main(String [] args) {
		StudentInfo studentA = new StudentInfo(1);
		StudentInfo studentB = new StudentInfo(2);
		StudentInfo studentC = new StudentInfo(3);
		StudentInfo studentD = new StudentInfo(4);
		StudentInfo studentE = new StudentInfo(5);
		StudentInfo studentF = new StudentInfo(6);
		StudentInfo studentG = new StudentInfo(7);
		StudentInfo studentH = new StudentInfo(8);
		StudentInfo studentI = new StudentInfo(9);
		StudentInfo studentJ = new StudentInfo(10);
	
		MyBinaryTree theTree = new MyBinaryTree();
	
	//Testing Code
		theTree.addToTree(theTree.root, studentB);
		theTree.addToTree(theTree.root, studentF);
		theTree.addToTree(theTree.root, studentG);
		theTree.addToTree(theTree.root, studentA);
		theTree.addToTree(theTree.root, studentJ);
		theTree.addToTree(theTree.root, studentD);
		theTree.addToTree(theTree.root, studentH);
		theTree.addToTree(theTree.root, studentI);
		theTree.addToTree(theTree.root, studentC);
		
		System.out.println("preorder");
		theTree.preorder(theTree.root);
		System.out.println("postorder");
		theTree.postorder(theTree.root);
		System.out.println("inorder");
		theTree.inorder(theTree.root);
		
	
	
}
}