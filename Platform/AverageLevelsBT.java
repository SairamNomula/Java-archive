// Average of Levels in Binary Tree

// Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
 
// Input: root = [3,9,20,null,null,15,7]
// Output: [3.00000,14.50000,11.00000]
// Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
// Hence return [3, 14.5, 11].


class AverageLevelsBT {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new LinkedList<>();
            
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            
            while(!q.isEmpty()){
                int size = q.size();
                double sum =0;
                
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    sum += node.val;
                    
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                }
                result.add(sum/size);
            }
            return result;
        }
    }
}
