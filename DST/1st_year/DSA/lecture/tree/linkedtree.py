class LinedTreeNode:
    def __init__(self, data):
        self.data = data
        self.children = []
    def add_child(self, child_node):
        self.children.append(child_node)
    def __str__(self):
        return str(self.data)
class LinkedTree:
    def __init__(self, root_data):
        self.root = LinedTreeNode(root_data)
    def add_child(self, parent_node, child_data):
        child_node = LinedTreeNode(child_data)
        parent_node.add_child(child_node)
        return child_node
    def __str__(self):
        return self._str_helper(self.root, 0)
    def _str_helper(self, node, level):
        result = "  " * level + str(node) + "\n"
        for child in node.children:
            result += self._str_helper(child, level + 1)
        return result



def traverse_and_print(node):
    print(node.data)
    for child in node.children:
        traverse_and_print(child)
def breath_first_traversal(node):
    queue = [node]
    while queue:
        current = queue.pop(0)
        print(current.data)
        queue.extend(current.children)
def depth_first_traversal(node):
    print(node.data)
    for child in node.children:
        depth_first_traversal(child)

def preorder_traversal(node):
    if node is not None:
        print(node.data)  # Visit the current node
        for child in node.children:  # Traverse all children
            preorder_traversal(child)

def postorder_traversal(node):
    if node is not None:
        for child in node.children:  # Traverse all children
            postorder_traversal(child)
        print(node.data)  # Visit the current node

def inorder_traversal(node):
    if node is not None:
        for child in node.children[:-1]:  # Traverse all but the last child
            inorder_traversal(child)
        print(node.data)  # Visit the current node
        if node.children:  # Traverse the last child if it exists
            inorder_traversal(node.children[-1])
if __name__ == "__main__":
    tree = LinkedTree("A")
    child1 = tree.add_child(tree.root, "B")
    child2 = tree.add_child(tree.root, "C")
    tree.add_child(child1, "D")
    tree.add_child(child1, "E")
    tree.add_child(child2, "F")
    tree.add_child(child2, "G")
    print("Tree structure:")
    print(tree)
    print("Preorder Traversal:")
    preorder_traversal(tree.root)
    print("Postorder Traversal:")
    postorder_traversal(tree.root)
    print("Inorder Traversal:")
    inorder_traversal(tree.root)
    print("Breadth-First Traversal:")
    breath_first_traversal(tree.root)
    print("Depth-First Traversal:")
    depth_first_traversal(tree.root)