package com.ash.programmers.pccp;

import java.util.*;

/**
 * 충돌 위험 찾기
 */
public class PCCP03 {

    public static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return r == point.r && c == point.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r, c);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "r=" + r +
                    ", c=" + c +
                    '}';
        }
    }

    public static class Robot {
        Point position;
        private final Stack<Point> points = new Stack<>();

        public Robot(Point position) {
            this.position = position;
        }

        void addPoint(Point p) {
            points.push(p);
        }

        public void move() {
            Point next = points.pop();
            if (position.equals(next) && !points.isEmpty()) next = points.pop();
            if (position.r > next.r) {
                position.r--;
            } else if (position.r < next.r) {
                position.r++;
            } else if (position.c < next.c) {
                position.c++;
            } else if (position.c > next.c) {
                position.c--;
            } else {
                return;
            }
            addPoint(next);
        }

        public boolean isArrived() {
            return points.isEmpty();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Robot robot = (Robot) o;
            return Objects.equals(position, robot.position);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(position);
        }
    }

    /**
     * @param points 2차원 좌표를 가진 포인트 배열
     * @param routes 운송 경로
     * @return
     */
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;

        Queue<Robot> queue = new LinkedList<>();

        for (int[] arr : routes) {
            Robot robot = new Robot(new Point(points[arr[0] - 1][0], points[arr[0] - 1][1]));
            for (int i = arr.length - 1; i > 0; i--) {
                robot.addPoint(new Point(points[arr[i] - 1][0], points[arr[i] - 1][1]));
            }
            queue.offer(robot);
        }

        while (!queue.isEmpty()) {
            Map<Point, Integer> way = new HashMap<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Robot robot = queue.poll();
                if (robot.isArrived()) continue;;
                if (way.containsKey(robot.position)) way.put(new Point(robot.position.r, robot.position.c), 1);
                else way.put(new Point(robot.position.r, robot.position.c), 0);
                robot.move();
                queue.offer(robot);
            }

            for (Integer count : way.values()) {
                if (count > 0) answer++;
            }
        }

        return answer;
    }

}
