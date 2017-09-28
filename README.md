# CCI_Validate_BST_4_5
Initialize project CCI - Validate Binary Search Tree 4.5

This program is a solution to CCI book problem 4.5 Validate Binary Search Tree.
A TreeNode chain is created and pass to a checkBST method that will pass the Tree node
to a overloaded method checkBST that will accept a TreeNode and integer min value and
integer max value as parameters. The overload checkBST method will be invoked recursively
as each node is checked to see if it is balanced with the parent node being greater than the
child node on the left and less than the child node to the right of the parent node.
