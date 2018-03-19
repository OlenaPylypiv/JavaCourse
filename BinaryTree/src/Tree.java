
public class Tree {
    static class Node{
	 public int value;
	 public Node left;
	 public Node right;
	 
	 public Node(int value) {
		 this.value = value;
		 this.left = null;
		 this.right = null;
	 }
    }
    
    private Node root;
    public Tree(int rootValue) {
    	this.root = new Node(rootValue);
    }
    private Node addRecursive(Node current, int value) {
		if( current == null) {
			return new Node(value);
		}
		if(value < current.value) {
			current.left = addRecursive(current.left,value);
		}
		else if(value > current.value) {
			current.right = addRecursive(current.right,value);
		}
		else{ 
			return current;}
		
		return current;
		
	}
    public void add(int value){
    	this.root = addRecursive(root,value);
    }
    private Node finden;
    
    private Node containsNodeRecursive(Node current, int value) {
    	finden = null;
    	if(current.value == value) {
    		finden = current;
    		return finden;
    	}
    	if((value < current.value)&&(current.left != null) ){
    		finden = containsNodeRecursive(current.left,value);
    	}
    	if((value > current.value)&&(current.right != null)) {
    		finden = containsNodeRecursive(current.right,value);
    	}
    	return finden;
    	
    	
    }
    

	
    public Node find(int value) {
        return containsNodeRecursive(this.root, value);
}
	}


