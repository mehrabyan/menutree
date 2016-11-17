package menutree;

public class NodePath {

	public void toParent(Node<String> node) {
	for(Integer k : node.getParent().getChildren().keySet())
		System.out.println(k + ". " + node.getParent().getChildren().get(k).getContent());
}
	
	public void toChildren(Node<String> node) {
		for (Integer m : node.getChildren().keySet())
			System.out.println("\t" + m + ". " + node.getChildren().get(m).getContent());
	}
}
