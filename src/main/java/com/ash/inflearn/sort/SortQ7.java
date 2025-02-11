package com.ash.inflearn.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}

public class SortQ7 {

    public void solution(Scanner scanner) {

        List<Point> list = new ArrayList<>();

        int n  = scanner.nextInt();

        for (int i =0; i<n; i++) {
            list.add(
                    new Point(scanner.nextInt(), scanner.nextInt())
            );
        }

        list = list.stream().sorted()
                .collect(Collectors.toList());

        for (Point p : list) {
            System.out.println(p);
        }
    }

}
