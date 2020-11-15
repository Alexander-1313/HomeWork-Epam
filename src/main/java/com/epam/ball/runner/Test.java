package com.epam.ball.runner;

import com.epam.ball.entity.Ball;
import com.epam.ball.entity.Bucket;
import com.epam.ball.entity.Color;
import com.epam.ball.service.BallService;

public class Test {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(15);
        BallService service = new BallService();

        service.kickBallIntoBucket(bucket, new Ball(1.4, Color.GREEN));
        service.kickBallIntoBucket(bucket, new Ball(1.9, Color.GREEN));
        service.kickBallIntoBucket(bucket, new Ball(2.4, Color.RED));
        service.kickBallIntoBucket(bucket, new Ball(1.3, Color.BLUE));
        service.kickBallIntoBucket(bucket, new Ball(1.1, Color.BLUE));
        service.kickBallIntoBucket(bucket, new Ball(3.6, Color.RED));

        System.out.println(service.getBucketWeight(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucketByColor(bucket, Color.RED) = " + service.getBallOutOfBucketByColor(bucket, Color.RED));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        System.out.println("service.getBallOutOfBucket(bucket) = " + service.getBallOutOfBucket(bucket));
        service.kickBallIntoBucket(bucket, new Ball(4.5, Color.GREEN));
        System.out.println("service.getBucketWeight(bucket) = " + service.getBucketWeight(bucket));
        
    }
}
