package CS4320_HW1;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BPlusTree myTree = new BPlusTree(5); 
		myTree.insert(0, "2");
		myTree.delete(0);
		myTree.insert(1, "2");
		myTree.insert(2, "2");
		myTree.insert(4, "4");
		Utils.printTree(myTree);
		myTree.insert(5, "5");
		Utils.printTree(myTree);
		myTree.insert(5, "4");
		Utils.printTree(myTree);
		myTree.insert(7, "7");
		Utils.printTree(myTree);
		myTree.insert(8, "8");
		myTree.insert(9, "9");
		myTree.insert(10, "10");
		myTree.insert(11, "11");
		myTree.insert(12, "12");
		myTree.insert(13, "13");
		if(myTree.exist(12)){
			System.out.print("YES\n");
		}
		else{
			System.out.print("NO\n");
		}
		if(myTree.exist(16)){
			System.out.print("YES\n");
		}
		else{
			System.out.print("NO\n");
		}
		if(myTree.exist(4)){
			System.out.print("YES\n");
		}
		else{
			System.out.print("NO\n");
		}
		myTree.deleteall(5);
		System.out.print(myTree.find(1,1));
		System.out.print(myTree.find(2,10));
		Utils.printTree(myTree);
	}

}
