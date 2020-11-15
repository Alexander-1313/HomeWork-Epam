package com.epam.ball.service;

import com.epam.ball.entity.Ball;
import com.epam.ball.entity.Bucket;
import com.epam.ball.entity.Color;

public class BallService {

    public void kickBallIntoBucket(Bucket bucket, Ball ball) {

        if (bucket.getBallIntoBucket() < 10) {
            bucket.setBallIntoBucket(ball);
        }
    }

    public Ball getBallOutOfBucket(Bucket bucket) {

        Ball ball = null;

        for (int i = 0; i < bucket.getBallCapacity(); i++) {
            if (bucket.searchBallById(i) != null) {
                ball = bucket.getBallById(i);
                return ball;
            }
        }

        return ball;
    }

    public Ball getBallOutOfBucketByColor(Bucket bucket, Color color) {

        Ball ball = null;

        for (int i = 0; i < bucket.getBallCapacity(); i++) {
            ball = bucket.searchBallById(i);

            if (ball != null && ball.getColor() == color) {
                ball = bucket.getBallById(i);
                return ball;
            }
        }

        return null;
    }

    public double getBucketWeight(Bucket bucket){
        double weight = 0;

        for(int i = 0; i < bucket.getBallCapacity(); i++){
            if(bucket.searchBallById(i) != null){
                weight += bucket.searchBallById(i).getWeight();
            }
        }

        return weight;
    }

    public int countOfBallByColor(Bucket bucket, Color color){
        int countOfBall = 0;

        for(int i = 0; i < bucket.getBallCapacity(); i++){
            if(bucket.searchBallById(i) != null){
                countOfBall++;
            }
        }

        return countOfBall;
    }

}
