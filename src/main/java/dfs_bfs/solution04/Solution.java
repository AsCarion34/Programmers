package dfs_bfs.solution04;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    class PathInfo {
        private String dept;
        private String dest;
        private int index = -1;

        public PathInfo(String dept, String dest) {
            this.dept = dept;
            this.dest = dest;
        }
        public boolean isAdjacent(PathInfo other) {
            return this.dest.equals(other.dept);
        }
    }

    public String[] solution(String[][] tickets) {
        String[] answer = {};

        List<PathInfo> pathList = Arrays.stream(tickets).map(ticket -> new PathInfo(ticket[0], ticket[1]))
                .sorted((o1, o2) -> (0 != o1.dept.compareTo(o2.dept)) ? o1.dept.compareTo(o2.dept) : o1.dest.compareTo(o2.dest))
                .collect(Collectors.toList());

        List<PathInfo> deptList = pathList.stream().filter(e -> e.dept.equals("ICN")).collect(Collectors.toList());

        for (PathInfo pathInfo : deptList) {
            pathInfo.index = 0;
            if(dfs(pathList, pathInfo, 1)) {
                break;
            }
        }

        answer = createPathArray(pathList);

        return answer;
    }

    public boolean dfs(List<PathInfo> pathInfoList, PathInfo dept, int index) {
        boolean bExit = false;
        if(index == pathInfoList.size()) {
            return true;
        }

        for(PathInfo pathInfo : pathInfoList) {
            if(pathInfo.index < 0 && dept.isAdjacent(pathInfo)) {
                pathInfo.index = index;
                bExit = dfs(pathInfoList, pathInfo, index + 1);
                if(bExit) {
                    break;
                }
            }
        }

        if(!bExit) {
            dept.index = -1;
        }

        return bExit;
    }

    public String[] createPathArray(List<PathInfo> pathInfoList) {
        pathInfoList.sort((o1, o2) -> o1.index > o2.index ? 1 : -1);

        String[] pathArry = new String[pathInfoList.size() + 1];
        pathArry[0] = pathInfoList.get(0).dept;
        pathArry[1] = pathInfoList.get(0).dest;
        for(int i = 1; i < pathInfoList.size(); i++) {
            pathArry[i + 1] = pathInfoList.get(i).dest;
        }
        return pathArry;
    }
}
