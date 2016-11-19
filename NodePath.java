package menutree;

public class NodePath {

	public Node<String> toParent(Node<String> node) {
		for (Integer k : node.getParent().getChildren().keySet())
			System.out.println(k + ". " + node.getParent().getChildren().get(k).getContent());
		
		return node.getParent();
	}

	public void toChildren(Node<String> node) {
		for (Integer m : node.getChildren().keySet())
			System.out.println(m + ". " + node.getChildren().get(m).getContent());
	}
}
