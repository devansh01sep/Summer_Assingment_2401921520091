package Week_4.Day_5;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.tree.TreeNode;

public class SerializeandDeserializeBtree {

    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            TreeNode n = q.poll();

            if (n != null) {
                q.add(n.left);
                q.add(n.right);
                ans.append(n.val);
            } else {
                ans.append('N');
            }

            ans.append(',');
        }

        return ans.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }

        int i = 0;
        String[] arr = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[i++]));
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();

            if (!arr[i].equals("N")) {
                n.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(n.left);
            }

            ++i;

            if (!arr[i].equals("N")) {
                n.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(n.right);
            }

            ++i;
        }

        return root;
    }
}
