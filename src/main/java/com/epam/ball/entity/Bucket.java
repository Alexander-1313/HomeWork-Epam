package com.epam.ball.entity;

import java.util.Arrays;
import java.util.Objects;

public class Bucket {

    private int ballCapacity = 10;
    private int ballIntoBucket = 0;
    private final Ball bucket[] = new Ball[ballCapacity];

    public Bucket() {
    }

    public Bucket(int ballCapacity) {
        this.ballCapacity = ballCapacity;
    }

    public int getBallCapacity() {
        return ballCapacity;
    }

    public void setBallCapacity(int ballCapacity) {
        this.ballCapacity = ballCapacity;
    }

    public int getBallIntoBucket() {
        return ballIntoBucket;
    }

    public void setBallIntoBucket(int ballIntoBucket) {
        this.ballIntoBucket = ballIntoBucket;
    }

    public void setBallIntoBucket(Ball ball) {
        bucket[ballIntoBucket++] = ball;
    }

    public Ball searchBallById(int i) {
        Ball ball = null;

        if (i < bucket.length && bucket[i] != null) {
            ball = bucket[i];
        }

        return ball;
    }

    public Ball getBallById(int i) {
        Ball ball = null;

        if (i < bucket.length && bucket[i] != null) {
            ball = bucket[i];
            bucket[i] = null;
        }

        return ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bucket bucket1 = (Bucket) o;
        return ballCapacity == bucket1.ballCapacity &&
                Arrays.equals(bucket, bucket1.bucket);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ballCapacity);
        result = 31 * result + Arrays.hashCode(bucket);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bucket{");
        sb.append("ballCapacity=").append(ballCapacity);
        sb.append(", bucket=").append(Arrays.toString(bucket));
        sb.append('}');
        return sb.toString();
    }
}
