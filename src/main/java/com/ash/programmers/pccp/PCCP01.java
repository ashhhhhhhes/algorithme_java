package com.ash.programmers.pccp;

public class PCCP01 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"});
//        String result = solution.solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"});
        System.out.println(result);
    }

    static class Solution {

        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            String answer = "";

            Integer posSec = this.toSeconds(pos);
            Integer viedoLenSec = this.toSeconds(video_len);

            for (String command : commands) {
                posSec = pass(op_start, op_end, posSec);
                if ("prev".equals(command)) {
                    posSec = prev(posSec);
                } else {
                    posSec = next(posSec, viedoLenSec);
                    posSec = pass(op_start, op_end, posSec);
                }
            }

            int time = (posSec / 60);
            int min = posSec % 60;
            answer += (time >= 10 ? time : "0" + time) + ":";
            answer += (min >= 10 ? min : "0" + min) + "";

            return answer;
        }

        private Integer pass(String op_start, String op_end, Integer posSec) {
            if (posSec >= this.toSeconds(op_start) && posSec <= this.toSeconds(op_end)) {
                posSec = this.toSeconds(op_end);
            }
            return posSec;
        }

        private Integer next(Integer posSec, Integer viedoLenSec) {
            if (posSec < viedoLenSec) {
                posSec += 10;
            } else {
                posSec = viedoLenSec;
            }
            return posSec;
        }

        private Integer prev(Integer posSec) {
            if (posSec < 10) {
                posSec = 0;
            } else {
                posSec -= 10;
            }
            return posSec;
        }

        public Integer toSeconds(String time) {
            String[] timeArr = time.split(":");

            return Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
        }
    }
}
