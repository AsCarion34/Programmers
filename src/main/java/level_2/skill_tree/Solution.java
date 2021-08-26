package level_2.skill_tree;

import java.util.Arrays;

public class Solution {
    /***
     * skill tree 를 순회하면서 skill 가 아닌 데이터는 모두 제거한다.
     * 이후 순서가 sill 에 맞는 갯수만 카운트 한다.
     */
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String user_skill_tree : skill_trees) {

            String[] filtered_skill_tree = Arrays.stream(user_skill_tree.split("")).filter(skill::contains).toArray(String[]::new);
            if(checkSkillTree(skill, filtered_skill_tree)) {
                answer += 1;
            }
        }

        return answer;
    }

    private static boolean checkSkillTree(String skill_manual, String[] skill_tree) {
        int offset = 0;
        for(String skill : skill_tree) {
            if(!skill.equals(skill_manual.substring(offset, offset + 1))) {
                return false;
            }
            offset++;
        }
        return true;
    }
}
