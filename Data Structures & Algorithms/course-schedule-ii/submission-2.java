class Solution {

    public int[] findOrder(
        int numCourses,
        int[][] prerequisites
    ) {

        // Build graph
        ArrayList<ArrayList<Integer>> graph =
            new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Calculate in-degree
        int[] inDegree = new int[numCourses];

        for (int[] edge : prerequisites) {

            int course = edge[0];
            int prerequisite = edge[1];

            graph.get(prerequisite).add(course);

            inDegree[course]++;
        }

        // Courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {

            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Store answer
        int[] result = new int[numCourses];
        int index = 0;

        // Kahn's Algorithm
        while (!queue.isEmpty()) {

            int node = queue.poll();

            result[index] = node;
            index++;

            for (int neighbour : graph.get(node)) {

                inDegree[neighbour]--;

                if (inDegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        // Not all courses processed → cycle
        if (index != numCourses) {
            return new int[0];
        }

        return result;
    }
}